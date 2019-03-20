/**
 * 
 */
package br.com.caelum.ingresso.mail;

import br.com.caelum.ingresso.model.Token;

/**
 * @author lab8402
 *
 */
public class EmailNovoUsuario implements Email {
	private final Token token;

	public EmailNovoUsuario(Token token) {
		this.token = token;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.caelum.ingresso.model.mail.Email#getTo()
	 */
	@Override
	public String getTo() {
		return token.getEmail();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.caelum.ingresso.model.mail.Email#getBody()
	 */
	@Override
	public String getBody() {
		StringBuilder body = new StringBuilder("<html>");
		body.append("<body>");
		body.append("<h2>Bem Vindo</h2>");
		body.append(String.format("Acesso o <a href=%s>link</a> para para criar seu login no sistema de ingressos.", makeURL()	));
		body.append("</body>");
		body.append("</html>");
		return	body.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.caelum.ingresso.model.mail.Email#getSubject()
	 */
	@Override
	public String getSubject() {
		return "Cadastro Sistema de Ingressos";
	}

	private String makeURL() {
		return String.format("http://localhost:8080/usuario/validate?uuid=%s", token.getUuid());
	}
}
