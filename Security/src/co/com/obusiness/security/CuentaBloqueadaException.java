package co.com.obusiness.security;

import java.io.Serializable;

/**
 * Excepcion que representa que una cuenta esta bloqueada
 * @author Johann Medina
 */
public class CuentaBloqueadaException extends CotrafaSecurityException implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Construye una instancia de la excepcion
	 * @param message Mensaje de error
	 * @param mensajeUsuario Mensaje de error para el usuario
	 */
	public CuentaBloqueadaException(String message, String mensajeUsuario) {
		super(message, mensajeUsuario);
	}
	
	/**
	 * Construye una instancia de la excepcion
	 * @param message Mensaje de error
	 * @param mensajeUsuario Mensaje de error para el usuario
	 * @param ex Causa de la excepcion
	 */
	public CuentaBloqueadaException(String message, String mensajeUsuario, Exception ex) {
		super(message, mensajeUsuario, ex);
	}
}
