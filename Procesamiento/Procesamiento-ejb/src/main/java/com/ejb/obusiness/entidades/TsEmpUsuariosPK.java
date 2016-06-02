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
public class TsEmpUsuariosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EMPRESA")
    private long idEmpresa;

    public TsEmpUsuariosPK() {
    }

    public TsEmpUsuariosPK(long id, long idEmpresa) {
        this.id = id;
        this.idEmpresa = idEmpresa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) idEmpresa;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TsEmpUsuariosPK)) {
            return false;
        }
        TsEmpUsuariosPK other = (TsEmpUsuariosPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.idEmpresa != other.idEmpresa) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TsEmpUsuariosPK[ id=" + id + ", idEmpresa=" + idEmpresa + " ]";
    }
    
}
