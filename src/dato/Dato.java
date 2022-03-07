package dato;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import model.Genero;
import model.Juego;
import model.Plataforma;
import utilidades.PedirDatos;

public class Dato {

	private List<Juego> listaJuegos;

	public Dato() {
		super();
		this.listaJuegos = new ArrayList<>();
		this.recogerDatos();
	}

	public List<Juego> getListaJuegos() {
		return listaJuegos;
	}

	public void setListaJuegos(List<Juego> listaJuegos) {
		this.listaJuegos = listaJuegos;
	}

	public void recogerDatos() {
		String file = "vgsales.csv";
		BufferedReader reader = null;
		String line = "";
		try {
			reader = new BufferedReader(new FileReader(file));

			reader.readLine();
			while ((line = reader.readLine()) != null) {
				try {
					String[] row = line.split(",");
					int fecha = Integer.parseInt(row[3].replace("-", ""));
					row[4] = row[4].toUpperCase();
					Genero genero = Genero.valueOf(row[4].replace("-", ""));

					Plataforma plataforma;
					if ("3DS".equals(row[2])) {
						plataforma = Plataforma.TRESDS;
					} else if ("2600".equals(row[2].toUpperCase())) {
						plataforma = Plataforma.DOSSEIS;
					} else {
						plataforma = Plataforma.valueOf(row[2].toUpperCase());
					}

					Juego juego = new Juego(row[1], plataforma, fecha, genero, row[5]);
					if (!isExiste(juego)) {
						listaJuegos.add(juego);
					}
					// System.out.println(row[4]);
				} catch (Exception e) {

				}

			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Parece que ha dado error" + e.getMessage());
		}
		// generarInforme();
	}

	public boolean isExiste(Juego juego) {
		boolean existe = false;

		for (Juego item : listaJuegos) {
			if (item.equals(juego)) {
				existe = true;
				break;
			}
		}
		return existe;
	}

	public void generarInforme() {
		System.out.println("Informe juegos: ");
		if (!listaJuegos.isEmpty()) {
			for (Juego item : listaJuegos) {
				System.out.println(item.toString());
			}
		} else {
			System.out.println("Est� vac�o");
		}

	}

	public void filtradoGenero() {
		String g = PedirDatos.pedirString(
				"Introduce el genero a filtrar: SPORTS, ACTION, SHOOTER, PLATFORM, RACING, ROLEPLAYING, PUZZLE, MISC, SIMULATION, FIGHTING o ADVENTURE");
		if (isGenero(g.toUpperCase())) {
			Genero genero = Genero.valueOf(g.toUpperCase());
			for (Juego juego : listaJuegos) {
				if (juego.getGenero().equals(genero))
					System.out.println(juego.toString());
			}
		} else {
			System.out.println("El genero introducido no corresponde a ninguno encontrado.");
		}
	}

	public boolean isPlataforma(String plataforma) {
		boolean resultado = false;
		Plataforma[] plataformas = Plataforma.values();
		for (Plataforma item : plataformas) {
			if (plataforma.equals(item.getNombre())) {
				resultado = true;
			}
		}
		return resultado;
	}

	public boolean isGenero(String genero) {
		boolean resultado = false;
		Genero[] generos = Genero.values();
		for (Genero item : generos) {
			if (genero.equals(item.name())) {
				resultado = true;
			}
		}
		return resultado;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void filtradoPorNintendo() {
		
			for (Juego juego : listaJuegos) {
				if (juego.getGenero().equals("Nintendo")) {
					System.out.println(juego.toString());	
					
				}
			}
	}
	
	public void filtrarPorPublisher(String publisher) {
		for (Juego juego : listaJuegos) {
			if (juego.getPublisher().equals(publisher))
				System.out.println(juego.toString());
		}
	}
	
	
	public void pedirPublisher() {
		String g = PedirDatos.pedirString("Introduce el publisher: ");
		this.filtrarPorPublisher(g.toUpperCase());
		
	}

	public void crearJuego() {
		Juego juegoNuevo = null;
		String nombre = PedirDatos.pedirString("Introduzca nombre del juego:");

		String nombrePlataforma = PedirDatos.pedirString("Introduzca plataforma del juego:");
		nombrePlataforma = nombrePlataforma.toUpperCase();
		Plataforma plataforma = null;
		if (isPlataforma(nombrePlataforma)) {
			plataforma = Plataforma.valueOf(nombrePlataforma);
		}
		int fecha = 0;
		boolean compFecha = false;
		do {
			try {
				fecha = PedirDatos.pedirEnteros("Introduzca fecha del anio del juego:");
				compFecha = true;
			} catch (Exception e) {
				System.out.println("Por favor introduce un numero.");
			}
		} while (compFecha == false);
		String nombreGenero = PedirDatos.pedirString("Introduzca genero del juego: ");
		nombreGenero = nombreGenero.toUpperCase();
		Genero genero = null;
		if (isGenero(nombreGenero)) {
			genero = Genero.valueOf(nombreGenero);
		}
		String publisher = PedirDatos.pedirString("Introduzca publisher del juego: ");

		juegoNuevo = new Juego(nombre, plataforma, fecha, genero, publisher);
		
		this.altaJuego(juegoNuevo);
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
