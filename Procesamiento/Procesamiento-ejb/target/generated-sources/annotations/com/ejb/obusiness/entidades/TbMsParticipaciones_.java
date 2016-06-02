package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbMsPolizas;
import com.ejb.obusiness.entidades.TbPersonas;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbMsParticipaciones.class)
public class TbMsParticipaciones_ { 

    public static volatile SingularAttribute<TbMsParticipaciones, Long> id;
    public static volatile SingularAttribute<TbMsParticipaciones, BigDecimal> porcentaje;
    public static volatile ListAttribute<TbMsParticipaciones, TbMsPolizas> tbMsPolizasList;
    public static volatile SingularAttribute<TbMsParticipaciones, TbPersonas> tbPersonas;

}