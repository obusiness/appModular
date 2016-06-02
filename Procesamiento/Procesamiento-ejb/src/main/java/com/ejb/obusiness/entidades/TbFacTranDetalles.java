/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.obusiness.entidades;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name = "TB_FAC_TRAN_DETALLES", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbFacTranDetalles.findAll", query = "SELECT t FROM TbFacTranDetalles t"),
    @NamedQuery(name = "TbFacTranDetalles.findById", query = "SELECT t FROM TbFacTranDetalles t WHERE t.tbFacTranDetallesPK.id = :id"),
    @NamedQuery(name = "TbFacTranDetalles.findByIdTransaccion", query = "SELECT t FROM TbFacTranDetalles t WHERE t.tbFacTranDetallesPK.idTransaccion = :idTransaccion")})
public class TbFacTranDetalles implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbFacTranDetallesPK tbFacTranDetallesPK;
    @JoinColumn(name = "ID_TRANSACCION", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbFacTransacciones tbFacTransacciones;

    public TbFacTranDetalles() {
    }

    public TbFacTranDetalles(TbFacTranDetallesPK tbFacTranDetallesPK) {
        this.tbFacTranDetallesPK = tbFacTranDetallesPK;
    }

    public TbFacTranDetalles(long id, long idTransaccion) {
        this.tbFacTranDetallesPK = new TbFacTranDetallesPK(id, idTransaccion);
    }

    public TbFacTranDetallesPK getTbFacTranDetallesPK() {
        return tbFacTranDetallesPK;
    }

    public void setTbFacTranDetallesPK(TbFacTranDetallesPK tbFacTranDetallesPK) {
        this.tbFacTranDetallesPK = tbFacTranDetallesPK;
    }

    public TbFacTransacciones getTbFacTransacciones() {
        return tbFacTransacciones;
    }

    public void setTbFacTransacciones(TbFacTransacciones tbFacTransacciones) {
        this.tbFacTransacciones = tbFacTransacciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbFacTranDetallesPK != null ? tbFacTranDetallesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbFacTranDetalles)) {
            return false;
        }
        TbFacTranDetalles other = (TbFacTranDetalles) object;
        if ((this.tbFacTranDetallesPK == null && other.tbFacTranDetallesPK != null) || (this.tbFacTranDetallesPK != null && !this.tbFacTranDetallesPK.equals(other.tbFacTranDetallesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbFacTranDetalles[ tbFacTranDetallesPK=" + tbFacTranDetallesPK + " ]";
    }
    
}
