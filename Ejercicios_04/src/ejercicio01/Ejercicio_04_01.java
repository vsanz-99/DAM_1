package ejercicio01;
import java.util.Scanner;

/**
 * <p>Leer una frase de maximo 80 caracteres y escribirla progresivamente.</p>
 * @since 15/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_04_01 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) { 
			String miCadena = "";
			System.out.println("Introduce una cadena de caracteres: ");
			miCadena = teclado.nextLine();

			if ( miCadena.length() <= 80 ) {
				System.out.println("\n Leyendo progresivamente la cadena introducida ... ");
				int m = 0;
				for ( int i = 0; i < miCadena.length(); i++ ) {
					System.out.println(miCadena.substring( m, i + 1 ));
				}

			} else {
				System.out.println("\n Ha introducido mas de 80 caracteres. ");
				System.out.println("\n Fin del programa. ");
			}

			teclado.close();

		}

	}

}
