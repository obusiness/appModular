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
public class TsEmpAplicacionesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EMPRESA")
    private long idEmpresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MODULO_APLICACION")
    private long moduloAplicacion;

    public TsEmpAplicacionesPK() {
    }

    public TsEmpAplicacionesPK(long idEmpresa, long id, long moduloAplicacion) {
        this.idEmpresa = idEmpresa;
        this.id = id;
        this.moduloAplicacion = moduloAplicacion;
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

    public long getModuloAplicacion() {
        return moduloAplicacion;
    }

    public void setModuloAplicacion(long moduloAplicacion) {
        this.moduloAplicacion = moduloAplicacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idEmpresa;
        hash += (int) id;
        hash += (int) moduloAplicacion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TsEmpAplicacionesPK)) {
            return false;
        }
        TsEmpAplicacionesPK other = (TsEmpAplicacionesPK) object;
        if (this.idEmpresa != other.idEmpresa) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.moduloAplicacion != other.moduloAplicacion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TsEmpAplicacionesPK[ idEmpresa=" + idEmpresa + ", id=" + id + ", moduloAplicacion=" + moduloAplicacion + " ]";
    }
    
}
