package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbPerDirecciones;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbTipoRegion.class)
public class TbTipoRegion_ { 

    public static volatile SingularAttribute<TbTipoRegion, Long> id;
    public static volatile SingularAttribute<TbTipoRegion, String> codigo;
    public static volatile SingularAttribute<TbTipoRegion, String> region;
    public static volatile ListAttribute<TbTipoRegion, TbPerDirecciones> tbPerDireccionesList;

}