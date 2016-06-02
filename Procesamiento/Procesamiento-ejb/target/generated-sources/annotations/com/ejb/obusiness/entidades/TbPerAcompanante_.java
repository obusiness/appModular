package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbPerAcompanantePK;
import com.ejb.obusiness.entidades.TbPersonas;
import com.ejb.obusiness.entidades.TbTipoParentesco;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbPerAcompanante.class)
public class TbPerAcompanante_ { 

    public static volatile SingularAttribute<TbPerAcompanante, TbTipoParentesco> parentesco;
    public static volatile SingularAttribute<TbPerAcompanante, TbPerAcompanantePK> tbPerAcompanantePK;
    public static volatile SingularAttribute<TbPerAcompanante, String> telefono;
    public static volatile SingularAttribute<TbPerAcompanante, TbPersonas> tbPersonas;

}