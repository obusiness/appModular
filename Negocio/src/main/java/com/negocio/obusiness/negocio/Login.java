/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.obusiness.negocio;

import com.dominio.obusiness.dominio.TsEmpUsuarios;
import javax.ejb.Remote;

/**
 *
 * @author EQUIPO
 */
@Remote
public interface Login {
    TsEmpUsuarios validarLogin(TsEmpUsuarios obj) throws Exception;
}
