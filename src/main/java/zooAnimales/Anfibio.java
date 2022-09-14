package zooAnimales;

import java.util.Arrays;

import gestion.Zona;

public class Anfibio extends Animal {
	private static Anfibio[] listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;

	public Anfibio(String nombre, int edad, String habitad, String genero, Zona zona, String colorPiel,
			boolean venenoso) {
		super(nombre, edad, habitad, genero, zona);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;

		listado = Arrays.copyOf(listado, listado.length + 1);
		listado[listado.length - 1] = this;
	}

	public Anfibio() {

	}

	public static int cantidadReptiles() {
		return 1;
	}

	public String movimiento() {
		return "saltar";
	}

	public Anfibio crearRana(String nombre, int edad, String genero, Zona zona) {
		ranas++;
		Anfibio a = new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true);
		listado = Arrays.copyOf(listado, listado.length);
		listado[listado.length - 1] = a;
		return a;

	}

	public Anfibio crearSalamandra(String nombre, int edad, String genero, Zona zona) {
		salamandras++;
		Anfibio a = new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarillo", false);
		listado = Arrays.copyOf(listado, listado.length);
		listado[listado.length - 1] = a;
		return a;
	}
}
