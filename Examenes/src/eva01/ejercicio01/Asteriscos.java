package eva01.ejercicio01;
import java.util.Scanner;

/**
 * <p><i>Archivo: Asteriscos.java</i></p>
 * <p>Programa que solicite introducir un entero positivo y obtenga por pantalla la siguiente salida, 
 * segun el valor introducido.</p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Asteriscos {

	public static void main(String[] args) {

		int numero=0;

		@SuppressWarnings("resource")
		Scanner entrada=new Scanner(System.in);

		do {
			System.out.print("\tIntroduce un numero entero para la altura: ");
			numero=entrada.nextInt();
		} while (numero<=0);

		System.out.println();

		if (0<numero) {
			// Imprimir tantas lineas como su altura.
			for (int i=1; i<=numero; i++) {
				// Imprimir espacios en blanco para construir la parte externa al triangulo.
				for (int j=1; j<=numero-i; j++)
					System.out.print(" ");
				// Imprimir asteriscos para contruir el interior de la piramide.
				for (int x=1; x<=i; x++) 
					System.out.print("*");
				System.out.println();
			}
		}

	}

}
