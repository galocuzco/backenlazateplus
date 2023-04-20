package com.enlazateplus.backend.dominio.base;

import java.util.Objects;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
public class Dominio 
{
	protected Long id;
	protected EstadosEnum estado;
	
	public Dominio() {
		super();
	}

	public Dominio(Long id) {
		super();
		this.id = id;
	}

	public Dominio(Long id, EstadosEnum estado) {
		super();
		this.id = id;
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EstadosEnum getEstado() {
		return estado;
	}

	public void setEstado(EstadosEnum estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estado, id);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dominio other = (Dominio) obj;
		return Objects.equals(estado, other.estado) && Objects.equals(id, other.id);
	}
	
}
