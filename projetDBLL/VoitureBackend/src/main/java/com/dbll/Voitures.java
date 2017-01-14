/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbll;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rh The King
 */
@Entity
@Table(name = "voitures")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Voitures.findAll", query = "SELECT v FROM Voitures v")
    , @NamedQuery(name = "Voitures.findByIdv", query = "SELECT v FROM Voitures v WHERE v.idv = :idv")
    , @NamedQuery(name = "Voitures.findByNomV", query = "SELECT v FROM Voitures v WHERE v.nomV = :nomV")
    , @NamedQuery(name = "Voitures.findByImageV", query = "SELECT v FROM Voitures v WHERE v.imageV = :imageV")
    , @NamedQuery(name = "Voitures.findByPrix", query = "SELECT v FROM Voitures v WHERE v.prix = :prix")})
public class Voitures implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idv")
    private Integer idv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nom_v")
    private String nomV;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10000)
    @Column(name = "image_v")
    private String imageV;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prix")
    private long prix;
    @JoinColumn(name = "idm", referencedColumnName = "idm")
    @ManyToOne(optional = false)
    private Marques idm;

    public Voitures() {
    }

    public Voitures(Integer idv) {
        this.idv = idv;
    }

    public Voitures(Integer idv, String nomV, String imageV, long prix) {
        this.idv = idv;
        this.nomV = nomV;
        this.imageV = imageV;
        this.prix = prix;
    }

    public Integer getIdv() {
        return idv;
    }

    public void setIdv(Integer idv) {
        this.idv = idv;
    }

    public String getNomV() {
        return nomV;
    }

    public void setNomV(String nomV) {
        this.nomV = nomV;
    }

    public String getImageV() {
        return imageV;
    }

    public void setImageV(String imageV) {
        this.imageV = imageV;
    }

    public long getPrix() {
        return prix;
    }

    public void setPrix(long prix) {
        this.prix = prix;
    }

    public Marques getIdm() {
        return idm;
    }

    public void setIdm(Marques idm) {
        this.idm = idm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idv != null ? idv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Voitures)) {
            return false;
        }
        Voitures other = (Voitures) object;
        if ((this.idv == null && other.idv != null) || (this.idv != null && !this.idv.equals(other.idv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dbll.Voitures[ idv=" + idv + " ]";
    }
    
}
