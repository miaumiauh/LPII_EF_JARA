package com.cibertec.LPII_EF_JARA_CANDY.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class HistorialMedico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	private Paciente paciente;
	
	@OneToMany(mappedBy = "historial_medico")
	private List<Receta> recetas;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private Date fecha;
	
	@OneToMany(mappedBy = "historial_medico")
	private List<Diagnostico> diagnosticos;
	
	@ManyToMany
	private List<Radiografia> radiografias;
	
	@ManyToMany
	private List<Alergia> alergias;
	
	@OneToMany(mappedBy = "historial_medico")
	private List<Atencion> atencion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Receta> getRecetas() {
		return recetas;
	}

	public void setRecetas(List<Receta> recetas) {
		this.recetas = recetas;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<Diagnostico> getDiagnosticos() {
		return diagnosticos;
	}

	public void setDiagnosticos(List<Diagnostico> diagnosticos) {
		this.diagnosticos = diagnosticos;
	}

	public List<Radiografia> getRadiografias() {
		return radiografias;
	}

	public void setRadiografias(List<Radiografia> radiografias) {
		this.radiografias = radiografias;
	}

	public List<Alergia> getAlergias() {
		return alergias;
	}

	public void setAlergias(List<Alergia> alergias) {
		this.alergias = alergias;
	}

	public List<Atencion> getAtencion() {
		return atencion;
	}

	public void setAtencion(List<Atencion> atencion) {
		this.atencion = atencion;
	}
	
	
		
}
