/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.obusiness.dominio;

import java.io.Serializable;
import java.util.List;


/**
 *
 * @author EQUIPO
 */
public class TsCfgModuloComponentes implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private long orden;
    private TsCfgModulos codigoModulo;
    private List<TsCfgModuloComponentes> tsCfgModuloComponentesList;
    private TsCfgModuloComponentes componentePadre;
    private TsCfgComponentes codigoComponente;

    public TsCfgModuloComponentes() {
    }

    public TsCfgModuloComponentes(Long id) {
        this.id = id;
    }

    public TsCfgModuloComponentes(Long id, long orden) {
        this.id = id;
        this.orden = orden;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getOrden() {
        return orden;
    }

    public void setOrden(long orden) {
        this.orden = orden;
    }

    public TsCfgModulos getCodigoModulo() {
        return codigoModulo;
    }

    public void setCodigoModulo(TsCfgModulos codigoModulo) {
        this.codigoModulo = codigoModulo;
    }

    public List<TsCfgModuloComponentes> getTsCfgModuloComponentesList() {
        return tsCfgModuloComponentesList;
    }

    public void setTsCfgModuloComponentesList(List<TsCfgModuloComponentes> tsCfgModuloComponentesList) {
        this.tsCfgModuloComponentesList = tsCfgModuloComponentesList;
    }

    public TsCfgModuloComponentes getComponentePadre() {
        return componentePadre;
    }

    public void setComponentePadre(TsCfgModuloComponentes componentePadre) {
        this.componentePadre = componentePadre;
    }

    public TsCfgComponentes getCodigoComponente() {
        return codigoComponente;
    }

    public void setCodigoComponente(TsCfgComponentes codigoComponente) {
        this.codigoComponente = codigoComponente;
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
        if (!(object instanceof TsCfgModuloComponentes)) {
            return false;
        }
        TsCfgModuloComponentes other = (TsCfgModuloComponentes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TsCfgModuloComponentes[ id=" + id + " ]";
    }
    
}
