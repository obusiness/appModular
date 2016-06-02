package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbInvSucursal;
import com.ejb.obusiness.entidades.TbPersonas;
import com.ejb.obusiness.entidades.TbSucUsuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbSucursales.class)
public class TbSucursales_ { 

    public static volatile SingularAttribute<TbSucursales, Long> id;
    public static volatile SingularAttribute<TbSucursales, String> sucursal;
    public static volatile SingularAttribute<TbSucursales, String> logo;
    public static volatile ListAttribute<TbSucursales, TbInvSucursal> tbInvSucursalList;
    public static volatile SingularAttribute<TbSucursales, TbPersonas> tbPersonas;
    public static volatile ListAttribute<TbSucursales, TbSucUsuario> tbSucUsuarioList;

}