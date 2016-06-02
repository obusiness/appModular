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
@Table(name = "TB_TIPO_FORMA_PAGOS", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTipoFormaPagos.findAll", query = "SELECT t FROM TbTipoFormaPagos t"),
    @NamedQuery(name = "TbTipoFormaPagos.findById", query = "SELECT t FROM TbTipoFormaPagos t WHERE t.id = :id"),
    @NamedQuery(name = "TbTipoFormaPagos.findByFormaPago", query = "SELECT t FROM TbTipoFormaPagos t WHERE t.formaPago = :formaPago"),
    @NamedQuery(name = "TbTipoFormaPagos.findByDescripcion", query = "SELECT t FROM TbTipoFormaPagos t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "TbTipoFormaPagos.findByEfectivo", query = "SELECT t FROM TbTipoFormaPagos t WHERE t.efectivo = :efectivo")})
public class TbTipoFormaPagos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "FORMA_PAGO")
    private String formaPago;
    @Size(max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Size(max = 2)
    @Column(name = "EFECTIVO")
    private String efectivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formaPago")
    private List<TbFacTransacciones> tbFacTransaccionesList;

    public TbTipoFormaPagos() {
    }

    public TbTipoFormaPagos(Long id) {
        this.id = id;
    }

    public TbTipoFormaPagos(Long id, String formaPago) {
        this.id = id;
        this.formaPago = formaPago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }

    @XmlTransient
    public List<TbFacTransacciones> getTbFacTransaccionesList() {
        return tbFacTransaccionesList;
    }

    public void setTbFacTransaccionesList(List<TbFacTransacciones> tbFacTransaccionesList) {
        this.tbFacTransaccionesList = tbFacTransaccionesList;
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
        if (!(object instanceof TbTipoFormaPagos)) {
            return false;
        }
        TbTipoFormaPagos other = (TbTipoFormaPagos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbTipoFormaPagos[ id=" + id + " ]";
    }
    
}
