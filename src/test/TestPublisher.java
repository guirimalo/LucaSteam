package test;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dato.Dato;
import model.Genero;
import model.Juego;
import model.Plataforma;

public class TestPublisher {

	Dato d = new Dato();

	private Juego juego1 = new Juego("Wii Sports", Plataforma.WII, 2006, Genero.SPORTS, "Nintendo");
	ArrayList<Juego> lista = d.filtrarPorPublisher("Nintendo");


	@Test
	public void isNotNull() {
		assertNotNull(lista);
		
	}


	@Test
	public void testPublisherFalse() {
		juego1 = new Juego("Super Mario Bross", Plataforma.NES, 1985, Genero.PLATFORM, "Activision");
		assertFalse(lista.contains(juego1));
	}

	@Test
	public void testPublisherisNotEmpty() {
		
		assertTrue(lista.isEmpty());
		
	}

	@Test
	public void testPublisherisEmpty() {
		ArrayList<Juego> lista2 = new ArrayList<Juego>();
		assertTrue(lista2.isEmpty());
	}
}
