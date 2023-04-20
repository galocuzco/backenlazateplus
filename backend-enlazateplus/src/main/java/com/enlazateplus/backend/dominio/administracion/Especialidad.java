package com.enlazateplus.backend.dominio.administracion;

import java.util.Objects;
import com.enlazateplus.backend.dominio.base.Dominio;
import com.enlazateplus.backend.dominio.base.EstadosEnum;

public class Especialidad extends Dominio 
{
	private String nombreCorto;
	private String nombreLargo;
	
	public Especialidad() {
		super();
	}

	public Especialidad(Long id, String nombreCorto) {
		super(id);
		this.nombreCorto = nombreCorto;
	}
	
	public Especialidad(Long id, String nombreCorto, String nombreLargo, EstadosEnum estado) {
		super(id, estado);
		this.nombreCorto = nombreCorto;
		this.nombreLargo = nombreLargo;
	}

	public String getNombreCorto() {
		return nombreCorto;
	}
	
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}
	
	public String getNombreLargo() {
		return nombreLargo;
	}
	
	public void setNombreLargo(String nombreLargo) {
		this.nombreLargo = nombreLargo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nombreCorto, nombreLargo);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Especialidad other = (Especialidad) obj;
		return Objects.equals(nombreCorto, other.nombreCorto) && Objects.equals(nombreLargo, other.nombreLargo);
	}
	
}
