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
@Table(name = "TB_EMPRESAS", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbEmpresas.findAll", query = "SELECT t FROM TbEmpresas t"),
    @NamedQuery(name = "TbEmpresas.findById", query = "SELECT t FROM TbEmpresas t WHERE t.id = :id"),
    @NamedQuery(name = "TbEmpresas.findByNombre", query = "SELECT t FROM TbEmpresas t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TbEmpresas.findByDescripcion", query = "SELECT t FROM TbEmpresas t WHERE t.descripcion = :descripcion")})
public class TbEmpresas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 1000)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<TbMsTipoRamos> tbMsTipoRamosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbEmpresas")
    private List<TsEmpAplicaciones> tsEmpAplicacionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<TbInvProductos> tbInvProductosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresas")
    private List<TsEmpRoles> tsEmpRolesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbEmpresas")
    private List<TsEmpUsuarios> tsEmpUsuariosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<TbMsTipoCompanias> tbMsTipoCompaniasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbEmpresas")
    private List<TbPersonas> tbPersonasList;

    public TbEmpresas() {
    }

    public TbEmpresas(Long id) {
        this.id = id;
    }

    public TbEmpresas(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<TbMsTipoRamos> getTbMsTipoRamosList() {
        return tbMsTipoRamosList;
    }

    public void setTbMsTipoRamosList(List<TbMsTipoRamos> tbMsTipoRamosList) {
        this.tbMsTipoRamosList = tbMsTipoRamosList;
    }

    @XmlTransient
    public List<TsEmpAplicaciones> getTsEmpAplicacionesList() {
        return tsEmpAplicacionesList;
    }

    public void setTsEmpAplicacionesList(List<TsEmpAplicaciones> tsEmpAplicacionesList) {
        this.tsEmpAplicacionesList = tsEmpAplicacionesList;
    }

    @XmlTransient
    public List<TbInvProductos> getTbInvProductosList() {
        return tbInvProductosList;
    }

    public void setTbInvProductosList(List<TbInvProductos> tbInvProductosList) {
        this.tbInvProductosList = tbInvProductosList;
    }

    @XmlTransient
    public List<TsEmpRoles> getTsEmpRolesList() {
        return tsEmpRolesList;
    }

    public void setTsEmpRolesList(List<TsEmpRoles> tsEmpRolesList) {
        this.tsEmpRolesList = tsEmpRolesList;
    }

    @XmlTransient
    public List<TsEmpUsuarios> getTsEmpUsuariosList() {
        return tsEmpUsuariosList;
    }

    public void setTsEmpUsuariosList(List<TsEmpUsuarios> tsEmpUsuariosList) {
        this.tsEmpUsuariosList = tsEmpUsuariosList;
    }

    @XmlTransient
    public List<TbMsTipoCompanias> getTbMsTipoCompaniasList() {
        return tbMsTipoCompaniasList;
    }

    public void setTbMsTipoCompaniasList(List<TbMsTipoCompanias> tbMsTipoCompaniasList) {
        this.tbMsTipoCompaniasList = tbMsTipoCompaniasList;
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
        if (!(object instanceof TbEmpresas)) {
            return false;
        }
        TbEmpresas other = (TbEmpresas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbEmpresas[ id=" + id + " ]";
    }
    
}
