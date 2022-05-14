package ejercicio08;
import java.util.*;

/**
 * <p>Leer un numero N (filtrando que debe ser mayor que 0) y calcular
 * su factorial.</p>
 * @since 08/11/2021
 * @version 1.0
 * @param args
 * @author Victor Sanz*/

public class Ejercicio_03_08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double factorial = 1;
		double num;

		System.out.println("Introduce un numero: ");
		num = (double)teclado.nextInt();

		while ( num > 0 ) {
			factorial = factorial * num; num--;
		}
		System.out.println("\n El factorial del numero introducido es: " + factorial);

		teclado.close();
	}

}