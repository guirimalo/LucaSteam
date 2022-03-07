package servicio;

import dato.Dato;
import model.Juego;

public class Gestor implements IGestor {

	private Dato dato = new Dato();

	public Dato getDato() {
		return dato;
	}

	public void setDato(Dato dato) {
		this.dato = dato;
	}

	public void altaJuego() {
		this.dato.crearJuego();
	}

	public void generarInforme() {
		this.dato.generarInforme();
	}

	public void filtradoGenero() {
		this.dato.filtradoGenero();
	}
	
	public void filtradoPorNintendo() {
		this.dato.filtradoPorNintendo();
	}
	
	public void filtradoPorPublihser() {
		this.dato.filtrarPorPublisher(null);
	}

}
