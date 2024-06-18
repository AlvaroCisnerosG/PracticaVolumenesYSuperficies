package clases;

public class Cilindro {

	int radio;
	int altura;
	/**
	 * 
	 * Constructor de un cilindro dado su radio y su altura
	 * @param radio El radio del cilindro
	 * @param altura La altura del cilindro
	 */
	public Cilindro(int radio, int altura) {
		
		if((radio<=0)||(altura<=00)){
			throw new IllegalArgumentException("Los valores de radio y altura no puede ser menor o igual a cero");
		}
		
		this.radio = radio;
		this.altura = altura;
	}
	/**
	 * 
	 * Metodo para calcular la superficie de un cilindro
	 * @return Te devuelve la superficie de un cilindro
	 */
	public int Superficie() {
		return (int) (2*3.14*(radio*radio)+2*3.14*radio*altura);
	}
	/**
	 * 
	 * Metodo que te calcula el volumen de un cilindro
	 * @return Te devuelve el volumen de un cilindro
	 */
	public int Volumen() {
		return (int) ((3.14*(radio*radio))*altura);
	}
}
