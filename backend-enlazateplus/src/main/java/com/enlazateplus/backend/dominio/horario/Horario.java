package com.enlazateplus.backend.dominio.horario;

import java.time.LocalDate;
import com.enlazateplus.backend.dominio.administracion.Especialidad;
import com.enlazateplus.backend.dominio.administracion.Medico;
import com.enlazateplus.backend.dominio.administracion.Sede;
import com.enlazateplus.backend.dominio.base.Dominio;

public class Horario extends Dominio 
{
	private Especialidad especialidad;
	private Sede sede;
	private Medico medico;
	private LocalDate fecha;
	private String horaIni;
	private String horaFin;
	private SituacionEnum situacion;
	
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	public Sede getSede() {
		return sede;
	}
	public void setSede(Sede sede) {
		this.sede = sede;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getHoraIni() {
		return horaIni;
	}
	public void setHoraIni(String horaIni) {
		this.horaIni = horaIni;
	}
	public String getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
	public SituacionEnum getSituacion() {
		return situacion;
	}
	public void setSituacion(SituacionEnum situacion) {
		this.situacion = situacion;
	}
	
}
