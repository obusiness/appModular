package co.com.obusiness.security;

import java.io.Serializable;

/**
 * Excepcion que representa que el usuario o contraseña son invalidos
 * @author Johann Medina
 */
public class CredencialesInvalidasException extends CotrafaSecurityException implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Construye una instancia de la excepcion
	 * @param message Mensaje de error
	 * @param mensajeUsuario Mensaje de error para el usuario
	 */
	public CredencialesInvalidasException(String message, String mensajeUsuario) {
		super(message, mensajeUsuario);
	}
	
	/**
	 * Construye una instancia de la excepcion
	 * @param message Mensaje de error
	 * @param mensajeUsuario Mensaje de error para el usuario
	 * @param ex Causa de la excepcion
	 */
	public CredencialesInvalidasException(String message, String mensajeUsuario, Exception ex) {
		super(message, mensajeUsuario, ex);
	}
}
