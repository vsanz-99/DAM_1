package ejercicio11;
import java.util.*;

/**
 * <p>Introducir un numero N e imprimir la lista de
 * todos los numeros primos hasta dicho numero N.</p>
 * @since 08/11/2021
 * @version 1.0
 * @param args
 * @author Victor Sanz*/

public class Ejercicio_03_11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num = 0;

		System.out.println("Introduce un numero: ");
		num = (double)teclado.nextInt();
		System.out.println("Lista de numeros primos hasta el " + num + ":");

		for ( int i = 1; i < num; i++ ) { // i --> Numeros antes de llegar al numero introducido por teclado.
			int count= 0;
			for ( int j = 1; j <= i; j++ ) { // j --> Divisores para dichos numeros.
				if ( i % j == 0 ) {
					count++;
				}
			}
			if ( count == 2 ) {
				System.out.println( "\n --> " + i);
			}
		}

		teclado.close();
	}
}