/**
 * 
 */
package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

import br.com.caelum.ingresso.desconto.Desconto;

/**
 * @author lab8402
 *
 */
public class Ingresso {

	private Sessao sessao;
	private BigDecimal preco;

	public Ingresso() {

	}

	public Ingresso(Sessao sessao, Desconto desconto) {
		setSessao(sessao);
		setPreco((desconto != null ? desconto.aplicar(sessao.getPreco()) : sessao.getPreco()));
	}

	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
}
