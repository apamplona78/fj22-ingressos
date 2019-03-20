/**
 * 
 */
package br.com.caelum.ingresso.seguranca;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @author lab8402
 *
 */
@Configuration
public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {

	public SecurityInitializer() {
		super(SecurityConfiguration.class);
	}
}
