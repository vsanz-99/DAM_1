package ejercicio07;
import java.util.Scanner;

/**
 * <p>Leer una frase por teclado y mostrar el numero de mayusculas, 
 * minusculas y caracteres numericos por pantalla.</p>
 * @since 18/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_04_07 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadenaintro = "";
		int contnums = 0;
		int lowercase = 0;
		int uppercase = 0;

		System.out.println("Introduce una frase por teclado: ");
		cadenaintro = teclado.nextLine();
		String cadenanueva = cadenaintro.replace(" ", "");

		for ( int i = 0; i < cadenanueva.length(); i++) {

			// Numeros:
			if ( Character.isDigit(cadenanueva.charAt(i)) ) {
				contnums++;
			}

			// Mayusculas:
			if (( cadenanueva.charAt(i) >= 'A' ) && ( cadenanueva.charAt(i) <= 'Z' )) {
				uppercase++;

				//Minusculas
			} else if (( cadenanueva.charAt(i) >= 'a' ) && ( cadenanueva.charAt(i) <= 'z' )) {
				lowercase++;
			}
		}

		System.out.println("\n Numero de caracteres numericos: " + contnums);
		System.out.println("\n Numero de mayusculas: " + uppercase);
		System.out.println("\n Numero de minusculas: " + lowercase);

		teclado.close();

	}

}
