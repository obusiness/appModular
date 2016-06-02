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
@Table(name = "TS_CFG_MODULOS", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TsCfgModulos.findAll", query = "SELECT t FROM TsCfgModulos t"),
    @NamedQuery(name = "TsCfgModulos.findByCodigo", query = "SELECT t FROM TsCfgModulos t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TsCfgModulos.findByModulo", query = "SELECT t FROM TsCfgModulos t WHERE t.modulo = :modulo"),
    @NamedQuery(name = "TsCfgModulos.findByDescripcion", query = "SELECT t FROM TsCfgModulos t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "TsCfgModulos.findByObservaciones", query = "SELECT t FROM TsCfgModulos t WHERE t.observaciones = :observaciones")})
public class TsCfgModulos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Long codigo;
    @Column(name = "MODULO")
    private String modulo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tsCfgModulos")
    private List<TsEmpAplicaciones> tsEmpAplicacionesList;
    @OneToMany(mappedBy = "codigoModulo")
    private List<TsCfgModuloComponentes> tsCfgModuloComponentesList;

    public TsCfgModulos() {
    }

    public TsCfgModulos(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @XmlTransient
    public List<TsEmpAplicaciones> getTsEmpAplicacionesList() {
        return tsEmpAplicacionesList;
    }

    public void setTsEmpAplicacionesList(List<TsEmpAplicaciones> tsEmpAplicacionesList) {
        this.tsEmpAplicacionesList = tsEmpAplicacionesList;
    }

    @XmlTransient
    public List<TsCfgModuloComponentes> getTsCfgModuloComponentesList() {
        return tsCfgModuloComponentesList;
    }

    public void setTsCfgModuloComponentesList(List<TsCfgModuloComponentes> tsCfgModuloComponentesList) {
        this.tsCfgModuloComponentesList = tsCfgModuloComponentesList;
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
        if (!(object instanceof TsCfgModulos)) {
            return false;
        }
        TsCfgModulos other = (TsCfgModulos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TsCfgModulos[ codigo=" + codigo + " ]";
    }
    
}
