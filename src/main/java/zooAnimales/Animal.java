package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;

	public Animal(String nombre, int edad, String habitad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitad;
		this.genero = genero;

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
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat
					+ "y  mi genero es " + genero + ", la zona en la que me ubico es " + zona + ", en el "
					+ zona.getZoo();

		} else {
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat
					+ " y mi genero es " + genero;
		}

	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitad) {
		this.habitat = habitad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
}
