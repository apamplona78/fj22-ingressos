/**
 * 
 */
package br.com.caelum.ingresso.mail;

/**
 * @author lab8402
 *
 */
public interface Email {
	String getTo();

	String getBody();

	String getSubject();
}
