package com.somospnt.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import com.somospnt.object.Bebida;
import com.somospnt.object.Cosmetico;
import com.somospnt.object.Fruta;
import com.somospnt.object.Producto;

/*
Ejercicio Escuelita Somos PNT

Imaginemos un supermercado de barrio.

Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse, se visualiza lo siguiente por consola y se termina la ejecuci�n:

Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20
Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18
Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19
Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
=============================
Producto m�s caro: Frutillas
Producto m�s barato: Coca-Cola


La soluci�n debe cumplir con los siguientes requisitos:

Dise�ar una soluci�n orientada a objetos.
	1.La salida es por consola y exactamente como se requiere.
	2.Usar solamente las clases provistas por Java 8..
	3.Cargar la lista de productos en un �nico m�todo. No hay ingreso por pantalla de ning�n tipo.
	4.El algoritmo usado para la impresi�n no tiene que depender de la cantidad o tipo de productos.
	5.Para mostrar el mayor / menor, utilizar la interfaz Comparable.
	6.Para imprimir por pantalla, sobrescribir el m�todo toString()
*/

public class Main {
	public static ArrayList<Producto> productos = new ArrayList<>();
	
	public static void init() {
		productos.add(new Bebida("Coca-Cola Zero", 20, 1.5F));
		productos.add(new Bebida("Coca-Cola", 18, 1.5F));
		productos.add(new Cosmetico("Shampoo Sedal", 19, 500));
		productos.add(new Fruta("Frutillas", 64, "Kilo"));
	}
	
	public static void buscarMayorMenor() {
		Collections.sort(productos);
		int size = productos.size();
		
		System.out.println("=============================");
		System.out.println("Producto m�s caro: " + productos.get(size-1).getNombre());
		System.out.println("Producto m�s barato: " + productos.get(0).getNombre());
	}
	
	public static void main(String[] args) {
		init();
		String listString = productos.stream()
				.map(Object::toString)
                .collect(Collectors.joining("\n"));
		
		System.out.println(listString);

		buscarMayorMenor();
	}
}
