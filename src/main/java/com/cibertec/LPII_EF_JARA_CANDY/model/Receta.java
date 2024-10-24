package com.cibertec.LPII_EF_JARA_CANDY.model;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class Receta {
	
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 @Temporal(TemporalType.TIMESTAMP)
 private Date fecha;
 private String descripcion_receta;
 @ManyToOne
 private HistorialMedico historial_medico;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getFecha() {
	return fecha;
}
public void setFecha(Date fecha) {
	this.fecha = fecha;
}
public String getDescripcion_receta() {
	return descripcion_receta;
}
public void setDescripcion_receta(String descripcion_receta) {
	this.descripcion_receta = descripcion_receta;
}
public HistorialMedico getHistorial_medico() {
	return historial_medico;
}
public void setHistorial_medico(HistorialMedico historial_medico) {
	this.historial_medico = historial_medico;
}
 
 
}
