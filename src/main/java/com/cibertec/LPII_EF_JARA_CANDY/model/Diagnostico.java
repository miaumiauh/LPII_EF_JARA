package com.cibertec.LPII_EF_JARA_CANDY.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Diagnostico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private Date fecha_diagnostico;
private String descripcion_diagnostico;
@ManyToOne
private HistorialMedico historial_medico;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getFecha_diagnostico() {
	return fecha_diagnostico;
}
public void setFecha_diagnostico(Date fecha_diagnostico) {
	this.fecha_diagnostico = fecha_diagnostico;
}
public String getDescripcion_diagnostico() {
	return descripcion_diagnostico;
}
public void setDescripcion_diagnostico(String descripcion_diagnostico) {
	this.descripcion_diagnostico = descripcion_diagnostico;
}
public HistorialMedico getHistorial_medico() {
	return historial_medico;
}
public void setHistorial_medico(HistorialMedico historial_medico) {
	this.historial_medico = historial_medico;
}  


}
