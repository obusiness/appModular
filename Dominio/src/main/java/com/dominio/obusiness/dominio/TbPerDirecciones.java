/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.obusiness.dominio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EQUIPO
 */
@Entity
@Table(name = "TB_PER_DIRECCIONES", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbPerDirecciones.findAll", query = "SELECT t FROM TbPerDirecciones t"),
    @NamedQuery(name = "TbPerDirecciones.findById", query = "SELECT t FROM TbPerDirecciones t WHERE t.id = :id"),
    @NamedQuery(name = "TbPerDirecciones.findByDireccion", query = "SELECT t FROM TbPerDirecciones t WHERE t.direccion = :direccion")})
public class TbPerDirecciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "DIRECCION")
    private String direccion;
    @JoinColumn(name = "ID_REGION", referencedColumnName = "ID")
    @ManyToOne
    private TbTipoRegion idRegion;
    @JoinColumns({
        @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA"),
        @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID")})
    @ManyToOne(optional = false)
    private TbPersonas tbPersonas;

    public TbPerDirecciones() {
    }

    public TbPerDirecciones(Long id) {
        this.id = id;
    }

    public TbPerDirecciones(Long id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TbTipoRegion getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(TbTipoRegion idRegion) {
        this.idRegion = idRegion;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbPerDirecciones)) {
            return false;
        }
        TbPerDirecciones other = (TbPerDirecciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbPerDirecciones[ id=" + id + " ]";
    }
    
}
