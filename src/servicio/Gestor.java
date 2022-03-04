package servicio;

import dato.Dato;
import model.Juego;

public class Gestor {
	
	public Juego altaJuego (Juego juego) {
		
		new Dato().altaJuego(juego);
		return juego;
		

	}

}
