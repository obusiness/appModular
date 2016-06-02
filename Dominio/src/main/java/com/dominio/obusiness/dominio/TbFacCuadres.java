/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.obusiness.dominio;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EQUIPO
 */
@Entity
@Table(name = "TB_FAC_CUADRES", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbFacCuadres.findAll", query = "SELECT t FROM TbFacCuadres t"),
    @NamedQuery(name = "TbFacCuadres.findById", query = "SELECT t FROM TbFacCuadres t WHERE t.id = :id"),
    @NamedQuery(name = "TbFacCuadres.findByFechaCuadre", query = "SELECT t FROM TbFacCuadres t WHERE t.fechaCuadre = :fechaCuadre"),
    @NamedQuery(name = "TbFacCuadres.findByEstado", query = "SELECT t FROM TbFacCuadres t WHERE t.estado = :estado"),
    @NamedQuery(name = "TbFacCuadres.findByValorEfectivo", query = "SELECT t FROM TbFacCuadres t WHERE t.valorEfectivo = :valorEfectivo")})
public class TbFacCuadres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   @Column(name = "ID")
    private Long id;
    @Column(name = "FECHA_CUADRE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCuadre;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "VALOR_EFECTIVO")
    private Long valorEfectivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCuadre")
    private List<TbFacTransacciones> tbFacTransaccionesList;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbSucUsuario idUsuario;

    public TbFacCuadres() {
    }

    public TbFacCuadres(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaCuadre() {
        return fechaCuadre;
    }

    public void setFechaCuadre(Date fechaCuadre) {
        this.fechaCuadre = fechaCuadre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getValorEfectivo() {
        return valorEfectivo;
    }

    public void setValorEfectivo(Long valorEfectivo) {
        this.valorEfectivo = valorEfectivo;
    }

    @XmlTransient
    public List<TbFacTransacciones> getTbFacTransaccionesList() {
        return tbFacTransaccionesList;
    }

    public void setTbFacTransaccionesList(List<TbFacTransacciones> tbFacTransaccionesList) {
        this.tbFacTransaccionesList = tbFacTransaccionesList;
    }

    public TbSucUsuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(TbSucUsuario idUsuario) {
        this.idUsuario = idUsuario;
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
        if (!(object instanceof TbFacCuadres)) {
            return false;
        }
        TbFacCuadres other = (TbFacCuadres) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbFacCuadres[ id=" + id + " ]";
    }
    
}
