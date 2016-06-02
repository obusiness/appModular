package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbInvProductos;
import com.ejb.obusiness.entidades.TbMsTipoCompanias;
import com.ejb.obusiness.entidades.TbMsTipoRamos;
import com.ejb.obusiness.entidades.TbPersonas;
import com.ejb.obusiness.entidades.TsEmpAplicaciones;
import com.ejb.obusiness.entidades.TsEmpRoles;
import com.ejb.obusiness.entidades.TsEmpUsuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbEmpresas.class)
public class TbEmpresas_ { 

    public static volatile SingularAttribute<TbEmpresas, Long> id;
    public static volatile SingularAttribute<TbEmpresas, String> nombre;
    public static volatile ListAttribute<TbEmpresas, TsEmpAplicaciones> tsEmpAplicacionesList;
    public static volatile ListAttribute<TbEmpresas, TbInvProductos> tbInvProductosList;
    public static volatile ListAttribute<TbEmpresas, TbMsTipoRamos> tbMsTipoRamosList;
    public static volatile SingularAttribute<TbEmpresas, String> descripcion;
    public static volatile ListAttribute<TbEmpresas, TsEmpRoles> tsEmpRolesList;
    public static volatile ListAttribute<TbEmpresas, TbMsTipoCompanias> tbMsTipoCompaniasList;
    public static volatile ListAttribute<TbEmpresas, TsEmpUsuarios> tsEmpUsuariosList;
    public static volatile ListAttribute<TbEmpresas, TbPersonas> tbPersonasList;

}