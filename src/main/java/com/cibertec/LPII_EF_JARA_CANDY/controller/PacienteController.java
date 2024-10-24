package com.cibertec.LPII_EF_JARA_CANDY.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.LPII_EF_JARA_CANDY.model.Paciente;
import com.cibertec.LPII_EF_JARA_CANDY.service.PacienteService;
@Controller
public class PacienteController {

	@Autowired
	private PacienteService service;
	
	@GetMapping({"/lista_paciente", "/"})
	public String list(Model model) {
		model.addAttribute("lst_paciente", service.list());
		return "lista_paciente";
	}
	@GetMapping("/crear_paciente")
	public String add(Model model) {
		Paciente paciente = new Paciente();
		model.addAttribute("paciente", paciente);
		return "crear_paciente";
	}
	@PostMapping("/crear_paciente")
	public String add(@ModelAttribute Paciente paciente) {
		service.add(paciente);
		return "redirect:/lista_paciente";
	}
	@GetMapping("/editar_paciente/{id}")
	public String edit(@PathVariable int id, Model model) {
		model.addAttribute("paciente", service.find(id));
		return "editar_paciente";
	}
	@PostMapping("/editar_paciente/")
	public String edit(@ModelAttribute Paciente paciente, Model model) {
		service.edit(paciente);
		return "redirect:/lista_paciente";
	}
	@GetMapping("/eliminar_paciente/{id}")
	public String delete(@PathVariable int id) {
		service.delete(id);
		return "redirect:/lista_paciente";
	}
}
