/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.obusiness.dominio;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "TB_MS_PARTICIPACIONES", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbMsParticipaciones.findAll", query = "SELECT t FROM TbMsParticipaciones t"),
    @NamedQuery(name = "TbMsParticipaciones.findById", query = "SELECT t FROM TbMsParticipaciones t WHERE t.id = :id"),
    @NamedQuery(name = "TbMsParticipaciones.findByPorcentaje", query = "SELECT t FROM TbMsParticipaciones t WHERE t.porcentaje = :porcentaje")})
public class TbMsParticipaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;
    @JoinColumns({
        @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA"),
        @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID")})
    @ManyToOne(optional = false)
    private TbPersonas tbPersonas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idParticipacion")
    private List<TbMsPolizas> tbMsPolizasList;

    public TbMsParticipaciones() {
    }

    public TbMsParticipaciones(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public TbPersonas getTbPersonas() {
        return tbPersonas;
    }

    public void setTbPersonas(TbPersonas tbPersonas) {
        this.tbPersonas = tbPersonas;
    }

    @XmlTransient
    public List<TbMsPolizas> getTbMsPolizasList() {
        return tbMsPolizasList;
    }

    public void setTbMsPolizasList(List<TbMsPolizas> tbMsPolizasList) {
        this.tbMsPolizasList = tbMsPolizasList;
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
        if (!(object instanceof TbMsParticipaciones)) {
            return false;
        }
        TbMsParticipaciones other = (TbMsParticipaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbMsParticipaciones[ id=" + id + " ]";
    }
    
}
