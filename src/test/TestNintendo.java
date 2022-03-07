package test;


import static org.junit.Assert.*;

import org.junit.Test;

import dato.Dato;


public class TestNintendo {
	
	@Test
	public void isNotNull() {
		Dato d = new Dato();
		assertNotNull(d.filtradoPorNintendo());
	}


}
