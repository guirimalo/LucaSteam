package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.Test;

import dato.Dato;
import model.Genero;
import model.Juego;
import model.Plataforma;

class TestAnios {

	Dato d = new Dato ();
	private Juego juego1;
	private Juego juego2;

	@Test
	void testAniosPares() {
		assertNotNull(d.filtradoAniosPares());
	}

	@Test
	void testAniosPares2() {
		juego1 = new Juego("Wii Sports", Plataforma.WII, 2006, Genero.SPORTS, "Nintendo");
		assertTrue(d.filtradoAniosPares().contains(juego1));

	}
	@Test
	void testAniosPares3() {
		juego2 = new Juego("Super Mario Bross", Plataforma.NES, 1985, Genero.PLATFORM, "Nintendo");
		assertFalse(d.filtradoAniosPares().contains(juego2));

	}

	@Test
	void testAniosPares4() {
		List<Juego> lista = d.filtradoAniosPares();
		assertFalse(lista.isEmpty());

	}
}