/**
 * 
 */
package br.com.caelum.ingresso.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author lab8402
 *
 */
@Entity
public class Permissao implements GrantedAuthority {
	@Id
	private String nome;

	@Override
	public String getAuthority() {
		return nome;
	}

	public Permissao(String nome) {
		this.nome = nome;
	}

	/**
	 * @deprecated hibernate only
	 */
	public Permissao() {
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
}
