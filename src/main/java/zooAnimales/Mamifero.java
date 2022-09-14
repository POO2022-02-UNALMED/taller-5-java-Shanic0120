package zooAnimales;

import java.util.Arrays;

import gestion.Zona;

public class Mamifero extends Animal {
	private static Mamifero[] listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;

	public Mamifero(String nombre, int edad, String habitad, String genero, Zona zona, boolean pelaje, int patas) {
		super(nombre, edad, habitad, genero, zona);
		this.pelaje = pelaje;
		this.patas = patas;
	}

	public Mamifero() {
		// TODO Auto-generated constructor stub
	}

	public static int cantidadMamiferos() {
		return caballos + leones;

	}

	public Mamifero crearCaballo(String nombre, int edad, String genero, Zona zona) {
		caballos++;
		Mamifero a = new Mamifero(nombre, edad, "pradera", genero, zona, true, 4);
		listado = Arrays.copyOf(listado, listado.length);
		listado[listado.length - 1] = a;
		return a;
	}

	public Mamifero crearLeones(String nombre, int edad, String genero, Zona zona) {
		leones++;
		Mamifero a = new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
		listado = Arrays.copyOf(listado, listado.length);
		listado[listado.length - 1] = a;
		return a;
	}
}
