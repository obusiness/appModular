package com.ejb.obusiness.entidades;

import com.ejb.obusiness.entidades.TbEmpresas;
import com.ejb.obusiness.entidades.TbInvProductos;
import com.ejb.obusiness.entidades.TbMsParticipaciones;
import com.ejb.obusiness.entidades.TbPerAcompanante;
import com.ejb.obusiness.entidades.TbPerDirecciones;
import com.ejb.obusiness.entidades.TbPerUbicacion;
import com.ejb.obusiness.entidades.TbPersonasPK;
import com.ejb.obusiness.entidades.TbSucursales;
import com.ejb.obusiness.entidades.TbTipoDocumentos;
import com.ejb.obusiness.entidades.TbTipoEstadoCivil;
import com.ejb.obusiness.entidades.TbTipoOcupacion;
import com.ejb.obusiness.entidades.TbTipoSexo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-06-02T12:32:19")
@StaticMetamodel(TbPersonas.class)
public class TbPersonas_ { 

    public static volatile ListAttribute<TbPersonas, TbInvProductos> tbInvProductosList;
    public static volatile SingularAttribute<TbPersonas, TbTipoEstadoCivil> estadoCivil;
    public static volatile SingularAttribute<TbPersonas, String> apellidos;
    public static volatile ListAttribute<TbPersonas, TbSucursales> tbSucursalesList;
    public static volatile SingularAttribute<TbPersonas, TbTipoSexo> sexo;
    public static volatile SingularAttribute<TbPersonas, Date> fechaIngreso;
    public static volatile SingularAttribute<TbPersonas, TbPerAcompanante> tbPerAcompanante;
    public static volatile SingularAttribute<TbPersonas, Date> fechaNacimiento;
    public static volatile ListAttribute<TbPersonas, TbMsParticipaciones> tbMsParticipacionesList;
    public static volatile SingularAttribute<TbPersonas, TbPersonasPK> tbPersonasPK;
    public static volatile SingularAttribute<TbPersonas, String> nombre;
    public static volatile SingularAttribute<TbPersonas, String> identificacion;
    public static volatile SingularAttribute<TbPersonas, TbTipoOcupacion> ocupacion;
    public static volatile ListAttribute<TbPersonas, TbPerDirecciones> tbPerDireccionesList;
    public static volatile SingularAttribute<TbPersonas, Long> edad;
    public static volatile SingularAttribute<TbPersonas, TbTipoDocumentos> tipoDocumento;
    public static volatile ListAttribute<TbPersonas, TbPerUbicacion> tbPerUbicacionList;
    public static volatile SingularAttribute<TbPersonas, TbEmpresas> tbEmpresas;

}