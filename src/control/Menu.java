package control;

import utilidades.PedirDatos;

public class Menu {
	
	public void iniciar() {
		this.menu();
	}
	
	public void menu() {
		System.out.println("Bienvenido a LucaSteam Game Software.");
		System.out.println("Opciones disponibles: 1-Dar de alta un juego. 2-Dar de baja un juego. 3-Modificar un juego. 4-Generar informes");
		int seleccion = PedirDatos.pedirEnteros("Introduce el numero de la opcion requerida y pulsa enter.");
	
		
	}
	
}
