/**
 * 
 */
package br.com.caelum.ingresso.desconto;

import java.math.BigDecimal;

/**
 * @author lab8402
 *
 */
public class SemDesconto implements Desconto {

	/* (non-Javadoc)
	 * @see br.com.caelum.ingresso.desconto.Desconto#aplicar(java.math.BigDecimal)
	 */
	@Override
	public BigDecimal aplicar(BigDecimal valor) {
		return valor;
	}

	@Override
	public String getDescricao() {
		return "Normal";
	}
}
