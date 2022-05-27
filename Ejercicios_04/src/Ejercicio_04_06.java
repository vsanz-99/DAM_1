package ejercicio06;
import java.util.Scanner;

/**
 * <p>Leer una frase por teclado (maximo 80 caracteres)
 * y, a continuacion, escribir cuantas vocales, consonantes
 * y caracteres numericos posee.</p> 
 * @since 17/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_04_06 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			String cadenaintro = "";
			@SuppressWarnings("unused")
			int longitud = cadenaintro.length();
			int contnums = 0;
			int contvocales = 0;
			int contconsonantes = 0;

			System.out.println("Introduce una frase por teclado: ");
			cadenaintro = teclado.nextLine();
			cadenaintro = cadenaintro.toLowerCase();
			String cadenanueva = cadenaintro.replace(" ", "");

			if ( cadenaintro.length() <= 80 ) {
				for ( int i = 0; i < cadenanueva.length(); i++) {
					
					// Numeros:
					if ( Character.isDigit(cadenanueva.charAt(i)) ) {
						contnums++;
					}

					// Vocales:
					if (( cadenanueva.charAt(i) == 'a' ) || ( cadenanueva.charAt(i) == 'e' ) || ( cadenanueva.charAt(i) == 'i' ) || ( cadenanueva.charAt(i) == 'o' ) || ( cadenanueva.charAt(i) == 'u' )) {
						contvocales++;
						
						// Consonantes:
					} else if (( cadenanueva.charAt(i) >= 'a' ) && ( cadenanueva.charAt(i) <= 'z' )) {
						contconsonantes++;
					}
				}
			} else {
				System.out.println("Ha introducido mas de 80 caracteres.");
				System.out.println("Fin del programa.");
			}

			System.out.println("\n Numero de caracteres numericos de la cadena: " + contnums);
			System.out.println("\n Numero de vocales de la cadena: " + contvocales);
			System.out.println("\n Numero de consonantes de la cadena: " + contconsonantes++);

			teclado.close();

		}

	}

}
