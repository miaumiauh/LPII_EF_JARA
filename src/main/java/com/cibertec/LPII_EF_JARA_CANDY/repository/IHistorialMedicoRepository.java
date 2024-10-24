package com.cibertec.LPII_EF_JARA_CANDY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.LPII_EF_JARA_CANDY.model.HistorialMedico;
@Repository
public interface IHistorialMedicoRepository extends JpaRepository<HistorialMedico, Integer>{

}
