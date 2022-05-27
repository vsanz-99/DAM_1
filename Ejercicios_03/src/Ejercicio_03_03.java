package ejercicio03;
import java.util.*;

/**
 * <p>Leer un numero N por teclado, calcular y mostrar
 * los divisores propios de dicho numero por pantalla (sin incluir N).</p>
 * @since 04/11/2021
 * @version 1.0
 * @param args
 * @author Victor Sanz*/

public class Ejercicio_03_03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0;

		System.out.print("Introduce un numero ");
		System.out.println("para calcular sus divisores propios.");
		num = teclado.nextInt();

		System.out.println("\n Los divisores propios del numero introducido son: ");
		System.out.print("\t");

		for ( int i = 1; i < num; i++ ) {
			int op1 = num % i; // Modulo de la divisi�n. 
			if ( op1 == 0 )
				System.out.print(i + " ");
		}

		teclado.close();
	}

}

