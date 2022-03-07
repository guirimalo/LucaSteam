package test;


import static org.junit.Assert.*;

import dato.Dato;
import model.Juego;

public class TestNintendo {

	public void isNull() {
		Dato d = new Dato();
		Juego j1 = new Juego();
		assertNull(d.filtradoPorNintendo());
	}
}
