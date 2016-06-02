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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "TB_MS_TIPO_COMPANIAS", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbMsTipoCompanias.findAll", query = "SELECT t FROM TbMsTipoCompanias t"),
    @NamedQuery(name = "TbMsTipoCompanias.findById", query = "SELECT t FROM TbMsTipoCompanias t WHERE t.id = :id"),
    @NamedQuery(name = "TbMsTipoCompanias.findByCompania", query = "SELECT t FROM TbMsTipoCompanias t WHERE t.compania = :compania")})
public class TbMsTipoCompanias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "COMPANIA")
    private String compania;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCompania")
    private List<TbMsRamosCompanias> tbMsRamosCompaniasList;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbEmpresas idEmpresa;

    public TbMsTipoCompanias() {
    }

    public TbMsTipoCompanias(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @XmlTransient
    public List<TbMsRamosCompanias> getTbMsRamosCompaniasList() {
        return tbMsRamosCompaniasList;
    }

    public void setTbMsRamosCompaniasList(List<TbMsRamosCompanias> tbMsRamosCompaniasList) {
        this.tbMsRamosCompaniasList = tbMsRamosCompaniasList;
    }

    public TbEmpresas getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TbEmpresas idEmpresa) {
        this.idEmpresa = idEmpresa;
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
        if (!(object instanceof TbMsTipoCompanias)) {
            return false;
        }
        TbMsTipoCompanias other = (TbMsTipoCompanias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbMsTipoCompanias[ id=" + id + " ]";
    }
    
}
