package ejercicio05;
import java.util.Scanner;

/**
 * <p>Leer una frase de hasta 80 caracteres y construir
 * dos cadenas donde una contenga los caracteres en posicion par
 * y la otra los caracteres en posicion impar.</p>
 * @since 16/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_04_05 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			String miCadena = "";
			System.out.println("Introduce una cadena de caracteres: ");
			miCadena = teclado.nextLine();
			int longitud = miCadena.length();

			if ( longitud <= 80 ) {

				System.out.print("\n Letras en posicion impar: ");

				for (int impar = 0; impar < longitud; impar += 2) {
					System.out.print(miCadena.charAt(impar));
				}

				System.out.print("\n Letras en posicion par: ");

				for (int par = 1; par < longitud; par += 2) {
					System.out.print(miCadena.charAt(par));
				}

			} else {
				System.out.println("\n Ha introducido mas de 80 caracteres. ");
				System.out.println("\n Fin del programa. ");
			}

			teclado.close();
		}

	}

}