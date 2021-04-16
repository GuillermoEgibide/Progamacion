/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloBD.exceptions.IllegalOrphanException;
import ModeloBD.exceptions.NonexistentEntityException;
import ModeloBD.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import ModeloUML.Empresa;
import ModeloUML.Persona;
import ModeloUML.Personasevento;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author 1GDAW12
 */
public class PersonaJpaController implements Serializable {

    public PersonaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Persona persona) throws PreexistingEntityException, Exception {
        if (persona.getPersonaseventoList() == null) {
            persona.setPersonaseventoList(new ArrayList<Personasevento>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Empresa nif = persona.getNif();
            if (nif != null) {
                nif = em.getReference(nif.getClass(), nif.getNif());
                persona.setNif(nif);
            }
            List<Personasevento> attachedPersonaseventoList = new ArrayList<Personasevento>();
            for (Personasevento personaseventoListPersonaseventoToAttach : persona.getPersonaseventoList()) {
                personaseventoListPersonaseventoToAttach = em.getReference(personaseventoListPersonaseventoToAttach.getClass(), personaseventoListPersonaseventoToAttach.getPersonaseventoPK());
                attachedPersonaseventoList.add(personaseventoListPersonaseventoToAttach);
            }
            persona.setPersonaseventoList(attachedPersonaseventoList);
            em.persist(persona);
            if (nif != null) {
                nif.getPersonaList().add(persona);
                nif = em.merge(nif);
            }
            for (Personasevento personaseventoListPersonasevento : persona.getPersonaseventoList()) {
                Persona oldPersonaOfPersonaseventoListPersonasevento = personaseventoListPersonasevento.getPersona();
                personaseventoListPersonasevento.setPersona(persona);
                personaseventoListPersonasevento = em.merge(personaseventoListPersonasevento);
                if (oldPersonaOfPersonaseventoListPersonasevento != null) {
                    oldPersonaOfPersonaseventoListPersonasevento.getPersonaseventoList().remove(personaseventoListPersonasevento);
                    oldPersonaOfPersonaseventoListPersonasevento = em.merge(oldPersonaOfPersonaseventoListPersonasevento);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPersona(persona.getDni()) != null) {
                throw new PreexistingEntityException("Persona " + persona + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Persona persona) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persistentPersona = em.find(Persona.class, persona.getDni());
            Empresa nifOld = persistentPersona.getNif();
            Empresa nifNew = persona.getNif();
            List<Personasevento> personaseventoListOld = persistentPersona.getPersonaseventoList();
            List<Personasevento> personaseventoListNew = persona.getPersonaseventoList();
            List<String> illegalOrphanMessages = null;
            for (Personasevento personaseventoListOldPersonasevento : personaseventoListOld) {
                if (!personaseventoListNew.contains(personaseventoListOldPersonasevento)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Personasevento " + personaseventoListOldPersonasevento + " since its persona field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (nifNew != null) {
                nifNew = em.getReference(nifNew.getClass(), nifNew.getNif());
                persona.setNif(nifNew);
            }
            List<Personasevento> attachedPersonaseventoListNew = new ArrayList<Personasevento>();
            for (Personasevento personaseventoListNewPersonaseventoToAttach : personaseventoListNew) {
                personaseventoListNewPersonaseventoToAttach = em.getReference(personaseventoListNewPersonaseventoToAttach.getClass(), personaseventoListNewPersonaseventoToAttach.getPersonaseventoPK());
                attachedPersonaseventoListNew.add(personaseventoListNewPersonaseventoToAttach);
            }
            personaseventoListNew = attachedPersonaseventoListNew;
            persona.setPersonaseventoList(personaseventoListNew);
            persona = em.merge(persona);
            if (nifOld != null && !nifOld.equals(nifNew)) {
                nifOld.getPersonaList().remove(persona);
                nifOld = em.merge(nifOld);
            }
            if (nifNew != null && !nifNew.equals(nifOld)) {
                nifNew.getPersonaList().add(persona);
                nifNew = em.merge(nifNew);
            }
            for (Personasevento personaseventoListNewPersonasevento : personaseventoListNew) {
                if (!personaseventoListOld.contains(personaseventoListNewPersonasevento)) {
                    Persona oldPersonaOfPersonaseventoListNewPersonasevento = personaseventoListNewPersonasevento.getPersona();
                    personaseventoListNewPersonasevento.setPersona(persona);
                    personaseventoListNewPersonasevento = em.merge(personaseventoListNewPersonasevento);
                    if (oldPersonaOfPersonaseventoListNewPersonasevento != null && !oldPersonaOfPersonaseventoListNewPersonasevento.equals(persona)) {
                        oldPersonaOfPersonaseventoListNewPersonasevento.getPersonaseventoList().remove(personaseventoListNewPersonasevento);
                        oldPersonaOfPersonaseventoListNewPersonasevento = em.merge(oldPersonaOfPersonaseventoListNewPersonasevento);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = persona.getDni();
                if (findPersona(id) == null) {
                    throw new NonexistentEntityException("The persona with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persona;
            try {
                persona = em.getReference(Persona.class, id);
                persona.getDni();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The persona with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Personasevento> personaseventoListOrphanCheck = persona.getPersonaseventoList();
            for (Personasevento personaseventoListOrphanCheckPersonasevento : personaseventoListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Persona (" + persona + ") cannot be destroyed since the Personasevento " + personaseventoListOrphanCheckPersonasevento + " in its personaseventoList field has a non-nullable persona field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Empresa nif = persona.getNif();
            if (nif != null) {
                nif.getPersonaList().remove(persona);
                nif = em.merge(nif);
            }
            em.remove(persona);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Persona> findPersonaEntities() {
        return findPersonaEntities(true, -1, -1);
    }

    public List<Persona> findPersonaEntities(int maxResults, int firstResult) {
        return findPersonaEntities(false, maxResults, firstResult);
    }

    private List<Persona> findPersonaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Persona.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Persona findPersona(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Persona.class, id);
        } finally {
            em.close();
        }
    }

    public int getPersonaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Persona> rt = cq.from(Persona.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
