package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbFacCuadres;
import com.ejb.obusiness.entidades.TbSucursales;
import com.ejb.obusiness.entidades.TsEmpUsuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbSucUsuario.class)
public class TbSucUsuario_ { 

    public static volatile SingularAttribute<TbSucUsuario, Long> id;
    public static volatile SingularAttribute<TbSucUsuario, TsEmpUsuarios> tsEmpUsuarios;
    public static volatile ListAttribute<TbSucUsuario, TbFacCuadres> tbFacCuadresList;
    public static volatile SingularAttribute<TbSucUsuario, String> estado;
    public static volatile SingularAttribute<TbSucUsuario, TbSucursales> idSucursal;

}