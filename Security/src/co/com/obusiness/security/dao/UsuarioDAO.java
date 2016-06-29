package co.com.obusiness.security.dao;

import java.util.List;

import co.com.obusiness.common.error.CotrafaException;
import co.com.obusiness.entidades.TsEmpUsuarios;

public interface UsuarioDAO {

	public abstract List<TsEmpUsuarios> findAll();

	public abstract TsEmpUsuarios findById(String usuario);

	public abstract void save(TsEmpUsuarios usuario);
	
	public TsEmpUsuarios getUsuario( String nombre );
	
	public boolean autenticarUsuario( String login, String password ) throws CotrafaException;

}