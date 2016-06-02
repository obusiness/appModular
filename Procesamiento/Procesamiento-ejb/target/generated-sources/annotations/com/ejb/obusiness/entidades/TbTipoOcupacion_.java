package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbPersonas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbTipoOcupacion.class)
public class TbTipoOcupacion_ { 

    public static volatile SingularAttribute<TbTipoOcupacion, Long> id;
    public static volatile SingularAttribute<TbTipoOcupacion, String> codigo;
    public static volatile SingularAttribute<TbTipoOcupacion, String> descripcion;
    public static volatile ListAttribute<TbTipoOcupacion, TbPersonas> tbPersonasList;

}