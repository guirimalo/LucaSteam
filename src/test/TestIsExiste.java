package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import dato.Dato;
import lombok.experimental.StandardException;
import model.Genero;
import model.Juego;
import model.Plataforma;

class TestIsExiste {
	private Dato dato;
	private Juego juego;

	@BeforeEach
	void beforeEach() {
		dato = new Dato();
	}

	@Test
	void isExisteJuegoCreadoManualTrue() {
		juego = new Juego("Wii Sports", Plataforma.WII, 2006, Genero.SPORTS, "Nintendo");
		assertTrue(dato.isExiste(juego), "Devuelve true porque existe el juego en la lista.");
	}

	@Test
	void isExisteJuegoCreadoManualFalse() {
		juego = new Juego("Impentum", Plataforma.DS, 2005, Genero.ACTION, "Miltronic");
		assertFalse(dato.isExiste(juego), "Devuelve false porque no existe el juego en la lista.");
	}
	
	@Test
	void JuegoIsNull() {
		juego = null;
		assertThrows(NullPointerException.class, () -> Optional.of(juego));
	}
	
	@Test
	void isExisteFalseIsJuegoNull() {
		juego = null;
		assertFalse(dato.isExiste(juego), "Como juego es null no existe y devuelve false");
	}
	
	@Test
	void isExisteFalseIsJuegoConstructorPorDefecto() {
		juego = new Juego();
		assertFalse(dato.isExiste(juego), "Como juego tiene constructor por defecto no existe en la lista y devuelve false");
	}
	
	@Test
	void isExiteJuegoIgualQueJuegoList() {
		juego = new Juego("Tetris", Plataforma.GB, 1989, Genero.PUZZLE, "Nintendo");
		assertTrue(dato.getListaJuegos().contains(juego), "El juego que he creado es el mismo que el juego de la lista.");
	}

}
