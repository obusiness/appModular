package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbInvProductos;
import com.ejb.obusiness.entidades.TbInvSucursal;
import com.ejb.obusiness.entidades.TbTipoMovimientos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbInvMovimientos.class)
public class TbInvMovimientos_ { 

    public static volatile SingularAttribute<TbInvMovimientos, Long> id;
    public static volatile SingularAttribute<TbInvMovimientos, TbTipoMovimientos> idTipoMovimiento;
    public static volatile SingularAttribute<TbInvMovimientos, Long> cantidad;
    public static volatile SingularAttribute<TbInvMovimientos, TbInvProductos> idProducto;
    public static volatile SingularAttribute<TbInvMovimientos, TbInvSucursal> tbInvSucursal;

}