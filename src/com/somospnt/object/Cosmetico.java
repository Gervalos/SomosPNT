package com.somospnt.object;

public class Cosmetico extends Producto {
	private int contenido;
	
	public Cosmetico(String nombre, float precio, int contenido) {
		super(nombre, precio);
		this.contenido = contenido;
	}

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " /// " + "Contenido: " + contenido + "ml" + " /// " + "Precio: $" + getPrecio(); 
	}
}
