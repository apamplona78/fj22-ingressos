/**
 * 
 */
package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author lab8402
 *
 */
@Entity
public class Ingresso {

	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne
	private Sessao sessao;
	
	private BigDecimal preco;
	
	@ManyToOne
	private Lugar lugar;
	
	@Enumerated(EnumType.STRING)
	private TipoDeIngresso tipoDeIngresso;
	
	public Ingresso() {

	}

	public Ingresso(Sessao sessao, TipoDeIngresso tipoDeIngresso, Lugar lugar) {
		setSessao(sessao);
		setTipoDeIngresso(tipoDeIngresso);
		setLugar(lugar);
		setPreco(getTipoDeIngresso().aplicarDesconto(getSessao().getPreco()));
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

	/**
	 * @return the lugar
	 */
	public Lugar getLugar() {
		return lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	/**
	 * @return the tipoDeIngresso
	 */
	public TipoDeIngresso getTipoDeIngresso() {
		return tipoDeIngresso;
	}

	/**
	 * @param tipoDeIngresso the tipoDeIngresso to set
	 */
	public void setTipoDeIngresso(TipoDeIngresso tipoDeIngresso) {
		this.tipoDeIngresso = tipoDeIngresso;
	}
}
