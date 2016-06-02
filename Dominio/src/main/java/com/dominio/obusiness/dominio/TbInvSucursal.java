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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "TB_INV_SUCURSAL", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbInvSucursal.findAll", query = "SELECT t FROM TbInvSucursal t"),
    @NamedQuery(name = "TbInvSucursal.findByIdProducto", query = "SELECT t FROM TbInvSucursal t WHERE t.tbInvSucursalPK.idProducto = :idProducto"),
    @NamedQuery(name = "TbInvSucursal.findByIdSucursal", query = "SELECT t FROM TbInvSucursal t WHERE t.tbInvSucursalPK.idSucursal = :idSucursal"),
    @NamedQuery(name = "TbInvSucursal.findByCantidad", query = "SELECT t FROM TbInvSucursal t WHERE t.cantidad = :cantidad"),
    @NamedQuery(name = "TbInvSucursal.findByPorcentajeDcto", query = "SELECT t FROM TbInvSucursal t WHERE t.porcentajeDcto = :porcentajeDcto")})
public class TbInvSucursal implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbInvSucursalPK tbInvSucursalPK;
    @Column(name = "CANTIDAD")
    private Long cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PORCENTAJE_DCTO")
    private BigDecimal porcentajeDcto;
    @JoinColumn(name = "ID_SUCURSAL", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbSucursales tbSucursales;
    @JoinColumn(name = "ID_PRODUCTO", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbInvProductos tbInvProductos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbInvSucursal")
    private List<TbInvMovimientos> tbInvMovimientosList;

    public TbInvSucursal() {
    }

    public TbInvSucursal(TbInvSucursalPK tbInvSucursalPK) {
        this.tbInvSucursalPK = tbInvSucursalPK;
    }

    public TbInvSucursal(TbInvSucursalPK tbInvSucursalPK, BigDecimal porcentajeDcto) {
        this.tbInvSucursalPK = tbInvSucursalPK;
        this.porcentajeDcto = porcentajeDcto;
    }

    public TbInvSucursal(long idProducto, long idSucursal) {
        this.tbInvSucursalPK = new TbInvSucursalPK(idProducto, idSucursal);
    }

    public TbInvSucursalPK getTbInvSucursalPK() {
        return tbInvSucursalPK;
    }

    public void setTbInvSucursalPK(TbInvSucursalPK tbInvSucursalPK) {
        this.tbInvSucursalPK = tbInvSucursalPK;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPorcentajeDcto() {
        return porcentajeDcto;
    }

    public void setPorcentajeDcto(BigDecimal porcentajeDcto) {
        this.porcentajeDcto = porcentajeDcto;
    }

    public TbSucursales getTbSucursales() {
        return tbSucursales;
    }

    public void setTbSucursales(TbSucursales tbSucursales) {
        this.tbSucursales = tbSucursales;
    }

    public TbInvProductos getTbInvProductos() {
        return tbInvProductos;
    }

    public void setTbInvProductos(TbInvProductos tbInvProductos) {
        this.tbInvProductos = tbInvProductos;
    }

    @XmlTransient
    public List<TbInvMovimientos> getTbInvMovimientosList() {
        return tbInvMovimientosList;
    }

    public void setTbInvMovimientosList(List<TbInvMovimientos> tbInvMovimientosList) {
        this.tbInvMovimientosList = tbInvMovimientosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbInvSucursalPK != null ? tbInvSucursalPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbInvSucursal)) {
            return false;
        }
        TbInvSucursal other = (TbInvSucursal) object;
        if ((this.tbInvSucursalPK == null && other.tbInvSucursalPK != null) || (this.tbInvSucursalPK != null && !this.tbInvSucursalPK.equals(other.tbInvSucursalPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbInvSucursal[ tbInvSucursalPK=" + tbInvSucursalPK + " ]";
    }
    
}
