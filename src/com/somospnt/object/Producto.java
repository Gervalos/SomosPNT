package com.somospnt.object;

public abstract class Producto implements Comparable<Producto> {
	private String nombre;
	private float precio;
	
	public Producto(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	@Override
	public int compareTo(Producto p) {
		if (this.precio < p.precio) {
			return -1;
		}
		else if (this.precio > p.precio) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
