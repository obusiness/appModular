package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TsCfgComponentes;
import com.ejb.obusiness.entidades.TsEmpRoles;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TsEmpPermisos.class)
public class TsEmpPermisos_ { 

    public static volatile SingularAttribute<TsEmpPermisos, Long> id;
    public static volatile SingularAttribute<TsEmpPermisos, Short> visualizar;
    public static volatile SingularAttribute<TsEmpPermisos, Short> crear;
    public static volatile SingularAttribute<TsEmpPermisos, TsCfgComponentes> codigoComponente;
    public static volatile SingularAttribute<TsEmpPermisos, Short> eliminar;
    public static volatile SingularAttribute<TsEmpPermisos, TsEmpRoles> idRol;
    public static volatile SingularAttribute<TsEmpPermisos, Short> modificar;

}