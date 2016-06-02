package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbFacTransacciones;
import com.ejb.obusiness.entidades.TbSucUsuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbFacCuadres.class)
public class TbFacCuadres_ { 

    public static volatile SingularAttribute<TbFacCuadres, Long> id;
    public static volatile SingularAttribute<TbFacCuadres, Date> fechaCuadre;
    public static volatile SingularAttribute<TbFacCuadres, String> estado;
    public static volatile SingularAttribute<TbFacCuadres, TbSucUsuario> idUsuario;
    public static volatile ListAttribute<TbFacCuadres, TbFacTransacciones> tbFacTransaccionesList;
    public static volatile SingularAttribute<TbFacCuadres, Long> valorEfectivo;

}