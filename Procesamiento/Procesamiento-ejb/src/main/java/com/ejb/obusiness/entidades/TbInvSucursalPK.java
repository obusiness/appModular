/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.obusiness.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author EQUIPO
 */
@Embeddable
public class TbInvSucursalPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PRODUCTO")
    private long idProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SUCURSAL")
    private long idSucursal;

    public TbInvSucursalPK() {
    }

    public TbInvSucursalPK(long idProducto, long idSucursal) {
        this.idProducto = idProducto;
        this.idSucursal = idSucursal;
    }

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(long idSucursal) {
        this.idSucursal = idSucursal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idProducto;
        hash += (int) idSucursal;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbInvSucursalPK)) {
            return false;
        }
        TbInvSucursalPK other = (TbInvSucursalPK) object;
        if (this.idProducto != other.idProducto) {
            return false;
        }
        if (this.idSucursal != other.idSucursal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbInvSucursalPK[ idProducto=" + idProducto + ", idSucursal=" + idSucursal + " ]";
    }
    
}
