package ejercicio03;
import java.util.Scanner;

/**
 * <p>Leer una frase y una palabra y mostrar por pantalla la posicion
 * de dicha palabra en la frase. Si no se encuentra la palabra se mostrar
 * un 0 por pantalla</p>
 * @since 15/11/2021
 * @version 1.0
 * @author Victor Sanz*/
public class Ejercicio_04_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			String fraseintro = " ";
			String palabraintro = " ";

			// Texto.
			System.out.println("Introduce una frase por teclado: ");
			fraseintro = teclado.nextLine();

			// Texto que se quiere buscar.
			System.out.println("Introduce una palabra por teclado: ");
			palabraintro = teclado.nextLine();

			if (fraseintro.contains(palabraintro)) {
				System.out.println("\n Palabra encontrada.");
				System.out.println("\n Posicion: " + posicionpalabra(fraseintro, palabraintro));

			} else {
				System.out.println("\n 0");
			}

			teclado.close();

		}

	}

	private static int posicionpalabra(String fraseintro, String palabraintro) {
		String palabras[] = fraseintro.split(" ");
		for ( int i = 0; i < palabras.length; i++) {
			if ( palabras[i].equals(palabraintro) ) {
				return i+1;
			}
		}
		return 0;

	}

}