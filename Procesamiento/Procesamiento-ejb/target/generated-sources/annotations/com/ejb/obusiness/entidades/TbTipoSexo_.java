package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbPersonas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbTipoSexo.class)
public class TbTipoSexo_ { 

    public static volatile SingularAttribute<TbTipoSexo, Long> id;
    public static volatile SingularAttribute<TbTipoSexo, String> codigo;
    public static volatile SingularAttribute<TbTipoSexo, String> descripcion;
    public static volatile ListAttribute<TbTipoSexo, TbPersonas> tbPersonasList;

}