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
@Table(name = "TB_TIPO_MOVIMIENTOS", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTipoMovimientos.findAll", query = "SELECT t FROM TbTipoMovimientos t"),
    @NamedQuery(name = "TbTipoMovimientos.findById", query = "SELECT t FROM TbTipoMovimientos t WHERE t.id = :id"),
    @NamedQuery(name = "TbTipoMovimientos.findByMovimiento", query = "SELECT t FROM TbTipoMovimientos t WHERE t.movimiento = :movimiento"),
    @NamedQuery(name = "TbTipoMovimientos.findByOperacion", query = "SELECT t FROM TbTipoMovimientos t WHERE t.operacion = :operacion")})
public class TbTipoMovimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "MOVIMIENTO")
    private String movimiento;
    @Column(name = "OPERACION")
    private Long operacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoMovimiento")
    private List<TbInvMovimientos> tbInvMovimientosList;

    public TbTipoMovimientos() {
    }

    public TbTipoMovimientos(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public Long getOperacion() {
        return operacion;
    }

    public void setOperacion(Long operacion) {
        this.operacion = operacion;
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
        if (!(object instanceof TbTipoMovimientos)) {
            return false;
        }
        TbTipoMovimientos other = (TbTipoMovimientos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbTipoMovimientos[ id=" + id + " ]";
    }
    
}
