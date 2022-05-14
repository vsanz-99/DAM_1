package ejercicio09;
import java.util.Scanner;

/**
 * <p>Cifrado Cesar en java.</p>
 * @since 21/11/2021
 * @version 1.0
 * @author Victor Sanz*/
public class Ejercicio_04_09 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		try (Scanner sc1 = new Scanner(System.in)) {
			String fraseintro = "";
			String frasecod = "";
			String abc = "abcdefghijklmnñopqrstuvwxyz ";
			int desplazamiento = 3;
			int longitud = abc.length();

			// Introducir un texto:
			do {

				System.out.println("Introduce una frase por teclado: \n");
				fraseintro = sc1.nextLine();

			} while ( fraseintro.isEmpty());

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
