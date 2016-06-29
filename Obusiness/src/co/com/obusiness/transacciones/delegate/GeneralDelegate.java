package co.com.obusiness.transacciones.delegate;

import co.com.obusiness.common.AtributosSesion;
import co.com.obusiness.common.ServiceLocator;
import co.com.obusiness.entidades.TsEmpUsuarios;
import co.com.obusiness.transacciones.ContextoWeb;

/**
 * Delegado encargado de buscar el servicio generico
 * @author Jacevedo
 * @version 1.0
 * @created 13-Abr-2012 01:19:06 p.m.
 */
public class GeneralDelegate {

	private Object service;

	/**
	 * constructor que crea una instancia del delegado
	 */
	public GeneralDelegate( String nameService ) {
		
		TsEmpUsuarios usuario = (TsEmpUsuarios) ContextoWeb.getInstance().get(AtributosSesion.USUARIO);
		this.service = ServiceLocator.getInstance().getService( nameService, usuario );
	}

	/**
	 * Obtiene el servicio a utilizar
	 * 
	 * @return service : El servicio generico
	 */		
	public Object getService() {
		return this.service;
	}
}
