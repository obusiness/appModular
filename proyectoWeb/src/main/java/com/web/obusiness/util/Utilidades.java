/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.obusiness.util;

import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;

/**
 *
 * @author EQUIPO
 */
public class Utilidades {
    public static Object getEJBRemote(String nameEJB, String service) throws Exception{
        Context context;
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "Weblogic.jndi.WLInitialContextFactory");
        props.put(Context.PROVIDER_URL, "http://localhost:7001");
        try{
            context = new InitialContext(props);
            String lookup =nameEJB+"#"+service;
            return context.lookup(lookup);
        }
        catch(Exception ex){
            throw new Exception("No se encontro el EJB", ex);
        }
    }
}
