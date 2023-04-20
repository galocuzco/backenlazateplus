package com.enlazateplus.backend.dominio.administracion;

import java.util.Objects;

public class Sede 
{
	private String nombreCorto;
	private String nombreLargo;
	
	public Sede(String nombreCorto, String nombreLargo) {
		super();
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
	public String toString() {
		return "Sede [nombreCorto=" + nombreCorto + ", nombreLargo=" + nombreLargo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreCorto, nombreLargo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sede other = (Sede) obj;
		return Objects.equals(nombreCorto, other.nombreCorto) && Objects.equals(nombreLargo, other.nombreLargo);
	}
	
}
