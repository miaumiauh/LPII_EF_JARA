package com.cibertec.LPII_EF_JARA_CANDY.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cibertec.LPII_EF_JARA_CANDY.model.HistorialMedico;
import com.cibertec.LPII_EF_JARA_CANDY.repository.IHistorialMedicoRepository;

@Service
public class HistorialMedicoService {
	@Autowired
	private IHistorialMedicoRepository historialMedicoRepository;

	public List<HistorialMedico>  list() {
		return historialMedicoRepository.findAll();
	}

	public HistorialMedico add(HistorialMedico historialMedico) {
		return historialMedicoRepository.save(historialMedico);
	}

	public HistorialMedico edit(HistorialMedico historialMedico) {
		return historialMedicoRepository.save(historialMedico);
	}

	public HistorialMedico find(int id) {
		return historialMedicoRepository.findById(id).get();
	}

	public void delete(int id) {
		historialMedicoRepository.deleteById(id);
	}
}
