package control;

import utilidades.PedirDatos;

public class Menu {
	
	public void iniciar() {
		this.menu();
	}
	
	public void menu() {
		System.out.println("Bienvenido a LucaSteam Game Software.");
		boolean salir = false;
		
		while(salir==false) {
			System.out.println("Opciones disponibles: 1-Dar de alta un juego. 2-Dar de baja un juego. 3-Modificar un juego. 4-Generar informes. 5-Salir");
			
			try {
				int seleccion = PedirDatos.pedirEnteros("Introduce el numero de la opcion requerida y pulsa enter.");
				
				switch(seleccion) {
				case 1: 
				}
			}catch(NumberFormatException e) {
				System.out.println("Introduce una opcion valida.");
			}
			
		}
	}
	
	public void altaJuego() {
		
	}
	
	public void bajaJuego() {
		
	}
	
	public void modificarJuego() {
		
	}
	
	public void generarInforme() {
		
	}
	
	
}
