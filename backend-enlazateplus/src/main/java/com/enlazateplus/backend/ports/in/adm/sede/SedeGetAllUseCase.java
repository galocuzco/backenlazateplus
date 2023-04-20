package com.enlazateplus.backend.ports.in.adm.sede;

import java.util.List;

import com.enlazateplus.backend.dominio.administracion.Sede;

public interface SedeGetAllUseCase 
{
	List<Sede> getAll() throws SedeUseCaseException;
}
