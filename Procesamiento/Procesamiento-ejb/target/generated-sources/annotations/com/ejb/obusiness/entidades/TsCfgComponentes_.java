package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TsCfgModuloComponentes;
import com.ejb.obusiness.entidades.TsCfgTipoComponentes;
import com.ejb.obusiness.entidades.TsEmpPermisos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TsCfgComponentes.class)
public class TsCfgComponentes_ { 

    public static volatile SingularAttribute<TsCfgComponentes, String> codigo;
    public static volatile SingularAttribute<TsCfgComponentes, String> componente;
    public static volatile ListAttribute<TsCfgComponentes, TsEmpPermisos> tsEmpPermisosList;
    public static volatile SingularAttribute<TsCfgComponentes, TsCfgTipoComponentes> codigoTipoComponente;
    public static volatile SingularAttribute<TsCfgComponentes, String> descripcion;
    public static volatile SingularAttribute<TsCfgComponentes, String> funcion;
    public static volatile ListAttribute<TsCfgComponentes, TsCfgModuloComponentes> tsCfgModuloComponentesList;

}