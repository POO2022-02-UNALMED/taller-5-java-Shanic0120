package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitad;
	private String genero;
	private Zona zona;

	public Animal(String nombre, int edad, String habitad, String genero, Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitad = habitad;
		this.genero = genero;
		this.zona = zona;

		totalAnimales++;
	}

	public Animal() {
		totalAnimales++;
	}

	public String movimiento() {
		return "desplazarse";
	}

	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAves() + "\nReptiles: "
				+ Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: "
				+ Anfibio.cantidadReptiles();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (zona != null) {
			return "“Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitad
					+ "mi genero es " + genero + ", la zona en la que me ubico es " + zona + ", en el " + zona.getZoo();

		} else {
			return "“Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitad
					+ "mi genero es " + genero;
		}

	}
}
