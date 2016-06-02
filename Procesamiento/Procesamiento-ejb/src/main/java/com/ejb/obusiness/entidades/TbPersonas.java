/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.obusiness.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EQUIPO
 */
@Entity
@Table(name = "TB_PERSONAS", catalog = "", schema = "OBUSINESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbPersonas.findAll", query = "SELECT t FROM TbPersonas t"),
    @NamedQuery(name = "TbPersonas.findByIdEmpresa", query = "SELECT t FROM TbPersonas t WHERE t.tbPersonasPK.idEmpresa = :idEmpresa"),
    @NamedQuery(name = "TbPersonas.findById", query = "SELECT t FROM TbPersonas t WHERE t.tbPersonasPK.id = :id"),
    @NamedQuery(name = "TbPersonas.findByIdentificacion", query = "SELECT t FROM TbPersonas t WHERE t.identificacion = :identificacion"),
    @NamedQuery(name = "TbPersonas.findByNombre", query = "SELECT t FROM TbPersonas t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TbPersonas.findByApellidos", query = "SELECT t FROM TbPersonas t WHERE t.apellidos = :apellidos"),
    @NamedQuery(name = "TbPersonas.findByFechaIngreso", query = "SELECT t FROM TbPersonas t WHERE t.fechaIngreso = :fechaIngreso"),
    @NamedQuery(name = "TbPersonas.findByFechaNacimiento", query = "SELECT t FROM TbPersonas t WHERE t.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "TbPersonas.findByEdad", query = "SELECT t FROM TbPersonas t WHERE t.edad = :edad")})
public class TbPersonas implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbPersonasPK tbPersonasPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "IDENTIFICACION")
    private String identificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 300)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column(name = "EDAD")
    private Long edad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbPersonas")
    private List<TbPerUbicacion> tbPerUbicacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbPersonas")
    private List<TbMsParticipaciones> tbMsParticipacionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbPersonas")
    private List<TbInvProductos> tbInvProductosList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tbPersonas")
    private TbPerAcompanante tbPerAcompanante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbPersonas")
    private List<TbPerDirecciones> tbPerDireccionesList;
    @JoinColumn(name = "SEXO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbTipoSexo sexo;
    @JoinColumn(name = "OCUPACION", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbTipoOcupacion ocupacion;
    @JoinColumn(name = "ESTADO_CIVIL", referencedColumnName = "ID")
    @ManyToOne
    private TbTipoEstadoCivil estadoCivil;
    @JoinColumn(name = "TIPO_DOCUMENTO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TbTipoDocumentos tipoDocumento;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbEmpresas tbEmpresas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbPersonas")
    private List<TbSucursales> tbSucursalesList;

    public TbPersonas() {
    }

    public TbPersonas(TbPersonasPK tbPersonasPK) {
        this.tbPersonasPK = tbPersonasPK;
    }

    public TbPersonas(TbPersonasPK tbPersonasPK, String identificacion, String nombre, Date fechaIngreso) {
        this.tbPersonasPK = tbPersonasPK;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
    }

    public TbPersonas(long idEmpresa, long id) {
        this.tbPersonasPK = new TbPersonasPK(idEmpresa, id);
    }

    public TbPersonasPK getTbPersonasPK() {
        return tbPersonasPK;
    }

    public void setTbPersonasPK(TbPersonasPK tbPersonasPK) {
        this.tbPersonasPK = tbPersonasPK;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getEdad() {
        return edad;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }

    @XmlTransient
    public List<TbPerUbicacion> getTbPerUbicacionList() {
        return tbPerUbicacionList;
    }

    public void setTbPerUbicacionList(List<TbPerUbicacion> tbPerUbicacionList) {
        this.tbPerUbicacionList = tbPerUbicacionList;
    }

    @XmlTransient
    public List<TbMsParticipaciones> getTbMsParticipacionesList() {
        return tbMsParticipacionesList;
    }

    public void setTbMsParticipacionesList(List<TbMsParticipaciones> tbMsParticipacionesList) {
        this.tbMsParticipacionesList = tbMsParticipacionesList;
    }

    @XmlTransient
    public List<TbInvProductos> getTbInvProductosList() {
        return tbInvProductosList;
    }

    public void setTbInvProductosList(List<TbInvProductos> tbInvProductosList) {
        this.tbInvProductosList = tbInvProductosList;
    }

    public TbPerAcompanante getTbPerAcompanante() {
        return tbPerAcompanante;
    }

    public void setTbPerAcompanante(TbPerAcompanante tbPerAcompanante) {
        this.tbPerAcompanante = tbPerAcompanante;
    }

    @XmlTransient
    public List<TbPerDirecciones> getTbPerDireccionesList() {
        return tbPerDireccionesList;
    }

    public void setTbPerDireccionesList(List<TbPerDirecciones> tbPerDireccionesList) {
        this.tbPerDireccionesList = tbPerDireccionesList;
    }

    public TbTipoSexo getSexo() {
        return sexo;
    }

    public void setSexo(TbTipoSexo sexo) {
        this.sexo = sexo;
    }

    public TbTipoOcupacion getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(TbTipoOcupacion ocupacion) {
        this.ocupacion = ocupacion;
    }

    public TbTipoEstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(TbTipoEstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public TbTipoDocumentos getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TbTipoDocumentos tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public TbEmpresas getTbEmpresas() {
        return tbEmpresas;
    }

    public void setTbEmpresas(TbEmpresas tbEmpresas) {
        this.tbEmpresas = tbEmpresas;
    }

    @XmlTransient
    public List<TbSucursales> getTbSucursalesList() {
        return tbSucursalesList;
    }

    public void setTbSucursalesList(List<TbSucursales> tbSucursalesList) {
        this.tbSucursalesList = tbSucursalesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbPersonasPK != null ? tbPersonasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbPersonas)) {
            return false;
        }
        TbPersonas other = (TbPersonas) object;
        if ((this.tbPersonasPK == null && other.tbPersonasPK != null) || (this.tbPersonasPK != null && !this.tbPersonasPK.equals(other.tbPersonasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TbPersonas[ tbPersonasPK=" + tbPersonasPK + " ]";
    }
    
}
