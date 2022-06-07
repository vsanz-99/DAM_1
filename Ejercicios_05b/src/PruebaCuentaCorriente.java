import java.util.Scanner;

/**
 * <p><i>Archivo: PruebaCuentaCorriente.java</i></p>
 * <p><b>Ejercicio 04</b>.</p>
 * @since 06/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class PruebaCuentaCorriente {

	public static void main(String[] args) {
		String titular="";
		Scanner teclado=new Scanner(System.in);
		do {
			System.out.println("Introduce el nombre del titular de la cuenta: ");
			titular=teclado.next();
			teclado.nextLine();
		} while (titular.isEmpty());
		System.out.println("\tFin del programa.");
		teclado.close();
	}

}
