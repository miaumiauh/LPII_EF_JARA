package com.cibertec.LPII_EF_JARA_CANDY.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.LPII_EF_JARA_CANDY.model.Atencion;
import com.cibertec.LPII_EF_JARA_CANDY.repository.IAtencionRepository;

@Service
public class AtencionService {
@Autowired
private IAtencionRepository atencionRepository;

public List<Atencion>  list() {
	return atencionRepository.findAll();
}

public Atencion add(Atencion atencion) {
	return atencionRepository.save(atencion);
}

public Atencion edit(Atencion atencion) {
	return atencionRepository.save(atencion);
}

public Atencion find(int id) {
	return atencionRepository.findById(id).get();
}

public void delete(int id) {
	atencionRepository.deleteById(id);
}

}
