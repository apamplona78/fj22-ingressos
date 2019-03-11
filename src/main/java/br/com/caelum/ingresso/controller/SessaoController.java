/**
 * 
 */
package br.com.caelum.ingresso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.ingresso.dao.FilmeDao;
import br.com.caelum.ingresso.dao.SalaDao;

/**
 * @author lab8402
 *
 */
@Controller
public class SessaoController {
	
	@Autowired
	private SalaDao salaDao;
	
	@Autowired
	private FilmeDao filmeDao;

	
	@GetMapping("admin/sessaso")
	public ModelAndView form(@RequestParam("salaId") Integer salaId) {
		ModelAndView model = new ModelAndView("sessao/sessao");
		model.addObject("sala", salaDao.findOne(salaId));
		model.addObject("filmes", filmeDao.findAll());
		
		return model;
	}
}
