/**
 * 
 */
package br.com.caelum.ingresso.desconto;

import java.math.BigDecimal;

/**
 * @author lab8402
 *
 */
public class DescontoParaEstudante implements Desconto {

	/* (non-Javadoc)
	 * @see br.com.caelum.ingresso.desconto.Desconto#aplicar(java.math.BigDecimal)
	 */
	@Override
	public BigDecimal aplicar(BigDecimal valor) {
		return (valor != null ? valor.divide(new BigDecimal("2.0")) : null);
	}

	@Override
	public String getDescricao() {
		return "Desconto para Estudante";
	}
}
