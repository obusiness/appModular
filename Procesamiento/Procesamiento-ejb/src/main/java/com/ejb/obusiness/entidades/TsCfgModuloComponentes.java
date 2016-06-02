/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.obusiness.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EQUIPO
 */
@Entity
@Table(name = "TS_CFG_MODULO_COMPONENTES", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TsCfgModuloComponentes.findAll", query = "SELECT t FROM TsCfgModuloComponentes t"),
    @NamedQuery(name = "TsCfgModuloComponentes.findById", query = "SELECT t FROM TsCfgModuloComponentes t WHERE t.id = :id"),
    @NamedQuery(name = "TsCfgModuloComponentes.findByOrden", query = "SELECT t FROM TsCfgModuloComponentes t WHERE t.orden = :orden")})
public class TsCfgModuloComponentes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDEN")
    private long orden;
    @JoinColumn(name = "CODIGO_MODULO", referencedColumnName = "CODIGO")
    @ManyToOne
    private TsCfgModulos codigoModulo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "componentePadre")
    private List<TsCfgModuloComponentes> tsCfgModuloComponentesList;
    @JoinColumn(name = "COMPONENTE_PADRE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TsCfgModuloComponentes componentePadre;
    @JoinColumn(name = "CODIGO_COMPONENTE", referencedColumnName = "CODIGO")
    @ManyToOne
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

    @XmlTransient
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
