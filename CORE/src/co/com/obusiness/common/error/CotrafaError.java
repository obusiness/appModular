package co.com.obusiness.common.error;

import java.io.Serializable;

/**
 * Representa todos las errores que puedan suceder en los servicios de la aplicacion
 * @author Johann Medina
 */
public class CotrafaError extends RuntimeException implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String userMessage;
	/**
	 * Construye una instancia del error
	 * @param message Mensaje de error
	 */
	public CotrafaError(String message) {
		super(message);
	}
	
	/**
	 * Construye una instancia del error
	 * @param message Mensaje de error
	 * @param mensajeUsuario Mensaje para el usuario
	 * @param causa Causa del error
	 */
	public CotrafaError(String message, Throwable causa) {
		super(message, causa);
	}
	/**
	 * Construye una instancia del error
	 * @param message
	 * @param userMessage
	 */
	public CotrafaError(String message, String userMessage) {
		super(message);
		this.userMessage = userMessage;
	}
	
	/**
	 * Construye una instancia del error
	 * @param message Mensaje de error
	 * @param mensajeUsuario Mensaje para el usuario
	 * @param causa Causa del error
	 */
	public CotrafaError(String message, String userMessage, Throwable causa) {
		super(message, causa);
		this.userMessage = userMessage;
	}
	
	/**
	 * Construye una instancia del error
	 * @param causa Causa del error
	 */
	public CotrafaError(Throwable causa) {
		super(causa);
	}

	public String getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}
	
}
