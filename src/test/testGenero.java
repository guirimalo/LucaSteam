package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import dato.Dato;
import model.Genero;
import model.Juego;
import model.Plataforma;

class testGenero {
	@Test
	void testGenero1() {
		Genero g3 = Genero.SPORTS;
		Juego j2 = new Juego("Wii Sport", Plataforma.WII, 2006, Genero.SPORTS, "Nintendo");
		
			
			assertEquals(j2.getGenero(), g3);
			
			
		}
	
	void testGenero2() {

		Juego j1 = new Juego();
		
			assertNull(j1.getGenero());
		
	}
}


