/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.obusiness.dominio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 *
 * @author EQUIPO
 */
@Embeddable
public class TbPersonasPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID_EMPRESA")
    private long idEmpresa;
    @Column(name = "ID")
    private long id;

    public TbPersonasPK() {
    }

    public TbPersonasPK(long idEmpresa, long id) {
        this.idEmpresa = idEmpresa;
        this.id = id;
    }

    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idEmpresa;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbPersonasPK)) {
            return false;
        }
        TbPersonasPK other = (TbPersonasPK) object;
        if (this.idEmpresa != other.idEmpresa) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbPersonasPK[ idEmpresa=" + idEmpresa + ", id=" + id + " ]";
    }
    
}
