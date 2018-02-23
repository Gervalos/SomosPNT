package com.somospnt.object;

public class Bebida extends Producto {
	private float litros;

	public Bebida(String nombre, float precio, float litros) {
		super(nombre, precio);
		this.litros = litros;
	}

	public float getLitros() {
		return litros;
	}

	public void setLitros(float litros) {
		this.litros = litros;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " /// " + "Litros: " + litros + " /// " + "Precio: $" + getPrecio(); 
	}
}
