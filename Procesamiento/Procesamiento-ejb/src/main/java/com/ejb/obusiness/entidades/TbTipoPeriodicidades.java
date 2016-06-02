/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.obusiness.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EQUIPO
 */
@Entity
@Table(name = "TB_TIPO_PERIODICIDADES", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTipoPeriodicidades.findAll", query = "SELECT t FROM TbTipoPeriodicidades t"),
    @NamedQuery(name = "TbTipoPeriodicidades.findById", query = "SELECT t FROM TbTipoPeriodicidades t WHERE t.id = :id"),
    @NamedQuery(name = "TbTipoPeriodicidades.findByPeriodicidad", query = "SELECT t FROM TbTipoPeriodicidades t WHERE t.periodicidad = :periodicidad"),
    @NamedQuery(name = "TbTipoPeriodicidades.findByNumeroDias", query = "SELECT t FROM TbTipoPeriodicidades t WHERE t.numeroDias = :numeroDias"),
    @NamedQuery(name = "TbTipoPeriodicidades.findByPeriodoAnual", query = "SELECT t FROM TbTipoPeriodicidades t WHERE t.periodoAnual = :periodoAnual"),
    @NamedQuery(name = "TbTipoPeriodicidades.findByPeriodoMesual", query = "SELECT t FROM TbTipoPeriodicidades t WHERE t.periodoMesual = :periodoMesual")})
public class TbTipoPeriodicidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 45)
    @Column(name = "PERIODICIDAD")
    private String periodicidad;
    @Column(name = "NUMERO_DIAS")
    private Long numeroDias;
    @Column(name = "PERIODO_ANUAL")
    private Long periodoAnual;
    @Column(name = "PERIODO_MESUAL")
    private Long periodoMesual;

    public TbTipoPeriodicidades() {
    }

    public TbTipoPeriodicidades(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public Long getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(Long numeroDias) {
        this.numeroDias = numeroDias;
    }

    public Long getPeriodoAnual() {
        return periodoAnual;
    }

    public void setPeriodoAnual(Long periodoAnual) {
        this.periodoAnual = periodoAnual;
    }

    public Long getPeriodoMesual() {
        return periodoMesual;
    }

    public void setPeriodoMesual(Long periodoMesual) {
        this.periodoMesual = periodoMesual;
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
        if (!(object instanceof TbTipoPeriodicidades)) {
            return false;
        }
        TbTipoPeriodicidades other = (TbTipoPeriodicidades) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbTipoPeriodicidades[ id=" + id + " ]";
    }
    
}
