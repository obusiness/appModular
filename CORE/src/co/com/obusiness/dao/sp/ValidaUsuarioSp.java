package co.com.obusiness.dao.sp;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.orm.hibernate4.SessionFactoryUtils;

import co.com.obusiness.entidades.TsEmpUsuarios;

public class ValidaUsuarioSp extends StoredProcedure{ 
	private static final String SPROC_NAME = "pa_valida_usuario"; 
	
	public ValidaUsuarioSp(SessionFactory sessionFactory) {	
		this.setDataSource(SessionFactoryUtils.getDataSource(sessionFactory));
		this.setSql(  SPROC_NAME ); 
	    declareParameter(new SqlParameter("niIdEmpresa", Types.INTEGER));
	    declareParameter(new SqlParameter("niIdUsuario", Types.VARCHAR));

	    declareParameter(new SqlOutParameter("voRespuesta", Types.VARCHAR));
		this.compile();
	}
	
	  public String validar(TsEmpUsuarios usuario) {
		    Map<String, String> inParameters = new HashMap<String, String>(2);
		    inParameters.put("niIdEmpresa", String.valueOf(usuario.getId().getIdEmpresa()));
		    inParameters.put("niIdUsuario", String.valueOf(usuario.getId().getId()));
		
		    Map<String, Object> outParameters = execute(inParameters);
		    if (outParameters.size() > 0) {
		      return (String) outParameters.get("voRespuesta");
		    } else {
		      return "NO";
		    }
		  }
	
	
}