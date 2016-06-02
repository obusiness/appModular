/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.obusiness.bean;

import com.dominio.obusiness.dominio.TsEmpUsuarios;
import com.web.obusiness.service.LoginServiceImpl;
import java.io.Serializable;

/**
 *
 * @author EQUIPO
 */
public class LoginBB implements Serializable {
    private TsEmpUsuarios usuario;
    private LoginServiceImpl loginService;
    
    public String validarLogin(){
        try{
            usuario = getLoginService().validarLogin(usuario);
            if (usuario.isStatus()){
                return "welcomePrimefaces_1";
            }
            else{
                return "login";
            }
        }
        catch (Exception ex){
            return "login";
        }
        
    }
    
    /**
     * @return the usuario
     */
    public TsEmpUsuarios getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(TsEmpUsuarios usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the loginServiceImpl
     */
    public LoginServiceImpl getLoginService() {
        return loginService;
    }

    /**
     * @param loginService the loginServiceImpl to set
     */
    public void setLoginService(LoginServiceImpl loginService) {
        this.loginService = loginService;
    }
}
