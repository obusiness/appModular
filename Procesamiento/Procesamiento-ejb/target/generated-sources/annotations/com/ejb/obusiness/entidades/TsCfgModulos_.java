package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TsCfgModuloComponentes;
import com.ejb.obusiness.entidades.TsEmpAplicaciones;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TsCfgModulos.class)
public class TsCfgModulos_ { 

    public static volatile SingularAttribute<TsCfgModulos, Long> codigo;
    public static volatile ListAttribute<TsCfgModulos, TsEmpAplicaciones> tsEmpAplicacionesList;
    public static volatile SingularAttribute<TsCfgModulos, String> descripcion;
    public static volatile SingularAttribute<TsCfgModulos, String> modulo;
    public static volatile SingularAttribute<TsCfgModulos, String> observaciones;
    public static volatile ListAttribute<TsCfgModulos, TsCfgModuloComponentes> tsCfgModuloComponentesList;

}