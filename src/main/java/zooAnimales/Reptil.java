package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
	private static List<Reptil> listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;

	public Reptil(String nombre, int edad, String habitad, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitad, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}

	public Reptil() {
		// TODO Auto-generated constructor stub
		this(null, 0, null, null, null, 0);
	}

	public static int cantidadReptiles() {
		return listado.size() + 1;
	}

	public String movimiento() {
		return "rectar";
	}

	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas++;
		Reptil a = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		return a;
	}

	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes++;
		Reptil a = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		return a;
	}

	public static List<Reptil> getListado() {
		return listado;
	}

	public static void setListado(List<Reptil> listado) {
		Reptil.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}
