package com.proyecto1.package1;

import java.util.Scanner;

public abstract class PlantaGeneral implements Utilidad {
	
	public String nombre;
	public String hoja;
	public String color;
	public double altura;
	public int cantidad;
	public String utilidad;
	
	Scanner scan = new Scanner(System.in);
	
	public PlantaGeneral() {}
	
	public PlantaGeneral (String hoja, double altura, String nombre, String color, int cantidad) {
		this.hoja = hoja;
		this.altura = altura;
		this.nombre = nombre;
		this.color = color;
		this.cantidad = cantidad;
		}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getHoja() {
		return hoja;
	}

	public void setHoja(String hoja) {
		this.hoja = hoja;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getUtilidad() {
		return utilidad;
	}

	public void setUtilidad(String utilidad) {
		this.utilidad = utilidad;
	}

	public String toString() {
		return "Nombre de la Planta: " + getNombre() +  "\n" + "Tipo de hoja: " + getHoja() + "\n"  +  "Color de la planta: " + getColor() +  "\n" + "Altura de la planta (en metros): " + getAltura() + "\n" + "Cantidad en inventario: " + getCantidad() + "\n";
	}
	
	public abstract void mostrar();

}