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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "TB_SUCURSALES", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbSucursales.findAll", query = "SELECT t FROM TbSucursales t"),
    @NamedQuery(name = "TbSucursales.findById", query = "SELECT t FROM TbSucursales t WHERE t.id = :id"),
    @NamedQuery(name = "TbSucursales.findBySucursal", query = "SELECT t FROM TbSucursales t WHERE t.sucursal = :sucursal"),
    @NamedQuery(name = "TbSucursales.findByLogo", query = "SELECT t FROM TbSucursales t WHERE t.logo = :logo")})
public class TbSucursales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 200)
    @Column(name = "SUCURSAL")
    private String sucursal;
    @Size(max = 200)
    @Column(name = "LOGO")
    private String logo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSucursal")
    private List<TbSucUsuario> tbSucUsuarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbSucursales")
    private List<TbInvSucursal> tbInvSucursalList;
    @JoinColumns({
        @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA"),
        @JoinColumn(name = "ID_PERSONAS", referencedColumnName = "ID")})
    @ManyToOne(optional = false)
    private TbPersonas tbPersonas;

    public TbSucursales() {
    }

    public TbSucursales(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @XmlTransient
    public List<TbSucUsuario> getTbSucUsuarioList() {
        return tbSucUsuarioList;
    }

    public void setTbSucUsuarioList(List<TbSucUsuario> tbSucUsuarioList) {
        this.tbSucUsuarioList = tbSucUsuarioList;
    }

    @XmlTransient
    public List<TbInvSucursal> getTbInvSucursalList() {
        return tbInvSucursalList;
    }

    public void setTbInvSucursalList(List<TbInvSucursal> tbInvSucursalList) {
        this.tbInvSucursalList = tbInvSucursalList;
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
        if (!(object instanceof TbSucursales)) {
            return false;
        }
        TbSucursales other = (TbSucursales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbSucursales[ id=" + id + " ]";
    }
    
}
