package test;

import model.Juego;
import model.Genero;
import model.Plataforma;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dato.Dato;
import junit.framework.TestCase;
import model.Juego;

public class testJuego extends TestCase {
	
		private enum Genero1 {Sports};
		private enum Plataforma2 {Wii}

		private static final String Sports = null;

		

		public void testAltaJuego() {
			Dato d = new Dato();
			d.recogerDatos();
			Juego j = d.crearJuego();
			d.altaJuego();
			
			for (Juego juego : d.getListaJuegos()) {
				if (d.getListaJuegos().contains(juego)) {
					
				}else{
					assertTrue(d.getListaJuegos().add(juego));
				};
				
			}
				
		}
		
		public void testArrayVacio() {
			Dato d = new Dato();
			d.recogerDatos();
			List<Juego> listaJuego = d.getListaJuegos();
			System.out.println(listaJuego.isEmpty());
			assertFalse(listaJuego.isEmpty());

		}
		
		public void testComprobacionDatos() throws IOException {
			
			Dato d = new Dato();
			d.recogerDatos();
			String file = "vgsales.csv";  
				BufferedReader reader = new BufferedReader(new FileReader (file));
				 
				 reader.readLine();
				 String line= reader.readLine();
				 String[] row =  line.split(",");
				 
				 
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
				
				lista.get(0).getGenero();
				assertNotNull(Genero.valueOf("Sports"));
				lista.get(0).getPlataforma();
				assertNotNull(Plataforma.valueOf("Wii"));
				
			    
			    System.out.println("Este es el resultado esperado "+ esperado1 + " y este el actual " + fecha);
			    System.out.println("Este es el resultado esperado "+ esperado2 + " y este el actual " + nombre);
			    System.out.println("Este es el resultado esperado "+ esperado3 + " y este el actual " + publisher);
			   
				
				}
		
	
	

}
