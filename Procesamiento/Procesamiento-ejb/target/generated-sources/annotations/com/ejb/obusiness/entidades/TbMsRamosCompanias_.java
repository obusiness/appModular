package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbMsPolizas;
import com.ejb.obusiness.entidades.TbMsTipoCompanias;
import com.ejb.obusiness.entidades.TbMsTipoRamos;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbMsRamosCompanias.class)
public class TbMsRamosCompanias_ { 

    public static volatile SingularAttribute<TbMsRamosCompanias, Long> id;
    public static volatile SingularAttribute<TbMsRamosCompanias, BigDecimal> porcentaje;
    public static volatile ListAttribute<TbMsRamosCompanias, TbMsPolizas> tbMsPolizasList;
    public static volatile SingularAttribute<TbMsRamosCompanias, Long> idConpania;
    public static volatile SingularAttribute<TbMsRamosCompanias, TbMsTipoCompanias> idCompania;
    public static volatile SingularAttribute<TbMsRamosCompanias, TbMsTipoRamos> idRamo;

}