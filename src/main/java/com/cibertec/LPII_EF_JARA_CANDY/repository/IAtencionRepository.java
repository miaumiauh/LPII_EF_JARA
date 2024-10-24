package com.cibertec.LPII_EF_JARA_CANDY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.LPII_EF_JARA_CANDY.model.Atencion;
@Repository
public interface IAtencionRepository extends JpaRepository<Atencion, Integer> {

}
