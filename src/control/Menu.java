package control;

import model.Juego;
import model.Juego.Genero;
import model.Juego.Plataforma;
import servicio.Gestor;
import utilidades.PedirDatos;

public class Menu {
	
	
	
	public void iniciar() {
		this.menu();
	}
	
	public void menu() {
		System.out.println("Bienvenido a LucaSteam Game Software.");
		boolean salir = false;
		
		//Se sale del menu y se finaliza el programa cuando se marca la opcion salir de dicho menu.
		while(salir==false) {
			System.out.println("Opciones disponibles: 1-Dar de alta un juego. 2-Dar de baja un juego. 3-Modificar un juego. 4-Generar informes. 5-Salir");
			
			try {
				//En funcion de la opcion seleccionada, se llama a un metodo en concreto.
				int seleccion = PedirDatos.pedirEnteros("Introduce el numero de la opcion requerida y pulsa enter.");
				
				switch(seleccion) {
				case 1: this.altaJuego();
				break;
				case 2: this.bajaJuego();
				break;
				case 3: this.modificarJuego();
				break;
				case 4: this.generarInforme();
				break;
				case 5: salir = true;
				default: System.out.println("Elige una opcion valida.");
				}
			}catch(NumberFormatException e) {
				System.out.println("Introduce una opcion valida (Numero de la opcion).");
			}
			
		}
	}
	
	public void altaJuego() {
		
		System.out.println("---Nueva alta de juego---");
		String nombre = PedirDatos.pedirString("Nombre:");
		Plataforma plataforma = Plataforma.valueOf(PedirDatos.pedirString("Plataforma::"));
		int fecha = PedirDatos.pedirEnteros("Anno de salida:");
		Genero genero = Genero.valueOf(PedirDatos.pedirString("Genero:"));
		String publisher = PedirDatos.pedirString("Publisher:");
		
		//Se llama al metodo altaJuego de la clase Gestor para que se encargue de gestionar las operaciones.
		new Gestor().altaJuego(new Juego(nombre, plataforma, fecha, genero, publisher));
		
	}
	
	public void bajaJuego() {
		//TODO
	}
	
	public void modificarJuego() {
		//TODO
	}
	
	public void generarInforme() {
		System.out.println("---Informes---");
		System.out.println("Selecciona el tipo de informe que deseas generar:");
		System.out.println("1-Lista comleta  2-Por genero  3-Por plataforma  4-Por Publisher 5-Por fecha  6-Juegos del siglo XX  7-Por annos pares");
		
		try {
			new Gestor().generarInforme();
			/*
			 * NOTA: 
			 * Se podria tener un metodo generarInforme en la clase gestor, al que se le pasa por parametro el tipo del informe a generar,
			 * y luego este metodo contiene un switch que llama al metodo correspondiente de la clase dato para cada tipo de informe a generar.
			 * */
		}catch(NumberFormatException e) {
			System.out.println("Introduce una opcion valida (Numero de la opcion).");
			System.out.println();
			
			this.generarInforme();
		}
	}
}
