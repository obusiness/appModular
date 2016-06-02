/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.obusiness.dominio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EQUIPO
 */
@Entity
@Table(name = "TB_INV_MOVIMIENTOS", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbInvMovimientos.findAll", query = "SELECT t FROM TbInvMovimientos t"),
    @NamedQuery(name = "TbInvMovimientos.findById", query = "SELECT t FROM TbInvMovimientos t WHERE t.id = :id"),
    @NamedQuery(name = "TbInvMovimientos.findByCantidad", query = "SELECT t FROM TbInvMovimientos t WHERE t.cantidad = :cantidad")})
public class TbInvMovimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "CANTIDAD")
    private long cantidad;
    @JoinColumn(name = "ID_TIPO_MOVIMIENTO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbTipoMovimientos idTipoMovimiento;
    @JoinColumns({
        @JoinColumn(name = "ID_SUC_PRODUCTO", referencedColumnName = "ID_PRODUCTO"),
        @JoinColumn(name = "ID_SUC_SUCURSAL", referencedColumnName = "ID_SUCURSAL")})
    @ManyToOne(optional = false)
    private TbInvSucursal tbInvSucursal;
    @JoinColumn(name = "ID_PRODUCTO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbInvProductos idProducto;

    public TbInvMovimientos() {
    }

    public TbInvMovimientos(Long id) {
        this.id = id;
    }

    public TbInvMovimientos(Long id, long cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public TbTipoMovimientos getIdTipoMovimiento() {
        return idTipoMovimiento;
    }

    public void setIdTipoMovimiento(TbTipoMovimientos idTipoMovimiento) {
        this.idTipoMovimiento = idTipoMovimiento;
    }

    public TbInvSucursal getTbInvSucursal() {
        return tbInvSucursal;
    }

    public void setTbInvSucursal(TbInvSucursal tbInvSucursal) {
        this.tbInvSucursal = tbInvSucursal;
    }

    public TbInvProductos getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(TbInvProductos idProducto) {
        this.idProducto = idProducto;
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
        if (!(object instanceof TbInvMovimientos)) {
            return false;
        }
        TbInvMovimientos other = (TbInvMovimientos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbInvMovimientos[ id=" + id + " ]";
    }
    
}
