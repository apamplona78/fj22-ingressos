/**
 * 
 */
package br.com.caelum.ingresso.model;

import java.time.YearMonth;

/**
 * @author lab8402
 *
 */
public class Cartao {
	private String numero;
	private Integer cvv;
	private YearMonth vencimento;

	public boolean isValido() {
		return vencimento.isAfter(YearMonth.now());
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the cvv
	 */
	public Integer getCvv() {
		return cvv;
	}

	/**
	 * @param cvv
	 *            the cvv to set
	 */
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	/**
	 * @return the vencimento
	 */
	public YearMonth getVencimento() {
		return vencimento;
	}

	/**
	 * @param vencimento
	 *            the vencimento to set
	 */
	public void setVencimento(YearMonth vencimento) {
		this.vencimento = vencimento;
	}
}
