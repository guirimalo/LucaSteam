package dato;

import java.util.ArrayList;

import model.Juego;

public interface IDato {
	void recogerDatos();
	boolean isExiste(Juego juego);
	void generarInforme();
	void pedirGenero();
	ArrayList<Juego> filtradoGenero(String genero);
	ArrayList<Juego> filtradoSXX();
	void pedirPlataforma();
	ArrayList<Juego> filtradoPlataforma(String p);
	ArrayList<Juego> filtradoAniosPares();
	boolean isPlataforma(String plataforma);
	boolean isGenero(String genero);
	ArrayList<Juego> filtradoPorNintendo();
	ArrayList<Juego> filtrarPorPublisher(String publisher);
	void pedirPublisher();
	void crearJuego();
	boolean altaJuego(Juego juego);
	void imprimirInforme(ArrayList<Juego> lista);
}
