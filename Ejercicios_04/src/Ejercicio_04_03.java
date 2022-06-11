import java.util.Scanner;

/**
 * <p>Leer una frase y una palabra y mostrar por pantalla la posicion
 * de dicha palabra en la frase. Si no se encuentra la palabra se debe mostrar
 * un 0 por pantalla.</p>
 * @since 15/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_04_03 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String fraseintro, palabraintro;
		fraseintro=palabraintro="";
		// Texto.
		do {
			System.out.println("Introduce una frase por teclado: ");
			fraseintro=teclado.nextLine();
		} while (fraseintro.isEmpty());
		// Texto que se quiere buscar.
		do {
			System.out.println("Introduce una palabra por teclado: ");
			palabraintro=teclado.nextLine();
		} while (palabraintro.isEmpty());
		teclado.close();
		if (fraseintro.contains(palabraintro)) {
			System.out.println("\n\tPalabra encontrada.");
			System.out.println("\n\tPosicion: "+posicionpalabra(fraseintro, palabraintro));
		} else {
			System.out.println("\n\tPalabra NO encontrada.");
			System.out.println("\n\t0");
		}
	}

	private static int posicionpalabra(String fraseintro, String palabraintro) {
		String palabras[]=fraseintro.split(" ");
		for (int i=0; i<palabras.length; i++) {
			if (palabras[i].equals(palabraintro)) {
				return i+1;
			}
		}
		return 0;
	}

}