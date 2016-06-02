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
@Table(name = "TB_MS_POLIZAS", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbMsPolizas.findAll", query = "SELECT t FROM TbMsPolizas t"),
    @NamedQuery(name = "TbMsPolizas.findById", query = "SELECT t FROM TbMsPolizas t WHERE t.id = :id")})
public class TbMsPolizas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @JoinColumn(name = "ID_RAMO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbMsRamosCompanias idRamo;
    @JoinColumn(name = "ID_PARTICIPACION", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbMsParticipaciones idParticipacion;

    public TbMsPolizas() {
    }

    public TbMsPolizas(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TbMsRamosCompanias getIdRamo() {
        return idRamo;
    }

    public void setIdRamo(TbMsRamosCompanias idRamo) {
        this.idRamo = idRamo;
    }

    public TbMsParticipaciones getIdParticipacion() {
        return idParticipacion;
    }

    public void setIdParticipacion(TbMsParticipaciones idParticipacion) {
        this.idParticipacion = idParticipacion;
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
        if (!(object instanceof TbMsPolizas)) {
            return false;
        }
        TbMsPolizas other = (TbMsPolizas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbMsPolizas[ id=" + id + " ]";
    }
    
}
