package com.enlazateplus.backend.dominio.horario;

public enum SituacionEnum 
{
	RESERVADO(1, "Reservado"),
	REPROGRAMADO(2, "Reprogramado"),
	CANCELADA(3, "Cancelado");
	
	private Integer valor;
	private String descripcion;
	
	private SituacionEnum(Integer valor, String descripcion) {
		this.valor = valor;
		this.descripcion = descripcion;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
