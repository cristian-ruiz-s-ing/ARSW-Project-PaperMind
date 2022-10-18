package edu.eci.arsw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.eci.arsw.model.Biblioteca;
import edu.eci.arsw.service.api.BibliotecaServiceAPI;

@Controller
public class bibliotecaController {
	
	@Autowired
	private BibliotecaServiceAPI bibliotecaServiceAPI;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", bibliotecaServiceAPI.getAll());
		return "index";
	}
	
	@GetMapping(value = "/bibliotecas/{id}")
	public String getBibliotecaById(@PathVariable("id") Long id, Model model) {
		if (id != null && id != 0) {
			model.addAttribute("biblioteca", bibliotecaServiceAPI.get(id));
		}
		return "bibliotecas";
	}
	
	@PostMapping(value = "/bibliotecas")
	public String postBiblioteca(Biblioteca biblioteca, Model model) {
		bibliotecaServiceAPI.save(biblioteca);
		return "redirect:/";
	}
	
	@GetMapping(value = "/bibliotecas/{id}")
	public String deleteBiblioteca(@PathVariable("id") Long id, Model model) {
		bibliotecaServiceAPI.delete(id);
		return "redirect:/";
	}
	
}
