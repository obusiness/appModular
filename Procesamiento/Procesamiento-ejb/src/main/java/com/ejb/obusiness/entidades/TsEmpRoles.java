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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "TS_EMP_ROLES", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TsEmpRoles.findAll", query = "SELECT t FROM TsEmpRoles t"),
    @NamedQuery(name = "TsEmpRoles.findById", query = "SELECT t FROM TsEmpRoles t WHERE t.id = :id"),
    @NamedQuery(name = "TsEmpRoles.findByRol", query = "SELECT t FROM TsEmpRoles t WHERE t.rol = :rol"),
    @NamedQuery(name = "TsEmpRoles.findByDescripcion", query = "SELECT t FROM TsEmpRoles t WHERE t.descripcion = :descripcion")})
public class TsEmpRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ROL")
    private String rol;
    @Size(max = 1000)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "ID_EMPRESAS", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbEmpresas idEmpresas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRol")
    private List<TsEmpRolesUsuarios> tsEmpRolesUsuariosList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idRol")
    private TsEmpPermisos tsEmpPermisos;

    public TsEmpRoles() {
    }

    public TsEmpRoles(Long id) {
        this.id = id;
    }

    public TsEmpRoles(Long id, String rol) {
        this.id = id;
        this.rol = rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TbEmpresas getIdEmpresas() {
        return idEmpresas;
    }

    public void setIdEmpresas(TbEmpresas idEmpresas) {
        this.idEmpresas = idEmpresas;
    }

    @XmlTransient
    public List<TsEmpRolesUsuarios> getTsEmpRolesUsuariosList() {
        return tsEmpRolesUsuariosList;
    }

    public void setTsEmpRolesUsuariosList(List<TsEmpRolesUsuarios> tsEmpRolesUsuariosList) {
        this.tsEmpRolesUsuariosList = tsEmpRolesUsuariosList;
    }

    public TsEmpPermisos getTsEmpPermisos() {
        return tsEmpPermisos;
    }

    public void setTsEmpPermisos(TsEmpPermisos tsEmpPermisos) {
        this.tsEmpPermisos = tsEmpPermisos;
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
        if (!(object instanceof TsEmpRoles)) {
            return false;
        }
        TsEmpRoles other = (TsEmpRoles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TsEmpRoles[ id=" + id + " ]";
    }
    
}
