package com.cibertec.LPII_EF_JARA_CANDY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.LPII_EF_JARA_CANDY.model.Medico;
@Repository
public interface IMedicoRepository extends JpaRepository<Medico, Integer> {

}
