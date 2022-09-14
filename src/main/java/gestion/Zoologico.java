package gestion;

import java.util.Arrays;

public class Zoologico {
	private String nombre;
	private String ublicacion;
	private Zona[] zonas;

	public Zoologico(String nombre, String ubicacion, Zona[] zonas) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.ublicacion = ubicacion;
		this.zonas = zonas;
	}

	public Zoologico() {
		super();
	}

	public void agregarZonas(Zona zona) {
		// TODO Auto-generated method stub
		this.zonas = Arrays.copyOf(this.zonas, this.zonas.length);
		this.zonas[this.zonas.length - 1] = zona;
	}

	public int cantidadTotalAnimales() {
		// TODO Auto-generated method stub
		int x = 0;
		for (Zona zona : zonas) {
			x += zona.cantidadAnimales();
		}
		return x;
	}
}
