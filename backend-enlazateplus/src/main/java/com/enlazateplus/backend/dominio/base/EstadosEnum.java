package com.enlazateplus.backend.dominio.base;

public enum EstadosEnum 
{
	Activo(1, "Activo"),
	Eliminado(2, "Eliminado");
	
	private Integer valor;
	private String descripcion;
	
	private EstadosEnum(Integer valor, String descripcion) {
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
