package test;

import java.util.ArrayList;
import java.util.List;

import dato.Dato;
import junit.framework.TestCase;
import model.Juego;

public class test extends TestCase {
	
		public void testAltaJuego() {
			Dato.recogerDatos();
			
			for (Juego juego : Dato.listaJuegos) {
				if(Dato.listaJuegos.contains(juego)){
					assertFalse(Dato.listaJuegos.add(juego));
				}
			}
				
		}
		
		public void testArrayVacio() {
			Dato.recogerDatos();
			System.out.println(Dato.listaJuegos.isEmpty());
			assertFalse(Dato.listaJuegos.isEmpty());

		}
	

}
