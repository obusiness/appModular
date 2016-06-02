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
public class TbFacTranDetallesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TRANSACCION")
    private long idTransaccion;

    public TbFacTranDetallesPK() {
    }

    public TbFacTranDetallesPK(long id, long idTransaccion) {
        this.id = id;
        this.idTransaccion = idTransaccion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(long idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) idTransaccion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbFacTranDetallesPK)) {
            return false;
        }
        TbFacTranDetallesPK other = (TbFacTranDetallesPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.idTransaccion != other.idTransaccion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbFacTranDetallesPK[ id=" + id + ", idTransaccion=" + idTransaccion + " ]";
    }
    
}
