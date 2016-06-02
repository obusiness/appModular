/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.obusiness.dominio;

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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EQUIPO
 */
@Entity
@Table(name = "TB_TIPO_DOCUMENTOS", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTipoDocumentos.findAll", query = "SELECT t FROM TbTipoDocumentos t"),
    @NamedQuery(name = "TbTipoDocumentos.findById", query = "SELECT t FROM TbTipoDocumentos t WHERE t.id = :id"),
    @NamedQuery(name = "TbTipoDocumentos.findByCodigo", query = "SELECT t FROM TbTipoDocumentos t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TbTipoDocumentos.findByDescripcion", query = "SELECT t FROM TbTipoDocumentos t WHERE t.descripcion = :descripcion")})
public class TbTipoDocumentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoDocumento")
    private List<TbPersonas> tbPersonasList;

    public TbTipoDocumentos() {
    }

    public TbTipoDocumentos(Long id) {
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
        if (!(object instanceof TbTipoDocumentos)) {
            return false;
        }
        TbTipoDocumentos other = (TbTipoDocumentos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbTipoDocumentos[ id=" + id + " ]";
    }
    
}
