package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbInvMovimientos;
import com.ejb.obusiness.entidades.TbInvProductos;
import com.ejb.obusiness.entidades.TbInvSucursalPK;
import com.ejb.obusiness.entidades.TbSucursales;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbInvSucursal.class)
public class TbInvSucursal_ { 

    public static volatile SingularAttribute<TbInvSucursal, TbInvSucursalPK> tbInvSucursalPK;
    public static volatile SingularAttribute<TbInvSucursal, Long> cantidad;
    public static volatile SingularAttribute<TbInvSucursal, TbInvProductos> tbInvProductos;
    public static volatile SingularAttribute<TbInvSucursal, BigDecimal> porcentajeDcto;
    public static volatile SingularAttribute<TbInvSucursal, TbSucursales> tbSucursales;
    public static volatile ListAttribute<TbInvSucursal, TbInvMovimientos> tbInvMovimientosList;

}