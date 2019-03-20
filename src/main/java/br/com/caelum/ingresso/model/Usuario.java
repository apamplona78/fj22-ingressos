/**
 * 
 */
package br.com.caelum.ingresso.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author lab8402
 *
 */
@Entity
public class Usuario implements UserDetails {
	@Id
	@GeneratedValue
	private Integer id;
	private String email;
	private String password;

	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Permissao> permissoes = new HashSet<>();

	/**
	 * @deprecated hibernate only
	 */
	public Usuario() {
	}

	public Usuario(String email, String password, Set<Permissao> permissoes) {
		this.email = email;
		this.password = password;
		this.permissoes = permissoes;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return permissoes;
	}

	
	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the permissoes
	 */
	public Set<Permissao> getPermissoes() {
		return permissoes;
	}

	/**
	 * @param permissoes
	 *            the permissoes to set
	 */
	public void setPermissoes(Set<Permissao> permissoes) {
		this.permissoes = permissoes;
	}
}
