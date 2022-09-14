package zooAnimales;

import java.util.Arrays;

import gestion.Zona;

public class Reptil extends Animal {
	private static Reptil[] listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;

	public Reptil(String nombre, int edad, String habitad, String genero, Zona zona, String colorEscamas,
			int largoCola) {
		super(nombre, edad, habitad, genero, zona);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}

	public Reptil() {
		// TODO Auto-generated constructor stub
	}

	public static int cantidadReptiles() {
		return serpientes + iguanas;
	}

	public String movimiento() {
		return "rectar";
	}

	public Reptil crearIguana(String nombre, int edad, String genero, Zona zona) {
		iguanas++;
		Reptil a = new Reptil(nombre, edad, "humedal", genero, zona, "verde", 3);
		listado = Arrays.copyOf(listado, listado.length);
		listado[listado.length - 1] = a;
		return a;
	}

	public Reptil crearSerpiente(String nombre, int edad, String genero, Zona zona) {
		serpientes++;
		Reptil a = new Reptil(nombre, edad, "jungla", genero, zona, "blanco", 1);
		listado = Arrays.copyOf(listado, listado.length);
		listado[listado.length - 1] = a;
		return a;
	}
}
