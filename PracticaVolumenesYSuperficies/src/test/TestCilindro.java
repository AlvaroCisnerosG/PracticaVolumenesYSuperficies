package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Cilindro;


class TestCilindro {

	static private Cilindro c1;
	@BeforeAll
	static void init() {
	c1 = new Cilindro(5,8);
	}
	
	@Test 
	void testSuperficie1() {
		int superficieEsperada = 408;
		int superficieObtenida = c1.Superficie();
		assertEquals(superficieEsperada, superficieObtenida);
	}
	@Test 
	void testVolumen1() {
		int volumenEsperada = 628;
		int volumenObtenida = c1.Volumen();
		assertEquals(volumenEsperada, volumenObtenida);
	}
	
}
