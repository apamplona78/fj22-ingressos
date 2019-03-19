/**
 * 
 */
package br.com.caelum.ingresso.form;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.caelum.ingresso.model.Cartao;

/**
 * @author lab8402
 *
 */
public class PagamentoForm {

	@Valid
	private Cartao cartao;
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String sobrenome;
	
	@NotEmpty
	private String cpf;

	public boolean isValido() {
		return (getCartao() != null ? getCartao().isValido() : true);
	}
	/**
	 * @return the cartao
	 */
	public Cartao getCartao() {
		return cartao;
	}

	/**
	 * @param cartao
	 *            the cartao to set
	 */
	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
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

	/**
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * @param sobrenome
	 *            the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf
	 *            the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
