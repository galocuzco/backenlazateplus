package com.enlazateplus.backend.ports.in.citas;

import com.enlazateplus.backend.dominio.administracion.Paciente;
import com.enlazateplus.backend.dominio.horario.Horario;

public class CitaReservaCommand 
{
	private Horario horario;
	private Paciente paciente;
	
	public CitaReservaCommand() {
		super();
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
}
