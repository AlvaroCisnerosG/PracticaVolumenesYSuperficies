package app;

import clases.Cubo;

public class Principal {

	public static void main(String[] args) {
		
		int lado =(int)(Math.random()*11);
		int lado2 =(int)(Math.random()*11);
		
		Cubo c1 = new Cubo (lado); 
		Cubo c2 = new Cubo (lado2);
		
		int superficie = c1.Superficie();
		int volumen = c1.Volumen();
		
		int superficie2 = c2.Superficie();
		int volumen2 = c2.Volumen();
	}

}
