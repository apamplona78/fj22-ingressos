/**
 * 
 */
package br.com.caelum.ingresso.desconto;

import java.math.BigDecimal;

/**
 * @author lab8402
 *
 */
public interface Desconto {

	public BigDecimal aplicar(BigDecimal valor);
}
