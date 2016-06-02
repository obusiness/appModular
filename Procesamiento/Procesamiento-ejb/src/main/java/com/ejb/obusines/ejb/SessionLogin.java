/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.obusines.ejb;

import com.dominio.obusiness.dominio.TsEmpUsuarios;
import com.negocio.obusiness.negocio.Login;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author EQUIPO
 */

@Stateless
public class SessionLogin implements Login{

    @PersistenceContext(unitName = "persistenceObusiness")
    EntityManager em;
    
    @Override
    public TsEmpUsuarios validarLogin(TsEmpUsuarios obj) throws Exception {
        try{
        Query query = em.createNamedQuery("TsEmpUsuarios.findByUsuario");
        query.setParameter("usuario", obj.getUsuario());
        List lista = query.getResultList();
        if (lista.size() > 0){
            obj.setStatus(true);
            obj.setMensaje("Usuario encontrado");
        }
        else{
            obj.setStatus(false);
            obj.setMensaje("Usuario no encontrado");
            
        }
        return obj;
        }
        catch (Exception ex){
            throw new Exception("Error en validar usuario: "+ex.getMessage(), ex);
        }
    }
    
}
