package ejercicio05;
import java.util.Scanner;

/**
 * <p>Leer una serie de numeros por teclado, cuando el numero
 * leido sea 0 se finalizara la lectura de numeros. Calcular
 * y escribir la suma de los numeros de la serie y mostrar
 * cuantos se han introducido en total.</p>
 * @since 03/11/2021
 * @version 1.0
 * @param args
 * @author Victor Sanz*/

public class Ejercicio_03_05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num; // Numero que introducimos por teclado.
		int suma = 0; // Acumulador.
		int introducidos = 0; // Cantidad de numeros introducidos.
		do {
			
			System.out.println("Introducir un número para sumar (escribir 0 para finalizar): ");
			num = teclado.nextInt();
			suma += num;
			introducidos++;
			
		} while ( num != 0 );
		
		// --introducidos; --> Para que no cuente el 0.
		System.out.print("\n La suma de los " + --introducidos + " numeros introducidos es " + suma);

		teclado.close();
	}

}
