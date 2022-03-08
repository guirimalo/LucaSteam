package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import dato.Dato;
import model.Genero;
import model.Juego;
import model.Plataforma;

class TestGenero {
	
	Dato d = new Dato();
	private Juego juego1 = new Juego("Wii Sports", Plataforma.WII, 2006, Genero.SPORTS, "Nintendo");
	ArrayList<Juego> lista = d.filtradoGenero("SPORTS");
	
	

	@Test
	void testGenero1() {
		Genero g3 = Genero.SPORTS;
		Juego j2 = new Juego("Wii Sport", Plataforma.WII, 2006, Genero.SPORTS, "Nintendo");

		assertEquals(j2.getGenero(), g3);

	}

	@Test
	void testGenero2() {

		Juego j1 = new Juego();

		assertNull(j1.getGenero());

	}

	@Test
	void testGenero3() {
		Genero genero = Genero.SPORTS;

		assertTrue(juego1.getGenero().equals(genero));
	}
	

	@Test
	public void isNotNull() {
		assertNotNull(lista);

	}

	@Test
	public void testGeneroFalse() {
		juego1 = new Juego("Super Mario Bross", Plataforma.NES, 1985, Genero.PLATFORM, "Activision");
		assertFalse(lista.contains(juego1));
	}

	@Test
	public void testGeneroisNotEmpty() {

		assertFalse(lista.isEmpty());

	}

	@Test
	public void testGeneroisEmpty() {
		ArrayList<Juego> lista2 = new ArrayList<Juego>();
		assertTrue(lista2.isEmpty());
	}
}
