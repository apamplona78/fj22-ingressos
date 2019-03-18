/**
 * 
 */
package br.com.caelum.ingresso.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author lab8402
 *
 */
@Entity
public class Compra {
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	List<Ingresso> ingressos = new ArrayList<>();

	/**
	 * @deprecated hibernate only
	 */
	public Compra() {
	}

	public Compra(List<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the ingressos
	 */
	public List<Ingresso> getIngressos() {
		return ingressos;
	}

	/**
	 * @param ingressos the ingressos to set
	 */
	public void setIngressos(List<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}
}
