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
@Table(name = "TS_EMP_ROLES_USUARIOS", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TsEmpRolesUsuarios.findAll", query = "SELECT t FROM TsEmpRolesUsuarios t"),
    @NamedQuery(name = "TsEmpRolesUsuarios.findById", query = "SELECT t FROM TsEmpRolesUsuarios t WHERE t.id = :id")})
public class TsEmpRolesUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @JoinColumns({
        @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID"),
        @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA")})
    @ManyToOne(optional = false)
    private TsEmpUsuarios tsEmpUsuarios;
    @JoinColumn(name = "ID_ROL", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TsEmpRoles idRol;

    public TsEmpRolesUsuarios() {
    }

    public TsEmpRolesUsuarios(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TsEmpUsuarios getTsEmpUsuarios() {
        return tsEmpUsuarios;
    }

    public void setTsEmpUsuarios(TsEmpUsuarios tsEmpUsuarios) {
        this.tsEmpUsuarios = tsEmpUsuarios;
    }

    public TsEmpRoles getIdRol() {
        return idRol;
    }

    public void setIdRol(TsEmpRoles idRol) {
        this.idRol = idRol;
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
        if (!(object instanceof TsEmpRolesUsuarios)) {
            return false;
        }
        TsEmpRolesUsuarios other = (TsEmpRolesUsuarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TsEmpRolesUsuarios[ id=" + id + " ]";
    }
    
}
