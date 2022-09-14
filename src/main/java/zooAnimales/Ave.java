package zooAnimales;

import java.util.Arrays;

import gestion.Zona;

public class Ave extends Animal {
	private static Ave[] listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;

	public Ave(String nombre, int edad, String habitad, String genero, Zona zona, String colorPlumas) {
		super(nombre, edad, habitad, genero, zona);
		this.colorPlumas = colorPlumas;
	}

	public Ave() {
		// TODO Auto-generated constructor stub
	}

	public static int cantidadAves() {
		return halcones + aguilas;
	}

	public String movimiento() {
		return "volar";
	}

	public Ave creaHalcon(String nombre, int edad, String genero, Zona zona) {
		halcones++;

		Ave a = new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso");
		listado = Arrays.copyOf(listado, listado.length);
		listado[listado.length - 1] = a;
		return a;
	}

	public Ave crearAguila(String nombre, int edad, String genero, Zona zona) {
		aguilas++;
		Ave a = new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo");
		listado = Arrays.copyOf(listado, listado.length);
		listado[listado.length - 1] = a;
		return a;
	}
}
