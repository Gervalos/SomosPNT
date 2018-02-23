package com.somospnt.object;

public class Fruta extends Producto {

	private String unidadVenta;
	
	public Fruta(String nombre, float precio, String unidadVenta) {
		super(nombre, precio);
		this.unidadVenta = unidadVenta;
	}

	public String getUnidadVenta() {
		return unidadVenta;
	}

	public void setUnidadVenta(String unidadVenta) {
		this.unidadVenta = unidadVenta;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " /// " + "Precio: $" + getPrecio() + " /// " + "Unidad de Venta: " + unidadVenta;
	}
}
