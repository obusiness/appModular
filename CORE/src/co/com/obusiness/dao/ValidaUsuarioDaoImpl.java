package co.com.obusiness.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.obusiness.dao.sp.ValidaUsuarioSp;
import co.com.obusiness.entidades.TsEmpUsuarios;


@Repository
public class ValidaUsuarioDaoImpl extends HibernateDaoSupport  implements ValidaUsuarioDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	//private ValidaUsuarioSp validaUsuarioSp;
	
	@Override
	
	public String validaUsuario(TsEmpUsuarios usuario) throws Exception{	
		//Session session = sessionFactory.getCurrentSession();
		ValidaUsuarioSp validaUsuarioSp = new ValidaUsuarioSp(this.getHibernateTemplate().getSessionFactory());
		String respuesta = validaUsuarioSp.validar(usuario);
		return respuesta;
	}


}
