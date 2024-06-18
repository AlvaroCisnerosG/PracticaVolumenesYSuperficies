package clases;

public class Cubo {

	
	int lado;

	/**
	 * 
	 * Contrusctor de un cubo que lanza excepxion si el valor enterno es igual o menor a cero
	 * @param lado El lado del cubo
	 */
	public Cubo(int lado) {
		
		if (lado<=0) {
			throw new IllegalArgumentException("No puede ser menor o igual a cero");
		}
		this.lado = lado;
	}
	
	/**
	 * 
	 * Calcula la superficie de un cubo
	 * @return Te devuelve la superficie de un cubo 
	 */
	public int Superficie() {
		return (lado*lado)*6;
	}
	
	/**
	 * 
	 * Te calcula el volumen de un cubo
	 * @return Te devuelve el volumen de un cubo
	 */
	public int Volumen() {
		return lado*lado*lado;
	}
	
}
