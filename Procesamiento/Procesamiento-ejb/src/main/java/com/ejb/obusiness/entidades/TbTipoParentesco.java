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
@Table(name = "TB_TIPO_PARENTESCO", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTipoParentesco.findAll", query = "SELECT t FROM TbTipoParentesco t"),
    @NamedQuery(name = "TbTipoParentesco.findById", query = "SELECT t FROM TbTipoParentesco t WHERE t.id = :id"),
    @NamedQuery(name = "TbTipoParentesco.findByCodigo", query = "SELECT t FROM TbTipoParentesco t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TbTipoParentesco.findByParentesco", query = "SELECT t FROM TbTipoParentesco t WHERE t.parentesco = :parentesco")})
public class TbTipoParentesco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "CODIGO")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "PARENTESCO")
    private String parentesco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parentesco")
    private List<TbPerAcompanante> tbPerAcompananteList;

    public TbTipoParentesco() {
    }

    public TbTipoParentesco(Long id) {
        this.id = id;
    }

    public TbTipoParentesco(Long id, String codigo, String parentesco) {
        this.id = id;
        this.codigo = codigo;
        this.parentesco = parentesco;
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

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @XmlTransient
    public List<TbPerAcompanante> getTbPerAcompananteList() {
        return tbPerAcompananteList;
    }

    public void setTbPerAcompananteList(List<TbPerAcompanante> tbPerAcompananteList) {
        this.tbPerAcompananteList = tbPerAcompananteList;
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
        if (!(object instanceof TbTipoParentesco)) {
            return false;
        }
        TbTipoParentesco other = (TbTipoParentesco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbTipoParentesco[ id=" + id + " ]";
    }
    
}
