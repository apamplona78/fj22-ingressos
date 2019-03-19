/**
 * 
 */
package br.com.caelum.ingresso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.ingresso.dao.IngressoDao;

/**
 * @author lab8402
 *
 */
@Controller
public class VendaController {

	@Autowired
	private IngressoDao ingressoDao;
	
	@GetMapping ("/admin/vendas")
	public ModelAndView vendas() {
		ModelAndView view = new ModelAndView("venda/lista");
		view.addObject("ingressos", ingressoDao.findAll());
		return view;
	}
}
