package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dato.Dato;
import model.Genero;
import model.Juego;
import model.Plataforma;

class TestIsExiste {
	private Dato dato;
	private Juego juego;
	
	@BeforeEach
	void beforeEach() {
		// Creo juego
		dato = new Dato();
	}
	
	@Test
	void isExisteJuegoCreadoManualFalse() {
		juego = new Juego("Wii Sports", Plataforma.WII, 2006, Genero.SPORTS, "Nintendo");
		assertTrue(dato.isExiste(juego), "Devuelve false porque existe el juego en la lista.");
	}
	
	@Test
	void isExisteJuegoCreadoManualTrue() {
		juego = new Juego("Impentum", Plataforma.DS, 2005, Genero.ACTION, "Miltronic");
		assertFalse(dato.isExiste(juego), "Devuelve true porque no existe el juego en la lista.");
	}

}
