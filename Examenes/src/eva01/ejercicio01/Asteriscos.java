package eva01.ejercicio01;

/**
 * Programa que lee un numero entero e imprime un triangulo rect�ngulo con ese
 * n�mero como altura y utilizando el caracter del asterisco, '*'. El �ngulo
 * recto se dibuja en la parte inferior derecha de la pantalla.
 * 202112
 * @author DAM1
 */
import java.util.Scanner;

public class Asteriscos {

	public static void main ( String[] args ) {
		int numero = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escribe numero: ");
		numero = entrada.nextInt();
		
		if ( 0 < numero ) {
			// Imprimo tantas l�neas como su altura
			for ( int i = 1; i <= numero; i++ ) {
				// Imprimo blancos para construir la parte externa al tri�ngulo
				for ( int j = 1; j <= numero-i; j++ )
					System.out.print(" ");
				
				// Imprimo asteriscos para contruir el interior
				for ( int x = 1; x <= i; x++) 
					System.out.print("*");
				
				System.out.println();
			}
		}

	}

}
