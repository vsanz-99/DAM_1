package ejercicio01;
import java.util.*;

/**
 * <h1>Ejercicio_03_01</h1>
 * <p>Imprimir la suma de los numeros enteros comprendidos entre A y B ('A<=B').
 * Sin incluir A y B.</p>
 * @since 02/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_03_01 {

	/**
	 * @param a numero 'A' introducido por teclado
	 * @param b numero 'B' introducido por teclado
	 * @param suma acumulador para la suma de los numeros comprendidos entre 'A' y 'B'
	 * @param contador para llevar la cuenta de las iteraciones del bucle for
	 */

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {

			int a, b; // Numeros de los extremos.
			int suma; // Acumulador para la suma de los numeros comprendidos entre A y B.
			int contador = 0;

			// Leer los numeros A y B.

			System.out.println("Introduzca el numero menor (A): ");
			a = teclado.nextInt();

			System.out.println("Introduzca el numero mayor (B): ");
			b = teclado.nextInt();

			if ( a <= b ) {
				suma = 0;

				// Sumar los numeros entre A y B, sin incluirlos. 

				for ( contador = a + 1; contador < b; contador++ ) {
					suma += contador;
				}

				System.out.println("\n\t La suma de los numeros enteros comprendidos entre (A) y (B) es: " + suma);

			} else {
				System.out.println("\n\t Parametros introducidos incorrectos.");
				System.out.println("\n\t Fin del programa.");
			}

			teclado.close();

		}
	}

}
