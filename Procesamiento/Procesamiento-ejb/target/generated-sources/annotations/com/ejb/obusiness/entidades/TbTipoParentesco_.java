package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbPerAcompanante;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbTipoParentesco.class)
public class TbTipoParentesco_ { 

    public static volatile SingularAttribute<TbTipoParentesco, Long> id;
    public static volatile SingularAttribute<TbTipoParentesco, String> codigo;
    public static volatile SingularAttribute<TbTipoParentesco, String> parentesco;
    public static volatile ListAttribute<TbTipoParentesco, TbPerAcompanante> tbPerAcompananteList;

}