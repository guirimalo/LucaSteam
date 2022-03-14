package test;

import model.Juego;
import model.Genero;
import model.Plataforma;

import java.io.IOException;
import java.util.List;
import org.junit.Test;
import dato.Dato;

import static org.junit.Assert.*;

public class TestJuego {

	Dato d = new Dato();
	Juego j1 = new Juego();
	Juego j2 = new Juego("Wii Sport", Plataforma.WII, 2006, Genero.SPORTS, "Nintendo");

	@Test
	public void testAltaJuegoTrue() {
		assertTrue(d.altaJuego(j2));
	}

	@Test
	public void testAltaJuegoFalse() {
		j1 = d.getListaJuegos().get(2);
		assertFalse(d.altaJuego(j1));

	}

	@Test
	public void testArrayVacio() {
		Dato d = new Dato();
		d.recogerDatos();
		List<Juego> listaJuego = d.getListaJuegos();
		assertFalse(listaJuego.isEmpty());

	}

	@Test
	public void testComprobacionDatos() throws IOException {

		Dato d = new Dato();
		d.recogerDatos();

		List<Juego> lista = d.getListaJuegos();
		int esperado1 = lista.get(0).getFecha();
		int fecha = 2006;

		String esperado2 = lista.get(0).getNombre();
		String nombre = "Wii Sports";

		String esperado3 = lista.get(0).getPublisher();
		String publisher = "Nintendo";

		assertEquals(esperado1, fecha);
		assertEquals(esperado2, nombre);
		assertEquals(esperado3, publisher);

		assertNotNull(lista.get(0).getGenero());
		assertNotNull(lista.get(0).getGenero());

	}

	@Test
	public void testGenerarInforme() {
		Dato d = new Dato();
		d.generarInforme();
		for (Juego item : d.getListaJuegos()) {
			assertNotNull(item.toString());

		}

	}

	@Test
	public void testJuego() {

		assertEquals("Juego [nombre=null, date=0, publisher=null, genero=null, plataforma=null]", j1.toString());
		assertEquals("Juego [nombre=Wii Sport, date=2006, publisher=Nintendo, genero=SPORTS, plataforma=WII]",
				j2.toString());

	}
}
