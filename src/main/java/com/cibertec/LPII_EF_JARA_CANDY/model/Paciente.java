package com.cibertec.LPII_EF_JARA_CANDY.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String direccion; 
	private String telefono; 
	private String email;
	
	@OneToOne
	private HistorialMedico historial_medico;
	
	@OneToMany(mappedBy = "paciente")
	private List<Atencion> atencion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public HistorialMedico getHistorial_medico() {
		return historial_medico;
	}

	public void setHistorial_medico(HistorialMedico historial_medico) {
		this.historial_medico = historial_medico;
	}

	public List<Atencion> getAtencion() {
		return atencion;
	}

	public void setAtencion(List<Atencion> atencion) {
		this.atencion = atencion;
	}

	
	
}
