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
@Table(name = "TS_CFG_COMPONENTES", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TsCfgComponentes.findAll", query = "SELECT t FROM TsCfgComponentes t"),
    @NamedQuery(name = "TsCfgComponentes.findByCodigo", query = "SELECT t FROM TsCfgComponentes t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TsCfgComponentes.findByComponente", query = "SELECT t FROM TsCfgComponentes t WHERE t.componente = :componente"),
    @NamedQuery(name = "TsCfgComponentes.findByDescripcion", query = "SELECT t FROM TsCfgComponentes t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "TsCfgComponentes.findByFuncion", query = "SELECT t FROM TsCfgComponentes t WHERE t.funcion = :funcion")})
public class TsCfgComponentes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "COMPONENTE")
    private String componente;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FUNCION")
    private String funcion;
    @OneToMany(mappedBy = "codigoComponente")
    private List<TsCfgModuloComponentes> tsCfgModuloComponentesList;
    @JoinColumn(name = "CODIGO_TIPO_COMPONENTE", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private TsCfgTipoComponentes codigoTipoComponente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoComponente")
    private List<TsEmpPermisos> tsEmpPermisosList;

    public TsCfgComponentes() {
    }

    public TsCfgComponentes(String codigo) {
        this.codigo = codigo;
    }

    public TsCfgComponentes(String codigo, String componente) {
        this.codigo = codigo;
        this.componente = componente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @XmlTransient
    public List<TsCfgModuloComponentes> getTsCfgModuloComponentesList() {
        return tsCfgModuloComponentesList;
    }

    public void setTsCfgModuloComponentesList(List<TsCfgModuloComponentes> tsCfgModuloComponentesList) {
        this.tsCfgModuloComponentesList = tsCfgModuloComponentesList;
    }

    public TsCfgTipoComponentes getCodigoTipoComponente() {
        return codigoTipoComponente;
    }

    public void setCodigoTipoComponente(TsCfgTipoComponentes codigoTipoComponente) {
        this.codigoTipoComponente = codigoTipoComponente;
    }

    @XmlTransient
    public List<TsEmpPermisos> getTsEmpPermisosList() {
        return tsEmpPermisosList;
    }

    public void setTsEmpPermisosList(List<TsEmpPermisos> tsEmpPermisosList) {
        this.tsEmpPermisosList = tsEmpPermisosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TsCfgComponentes)) {
            return false;
        }
        TsCfgComponentes other = (TsCfgComponentes) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TsCfgComponentes[ codigo=" + codigo + " ]";
    }
    
}
