package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbEmpresas;
import com.ejb.obusiness.entidades.TbMsRamosCompanias;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbMsTipoRamos.class)
public class TbMsTipoRamos_ { 

    public static volatile SingularAttribute<TbMsTipoRamos, Long> id;
    public static volatile SingularAttribute<TbMsTipoRamos, String> codigo;
    public static volatile SingularAttribute<TbMsTipoRamos, TbEmpresas> idEmpresa;
    public static volatile ListAttribute<TbMsTipoRamos, TbMsRamosCompanias> tbMsRamosCompaniasList;
    public static volatile SingularAttribute<TbMsTipoRamos, String> ramo;

}