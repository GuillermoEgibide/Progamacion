/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloBD.exceptions.NonexistentEntityException;
import ModeloBD.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import ModeloUML.Persona;
import ModeloUML.Personasevento;
import ModeloUML.PersonaseventoPK;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author 1GDAW12
 */
public class PersonaseventoJpaController implements Serializable {

    public PersonaseventoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Personasevento personasevento) throws PreexistingEntityException, Exception {
        if (personasevento.getPersonaseventoPK() == null) {
            personasevento.setPersonaseventoPK(new PersonaseventoPK());
        }
        personasevento.getPersonaseventoPK().setDni(personasevento.getPersona().getDni());
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persona = personasevento.getPersona();
            if (persona != null) {
                persona = em.getReference(persona.getClass(), persona.getDni());
                personasevento.setPersona(persona);
            }
            em.persist(personasevento);
            if (persona != null) {
                persona.getPersonaseventoList().add(personasevento);
                persona = em.merge(persona);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPersonasevento(personasevento.getPersonaseventoPK()) != null) {
                throw new PreexistingEntityException("Personasevento " + personasevento + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Personasevento personasevento) throws NonexistentEntityException, Exception {
        personasevento.getPersonaseventoPK().setDni(personasevento.getPersona().getDni());
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Personasevento persistentPersonasevento = em.find(Personasevento.class, personasevento.getPersonaseventoPK());
            Persona personaOld = persistentPersonasevento.getPersona();
            Persona personaNew = personasevento.getPersona();
            if (personaNew != null) {
                personaNew = em.getReference(personaNew.getClass(), personaNew.getDni());
                personasevento.setPersona(personaNew);
            }
            personasevento = em.merge(personasevento);
            if (personaOld != null && !personaOld.equals(personaNew)) {
                personaOld.getPersonaseventoList().remove(personasevento);
                personaOld = em.merge(personaOld);
            }
            if (personaNew != null && !personaNew.equals(personaOld)) {
                personaNew.getPersonaseventoList().add(personasevento);
                personaNew = em.merge(personaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                PersonaseventoPK id = personasevento.getPersonaseventoPK();
                if (findPersonasevento(id) == null) {
                    throw new NonexistentEntityException("The personasevento with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(PersonaseventoPK id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Personasevento personasevento;
            try {
                personasevento = em.getReference(Personasevento.class, id);
                personasevento.getPersonaseventoPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The personasevento with id " + id + " no longer exists.", enfe);
            }
            Persona persona = personasevento.getPersona();
            if (persona != null) {
                persona.getPersonaseventoList().remove(personasevento);
                persona = em.merge(persona);
            }
            em.remove(personasevento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Personasevento> findPersonaseventoEntities() {
        return findPersonaseventoEntities(true, -1, -1);
    }

    public List<Personasevento> findPersonaseventoEntities(int maxResults, int firstResult) {
        return findPersonaseventoEntities(false, maxResults, firstResult);
    }

    private List<Personasevento> findPersonaseventoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Personasevento.class));
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

    public Personasevento findPersonasevento(PersonaseventoPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Personasevento.class, id);
        } finally {
            em.close();
        }
    }

    public int getPersonaseventoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Personasevento> rt = cq.from(Personasevento.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
