package com.enlazateplus.backend.dominio.citas;

import java.time.LocalDate;

import com.enlazateplus.backend.dominio.administracion.Paciente;
import com.enlazateplus.backend.dominio.base.Dominio;
import com.enlazateplus.backend.dominio.constantes.MensajesConstantes;
import com.enlazateplus.backend.dominio.horario.Horario;
import com.enlazateplus.backend.dominio.horario.SituacionEnum;

public class Cita extends Dominio 
{
	private Horario horario;
	private Paciente paciente;
	private SituacionEnum situacion;
	
	public Cita reservar() throws CitaExcepcion{
		//implementar reglas de negocio
		try {
			validarFechaReserva();
		}catch(Exception e) {
			throw new CitaExcepcion(e);
		}
		return null;
	}
	
	public Cita reprogramar() throws CitaExcepcion{
		
		return null;
	}
	
	public Cita cancelar() throws CitaExcepcion{
		
		return null;
	}

	private void validarFechaReserva() throws CitaExcepcion {
		if(horario.getFecha().isBefore(LocalDate.now())) {
			throw new CitaExcepcion(MensajesConstantes.FECHA_RESERVA_INVALIDA);
		}
	}
	
}
