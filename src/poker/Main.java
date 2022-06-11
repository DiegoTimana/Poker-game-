/* 
 * @Author Gabriel Arango
 * @Author Diego Timaná
 * @Version 1.0
 */
package poker;

/**
 * The Class Main.
 */
public class Main {

	/**
	 * Es el main del juego, ejecuta el constructor que hace toda la magia
	 */

	public static void main(String[] args) {
		Logica juego = new Logica();
		juego.jugar();
	}
}
