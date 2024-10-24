package com.cibertec.LPII_EF_JARA_CANDY.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.LPII_EF_JARA_CANDY.model.HistorialMedico;
import com.cibertec.LPII_EF_JARA_CANDY.model.Medico;
import com.cibertec.LPII_EF_JARA_CANDY.model.Paciente;
import com.cibertec.LPII_EF_JARA_CANDY.service.HistorialMedicoService;
import com.cibertec.LPII_EF_JARA_CANDY.service.PacienteService;

@Controller
public class HistorialMedicoController {
	@Autowired
	private HistorialMedicoService service;
	@Autowired
	private PacienteService servicep;

	@GetMapping({ "/lista_historialMedico" })
	public String list(Model model) {
		model.addAttribute("lst_historialMedico", service.list());
		return "lista_historialMedico";
	}

	@GetMapping("/crear_historialMedico")
	public String add(Model model) {
		HistorialMedico historialMedico = new HistorialMedico();
		model.addAttribute("historialMedico", historialMedico);
		model.addAttribute("listaPaciente", servicep.list());
		return "crear_historialMedico";
	}

	@PostMapping("/crear_historialMedico")
	public String add(@ModelAttribute HistorialMedico historialMedico) {
		service.add(historialMedico);
		return "redirect:/lista_historialMedico";
	}

	@GetMapping("/editar_historialMedico/{id}")
	public String edit(@PathVariable int id, Model model) {
		model.addAttribute("historialMedico", service.find(id));
		model.addAttribute("listaPaciente", servicep.list());
		return "editar_historialMedico";
	}

	@PostMapping("/editar_historialMedico")
	public String edit(@ModelAttribute HistorialMedico historialMedico, Model model) {
		System.out.println(historialMedico.getId());
		service.edit(historialMedico);
		return "redirect:/lista_historialMedico";
	}

	@GetMapping("/eliminar_historialMedico/{id}")
	public String delete(@PathVariable int id) {
		service.delete(id);
		return "redirect:/lista_historialMedico";
	}

}
