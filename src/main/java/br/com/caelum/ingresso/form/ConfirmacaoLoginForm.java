/**
 * 
 */
package br.com.caelum.ingresso.form;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.caelum.ingresso.dao.UsuarioDao;
import br.com.caelum.ingresso.model.Permissao;
import br.com.caelum.ingresso.model.Token;
import br.com.caelum.ingresso.model.Usuario;

/**
 * @author lab8402
 *
 */
public class ConfirmacaoLoginForm {
	private Token token;
	private String password;
	private String confirmPassword;

	public ConfirmacaoLoginForm() {
	}

	public ConfirmacaoLoginForm(Token token) {
		this.token = token;
	}

	// criar getters e setters
	public boolean isValid() {
		return password.equals(confirmPassword);
	}

	/**
	 * @return the token
	 */
	public Token getToken() {
		return token;
	}

	/**
	 * @param token
	 *            the token to set
	 */
	public void setToken(Token token) {
		this.token = token;
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
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * @param confirmPassword
	 *            the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Usuario toUsuario(UsuarioDao dao, PasswordEncoder encoder) {
		String encriptedPassword = encoder.encode(this.password);
		String email = token.getEmail();
		Usuario usuario = dao.findByEmail(email).orElse(novoUsuario(email, encriptedPassword));
		usuario.setPassword(encriptedPassword);
		return usuario;
	}

	private Usuario novoUsuario(String email, String password) {
		Set<Permissao> permissoes = new HashSet<>();
		permissoes.add(new Permissao("COMPRADOR"));
		return new Usuario(email, password, permissoes);
	}
}
