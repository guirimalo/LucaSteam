package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import dato.Dato;
import model.Genero;
import model.Juego;
import model.Plataforma;

class TestSXX {

	Dato d = new Dato();
	private Juego juego1 = new Juego("Wii Sports", Plataforma.WII, 2006, Genero.SPORTS, "Nintendo");
	private Juego juego2 = new Juego("Carmageddon 64", Plataforma.N64, 1999, Genero.ACTION, "Virgin Interactive");

	@Test
	void testSXXNotNull() {
		assertNotNull(d.filtradoSXX());
	}

	@Test
	void testSXX2NotContains() {
		assertFalse(d.filtradoSXX().contains(juego1));

	}

	@Test
	void testSXX3Contains() {
		assertTrue(d.filtradoSXX().contains(juego2));
	}

	@Test
	void testSXXNotEmpty() {
		List<Juego> lista = d.filtradoSXX();
		assertFalse(lista.isEmpty());
	}
}
