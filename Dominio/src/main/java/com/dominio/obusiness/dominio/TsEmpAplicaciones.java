/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.obusiness.dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EQUIPO
 */
@Entity
@Table(name = "TS_EMP_APLICACIONES", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TsEmpAplicaciones.findAll", query = "SELECT t FROM TsEmpAplicaciones t"),
    @NamedQuery(name = "TsEmpAplicaciones.findByIdEmpresa", query = "SELECT t FROM TsEmpAplicaciones t WHERE t.tsEmpAplicacionesPK.idEmpresa = :idEmpresa"),
    @NamedQuery(name = "TsEmpAplicaciones.findById", query = "SELECT t FROM TsEmpAplicaciones t WHERE t.tsEmpAplicacionesPK.id = :id"),
    @NamedQuery(name = "TsEmpAplicaciones.findByEstado", query = "SELECT t FROM TsEmpAplicaciones t WHERE t.estado = :estado"),
    @NamedQuery(name = "TsEmpAplicaciones.findByFechaInicio", query = "SELECT t FROM TsEmpAplicaciones t WHERE t.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "TsEmpAplicaciones.findByFechaFinal", query = "SELECT t FROM TsEmpAplicaciones t WHERE t.fechaFinal = :fechaFinal"),
    @NamedQuery(name = "TsEmpAplicaciones.findByModuloAplicacion", query = "SELECT t FROM TsEmpAplicaciones t WHERE t.tsEmpAplicacionesPK.moduloAplicacion = :moduloAplicacion")})
public class TsEmpAplicaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TsEmpAplicacionesPK tsEmpAplicacionesPK;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "FECHA_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinal;
    @JoinColumn(name = "MODULO_APLICACION", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TsCfgModulos tsCfgModulos;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbEmpresas tbEmpresas;

    public TsEmpAplicaciones() {
    }

    public TsEmpAplicaciones(TsEmpAplicacionesPK tsEmpAplicacionesPK) {
        this.tsEmpAplicacionesPK = tsEmpAplicacionesPK;
    }

    public TsEmpAplicaciones(long idEmpresa, long id, long moduloAplicacion) {
        this.tsEmpAplicacionesPK = new TsEmpAplicacionesPK(idEmpresa, id, moduloAplicacion);
    }

    public TsEmpAplicacionesPK getTsEmpAplicacionesPK() {
        return tsEmpAplicacionesPK;
    }

    public void setTsEmpAplicacionesPK(TsEmpAplicacionesPK tsEmpAplicacionesPK) {
        this.tsEmpAplicacionesPK = tsEmpAplicacionesPK;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public TsCfgModulos getTsCfgModulos() {
        return tsCfgModulos;
    }

    public void setTsCfgModulos(TsCfgModulos tsCfgModulos) {
        this.tsCfgModulos = tsCfgModulos;
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
        hash += (tsEmpAplicacionesPK != null ? tsEmpAplicacionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TsEmpAplicaciones)) {
            return false;
        }
        TsEmpAplicaciones other = (TsEmpAplicaciones) object;
        if ((this.tsEmpAplicacionesPK == null && other.tsEmpAplicacionesPK != null) || (this.tsEmpAplicacionesPK != null && !this.tsEmpAplicacionesPK.equals(other.tsEmpAplicacionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TsEmpAplicaciones[ tsEmpAplicacionesPK=" + tsEmpAplicacionesPK + " ]";
    }
    
}
