package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal {
	private static List<Pez> listado = new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;

	public Pez(String nombre, int edad, String habitad, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitad, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}

	public Pez() {
		// TODO Auto-generated constructor stub
		this(null, 0, null, null, null, 0);
	}

	public static int cantidadPeces() {
		return listado.size();
	}

	public String movimiento() {
		return "nadar";
	}

	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		Pez a = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		return a;
	}

	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos++;
		Pez a = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		return a;
	}

	public static List<Pez> getListado() {
		return listado;
	}

	public static void setListado(List<Pez> listado) {
		Pez.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
}
