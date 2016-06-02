/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.obusiness.dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EQUIPO
 */
@Entity
@Table(name = "TB_TIPO_UBICACIONES", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTipoUbicaciones.findAll", query = "SELECT t FROM TbTipoUbicaciones t"),
    @NamedQuery(name = "TbTipoUbicaciones.findById", query = "SELECT t FROM TbTipoUbicaciones t WHERE t.id = :id"),
    @NamedQuery(name = "TbTipoUbicaciones.findByCodigo", query = "SELECT t FROM TbTipoUbicaciones t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TbTipoUbicaciones.findByUbicacion", query = "SELECT t FROM TbTipoUbicaciones t WHERE t.ubicacion = :ubicacion")})
public class TbTipoUbicaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "UBICACION")
    private String ubicacion;
    @OneToMany(mappedBy = "tipoUbicacion")
    private List<TbPerUbicacion> tbPerUbicacionList;

    public TbTipoUbicaciones() {
    }

    public TbTipoUbicaciones(Long id) {
        this.id = id;
    }

    public TbTipoUbicaciones(Long id, String codigo, String ubicacion) {
        this.id = id;
        this.codigo = codigo;
        this.ubicacion = ubicacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @XmlTransient
    public List<TbPerUbicacion> getTbPerUbicacionList() {
        return tbPerUbicacionList;
    }

    public void setTbPerUbicacionList(List<TbPerUbicacion> tbPerUbicacionList) {
        this.tbPerUbicacionList = tbPerUbicacionList;
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
        if (!(object instanceof TbTipoUbicaciones)) {
            return false;
        }
        TbTipoUbicaciones other = (TbTipoUbicaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbTipoUbicaciones[ id=" + id + " ]";
    }
    
}
