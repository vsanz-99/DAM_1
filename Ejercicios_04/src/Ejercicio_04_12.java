package ejercicio12;
import java.util.Scanner;

/**
 * <p>Introducir una palabra de no mas de 20 caracteres y
 * efectuar todas las rotaciones posibles de dicha palabra
 * introducida.</p>
 * @since 15/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_04_12 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			String palabraintro = "";
			String palabraactu = palabraintro;
			int longitud = palabraintro.length();
			int cont = 1;
			int m = 0;

			System.out.println("Introduce una palabra: ");
			palabraintro = teclado.nextLine();

			if ( longitud <= 20 ) {
				System.out.println("\n Palabra introducida: " + palabraintro); 

				for ( int i = 0; i < longitud - 1; i++ ) {

					palabraintro = palabraintro.charAt(longitud - 1) + palabraintro.substring(m, longitud - 1);
					System.out.print("\n Esta es la rotacion numero: " + cont++);
					System.out.println(" --> " + palabraintro);
				}

				System.out.print("\n Esta es la rotacion numero: " + cont++);
				System.out.println(" --> " + palabraactu);

			} else {

				System.out.println("\n Ha introducido mas de 20 caracteres.");
				System.out.println("\n Fin del programa.");
			}

			teclado.close();
		}
	}
}