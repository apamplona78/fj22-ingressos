/**
 * 
 */
package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

import br.com.caelum.ingresso.desconto.Desconto;
import br.com.caelum.ingresso.desconto.DescontoParaBanco;
import br.com.caelum.ingresso.desconto.DescontoParaEstudante;
import br.com.caelum.ingresso.desconto.SemDesconto;

/**
 * @author lab8402
 *
 */
public enum TipoDeIngressso {
	
	INTEIRO(new SemDesconto()),
	ESTUDANTE(new DescontoParaEstudante()),
	BANCO(new DescontoParaBanco());
	
	private final Desconto desconto;

	TipoDeIngressso(Desconto desconto) {
		this.desconto = desconto;
	}
	
	public BigDecimal aplicarDesconto(BigDecimal valor) {
		return desconto.aplicar(valor);
	}
	
	public String getDescricao() {
		return desconto.getDescricao();
	}
}
