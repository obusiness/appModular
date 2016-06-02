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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name = "TS_EMP_USUARIOS", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TsEmpUsuarios.findAll", query = "SELECT t FROM TsEmpUsuarios t"),
    @NamedQuery(name = "TsEmpUsuarios.findById", query = "SELECT t FROM TsEmpUsuarios t WHERE t.tsEmpUsuariosPK.id = :id"),
    @NamedQuery(name = "TsEmpUsuarios.findByIdEmpresa", query = "SELECT t FROM TsEmpUsuarios t WHERE t.tsEmpUsuariosPK.idEmpresa = :idEmpresa"),
    @NamedQuery(name = "TsEmpUsuarios.findByUsuario", query = "SELECT t FROM TsEmpUsuarios t WHERE t.usuario = :usuario"),
    @NamedQuery(name = "TsEmpUsuarios.findByEstado", query = "SELECT t FROM TsEmpUsuarios t WHERE t.estado = :estado")})
public class TsEmpUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TsEmpUsuariosPK tsEmpUsuariosPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "USUARIO")
    private String usuario;
    @Size(max = 10)
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tsEmpUsuarios")
    private List<TsEmpRolesUsuarios> tsEmpRolesUsuariosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tsEmpUsuarios")
    private List<TbSucUsuario> tbSucUsuarioList;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbEmpresas tbEmpresas;

    public TsEmpUsuarios() {
    }

    public TsEmpUsuarios(TsEmpUsuariosPK tsEmpUsuariosPK) {
        this.tsEmpUsuariosPK = tsEmpUsuariosPK;
    }

    public TsEmpUsuarios(TsEmpUsuariosPK tsEmpUsuariosPK, String usuario) {
        this.tsEmpUsuariosPK = tsEmpUsuariosPK;
        this.usuario = usuario;
    }

    public TsEmpUsuarios(long id, long idEmpresa) {
        this.tsEmpUsuariosPK = new TsEmpUsuariosPK(id, idEmpresa);
    }

    public TsEmpUsuariosPK getTsEmpUsuariosPK() {
        return tsEmpUsuariosPK;
    }

    public void setTsEmpUsuariosPK(TsEmpUsuariosPK tsEmpUsuariosPK) {
        this.tsEmpUsuariosPK = tsEmpUsuariosPK;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<TsEmpRolesUsuarios> getTsEmpRolesUsuariosList() {
        return tsEmpRolesUsuariosList;
    }

    public void setTsEmpRolesUsuariosList(List<TsEmpRolesUsuarios> tsEmpRolesUsuariosList) {
        this.tsEmpRolesUsuariosList = tsEmpRolesUsuariosList;
    }

    @XmlTransient
    public List<TbSucUsuario> getTbSucUsuarioList() {
        return tbSucUsuarioList;
    }

    public void setTbSucUsuarioList(List<TbSucUsuario> tbSucUsuarioList) {
        this.tbSucUsuarioList = tbSucUsuarioList;
    }

    public TbEmpresas getTbEmpresas() {
        return tbEmpresas;
    }

    public void setTbEmpresas(TbEmpresas tbEmpresas) {
        this.tbEmpresas = tbEmpresas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tsEmpUsuariosPK != null ? tsEmpUsuariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TsEmpUsuarios)) {
            return false;
        }
        TsEmpUsuarios other = (TsEmpUsuarios) object;
        if ((this.tsEmpUsuariosPK == null && other.tsEmpUsuariosPK != null) || (this.tsEmpUsuariosPK != null && !this.tsEmpUsuariosPK.equals(other.tsEmpUsuariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TsEmpUsuarios[ tsEmpUsuariosPK=" + tsEmpUsuariosPK + " ]";
    }
    
}
