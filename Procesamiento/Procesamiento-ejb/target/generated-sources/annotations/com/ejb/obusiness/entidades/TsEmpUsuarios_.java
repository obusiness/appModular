package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbEmpresas;
import com.ejb.obusiness.entidades.TbSucUsuario;
import com.ejb.obusiness.entidades.TsEmpRolesUsuarios;
import com.ejb.obusiness.entidades.TsEmpUsuariosPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TsEmpUsuarios.class)
public class TsEmpUsuarios_ { 

    public static volatile SingularAttribute<TsEmpUsuarios, TsEmpUsuariosPK> tsEmpUsuariosPK;
    public static volatile SingularAttribute<TsEmpUsuarios, String> estado;
    public static volatile SingularAttribute<TsEmpUsuarios, String> usuario;
    public static volatile ListAttribute<TsEmpUsuarios, TsEmpRolesUsuarios> tsEmpRolesUsuariosList;
    public static volatile ListAttribute<TsEmpUsuarios, TbSucUsuario> tbSucUsuarioList;
    public static volatile SingularAttribute<TsEmpUsuarios, TbEmpresas> tbEmpresas;

}