package com.cibertec.LPII_EF_JARA_CANDY.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.cibertec.LPII_EF_JARA_CANDY.model.Atencion;
import com.cibertec.LPII_EF_JARA_CANDY.model.Medico;
import com.cibertec.LPII_EF_JARA_CANDY.repository.IMedicoRepository;
import com.cibertec.LPII_EF_JARA_CANDY.service.AtencionService;
import com.cibertec.LPII_EF_JARA_CANDY.service.PacienteService;

@Controller
public class AtencionController {
	@Autowired
	private AtencionService service;
	@Autowired
	private PacienteService servicep;
	@GetMapping({"/lista_atencion"})
	public String list(Model model) {
		model.addAttribute("lst_atencion", service.list());
		return "lista_atencion";
	}
	@GetMapping("/crear_atencion")
	public String add(Model model) {
		Atencion atencion = new Atencion();
		Medico medico = new Medico();
		medico.setId(1);
		medico.setNombre("Milagros");
		medico.setApellido("Valenzuela");
		medicoRepository.save(medico);
		medico.setId(2);
		medico.setNombre("Daniel");
		medico.setApellido("Fernandez");
		medicoRepository.save(medico);
		model.addAttribute("atencion", atencion);
		model.addAttribute("listaPaciente", servicep.list());

		model.addAttribute("lst_medico", medicoRepository.findAll());
		return "crear_atencion";
	}
	@PostMapping("/crear_atencion")
	public String add(@ModelAttribute Atencion atencion) {
		service.add(atencion);
		return "redirect:/lista_atencion";
	}
	
	@Autowired
	private IMedicoRepository medicoRepository;
}
