package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbPerUbicacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbTipoUbicaciones.class)
public class TbTipoUbicaciones_ { 

    public static volatile SingularAttribute<TbTipoUbicaciones, Long> id;
    public static volatile SingularAttribute<TbTipoUbicaciones, String> codigo;
    public static volatile ListAttribute<TbTipoUbicaciones, TbPerUbicacion> tbPerUbicacionList;
    public static volatile SingularAttribute<TbTipoUbicaciones, String> ubicacion;

}