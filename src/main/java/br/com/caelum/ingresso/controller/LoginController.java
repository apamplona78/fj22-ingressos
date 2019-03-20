/**
 * 
 */
package br.com.caelum.ingresso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lab8402
 *
 */
@Controller
public class LoginController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}