package co.com.obusiness.security;

import java.io.Serializable;

/**
 * Encapsula los datos de conexion al OID
 * @author Johann Medina
 */
public class DataSourceOID implements Serializable {
	private static final long serialVersionUID = 1L;
	private String ldapHost;
	private int ldapPort;
	private String baseDN;
	
	/**
	 * Obtiene el host al que se debe conectar
	 * @return Cadena con el host
	 */
	public String getLdapHost() {
		return ldapHost;
	}
	
	/**
	 * Establece el host al que se debe conectar
	 * @param ldapHost Cadena con el host
	 */
	public void setLdapHost(String ldapHost) {
		this.ldapHost = ldapHost;
	}
	
	/**
	 * Obtiene el puerto al que se debe conectar
	 * @return Numero del puerto
	 */
	public int getLdapPort() {
		return ldapPort;
	}
	
	/**
	 * Establece el puerto al que se debe conectar
	 * @param ldapPort Numero del puerto
	 */
	public void setLdapPort(int ldapPort) {
		this.ldapPort = ldapPort;
	}
	
	/**
	 * Obtiene el DN base para las busquedas en el directorio
	 * @return Cadena con el DN base
	 */
	public String getBaseDN() {
		return baseDN;
	}

	/**
	 * Establece el DN base para las busquedas en el directorio
	 * @param baseDN Cadena con el DN base
	 */
	public void setBaseDN(String baseDN) {
		this.baseDN = baseDN;
	}
}
