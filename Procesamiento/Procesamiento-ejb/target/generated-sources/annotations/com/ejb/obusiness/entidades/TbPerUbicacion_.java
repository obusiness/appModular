package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbPersonas;
import com.ejb.obusiness.entidades.TbTipoUbicaciones;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbPerUbicacion.class)
public class TbPerUbicacion_ { 

    public static volatile SingularAttribute<TbPerUbicacion, Long> id;
    public static volatile SingularAttribute<TbPerUbicacion, TbTipoUbicaciones> tipoUbicacion;
    public static volatile SingularAttribute<TbPerUbicacion, String> descripcion;
    public static volatile SingularAttribute<TbPerUbicacion, TbPersonas> tbPersonas;

}