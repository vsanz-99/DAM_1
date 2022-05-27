package ejercicio06;
import java.util.Scanner;

/**
 * <p>Leer numeros por teclado hasta que se lea 0.
 * Calcular y escribir la suma de los numeros introducidos
 * en lugar par y de los introducidos en lugar impar.</p>
 * @since 08/11/2021
 * @version 1.0
 * @param args
 * @author Victor Sanz*/

public class Ejercicio_03_06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0; int suma_par = 0; int suma_impar = 0; int cont = 0;

		System.out.println("Introducir 0 para finalizar.");

		do {
			System.out.print("Introduce un numero: ");
			num = teclado.nextInt();

			if ( cont % 2 == 0 ) {
				suma_par += num;
				cont++;
			} else {
				suma_impar += num;
				cont ++;
			}
		} while ( num != 0 );
		
		System.out.println("\n Se han introducido: " + --cont + " numeros.");
		System.out.println("\n Suma de los numeros introducidos en lugar par: " + suma_par);
		System.out.println("\n Suma de los numeros introducidos en lugar impar: " + suma_impar);

		teclado.close();
	}

}
