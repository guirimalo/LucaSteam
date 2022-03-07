package servicio;

import dato.Dato;
import model.Juego;

public class Gestor implements IGestor {
	
	private Dato dato = new Dato();
	
	public Juego altaJuego() {
		Juego juego = dato.altaJuego();
		return juego;
	}
	
	public void generarInforme() {
		dato.generarInforme();
	}

}
