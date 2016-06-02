/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.obusiness.service;

import com.dominio.obusiness.dominio.TsEmpUsuarios;

/**
 *
 * @author EQUIPO
 */
public interface LoginService {
    TsEmpUsuarios validarLogin(TsEmpUsuarios obj) throws Exception;    
}
