package com.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.prueba.model.Persona;
import com.prueba.repo.IPersonaRepo;

@Controller
public class SaludoController {
	
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/")
	public String getSaludo(Persona p, Model model) throws Exception{
		//Persona p = new Persona("Fernandito",12);
		repo.save(p);
		model.addAttribute("persona",p);
		return "index";
	}
	
	@GetMapping("/form")
    public String showUserForm(Model model) throws Exception{
		Persona p=new Persona();
        model.addAttribute("persona", p);
        return "formulario";
    }
}
