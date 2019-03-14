/**
 * 
 */
package br.com.caelum.ingresso.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lab8402
 *
 */
public class ImagemCapa {

	@JsonProperty("Poster")
	private String url;

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
