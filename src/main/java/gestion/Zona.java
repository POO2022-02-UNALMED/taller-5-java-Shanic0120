package gestion;

import java.util.Arrays;

import zooAnimales.Animal;

public class Zona {

	private String nombre;
	private Zoologico zoo;
	private Animal[] animales;

	public Zona(String nombre, Zoologico zoo, Animal[] animales) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}

	public Zona() {

	}

	public void agregarAnimales(Animal animal) {
		this.animales = Arrays.copyOf(this.animales, this.animales.length);
		this.animales[this.animales.length - 1] = animal;
	}

	public int cantidadAnimales() {
		return animales.length;
	}

	public Zoologico getZoo() {
		return zoo;
	}
}
