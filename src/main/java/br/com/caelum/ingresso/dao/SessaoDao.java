package br.com.caelum.ingresso.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;

/**
 * Created by nando on 03/03/17.
 */
@Repository
public class SessaoDao {

	@PersistenceContext
	private EntityManager manager;

	public Sessao findOne(Integer id) {

		return manager.find(Sessao.class, id);
	}

	public void save(Sessao sessao) {
		manager.merge(sessao);
	}

	public List<Sessao> findAll() {
		return manager.createQuery("select s from Sessao s", Sessao.class).getResultList();
	}

	public void delete(Integer id) {
		manager.remove(findOne(id));
	}
	
	public List<Sessao> buscaSessoesDaSala(Sala sala) {
		return manager.createQuery("select s from Sessao s where s.sala = :sala", Sessao.class)
				.setParameter("sala", sala)
				.getResultList();
	}
}