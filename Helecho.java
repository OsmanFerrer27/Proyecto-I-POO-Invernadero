package com.proyecto1.package1;

public class Helecho extends PlantaGeneral {
	
	public Helecho() {
		super();
	}
	
	public Helecho(String hoja, double altura, String nombre, String color, int cantidad) {
		super(hoja, altura, nombre, color, cantidad);
	}
	
	@Override
	public void mostrar() {
		System.out.println("\n" + "Nombre de la Planta: " + getNombre() +  "\n" + "Tipo de hoja: " + getHoja() + "\n"  +  "Color de la planta: " + getColor() +  "\n" + "Altura de la planta (en metros): " + getAltura() + "\n" + "Cantidad en inventario: " + getCantidad() + "\n");

}
	
	public String toString() {
		return "Utilidad: " + super.getUtilidad() + super.toString() + "\n" + "\n";
	}
	
}