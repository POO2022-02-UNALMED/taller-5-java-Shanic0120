package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {
	private static List<Mamifero> listado = new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;

	public Mamifero(String nombre, int edad, String habitad, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitad, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}

	public Mamifero() {
		// TODO Auto-generated constructor stub
		this(null, 0, null, null, false, 0);
	}

	public static int cantidadMamiferos() {
		return listado.size();

	}

	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		Mamifero a = new Mamifero(nombre, edad, "pradera", genero, true, 4);

		return a;
	}

	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones++;
		Mamifero a = new Mamifero(nombre, edad, "selva", genero, true, 4);
		return a;
	}

	public static List<Mamifero> getListado() {
		return listado;
	}

	public static void setListado(List<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
}
