/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.obusiness.entidades;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EQUIPO
 */
@Entity
@Table(name = "TB_TIPO_REGION", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTipoRegion.findAll", query = "SELECT t FROM TbTipoRegion t"),
    @NamedQuery(name = "TbTipoRegion.findById", query = "SELECT t FROM TbTipoRegion t WHERE t.id = :id"),
    @NamedQuery(name = "TbTipoRegion.findByCodigo", query = "SELECT t FROM TbTipoRegion t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TbTipoRegion.findByRegion", query = "SELECT t FROM TbTipoRegion t WHERE t.region = :region")})
public class TbTipoRegion implements Serializable {

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
    @Column(name = "REGION")
    private String region;
    @OneToMany(mappedBy = "idRegion")
    private List<TbPerDirecciones> tbPerDireccionesList;

    public TbTipoRegion() {
    }

    public TbTipoRegion(Long id) {
        this.id = id;
    }

    public TbTipoRegion(Long id, String codigo, String region) {
        this.id = id;
        this.codigo = codigo;
        this.region = region;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @XmlTransient
    public List<TbPerDirecciones> getTbPerDireccionesList() {
        return tbPerDireccionesList;
    }

    public void setTbPerDireccionesList(List<TbPerDirecciones> tbPerDireccionesList) {
        this.tbPerDireccionesList = tbPerDireccionesList;
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
        if (!(object instanceof TbTipoRegion)) {
            return false;
        }
        TbTipoRegion other = (TbTipoRegion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbTipoRegion[ id=" + id + " ]";
    }
    
}
