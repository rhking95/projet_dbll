/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbll;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rh The King
 */
@Entity
@Table(name = "marques")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marques.findAll", query = "SELECT m FROM Marques m")
    , @NamedQuery(name = "Marques.findByIdm", query = "SELECT m FROM Marques m WHERE m.idm = :idm")
    , @NamedQuery(name = "Marques.findByNomm", query = "SELECT m FROM Marques m WHERE m.nomm = :nomm")
    , @NamedQuery(name = "Marques.findByLogoM", query = "SELECT m FROM Marques m WHERE m.logoM = :logoM")})
public class Marques implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idm")
    private Integer idm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nom_m")
    private String nomm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10000)
    @Column(name = "logo_m")
    private String logoM;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idm")
    private Collection<Voitures> voituresCollection;

    public Marques() {
    }

    public Marques(Integer idm) {
        this.idm = idm;
    }

    public Marques(Integer idm, String nomm, String logoM) {
        this.idm = idm;
        this.nomm = nomm;
        this.logoM = logoM;
    }

    public Integer getIdm() {
        return idm;
    }

    public void setIdm(Integer idm) {
        this.idm = idm;
    }

    public String getNomm() {
        return nomm;
    }

    public void setNomm(String nomm) {
        this.nomm = nomm;
    }

    public String getLogoM() {
        return logoM;
    }

    public void setLogoM(String logoM) {
        this.logoM = logoM;
    }

    @XmlTransient
    public Collection<Voitures> getVoituresCollection() {
        return voituresCollection;
    }

    public void setVoituresCollection(Collection<Voitures> voituresCollection) {
        this.voituresCollection = voituresCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idm != null ? idm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marques)) {
            return false;
        }
        Marques other = (Marques) object;
        if ((this.idm == null && other.idm != null) || (this.idm != null && !this.idm.equals(other.idm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dbll.Marques[ idm=" + idm + " ]";
    }
    
}
