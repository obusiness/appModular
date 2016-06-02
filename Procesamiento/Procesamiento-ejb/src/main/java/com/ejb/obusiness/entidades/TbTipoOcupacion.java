/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.obusiness.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
 * @author EQUIPO
 */
@Entity
@Table(name = "TB_TIPO_OCUPACION", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTipoOcupacion.findAll", query = "SELECT t FROM TbTipoOcupacion t"),
    @NamedQuery(name = "TbTipoOcupacion.findById", query = "SELECT t FROM TbTipoOcupacion t WHERE t.id = :id"),
    @NamedQuery(name = "TbTipoOcupacion.findByCodigo", query = "SELECT t FROM TbTipoOcupacion t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TbTipoOcupacion.findByDescripcion", query = "SELECT t FROM TbTipoOcupacion t WHERE t.descripcion = :descripcion")})
public class TbTipoOcupacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 6)
    @Column(name = "CODIGO")
    private String codigo;
    @Size(max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ocupacion")
    private List<TbPersonas> tbPersonasList;

    public TbTipoOcupacion() {
    }

    public TbTipoOcupacion(Long id) {
        this.id = id;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<TbPersonas> getTbPersonasList() {
        return tbPersonasList;
    }

    public void setTbPersonasList(List<TbPersonas> tbPersonasList) {
        this.tbPersonasList = tbPersonasList;
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
        if (!(object instanceof TbTipoOcupacion)) {
            return false;
        }
        TbTipoOcupacion other = (TbTipoOcupacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbTipoOcupacion[ id=" + id + " ]";
    }
    
}
