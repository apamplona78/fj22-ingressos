/**
 * 
 */
package br.com.caelum.ingresso.desconto;

import java.math.BigDecimal;

/**
 * @author lab8402
 *
 */
public class DescontoParaBanco implements Desconto {

	/* (non-Javadoc)
	 * @see br.com.caelum.ingresso.desconto.Desconto#aplicar(java.math.BigDecimal)
	 */
	@Override
	public BigDecimal aplicar(BigDecimal valor) {
		return (valor != null ? valor.subtract(trintaPorcento(valor)) : null);
	}

	private BigDecimal trintaPorcento(BigDecimal valor) {
		return valor.multiply(new BigDecimal("0.3"));
	}

	@Override
	public String getDescricao() {
		return "Desconto para Banco";
	}

}
