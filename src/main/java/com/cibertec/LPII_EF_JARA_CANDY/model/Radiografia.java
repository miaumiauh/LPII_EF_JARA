package com.cibertec.LPII_EF_JARA_CANDY.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Radiografia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	@Temporal(TemporalType.TIMESTAMP)
private Date fecha_radiografia;
private String nombre_radiografia;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getFecha_radiografia() {
	return fecha_radiografia;
}
public void setFecha_radiografia(Date fecha_radiografia) {
	this.fecha_radiografia = fecha_radiografia;
}
public String getNombre_radiografia() {
	return nombre_radiografia;
}
public void setNombre_radiografia(String nombre_radiografia) {
	this.nombre_radiografia = nombre_radiografia;
}


}
