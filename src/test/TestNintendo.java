package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dato.Dato;
import model.Genero;
import model.Juego;
import model.Plataforma;

public class TestNintendo {

	Dato d = new Dato();
	private Juego juego1;

	@Test
	public void isNotNull() {
		Dato d = new Dato();
		assertNotNull(d.filtradoPorNintendo());
	}

	@Test
	public void testNintendoTrue() {
		juego1 = new Juego("Wii Sports", Plataforma.WII, 2006, Genero.SPORTS, "Nintendo");
		assertTrue(d.filtradoPorNintendo().contains(juego1));

	}

	@Test
	public void testNintendoFalse() {
		juego1 = new Juego("Super Mario Bross", Plataforma.NES, 1985, Genero.PLATFORM, "Wii");
		assertFalse(d.filtradoPorNintendo().contains(juego1));

	}

	@Test
	public void testNintendoisNotEmpty() {
		List<Juego> lista = d.filtradoPorNintendo();
		assertFalse(lista.isEmpty());
	}

	@Test
	public void testNintendoiEmpty() {
		ArrayList<Juego> lista = new ArrayList<Juego>();
		assertTrue(lista.isEmpty());
	}
}
