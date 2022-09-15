package gestion;

import java.util.ArrayList;
import java.util.List;

import zooAnimales.Animal;

public class Zona {

	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales = new ArrayList<>();

	public Zona(String nombre, Zoologico zoo) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.zoo = zoo;
	}

	public Zona() {

	}

	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}

	public int cantidadAnimales() {
		return animales.size();
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

}
