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
@Table(name = "TB_INV_PRODUCTOS", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbInvProductos.findAll", query = "SELECT t FROM TbInvProductos t"),
    @NamedQuery(name = "TbInvProductos.findById", query = "SELECT t FROM TbInvProductos t WHERE t.id = :id"),
    @NamedQuery(name = "TbInvProductos.findByProducto", query = "SELECT t FROM TbInvProductos t WHERE t.producto = :producto"),
    @NamedQuery(name = "TbInvProductos.findByUnidad", query = "SELECT t FROM TbInvProductos t WHERE t.unidad = :unidad"),
    @NamedQuery(name = "TbInvProductos.findByTipoProducto", query = "SELECT t FROM TbInvProductos t WHERE t.tipoProducto = :tipoProducto"),
    @NamedQuery(name = "TbInvProductos.findByCantidad", query = "SELECT t FROM TbInvProductos t WHERE t.cantidad = :cantidad")})
public class TbInvProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "PRODUCTO")
    private String producto;
    @Column(name = "UNIDAD")
    private String unidad;
    @Column(name = "TIPO_PRODUCTO")
    private String tipoProducto;
    @Basic(optional = false)
    @Column(name = "CANTIDAD")
    private long cantidad;
    @JoinColumns({
        @JoinColumn(name = "ID_EMP_PROVEEDOR", referencedColumnName = "ID_EMPRESA"),
        @JoinColumn(name = "ID_PER_PROVEEDOR", referencedColumnName = "ID")})
    @ManyToOne(optional = false)
    private TbPersonas tbPersonas;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbEmpresas idEmpresa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbInvProductos")
    private List<TbInvSucursal> tbInvSucursalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProducto")
    private List<TbInvMovimientos> tbInvMovimientosList;

    public TbInvProductos() {
    }

    public TbInvProductos(Long id) {
        this.id = id;
    }

    public TbInvProductos(Long id, long cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public TbPersonas getTbPersonas() {
        return tbPersonas;
    }

    public void setTbPersonas(TbPersonas tbPersonas) {
        this.tbPersonas = tbPersonas;
    }

    public TbEmpresas getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TbEmpresas idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @XmlTransient
    public List<TbInvSucursal> getTbInvSucursalList() {
        return tbInvSucursalList;
    }

    public void setTbInvSucursalList(List<TbInvSucursal> tbInvSucursalList) {
        this.tbInvSucursalList = tbInvSucursalList;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbInvProductos)) {
            return false;
        }
        TbInvProductos other = (TbInvProductos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbInvProductos[ id=" + id + " ]";
    }
    
}
