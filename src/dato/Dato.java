package dato;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import model.Juego;
import model.Juego.Genero;
import model.Juego.Plataforma;
import utilidades.PedirDatos;

public class Dato {

	public static void main(String[] args) {
		recogerDatos();
		/*for (Juego juego : listaJuegos) {
			if (isExiste(juego))
				System.out.println("El juego existe");
		}
		Dato.generarInforme();
		Juego j = Dato.crearJuego();
		System.out.println(j.toString());*/

    }
    
    

	private static String file = "vgsales.csv";
	private static BufferedReader reader = null;
	private static String line = "";
	public static List<Juego> listaJuegos = new ArrayList<>();

	public static void recogerDatos() {
		try {
			reader = new BufferedReader(new FileReader(file));

			reader.readLine();
			while ((line = reader.readLine()) != null) {
				String[] row = line.split(",");

				int fecha = Integer.parseInt(row[3].replace("-", ""));
				Genero genero = Genero.valueOf(row[4].replace("-", ""));
				Plataforma plataforma = Plataforma.valueOf(row[2]);

				Juego juego = new Juego(row[1], plataforma, fecha, genero, row[5]);
				listaJuegos.add(juego);

				System.out.println(listaJuegos);
				//System.out.println(row[4]);
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Parece que ha dado error");
		}
	}

	public static boolean isExiste(Juego juego) {
		boolean existe = false;

		for (Juego item : listaJuegos) {
			if (item.equals(juego)) {
				existe = true;
				break;
			}
		}
		return existe;
	}

	public static void generarInforme() {
		System.out.println("Informe juegos: ");
		for (Juego item : listaJuegos) {
			System.out.println(item.toString());
		}
	}

	public static Juego crearJuego() {
		Juego juegoNuevo = null;
		String nombre = PedirDatos.pedirString("Introduzca nombre del juego:");
		String nombrePlataforma = PedirDatos.pedirString("Introduzca plataforma del juego:");
		Plataforma plataforma = null;
		if (nombrePlataforma.equals(Plataforma.Wii.name())) {
			plataforma = Plataforma.valueOf(nombrePlataforma);
		}
		int fecha = PedirDatos.pedirEnteros("Introduzca fecha del a�o del juego:");
		String nombreGenero = PedirDatos.pedirString("Introduzca g�nero del juego: ");
		Genero genero = null;
		if (nombreGenero.equals(Genero.Action.name())) {
			genero = Genero.valueOf(nombreGenero);
		} else if (nombreGenero.equals(Genero.Shooter.name())) {
			genero = Genero.valueOf(nombreGenero);
		} else if (nombreGenero.equals(Genero.Sports.name())) {
			genero = Genero.valueOf(nombreGenero);
		}
		String published = PedirDatos.pedirString("Introduzca published del juego: ");

		juegoNuevo = new Juego(nombre, plataforma, fecha, genero, published);
		return juegoNuevo;
	}

	public Juego altaJuego(Juego juego) {

		if (listaJuegos.contains(juego)) {
			System.out.println("Ya existe este juego");
		} else {

			listaJuegos.add(juego);

			System.out.println("Se ha creado el juego" + juego + " correctamente");
		}
		return juego;

	}
}
