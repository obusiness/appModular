package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbEmpresas;
import com.ejb.obusiness.entidades.TbInvMovimientos;
import com.ejb.obusiness.entidades.TbInvSucursal;
import com.ejb.obusiness.entidades.TbPersonas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbInvProductos.class)
public class TbInvProductos_ { 

    public static volatile SingularAttribute<TbInvProductos, Long> id;
    public static volatile SingularAttribute<TbInvProductos, String> tipoProducto;
    public static volatile SingularAttribute<TbInvProductos, TbEmpresas> idEmpresa;
    public static volatile ListAttribute<TbInvProductos, TbInvSucursal> tbInvSucursalList;
    public static volatile SingularAttribute<TbInvProductos, Long> cantidad;
    public static volatile SingularAttribute<TbInvProductos, TbPersonas> tbPersonas;
    public static volatile SingularAttribute<TbInvProductos, String> producto;
    public static volatile SingularAttribute<TbInvProductos, String> unidad;
    public static volatile ListAttribute<TbInvProductos, TbInvMovimientos> tbInvMovimientosList;

}