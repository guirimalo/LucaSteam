package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dato.Dato;
import model.Juego;

public class TestPublisher {

	@Test
	public void isNotNull() {
		Dato d = new Dato();
		assertNotNull(d.filtrarPorPublisher("Nintendo"));
	}
	
}
