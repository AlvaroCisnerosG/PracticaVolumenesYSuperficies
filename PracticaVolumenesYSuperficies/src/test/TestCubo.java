package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Cubo;

class TestCubo {

	static private Cubo c1;

	
	@BeforeAll
	static void init() {
		 c1 = new Cubo (2);

	}
	@Test 
	void testSuperficie1() {
		int superficieEsperada = 24;
		int superficieObtenida = c1.Superficie();
		assertEquals(superficieEsperada, superficieObtenida);
	}
	@Test 
	void testVolumen1() {
		int volumenEsperada = 8;
		int volumenObtenida = c1.Volumen();
		assertEquals(volumenEsperada, volumenObtenida);
	}
	@Test
	void TestCuboException1() {
		Exception excepcion = assertThrows(IllegalArgumentException.class,() -> new Cubo(0));
		//Exception excepcion2 = assertThrows(IllegalArgumentException.class,() -> r1.area());
		String mensajeEsperado = "la base y la altura deben ser mas de cero";
		String mensajeObtenido = excepcion.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);	
	}
	
}
