/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.obusiness.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EQUIPO
 */
@Entity
@Table(name = "TB_PER_ACOMPANANTE", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbPerAcompanante.findAll", query = "SELECT t FROM TbPerAcompanante t"),
    @NamedQuery(name = "TbPerAcompanante.findById", query = "SELECT t FROM TbPerAcompanante t WHERE t.tbPerAcompanantePK.id = :id"),
    @NamedQuery(name = "TbPerAcompanante.findByNombre", query = "SELECT t FROM TbPerAcompanante t WHERE t.tbPerAcompanantePK.nombre = :nombre"),
    @NamedQuery(name = "TbPerAcompanante.findByTelefono", query = "SELECT t FROM TbPerAcompanante t WHERE t.telefono = :telefono")})
public class TbPerAcompanante implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbPerAcompanantePK tbPerAcompanantePK;
    @Size(max = 45)
    @Column(name = "TELEFONO")
    private String telefono;
    @JoinColumn(name = "PARENTESCO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbTipoParentesco parentesco;
    @JoinColumns({
        @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA"),
        @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID")})
    @OneToOne(optional = false)
    private TbPersonas tbPersonas;

    public TbPerAcompanante() {
    }

    public TbPerAcompanante(TbPerAcompanantePK tbPerAcompanantePK) {
        this.tbPerAcompanantePK = tbPerAcompanantePK;
    }

    public TbPerAcompanante(long id, String nombre) {
        this.tbPerAcompanantePK = new TbPerAcompanantePK(id, nombre);
    }

    public TbPerAcompanantePK getTbPerAcompanantePK() {
        return tbPerAcompanantePK;
    }

    public void setTbPerAcompanantePK(TbPerAcompanantePK tbPerAcompanantePK) {
        this.tbPerAcompanantePK = tbPerAcompanantePK;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TbTipoParentesco getParentesco() {
        return parentesco;
    }

    public void setParentesco(TbTipoParentesco parentesco) {
        this.parentesco = parentesco;
    }

    public TbPersonas getTbPersonas() {
        return tbPersonas;
    }

    public void setTbPersonas(TbPersonas tbPersonas) {
        this.tbPersonas = tbPersonas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbPerAcompanantePK != null ? tbPerAcompanantePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbPerAcompanante)) {
            return false;
        }
        TbPerAcompanante other = (TbPerAcompanante) object;
        if ((this.tbPerAcompanantePK == null && other.tbPerAcompanantePK != null) || (this.tbPerAcompanantePK != null && !this.tbPerAcompanantePK.equals(other.tbPerAcompanantePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbPerAcompanante[ tbPerAcompanantePK=" + tbPerAcompanantePK + " ]";
    }
    
}
