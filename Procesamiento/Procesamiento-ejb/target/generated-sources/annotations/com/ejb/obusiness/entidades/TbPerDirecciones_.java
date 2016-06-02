package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbPersonas;
import com.ejb.obusiness.entidades.TbTipoRegion;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbPerDirecciones.class)
public class TbPerDirecciones_ { 

    public static volatile SingularAttribute<TbPerDirecciones, Long> id;
    public static volatile SingularAttribute<TbPerDirecciones, String> direccion;
    public static volatile SingularAttribute<TbPerDirecciones, TbPersonas> tbPersonas;
    public static volatile SingularAttribute<TbPerDirecciones, TbTipoRegion> idRegion;

}