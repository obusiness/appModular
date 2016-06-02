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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "TB_SUC_USUARIO", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbSucUsuario.findAll", query = "SELECT t FROM TbSucUsuario t"),
    @NamedQuery(name = "TbSucUsuario.findById", query = "SELECT t FROM TbSucUsuario t WHERE t.id = :id"),
    @NamedQuery(name = "TbSucUsuario.findByEstado", query = "SELECT t FROM TbSucUsuario t WHERE t.estado = :estado")})
public class TbSucUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumns({
        @JoinColumn(name = "ID_EMP_USU", referencedColumnName = "ID"),
        @JoinColumn(name = "ID_EMP_EMP", referencedColumnName = "ID_EMPRESA")})
    @ManyToOne(optional = false)
    private TsEmpUsuarios tsEmpUsuarios;
    @JoinColumn(name = "ID_SUCURSAL", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbSucursales idSucursal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
    private List<TbFacCuadres> tbFacCuadresList;

    public TbSucUsuario() {
    }

    public TbSucUsuario(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TsEmpUsuarios getTsEmpUsuarios() {
        return tsEmpUsuarios;
    }

    public void setTsEmpUsuarios(TsEmpUsuarios tsEmpUsuarios) {
        this.tsEmpUsuarios = tsEmpUsuarios;
    }

    public TbSucursales getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(TbSucursales idSucursal) {
        this.idSucursal = idSucursal;
    }

    @XmlTransient
    public List<TbFacCuadres> getTbFacCuadresList() {
        return tbFacCuadresList;
    }

    public void setTbFacCuadresList(List<TbFacCuadres> tbFacCuadresList) {
        this.tbFacCuadresList = tbFacCuadresList;
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
        if (!(object instanceof TbSucUsuario)) {
            return false;
        }
        TbSucUsuario other = (TbSucUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbSucUsuario[ id=" + id + " ]";
    }
    
}
