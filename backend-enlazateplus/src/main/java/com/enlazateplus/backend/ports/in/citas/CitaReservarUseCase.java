package com.enlazateplus.backend.ports.in.citas;

import com.enlazateplus.backend.dominio.administracion.Sede;

public interface CitaReservarUseCase 
{
	Sede save(Sede sede) throws CitaUseCaseException;
}
