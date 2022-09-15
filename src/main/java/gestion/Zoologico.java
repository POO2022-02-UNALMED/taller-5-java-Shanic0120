package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	private String nombre;
	private String ublicacion;
	private List<Zona> zonas = new ArrayList<>();

	public Zoologico(String nombre, String ubicacion) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.ublicacion = ubicacion;
		this.zonas = zonas;
	}

	public Zoologico() {

	}

	public void agregarZonas(Zona zona) {
		// TODO Auto-generated method stub
		zonas.add(zona);
	}

	public int cantidadTotalAnimales() {
		// TODO Auto-generated method stub
		int x = 0;
		for (Zona zona : zonas) {
			x += zona.cantidadAnimales();
		}
		return x;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUblicacion() {
		return ublicacion;
	}

	public void setUblicacion(String ublicacion) {
		this.ublicacion = ublicacion;
	}

	public List<Zona> getZona() {
		return zonas;
	}

	public void setZonas(List<Zona> zonas) {
		this.zonas = zonas;
	}

}
