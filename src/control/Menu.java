package control;

import servicio.Gestor;
import utilidades.PedirDatos;

public class Menu {

	private Gestor gestor = new Gestor();

	public void iniciar() {
		this.menu();
	}

	public void menu() {
		System.out.println("Bienvenido a LucaSteam Game Software.");
		boolean salir = false;

		// Se sale del menu y se finaliza el programa cuando se marca la opcion salir de
		// dicho menu.
		while (salir == false) {
			gestor.getDato().recogerDatos();
			System.out.println(
					"Opciones disponibles: \n 1-Dar de alta un juego. \n 2-Dar de baja un juego. \n 3-Modificar un juego. \n 4-Generar informe. \n 6-Salir ");

			try {
				// En funcion de la opcion seleccionada, se llama a un metodo en concreto.
				int seleccion = PedirDatos.pedirEnteros("Introduce el numero de la opcion requerida y pulsa enter.");

				switch (seleccion) {
				case 1:
					gestor.altaJuego();
					break;
				case 2: // gestor.bajaJuego();
					break;
				case 3: // gestor.modificarJuego();
					break;
				case 4:
					this.generarInforme();
					break;
				case 5:
					salir = true;
					break;
				default:
					System.out.println("Elige una opcion valida.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Introduce una opcion valida (Numero de la opcion).");
			}

		}
	}

	public void generarInforme() {
		System.out.println("---Informes---");
		System.out.println("Selecciona el tipo de informe que deseas generar:");
		System.out.println(
				" 1-Lista completa \n 2-Por genero \n 3-Por plataforma \n 4-Por Publisher \n 5-Juegos del siglo XX \n 6-Por annos pares \n 7-Nintendo");

		try {
			int seleccion = PedirDatos.pedirEnteros("Introduce el numero de la opcion requerida y pulsa enter.");

			switch (seleccion) {
			case 1:
				gestor.generarInforme();
				break;
			case 2:
				gestor.filtradoGenero();
				break;
			case 3:
				gestor.pedirPlataforma();;
				break;
			case 4:
				gestor.filtradoPorPublihser();
				break;
			case 5:
				gestor.filtradoSXX();
				break;
			case 6:
				gestor.filtradoAniosPares();
				break;
			case 7:
				gestor.filtradoPorNintendo();
				break;
			default:
				System.out.println("Elige una opcion valida.");
			}
		} catch (NumberFormatException e) {
			System.out.println("Introduce una opcion valida (Numero de la opcion).");
			System.out.println();

			this.generarInforme();
		}
	}
}
