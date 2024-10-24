package com.cibertec.LPII_EF_JARA_CANDY.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.LPII_EF_JARA_CANDY.model.Paciente;
import com.cibertec.LPII_EF_JARA_CANDY.repository.IPacienteRepository;
@Service
public class PacienteService {
	@Autowired
	private IPacienteRepository pacienteRepository;

	public List<Paciente>  list() {
		return pacienteRepository.findAll();
	}

	public Paciente add(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}

	public Paciente edit(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}

	public Paciente find(int id) {
		return pacienteRepository.findById(id).get();
	}

	public void delete(int id) {
		pacienteRepository.deleteById(id);
	}

}
