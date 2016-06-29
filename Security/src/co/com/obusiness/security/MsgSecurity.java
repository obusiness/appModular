package co.com.obusiness.security;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * Singleton para obtener los mensajes 
 * @author Johann Medina
 */
public class MsgSecurity {
	private static MsgSecurity instance;
	
	/**
	 * Evita que se construya una instancia directamente
	 */
	private MsgSecurity() { }
	
	/**
	 * Obtiene la unica instancia de la clase
	 * @return Instancia de la clase
	 */
	public static MsgSecurity getInstance() {
		if (instance == null) instance = new MsgSecurity();
		return instance;
	}
	
	/**
	 * Obtiene el mensaje que se desea mostrar la usuario desde el archivo de recursos
	 * @param claveMensaje Clave del del mensaje a mostrar
	 * @param argsMensaje Argumentos del mensaje a mostrar
	 * @return Texto con el mensaje
	 */
	public String get(String claveMensaje, Object... argsMensaje) {
		
		// obtiene el mensaje
        ResourceBundle bundle = ResourceBundle.getBundle("MsgSecurity");
        String mensaje = bundle.getString(claveMensaje);
        
        // formato del mensaje
        if (argsMensaje.length > 0) mensaje = MessageFormat.format(mensaje, argsMensaje);
		
        // Indica el mensaje
        return mensaje;
	}
}
