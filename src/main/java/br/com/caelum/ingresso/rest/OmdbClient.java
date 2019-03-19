/**
 * 
 */
package br.com.caelum.ingresso.rest;

import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import br.com.caelum.ingresso.model.DetalhesDoFilme;
import br.com.caelum.ingresso.model.Filme;

/**
 * @author lab8402
 *
 */
@Component
public class OmdbClient {

	public <T> Optional<T> request(Filme filme, Class<T> classe) {
		RestTemplate client = new RestTemplate();
		String titulo = filme.getNome().replaceAll(" ", "+");
		String url = String.format("https://omdb-fj22.herokuapp.com/movie?title=%s", titulo);

		try {
			return Optional.of(client.getForObject(url, classe));
		} catch (RestClientException e) {
			return Optional.empty();
		}
	}
}