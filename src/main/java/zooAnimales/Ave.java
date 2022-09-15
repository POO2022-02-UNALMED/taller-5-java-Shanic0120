package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal {
	private static List<Ave> listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;

	public Ave(String nombre, int edad, String habitad, String genero, String colorPlumas) {
		super(nombre, edad, habitad, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}

	public Ave() {
		// TODO Auto-generated constructor stub
		this(null, 0, null, null, null);
	}

	public static int cantidadAves() {
		return listado.size();
	}

	public String movimiento() {
		return "volar";
	}

	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones++;

		Ave a = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		return a;
	}

	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		Ave a = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		return a;
	}

	public static List<Ave> getListado() {
		return listado;
	}

	public static void setListado(List<Ave> listado) {
		Ave.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}
