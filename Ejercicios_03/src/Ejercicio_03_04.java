package ejercicio04;
import java.util.Scanner;

/**
 * <p>Leer un número N y mostrar por pantalla si es
 * o no primo.</p>
 * @since 08/11/2021
 * @version 1.0
 * @param args
 * @author Víctor Sanz*/

public class Ejercicio_03_04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		boolean primo = true;
		double num = 0;

		System.out.println("Introduce un número: ");
		num = (double)teclado.nextInt();

		/*
		 * int numero = 0;
		 * boolean primo = true;
		 * int divisor = numero - 1; 
		 * 
		 * while ( primo == true && divisor < numero ) {
		 * 		if ( numero % divisor == 0 )
		 * 			primo = false;
		 * 		divisor += 1;
		 * 		// primo = numero % divisor-- != 0;
		 * }*/

		for ( int i = 2; i < num / 2; i++ ) {
			if ( num % i == 0 ) {
				primo = false;
				break;
			}
		}

		if (primo)
			System.out.println("\n El número es primo.");
		else
			System.out.println("\n El número introducido no es primo.");

		teclado.close();
	}

}

