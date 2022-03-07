package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dato.Dato;
import model.Genero;
import model.Juego;
import model.Plataforma;

class TestFiltradoPlataforma {
	private Dato dato;
	private Juego juego;

	@BeforeEach
	void beforeEach() {
		dato = new Dato();
	}
	
	@Test
	void filtradoPorPlataformaWiiDato1Correcto() {
		juego = dato.getListaJuegos().get(0); // Sería WII
		assertEquals(juego.getPlataforma(), Plataforma.WII);
	}
	
	@Test
	void filtradoPorPlataformaWiiDato7Incorrecto() {
		juego = dato.getListaJuegos().get(6); // Sería DS
		assertNotEquals(juego.getPlataforma(), Plataforma.WII);
	}
	
	@Test
	void filtradoPorPlataformaPS3Dato17Correcto() {
		juego = dato.getListaJuegos().get(16); // Sería PS3
		assertEquals(juego.getPlataforma(), Plataforma.PS3);
	}
	
	@Test
	void filtradoPorPlataformaPS3Dato37Incorrecto() {
		juego = dato.getListaJuegos().get(36); // Sería X360
		assertNotEquals(juego.getPlataforma(), Plataforma.PS3);
	}

}
