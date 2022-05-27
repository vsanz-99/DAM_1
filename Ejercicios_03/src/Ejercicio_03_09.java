package ejercicio09;
import java.util.*;

/**
 * <p>Leer un numero y mostrar por pantalla si es perfecto o no.</p>
 * @since 09/11/2021
 * @version 1.0
 * @param args
 * @author Victor Sanz*/

public class Ejercicio_03_09 {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int suma = 0, num;
			
			System.out.print("Introduce un numero");
			System.out.println(" para saber si es perfecto: ");
			
			num = teclado.nextInt();
			
			for ( int i = 1; i < num; i++ ) { // La variable i son los divisores. Se divide desde 1 hasta n-1.
				if ( num % i == 0 ) {
					suma += i; // Si es divisor se suma.
				}
			}

			if ( suma == num ) { // Si el numero es igual a la suma de sus divisores es perfecto.
				System.out.println("\n El número introducido SI es perfecto");
			} else {
				System.out.println("\n El número introducido NO es perfecto");
			}

			teclado.close();
		}

	}

}
