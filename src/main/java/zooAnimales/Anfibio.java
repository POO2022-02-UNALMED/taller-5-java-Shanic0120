package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal {
	private static List<Anfibio> listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;

	public Anfibio(String nombre, int edad, String habitad, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitad, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}

	public Anfibio() {
		this(null, 0, null, null, null, true);
	}

	public static int cantidadReptiles() {
		return listado.size() + 1;
	}

	public String movimiento() {
		return "saltar";
	}

	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas++;
		Anfibio a = new Anfibio(nombre, edad, "selva", genero, "rojo", true);

		return a;

	}

	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras++;
		Anfibio a = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);

		return a;
	}

	public static List<Anfibio> getListado() {
		return listado;
	}

	public static void setListado(List<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}
