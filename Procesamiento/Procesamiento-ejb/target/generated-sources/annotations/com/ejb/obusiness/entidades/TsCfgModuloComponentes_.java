package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TsCfgComponentes;
import com.ejb.obusiness.entidades.TsCfgModuloComponentes;
import com.ejb.obusiness.entidades.TsCfgModulos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TsCfgModuloComponentes.class)
public class TsCfgModuloComponentes_ { 

    public static volatile SingularAttribute<TsCfgModuloComponentes, Long> id;
    public static volatile SingularAttribute<TsCfgModuloComponentes, Long> orden;
    public static volatile SingularAttribute<TsCfgModuloComponentes, TsCfgModuloComponentes> componentePadre;
    public static volatile ListAttribute<TsCfgModuloComponentes, TsCfgModuloComponentes> tsCfgModuloComponentesList;
    public static volatile SingularAttribute<TsCfgModuloComponentes, TsCfgComponentes> codigoComponente;
    public static volatile SingularAttribute<TsCfgModuloComponentes, TsCfgModulos> codigoModulo;

}