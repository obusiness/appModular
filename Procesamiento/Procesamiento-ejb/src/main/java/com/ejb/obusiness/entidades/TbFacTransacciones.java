/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.obusiness.entidades;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EQUIPO
 */
@Entity
@Table(name = "TB_FAC_TRANSACCIONES", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbFacTransacciones.findAll", query = "SELECT t FROM TbFacTransacciones t"),
    @NamedQuery(name = "TbFacTransacciones.findById", query = "SELECT t FROM TbFacTransacciones t WHERE t.id = :id"),
    @NamedQuery(name = "TbFacTransacciones.findByFecha", query = "SELECT t FROM TbFacTransacciones t WHERE t.fecha = :fecha")})
public class TbFacTransacciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbFacTransacciones")
    private List<TbFacTranDetalles> tbFacTranDetallesList;
    @JoinColumn(name = "FORMA_PAGO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbTipoFormaPagos formaPago;
    @JoinColumn(name = "ID_CUADRE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbFacCuadres idCuadre;

    public TbFacTransacciones() {
    }

    public TbFacTransacciones(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public List<TbFacTranDetalles> getTbFacTranDetallesList() {
        return tbFacTranDetallesList;
    }

    public void setTbFacTranDetallesList(List<TbFacTranDetalles> tbFacTranDetallesList) {
        this.tbFacTranDetallesList = tbFacTranDetallesList;
    }

    public TbTipoFormaPagos getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(TbTipoFormaPagos formaPago) {
        this.formaPago = formaPago;
    }

    public TbFacCuadres getIdCuadre() {
        return idCuadre;
    }

    public void setIdCuadre(TbFacCuadres idCuadre) {
        this.idCuadre = idCuadre;
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
        if (!(object instanceof TbFacTransacciones)) {
            return false;
        }
        TbFacTransacciones other = (TbFacTransacciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbFacTransacciones[ id=" + id + " ]";
    }
    
}
