package co.com.obusiness.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.obusiness.common.error.CotrafaError;
import co.com.obusiness.entidades.TsEmpUsuarios;
import co.com.obusiness.security.dto.AutenticacionDTO;




/**
 * @author Jmarin
 * @version 1.0
 */
public class ServiceLocator {
	private static final String SPRING_CONFIG_FILE =  "applicationContext.xml";
	private static ServiceLocator instance;
	private ApplicationContext context;
	
	private ServiceLocator() {

		try {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(SPRING_CONFIG_FILE);
			this.context = ctx;

		} catch (BeansException e) {
			throw new CotrafaError(e);
		}
		
	}
	
	public static ServiceLocator getInstance() {
		if (instance == null)
			instance = new ServiceLocator();
		
		return instance;
	}
	
	public Object getService(CodigoServicio codigoServicio) {
		Object resultado = this.context.getBean(codigoServicio.toString());
		
		return resultado;
	}
	
	public Object getService(String codigoServicio) {
		
		Object resultado = this.context.getBean(codigoServicio);
		
		return resultado;
	}
	
	public Object getService(CodigoServicio codigoServicio, TsEmpUsuarios usuario){
		//this.setUserDataConnection(usuario);
		return getService(codigoServicio);
	}
	
	public Object getService(String codigoServicio, TsEmpUsuarios usuario){
		//this.setUserDataConnection(usuario);
		return getService(codigoServicio);
	}
	
	public Object getService(CodigoServicio codigoServicio, String usuario, String clave){
		//this.setUserDataConnection(usuario, clave);
		return getService(codigoServicio);
	}
	
	public Object getService(CodigoServicio codigoServicio, AutenticacionDTO autenticacionDto){
		//this.setUserDataConnection(autenticacionDto);
		return getService(codigoServicio);
	}
	
	/**
	 * Asigna la información del usuario conectado a la aplicacion para establecer
	 * la conexión a la base de datos
	 * @param usuario
	 */
	/*public void setUserDataConnection(Usuario usuario){
		if (usuario != null){
			OracleOCIConnectionStrategy connectionStrategy = (OracleOCIConnectionStrategy) this.context.getBean("sicConnectionStrategy");
			if (connectionStrategy != null){
				connectionStrategy.setProxyUserName(usuario.getNombre());
				connectionStrategy.setProxyUserPassword(null);
				connectionStrategy.setClientIdentifier(((usuario.getTsPersonasByPerId() != null && usuario.getTsPersonasByPerId().getId() != 0) ? String.valueOf(usuario.getTsPersonasByPerId().getId()) : null));
			}
		}	
	}hossa*/
	
	/**
	 * Asigna la información del usuario conectado a la aplicacion para establecer
	 * la conexión a la base de datos
	 * @param usuario
	 */
	/*public void setUserDataConnection(String userName, String password){
		OracleOCIConnectionStrategy connectionStrategy = (OracleOCIConnectionStrategy) this.context.getBean("sicConnectionStrategy");
		if (connectionStrategy != null){
			//((OracleOCIConnectionStrategy) connectionStrategy).setProxyUserName("SIC");
			connectionStrategy.setProxyUserName(userName);
			connectionStrategy.setProxyUserPassword(password);
		}
	}hossa*/
	
	/**
	 * Asigna la información del usuario conectado a la aplicacion para establecer
	 * la conexión a la base de datos
	 * @param usuario
	 */
	/*public void setUserDataConnection(AutenticacionDTO autenticacionDto){
		OracleOCIConnectionStrategy connectionStrategy = (OracleOCIConnectionStrategy) this.context.getBean("sicConnectionStrategy");
		if (connectionStrategy != null){
			//((OracleOCIConnectionStrategy) connectionStrategy).setProxyUserName("SIC");
			connectionStrategy.setProxyUserName(autenticacionDto.getNombreUsuario());
			connectionStrategy.setProxyUserPassword(autenticacionDto.getClave());
		}
	}
hossa*/
}
