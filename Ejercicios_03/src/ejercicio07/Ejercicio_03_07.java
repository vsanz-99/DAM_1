package ejercicio07;
import java.util.Scanner;

/**
 * <p>Leer una secuencia de numeros (para finalizar introducir 0).
 * Imprimir la media de todos ellos, el mayor y el menor.</p>
 * @since 08/11/2021
 * @version 1.0
 * @param args
 * @author Victor Sanz*/

public class Ejercicio_03_07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double num = 0;
		int introducidos= 0;
		double suma = 0, mayor = 0, menor = 0;
		double media = 0.0;

		System.out.println("NOTA MEDIA, MAYOR Y MENOR  \n");
		System.out.println("Introducir 0 para finalizar.");

		do {
			System.out.println("Introduce un número: ");
			num = teclado.nextInt();

			if ( num > mayor ) {
				mayor = num;
			} else if ( num != 0 ) { 
				menor = num;
			}

			suma += num;
			++introducidos;

		} while ( num != 0);

		--introducidos;
		media = (double)(suma /= introducidos);

		System.out.println("\n Ha introducido " + introducidos + " números");
		System.out.println("\n Media de los numeros introducidos: " + media);
		System.out.println("\n El numero mayor de la secuencia introducida es: " + mayor);
		System.out.println("\n El numero menor de la secuencia introducida es: " + menor);

		teclado.close();
	}
}

