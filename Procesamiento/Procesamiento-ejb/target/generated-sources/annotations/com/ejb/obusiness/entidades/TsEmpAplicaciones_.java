package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbEmpresas;
import com.ejb.obusiness.entidades.TsCfgModulos;
import com.ejb.obusiness.entidades.TsEmpAplicacionesPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TsEmpAplicaciones.class)
public class TsEmpAplicaciones_ { 

    public static volatile SingularAttribute<TsEmpAplicaciones, Date> fechaFinal;
    public static volatile SingularAttribute<TsEmpAplicaciones, String> estado;
    public static volatile SingularAttribute<TsEmpAplicaciones, TsEmpAplicacionesPK> tsEmpAplicacionesPK;
    public static volatile SingularAttribute<TsEmpAplicaciones, Date> fechaInicio;
    public static volatile SingularAttribute<TsEmpAplicaciones, TsCfgModulos> tsCfgModulos;
    public static volatile SingularAttribute<TsEmpAplicaciones, TbEmpresas> tbEmpresas;

}