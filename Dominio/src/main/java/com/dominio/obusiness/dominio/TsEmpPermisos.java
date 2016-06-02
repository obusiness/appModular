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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EQUIPO
 */
@Entity
@Table(name = "TS_EMP_PERMISOS", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TsEmpPermisos.findAll", query = "SELECT t FROM TsEmpPermisos t"),
    @NamedQuery(name = "TsEmpPermisos.findById", query = "SELECT t FROM TsEmpPermisos t WHERE t.id = :id"),
    @NamedQuery(name = "TsEmpPermisos.findByVisualizar", query = "SELECT t FROM TsEmpPermisos t WHERE t.visualizar = :visualizar"),
    @NamedQuery(name = "TsEmpPermisos.findByCrear", query = "SELECT t FROM TsEmpPermisos t WHERE t.crear = :crear"),
    @NamedQuery(name = "TsEmpPermisos.findByModificar", query = "SELECT t FROM TsEmpPermisos t WHERE t.modificar = :modificar"),
    @NamedQuery(name = "TsEmpPermisos.findByEliminar", query = "SELECT t FROM TsEmpPermisos t WHERE t.eliminar = :eliminar")})
public class TsEmpPermisos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
   @Column(name = "VISUALIZAR")
    private short visualizar;
    @Basic(optional = false)
    @Column(name = "CREAR")
    private short crear;
    @Basic(optional = false)
    @Column(name = "MODIFICAR")
    private short modificar;
    @Basic(optional = false)
    @Column(name = "ELIMINAR")
    private short eliminar;
    @JoinColumn(name = "ID_ROL", referencedColumnName = "ID")
    @OneToOne(optional = false)
    private TsEmpRoles idRol;
    @JoinColumn(name = "CODIGO_COMPONENTE", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private TsCfgComponentes codigoComponente;

    public TsEmpPermisos() {
    }

    public TsEmpPermisos(Long id) {
        this.id = id;
    }

    public TsEmpPermisos(Long id, short visualizar, short crear, short modificar, short eliminar) {
        this.id = id;
        this.visualizar = visualizar;
        this.crear = crear;
        this.modificar = modificar;
        this.eliminar = eliminar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public short getVisualizar() {
        return visualizar;
    }

    public void setVisualizar(short visualizar) {
        this.visualizar = visualizar;
    }

    public short getCrear() {
        return crear;
    }

    public void setCrear(short crear) {
        this.crear = crear;
    }

    public short getModificar() {
        return modificar;
    }

    public void setModificar(short modificar) {
        this.modificar = modificar;
    }

    public short getEliminar() {
        return eliminar;
    }

    public void setEliminar(short eliminar) {
        this.eliminar = eliminar;
    }

    public TsEmpRoles getIdRol() {
        return idRol;
    }

    public void setIdRol(TsEmpRoles idRol) {
        this.idRol = idRol;
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
        if (!(object instanceof TsEmpPermisos)) {
            return false;
        }
        TsEmpPermisos other = (TsEmpPermisos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TsEmpPermisos[ id=" + id + " ]";
    }
    
}
