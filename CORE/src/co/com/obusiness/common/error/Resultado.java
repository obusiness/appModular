package co.com.obusiness.common.error;

/**
 * @author Jacevedo
 * @version 1.0
 * @created 24-Ago-2011 03:05:15 p.m.
 */
public class Resultado {

	private String mensaje;
	private String mensajeTecnico;
	private int codigo;
	//valores seg�n los definicdos en la enumeaci�n ResultadoOperacion
	
	public Resultado() {

	}

	public Resultado(int codigo) {
		this.codigo = codigo;
	}
	
	public String getMensajeTecnico() {
		return mensajeTecnico;
	}

	public void setMensajeTecnico(String mensajeTecnico) {
		if (mensajeTecnico != null && mensajeTecnico.length() > 0)
			this.mensajeTecnico = mensajeTecnico;
		else 
			this.mensajeTecnico = null;		

	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		if (mensaje != null && mensaje.length() > 0)
			this.mensaje = mensaje;
		else 
			this.mensaje = null;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}