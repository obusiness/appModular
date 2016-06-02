/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.obusiness.dominio;

import java.io.Serializable;
import java.util.List;
import sun.security.util.Password;


/**
 *
 * @author EQUIPO
 */
public class TsEmpUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    protected TsEmpUsuariosPK tsEmpUsuariosPK;
    private String usuario;
    private String estado;
    private List<TsEmpRolesUsuarios> tsEmpRolesUsuariosList;
    private List<TbSucUsuario> tbSucUsuarioList;
    private TbEmpresas tbEmpresas;
    private String password;
    private String mensaje;
    private boolean status;

    public TsEmpUsuarios() {
    }

    public TsEmpUsuarios(TsEmpUsuariosPK tsEmpUsuariosPK) {
        this.tsEmpUsuariosPK = tsEmpUsuariosPK;
    }

    public TsEmpUsuarios(TsEmpUsuariosPK tsEmpUsuariosPK, String usuario) {
        this.tsEmpUsuariosPK = tsEmpUsuariosPK;
        this.usuario = usuario;
    }

    public TsEmpUsuarios(long id, long idEmpresa) {
        this.tsEmpUsuariosPK = new TsEmpUsuariosPK(id, idEmpresa);
    }

    public TsEmpUsuariosPK getTsEmpUsuariosPK() {
        return tsEmpUsuariosPK;
    }

    public void setTsEmpUsuariosPK(TsEmpUsuariosPK tsEmpUsuariosPK) {
        this.tsEmpUsuariosPK = tsEmpUsuariosPK;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<TsEmpRolesUsuarios> getTsEmpRolesUsuariosList() {
        return tsEmpRolesUsuariosList;
    }

    public void setTsEmpRolesUsuariosList(List<TsEmpRolesUsuarios> tsEmpRolesUsuariosList) {
        this.tsEmpRolesUsuariosList = tsEmpRolesUsuariosList;
    }

    public List<TbSucUsuario> getTbSucUsuarioList() {
        return tbSucUsuarioList;
    }

    public void setTbSucUsuarioList(List<TbSucUsuario> tbSucUsuarioList) {
        this.tbSucUsuarioList = tbSucUsuarioList;
    }

    public TbEmpresas getTbEmpresas() {
        return tbEmpresas;
    }

    public void setTbEmpresas(TbEmpresas tbEmpresas) {
        this.tbEmpresas = tbEmpresas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tsEmpUsuariosPK != null ? tsEmpUsuariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TsEmpUsuarios)) {
            return false;
        }
        TsEmpUsuarios other = (TsEmpUsuarios) object;
        if ((this.tsEmpUsuariosPK == null && other.tsEmpUsuariosPK != null) || (this.tsEmpUsuariosPK != null && !this.tsEmpUsuariosPK.equals(other.tsEmpUsuariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.obusiness.entidades.TsEmpUsuarios[ tsEmpUsuariosPK=" + tsEmpUsuariosPK + " ]";
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
