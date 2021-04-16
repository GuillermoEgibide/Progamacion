/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 1GDAW12
 */
@Entity
@Table(name = "personaseventos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personasevento.findAll", query = "SELECT p FROM Personasevento p")
    , @NamedQuery(name = "Personasevento.findByDni", query = "SELECT p FROM Personasevento p WHERE p.personaseventoPK.dni = :dni")
    , @NamedQuery(name = "Personasevento.findByNombre", query = "SELECT p FROM Personasevento p WHERE p.personaseventoPK.nombre = :nombre")})
public class Personasevento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PersonaseventoPK personaseventoPK;
    @JoinColumn(name = "dni", referencedColumnName = "Dni", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Persona persona;

    public Personasevento() {
    }

    public Personasevento(PersonaseventoPK personaseventoPK) {
        this.personaseventoPK = personaseventoPK;
    }

    public Personasevento(String dni, String nombre) {
        this.personaseventoPK = new PersonaseventoPK(dni, nombre);
    }

    public PersonaseventoPK getPersonaseventoPK() {
        return personaseventoPK;
    }

    public void setPersonaseventoPK(PersonaseventoPK personaseventoPK) {
        this.personaseventoPK = personaseventoPK;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personaseventoPK != null ? personaseventoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personasevento)) {
            return false;
        }
        Personasevento other = (Personasevento) object;
        if ((this.personaseventoPK == null && other.personaseventoPK != null) || (this.personaseventoPK != null && !this.personaseventoPK.equals(other.personaseventoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ModeloUML.Personasevento[ personaseventoPK=" + personaseventoPK + " ]";
    }
    
}
