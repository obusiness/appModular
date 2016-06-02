/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.obusiness.entidades;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EQUIPO
 */
@Entity
@Table(name = "TB_PER_UBICACION", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbPerUbicacion.findAll", query = "SELECT t FROM TbPerUbicacion t"),
    @NamedQuery(name = "TbPerUbicacion.findById", query = "SELECT t FROM TbPerUbicacion t WHERE t.id = :id"),
    @NamedQuery(name = "TbPerUbicacion.findByDescripcion", query = "SELECT t FROM TbPerUbicacion t WHERE t.descripcion = :descripcion")})
public class TbPerUbicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "TIPO_UBICACION", referencedColumnName = "ID")
    @ManyToOne
    private TbTipoUbicaciones tipoUbicacion;
    @JoinColumns({
        @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA"),
        @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID")})
    @ManyToOne(optional = false)
    private TbPersonas tbPersonas;

    public TbPerUbicacion() {
    }

    public TbPerUbicacion(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TbTipoUbicaciones getTipoUbicacion() {
        return tipoUbicacion;
    }

    public void setTipoUbicacion(TbTipoUbicaciones tipoUbicacion) {
        this.tipoUbicacion = tipoUbicacion;
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
        if (!(object instanceof TbPerUbicacion)) {
            return false;
        }
        TbPerUbicacion other = (TbPerUbicacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbPerUbicacion[ id=" + id + " ]";
    }
    
}
