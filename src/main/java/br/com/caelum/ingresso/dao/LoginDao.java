package br.com.caelum.ingresso.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Usuario;

/**
 * Created by nando on 03/03/17.
 */
@Repository
public class LoginDao implements UserDetailsService {

	@PersistenceContext
	private EntityManager manager;

	public Sala findOne(Integer id) {

		return manager.find(Sala.class, id);
	}

	public void save(Sala sala) {
		manager.merge(sala);
	}

	public List<Sala> findAll() {
		return manager.createQuery("select s from Sala s", Sala.class).getResultList();
	}

	public void delete(Integer id) {
		manager.remove(findOne(id));
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		try {
			return manager.createQuery("select	u	from	Usuario	u	where	u.email	=	:email", Usuario.class)
					.setParameter("email", email).getSingleResult();
		} catch (NoResultException e) {
			throw new UsernameNotFoundException("Email	" + email + "Não	encontrado!");
		}
	}
}
