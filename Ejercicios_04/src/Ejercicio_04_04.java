package ejercicio04;
import java.util.Scanner;

/**
 * <p>Leer una cadena de hasta 80 caracteres y pasarla, 
 * en funcion de una variable, a mayusculas y minusculas.
 * Imprimir la cadena resultante.</p>
 * @since 15/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_04_04 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			String miCadena = "";
			String opcion = "";
			System.out.println("Introduce una cadena de caracteres: ");
			miCadena = teclado.nextLine();

			if ( miCadena.length() <= 80 ) {
				System.out.println("Elegir una opcion: ");
				System.out.println("\n (1) Convertir cadena a mayusculas. Introduce 'U'/'u'");
				System.out.println("\n (2) Convertir cadena a minusculas. Introduce 'L'/'l'");
				opcion = teclado.nextLine();

				switch (opcion) {
				case "U":
				case "u":
					System.out.println("Convirtiendo cadena a mayusculas ... ");
					System.out.println("\n " + miCadena.toUpperCase());
					break;
				case "L":
				case "l":
					System.out.println("Convirtiendo cadena a minusculas ... ");
					System.out.println("\n " + miCadena.toLowerCase());
					break;
				default:
					System.out.println("\n No ha introducido una opcion valida.");
					System.out.println("\n Fin del programa.");
				}
			} else {
				System.out.println("\n Ha introducido mas de 80 caracteres.");
				System.out.println("\n Fin del programa.");
			}
			teclado.close();
		}
	}

}
