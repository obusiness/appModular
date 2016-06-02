/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.obusiness.service;

import com.dominio.obusiness.dominio.TsEmpUsuarios;
import com.negocio.obusiness.negocio.Login;
import com.web.obusiness.util.Utilidades;

/**
 *
 * @author EQUIPO
 */
public class LoginServiceImpl implements LoginService{

    Login ejb;
    
    @Override
    public TsEmpUsuarios validarLogin(TsEmpUsuarios obj) throws Exception {
        ejb = (Login) Utilidades.getEJBRemote("ejbLogin", Login.class.getName());
        return ejb.validarLogin(obj);
    }
    
}
