package com.proyecto1.package1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				ArrayList <Hierba> hierbas= new ArrayList<Hierba>();
				
				
				Hierba h1 = new Hierba("Sesiles", 0.45 , "Manzanilla", "Blanco con centro amarillo", 8);
				h1.setUtilidad("Posee propiedades digestivas\n");
				
				Hierba h2 = new Hierba("Lanceoladas", 0.70, "Lavanda", "Morado", 6);
				h2.setUtilidad("Posee valor ornamental y propiedades medicinales\n");
				
				Hierba h3 = new Hierba("Basales grandes", 0.60 , "Arnica", "Amarillo", 5);
				h3.setUtilidad("Eficaz antiinflamatorio natural\n");
				
				Hierba h4 = new Hierba("Filiformes", 0.50, "Cilantro", "Verde", 7);
				h4.setUtilidad("Gastronomia\n");
				
				Hierba h5 = new Hierba("Ligeramente dentadas", 0.70, "Menta", "Verde", 5);
				h5.setUtilidad("Propiedades cardiovasculares e intestinales\n");
				
				
				hierbas.add(h1);
				hierbas.add(h2);
				hierbas.add(h3);
				hierbas.add(h4);
				hierbas.add(h5);
				
				
				ArrayList <Arbusto> arbustos = new ArrayList<Arbusto>();
				
				
				Arbusto a1 = new Arbusto("Ovaladas", 10, "Camelia", "Rosa, rojo o blanco", 9);
				a1.setUtilidad("Propiedades antioxidantes\n");											
				
				Arbusto a2 = new Arbusto("Poco dentadas", 3, "Hibisco", "Rojo, amarillo, blanco o mixto", 13);
				a2.setUtilidad("Efectos diureticos\n");
				
				Arbusto a3 = new Arbusto("Largas", 4, "Grevillea", "Rojo oxidado", 7);
				a3.setUtilidad("Decoracion inmobiliaria\n");
				
				Arbusto a4 = new Arbusto("Ovales y dentadas", 2, "Hortensias", "Azul pálido, lila, violeta, rosa, entre otros.", 22);
				a4.setUtilidad("Diuretico natural\n");
				
				Arbusto a5 = new Arbusto("Alternas y lanceoladas", 1.5, "Espirea", "Rosa", 4);
				a5.setUtilidad("Jardineria\n");
				
				
				arbustos.add(a1);
				arbustos.add(a2);
				arbustos.add(a3);
				arbustos.add(a4);
				arbustos.add(a5);
				
				
				ArrayList <Helecho> helechos = new ArrayList<>();
				
				
				Helecho he1 = new Helecho("Rizadas", 1, "Helecho Hembra", "Verde brillante", 12);
				he1.setUtilidad("Propiedades espectorantes\n");											
				
				Helecho he2 = new Helecho("Largas", 2, "Yerba de papagayo", "Amarillo, rojo o verde", 3);
				he2.setUtilidad("Decoracion inmobiliaria\n");
				
				Helecho he3 = new Helecho("Grandes", 6, "Helechos Arborescentes", "Verde", 7);
				he3.setUtilidad("Previenen la erosion, mantienen los suelos para el cultivo y proveen oxigeno\n");
				
				Helecho he4 = new Helecho("Romboidales", 0.75, "Helecho Falcata", "Verde oscuro", 2);
				he4.setUtilidad("Plantas de interior o jardines sombrios\n");
				
				Helecho he5 = new Helecho("Frondas", 12, "Dicksonia", "Verde", 1);
				he5.setUtilidad("Decoracion inmobiliaria\n");
				
				
				helechos.add(he1);
				helechos.add(he2);
				helechos.add(he3);
				helechos.add(he4);
				helechos.add(he5);
				
				
                ArrayList <Palmera> palmeras = new ArrayList<>();
				
				
                Palmera p1 = new Palmera("Bipinnadas", 15, "Caryota Urens", "Verde", 2);
				p1.setUtilidad("Finalidades agricolas\n");											
				
				Palmera p2 = new Palmera("Pinnadas", 20, "Cocos nucifera", "Verde",1);
				p2.setUtilidad("Decoracion de interiores amplios\n");
				
				Palmera p3 = new Palmera("Pinnadas", 2, "Chamaedorea elegans", "Verde", 3);
				p3.setUtilidad("Decoracion inmobiliaria\n");
				
				Palmera p4 = new Palmera("Pinnadas", 15, "Phoenix dactylifera", "Crema", 2);
				p4.setUtilidad("Cosecha los frutos llamados Datiles\n");
				
				Palmera p5 = new Palmera("Largas y lisas", 3, "Nannorrhops ritchiana", "Verde-plateado",4);
				p5.setUtilidad("Decoracion inmobiliaria\n");
				
			
				palmeras.add(p1);
				palmeras.add(p2);
				palmeras.add(p3);
				palmeras.add(p4);
				palmeras.add(p5);
				
				
				String aNombre = "  \n", aHoja = "", aColor = "", aUtilidad = "";
				int menu, aCantidad, b;
				double aAltura;
				
				Scanner scan = new Scanner(System.in);
				
			
				do {
					System.out.println("INVERNADERO");
					System.out.println("1. Mostrar Hierbas");
					System.out.println("2. Mostrar Arbustos");
					System.out.println("3. Mostrar Helechos");
					System.out.println("4. Mostrar Palmeras");
					System.out.println("5. Agregar una nueva planta");
					System.out.println("0. SALIR");
					menu = scan.nextInt();
					
					switch(menu) {
					
					case 1:
						System.out.println(hierbas);
						break;
						
					case 2:
						System.out.println(arbustos);
						break;
						
					case 3:
						System.out.println(helechos);
						break;
						
					case 4:
						System.out.println(palmeras);
						break;
						
					case 5:
						do {
							
						@SuppressWarnings("resource")
						Scanner scan2 = new Scanner(System.in);
						
						System.out.print("Nombre: ");
						aNombre = scan2.nextLine();
						System.out.print("Tipo de hoja: ");
						aHoja = scan2.nextLine();
						System.out.print("Altura (en metros): ");
						aAltura = scan2.nextDouble();
						System.out.print("Color de la planta: ");
						scan2.nextLine();
						aColor = scan2.nextLine();
						System.out.println("Cantidad en inventario: ");
						aCantidad = scan2.nextInt();
						scan2.nextLine();
						System.out.println("Utilidad:");
						aUtilidad = scan2.nextLine();
						System.out.println("\nEscoja el tipo de planta que desea agregar: \n1.Hierbas\n2.Arbustos\n3.Helechos\n4.Palmeras");
						b = scan2.nextInt();
						
						if (b == 1) {
							
							Hierba h = new Hierba(aHoja, aAltura, aNombre, aColor, aCantidad);
							hierbas.add(h);
							h.setUtilidad(aUtilidad);
							System.out.println("\n" + aNombre + " se agrego a la lista de las Hierbas \n");
							System.out.println(h);
							
						} else if (b == 2) {
							
							Arbusto a = new Arbusto(aHoja, aAltura, aNombre, aColor, aCantidad);
							arbustos.add(a);
							a.setUtilidad(aUtilidad);
							System.out.println("\n" + aNombre + " se agrego a la lista de los Arbustos \n");
							System.out.println(a);

						} else if (b == 3) {
							
							Helecho he = new Helecho(aHoja, aAltura, aNombre, aColor, aCantidad);
							helechos.add(he);
							he.setUtilidad(aUtilidad);
							System.out.println("\n" + aNombre + " se agrego a la lista de los Helechos \n");
							System.out.println(he);
							
						} else if (b ==4) {
							
							Palmera p = new Palmera(aHoja, aAltura, aNombre, aColor, aCantidad);
							palmeras.add(p);
							p.setUtilidad(aUtilidad);
							System.out.println("\n" + aNombre + " se agrego a la lista de las Palmeras \n");
							System.out.println(p);
							
						} else {
							
							System.out.println("SELECCION INVALIDA");
						}
						
						
						System.out.println("Desea agregar mas plantas? (1 = Si, 0 = No)");
						b = scan2.nextInt();
						
						}while (b != 0);
						break;
						
					case 0:
						System.out.println("HA SALIDO DEL PROGRAMA");
						break;
						default:
							System.out.println("ERROR");
							break;
						
					}
				}while (menu != 0);
				scan.close();

	}

}