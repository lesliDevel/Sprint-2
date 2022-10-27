package com.example.demo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto {
	@Id
	private long id_producto;
	private long cod_producto;
	private String nombre_producto;
	private long valor_producto;

	public long getId_producto() {
		return id_producto;
	}

	public void setId_producto(long id_producto) {
		this.id_producto = id_producto;
	}

	public long getCod_producto() {
		return cod_producto;
	}

	public void setCod_producto(long cod_producto) {
		this.cod_producto = cod_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public long getValor_producto() {
		return valor_producto;
	}

	public void setValor_producto(long valor_producto) {
		this.valor_producto = valor_producto;
	}

}
