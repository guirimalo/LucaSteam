package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dato.Dato;
import model.Juego;
import model.Plataforma;

class TestFiltradoPlataforma {
	private Dato dato;
	private List<Juego> juegos;
	private Juego juego;

	@BeforeEach
	void beforeEach() {
		dato = new Dato();
		juegos = new ArrayList<>();
	}

	@Test
	void filtradoPorPlataformaWiiDatoCorrecto() {
		juegos = dato.filtradoPlataforma("WII");
		juego = juegos.get(0);
		assertEquals(juego.getPlataforma(), Plataforma.WII);
	}

	@Test
	void filtradoPorPlataformaWiiDatoIncorrecto() {
		juegos = dato.filtradoPlataforma("PS3");
		juego = juegos.get(6);
		assertNotEquals(juego.getPlataforma(), Plataforma.WII);
	}

	@Test
	void filtradoPorPlataformaPS3DatoCorrecto() {
		juegos = dato.filtradoPlataforma("PS3");
		juego = juegos.get(2);
		assertEquals(juego.getPlataforma(), Plataforma.PS3);
	}

	@Test
	void filtradoPorPlataformaPS3DatoIncorrecto() {
		juegos = dato.filtradoPlataforma("X360");
		juego = juegos.get(4);
		assertNotEquals(juego.getPlataforma(), Plataforma.PS3);
	}

	@Test
	void filtradoPorPlataformaX360DatoCorrecto() {
		juegos = dato.filtradoPlataforma("X360");
		juego = juegos.get(2);
		assertEquals(juego.getPlataforma(), Plataforma.X360);
	}

	@Test
	void filtradoPorPlataformaX360DatoIncorrecto() {
		juegos = dato.filtradoPlataforma("PS4");
		juego = juegos.get(4);
		assertNotEquals(juego.getPlataforma(), Plataforma.X360);
	}

	@Test
	void filtradoPorPlataformaGBADatoCorrecto() {
		juegos = dato.filtradoPlataforma("GBA");
		juego = juegos.get(2);
		assertEquals(juego.getPlataforma(), Plataforma.GBA);
	}

	@Test
	void filtradoPorPlataformaGBADatoIncorrecto() {
		juegos = dato.filtradoPlataforma("PC");
		juego = juegos.get(4);
		assertNotEquals(juego.getPlataforma(), Plataforma.GBA);
	}

	@Test
	void filtradoPorPlataformaPCDatoCorrecto() {
		juegos = dato.filtradoPlataforma("PC");
		juego = juegos.get(2);
		assertEquals(juego.getPlataforma(), Plataforma.PC);
	}

	@Test
	void filtradoPorPlataformaPCDatoIncorrecto() {
		juegos = dato.filtradoPlataforma("PSP");
		juego = juegos.get(4);
		assertNotEquals(juego.getPlataforma(), Plataforma.PC);
	}

	@Test
	void filtradoPorPlataformaDOSSEISDatoCorrecto() {
		juegos = dato.filtradoPlataforma("DOSSEIS");
		juego = juegos.get(2);
		assertEquals(juego.getPlataforma(), Plataforma.DOSSEIS);
	}

	@Test
	void filtradoPorPlataformaDOSSEISDatoIncorrecto() {
		juegos = dato.filtradoPlataforma("NES");
		juego = juegos.get(4);
		assertNotEquals(juego.getPlataforma(), Plataforma.DOSSEIS);
	}

	@Test
	void filtradoPorPlataformaNESDatoCorrecto() {
		juegos = dato.filtradoPlataforma("NES");
		juego = juegos.get(2);
		assertEquals(juego.getPlataforma(), Plataforma.NES);
	}

	@Test
	void filtradoPorPlataformaNESDatoIncorrecto() {
		juegos = dato.filtradoPlataforma("N64");
		juego = juegos.get(4);
		assertNotEquals(juego.getPlataforma(), Plataforma.NES);
	}

	@Test
	void filtradoPorPlataformaArrayListNull() {
		juegos = null;
		assertNull(juegos, "El ArrayList que devuelve es nulo");
	}

	@Test
	void filtradoPorPlataformaArrayListNotNull() {
		juegos = dato.filtradoPlataforma("PSP");
		assertNotNull(juegos, "El ArrayList que devuelve no es nulo");
	}

	@Test
	void filtradoPorPlataformaArrayListEmpty() {
		juegos = dato.filtradoPlataforma("7LDF");
		assertTrue(juegos.isEmpty(), "ArrayList de juegos est� vac�a.");
	}

	@Test
	void filtradoPorPlataformaArrayListNotEmpty() {
		juegos = dato.filtradoPlataforma("GEN");
		assertFalse(juegos.isEmpty(), "ArrayList de juegos no est� vac�a.");
	}

	@Test
	void filtradoPorPlataformaPSDatoCorrecto() {
		juegos = dato.filtradoPlataforma("PS");
		juego = juegos.get(2);
		assertEquals(juego.getPlataforma(), Plataforma.PS);
	}

	@Test
	void filtradoPorPlataformaPSDatoIncorrecto() {
		juegos = dato.filtradoPlataforma("PC");
		juego = juegos.get(4);
		assertNotEquals(juego.getPlataforma(), Plataforma.PS);
	}

}
