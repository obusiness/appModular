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
@Table(name = "TS_CFG_TIPO_COMPONENTES", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TsCfgTipoComponentes.findAll", query = "SELECT t FROM TsCfgTipoComponentes t"),
    @NamedQuery(name = "TsCfgTipoComponentes.findByCodigo", query = "SELECT t FROM TsCfgTipoComponentes t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TsCfgTipoComponentes.findByTipoComponente", query = "SELECT t FROM TsCfgTipoComponentes t WHERE t.tipoComponente = :tipoComponente")})
public class TsCfgTipoComponentes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "TIPO_COMPONENTE")
    private String tipoComponente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoTipoComponente")
    private List<TsCfgComponentes> tsCfgComponentesList;

    public TsCfgTipoComponentes() {
    }

    public TsCfgTipoComponentes(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoComponente() {
        return tipoComponente;
    }

    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    @XmlTransient
    public List<TsCfgComponentes> getTsCfgComponentesList() {
        return tsCfgComponentesList;
    }

    public void setTsCfgComponentesList(List<TsCfgComponentes> tsCfgComponentesList) {
        this.tsCfgComponentesList = tsCfgComponentesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TsCfgTipoComponentes)) {
            return false;
        }
        TsCfgTipoComponentes other = (TsCfgTipoComponentes) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TsCfgTipoComponentes[ codigo=" + codigo + " ]";
    }
    
}
