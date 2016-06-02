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
@Table(name = "TB_MS_RAMOS_COMPANIAS", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbMsRamosCompanias.findAll", query = "SELECT t FROM TbMsRamosCompanias t"),
    @NamedQuery(name = "TbMsRamosCompanias.findById", query = "SELECT t FROM TbMsRamosCompanias t WHERE t.id = :id"),
    @NamedQuery(name = "TbMsRamosCompanias.findByPorcentaje", query = "SELECT t FROM TbMsRamosCompanias t WHERE t.porcentaje = :porcentaje"),
    @NamedQuery(name = "TbMsRamosCompanias.findByIdConpania", query = "SELECT t FROM TbMsRamosCompanias t WHERE t.idConpania = :idConpania")})
public class TbMsRamosCompanias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;
    @Column(name = "ID_CONPANIA")
    private Long idConpania;
    @JoinColumn(name = "ID_RAMO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbMsTipoRamos idRamo;
    @JoinColumn(name = "ID_COMPANIA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbMsTipoCompanias idCompania;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRamo")
    private List<TbMsPolizas> tbMsPolizasList;

    public TbMsRamosCompanias() {
    }

    public TbMsRamosCompanias(Long id) {
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

    public Long getIdConpania() {
        return idConpania;
    }

    public void setIdConpania(Long idConpania) {
        this.idConpania = idConpania;
    }

    public TbMsTipoRamos getIdRamo() {
        return idRamo;
    }

    public void setIdRamo(TbMsTipoRamos idRamo) {
        this.idRamo = idRamo;
    }

    public TbMsTipoCompanias getIdCompania() {
        return idCompania;
    }

    public void setIdCompania(TbMsTipoCompanias idCompania) {
        this.idCompania = idCompania;
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
        if (!(object instanceof TbMsRamosCompanias)) {
            return false;
        }
        TbMsRamosCompanias other = (TbMsRamosCompanias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbMsRamosCompanias[ id=" + id + " ]";
    }
    
}
