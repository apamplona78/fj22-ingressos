/**
 * 
 */
package br.com.caelum.ingresso.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import org.hibernate.validator.constraints.Email;

/**
 * @author lab8402
 *
 */
@Entity
public class Token {
	@Id
	private String uuid;
	@Email
	private String email;

	public Token() {
	}

	public Token(String email) {
		this.email = email;
	}

	// criar getters e setters
	@PrePersist
	public void prePersist() {
		uuid = UUID.randomUUID().toString();
	}

	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * @param uuid
	 *            the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
