package ejercicio08;
import java.util.Scanner;

/**
 * <p>Cifrado Cesar en java con desplazamiento introducido por teclado.</p>
 * @since 21/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_04_08 {

	/**
	 * @param args
	 * @return 
	 */

	public static void main(String[] args) {
		try (Scanner sc1 = new Scanner(System.in)) {
			String fraseintro = "";
			String frasecod = "";
			String abc = "abcdefghijklmnñopqrstuvwxyz ";
			// int desplazamiento = 3;
			int desplazamiento = 0;
			int longitud = abc.length();

			// Introducir un texto:
			do {

				System.out.println("Introduce una frase por teclado: \n");
				fraseintro = sc1.nextLine();

			} while (fraseintro.isEmpty());

			// Introducir desplazamiento:
			do {
				System.out.println("Introduce un numero entre 1 y 10 para el desplazamiento: \n");

				desplazamiento = sc1.nextInt();

			} while (( desplazamiento < 1 ) || ( desplazamiento > 10 ));

			for ( int i = 0; i < fraseintro.length(); i++) {
				for ( int j = 0; j < abc.length(); j++ ) {
					if ( fraseintro.charAt(i) == abc.charAt(j) ) {
						frasecod += abc.charAt((j+desplazamiento)%longitud);
					}
				}
			}
			System.out.println("Cadena codificada: \t" + frasecod);
			sc1.close();
		}
	}

}
