package edu.eci.arsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.eci.arsw.model.Biblioteca;
import edu.eci.arsw.service.api.BibliotecaServiceAPI;

@Controller
public class bibliotecaController {
	
	private BibliotecaServiceAPI bibliotecaServiceAPI;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", bibliotecaServiceAPI.getAll());
		return "index";
	}
	
	@RequestMapping(value = "/bibliotecas/{id}", method = RequestMethod.GET)
	public String getBibliotecaById(@PathVariable("id") Long id, Model model) {
		if (id != null) {
			model.addAttribute("biblioteca", bibliotecaServiceAPI.get(id));
		}
		return "bibliotecas";
	}
	
	@RequestMapping(value = "/bibliotecas", method = RequestMethod.POST)
	public String postBiblioteca(Biblioteca biblioteca, Model model) {
		bibliotecaServiceAPI.save(biblioteca);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/bibliotecas", method = RequestMethod.PUT)
	public String putBiblioteca(Biblioteca biblioteca, Model model) {
		bibliotecaServiceAPI.save(biblioteca);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/bibliotecas/{id}", method = RequestMethod.DELETE)
	public String deleteBiblioteca(@PathVariable("id") Long id, Model model) {
		bibliotecaServiceAPI.delete(id);
		return "redirect:/";
	}
	
}
