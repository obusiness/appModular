package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbFacCuadres;
import com.ejb.obusiness.entidades.TbFacTranDetalles;
import com.ejb.obusiness.entidades.TbTipoFormaPagos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbFacTransacciones.class)
public class TbFacTransacciones_ { 

    public static volatile SingularAttribute<TbFacTransacciones, Long> id;
    public static volatile SingularAttribute<TbFacTransacciones, Date> fecha;
    public static volatile ListAttribute<TbFacTransacciones, TbFacTranDetalles> tbFacTranDetallesList;
    public static volatile SingularAttribute<TbFacTransacciones, TbTipoFormaPagos> formaPago;
    public static volatile SingularAttribute<TbFacTransacciones, TbFacCuadres> idCuadre;

}