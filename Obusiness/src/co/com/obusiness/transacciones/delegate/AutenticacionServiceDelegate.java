package co.com.obusiness.transacciones.delegate;


import co.com.obusiness.common.AtributosSesion;
import co.com.obusiness.common.CodigoServicio;
import co.com.obusiness.common.ServiceLocator;
import co.com.obusiness.entidades.TsEmpUsuarios;
import co.com.obusiness.security.dto.AutenticacionDTO;
import co.com.obusiness.security.service.AutenticacionService;
import co.com.obusiness.transacciones.ContextoWeb;

/**
 * 
 * Delegado encargado de buscar el servicio correspondiente a la autenticaión del usuario
 * 
 * @author YULANI BARRAZA
 */
public class AutenticacionServiceDelegate {
	
	private AutenticacionService service;

	/**
	 *  Constructor que crea una instancia del delegado
	 */
	public AutenticacionServiceDelegate( AutenticacionDTO datos ) {
		this.service = (AutenticacionService)ServiceLocator.getInstance()
							       .getService(CodigoServicio.AUTENTICACION_SERVICE, 
									       datos.getNombreUsuario(), datos.getClave());
	}
	
	/**
	 * constructor que crea una instancia del delegado
	 */
	public AutenticacionServiceDelegate() {
		TsEmpUsuarios usuario = (TsEmpUsuarios) ContextoWeb.getInstance().get(AtributosSesion.USUARIO);
		this.service = (AutenticacionService) ServiceLocator.getInstance()
				.getService(CodigoServicio.AUTENTICACION_SERVICE, usuario);
	}
	
	/**
	 * Obtiene el servicio a utilizar 
	 * 
	 * @return service : El servicio de autenticación
	 */
	public AutenticacionService getService() {
		return this.service;
	}
}
