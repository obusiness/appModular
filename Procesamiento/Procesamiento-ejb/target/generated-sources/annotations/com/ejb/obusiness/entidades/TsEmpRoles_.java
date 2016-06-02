package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbEmpresas;
import com.ejb.obusiness.entidades.TsEmpPermisos;
import com.ejb.obusiness.entidades.TsEmpRolesUsuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TsEmpRoles.class)
public class TsEmpRoles_ { 

    public static volatile SingularAttribute<TsEmpRoles, Long> id;
    public static volatile SingularAttribute<TsEmpRoles, TsEmpPermisos> tsEmpPermisos;
    public static volatile SingularAttribute<TsEmpRoles, TbEmpresas> idEmpresas;
    public static volatile ListAttribute<TsEmpRoles, TsEmpRolesUsuarios> tsEmpRolesUsuariosList;
    public static volatile SingularAttribute<TsEmpRoles, String> descripcion;
    public static volatile SingularAttribute<TsEmpRoles, String> rol;

}