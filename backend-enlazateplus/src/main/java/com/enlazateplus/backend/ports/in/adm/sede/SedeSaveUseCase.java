package com.enlazateplus.backend.ports.in.adm.sede;

import com.enlazateplus.backend.dominio.administracion.Paciente;
import com.enlazateplus.backend.dominio.citas.Cita;
import com.enlazateplus.backend.dominio.horario.Horario;

public interface SedeSaveUseCase 
{
	Cita reservar(Horario horario, Paciente paciente) throws SedeUseCaseException;
}
