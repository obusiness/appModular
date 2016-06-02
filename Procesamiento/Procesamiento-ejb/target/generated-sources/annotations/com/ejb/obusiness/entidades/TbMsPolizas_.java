package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbMsParticipaciones;
import com.ejb.obusiness.entidades.TbMsRamosCompanias;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbMsPolizas.class)
public class TbMsPolizas_ { 

    public static volatile SingularAttribute<TbMsPolizas, Long> id;
    public static volatile SingularAttribute<TbMsPolizas, TbMsParticipaciones> idParticipacion;
    public static volatile SingularAttribute<TbMsPolizas, TbMsRamosCompanias> idRamo;

}