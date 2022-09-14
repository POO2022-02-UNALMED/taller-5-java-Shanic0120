package zooAnimales;

import java.util.Arrays;

import gestion.Zona;

public class Pez extends Animal {
	private static Pez[] listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;

	public Pez(String nombre, int edad, String habitad, String genero, Zona zona, String colorEscamas,
			int cantidadAletas) {
		super(nombre, edad, habitad, genero, zona);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}

	public Pez() {
		// TODO Auto-generated constructor stub
	}

	public static int cantidadPeces() {
		return 1;
	}

	public String movimiento() {
		return "nadar";
	}

	public Pez creaSalmon(String nombre, int edad, String genero, Zona zona) {
		salmones++;
		Pez a = new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6);
		listado = Arrays.copyOf(listado, listado.length);
		listado[listado.length - 1] = a;
		return a;
	}

	public Pez crearBacalao(String nombre, int edad, String genero, Zona zona) {
		bacalaos++;
		Pez a = new Pez(nombre, edad, "oceano", genero, zona, "gris", 6);
		listado = Arrays.copyOf(listado, listado.length);
		listado[listado.length - 1] = a;
		return a;
	}
}
