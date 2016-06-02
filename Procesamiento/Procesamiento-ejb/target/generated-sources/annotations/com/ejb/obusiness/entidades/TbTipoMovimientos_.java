package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbInvMovimientos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbTipoMovimientos.class)
public class TbTipoMovimientos_ { 

    public static volatile SingularAttribute<TbTipoMovimientos, Long> id;
    public static volatile SingularAttribute<TbTipoMovimientos, Long> operacion;
    public static volatile SingularAttribute<TbTipoMovimientos, String> movimiento;
    public static volatile ListAttribute<TbTipoMovimientos, TbInvMovimientos> tbInvMovimientosList;

}