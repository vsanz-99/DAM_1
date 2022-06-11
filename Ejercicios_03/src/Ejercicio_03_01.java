import java.util.Scanner;

/**
 * <h1>Ejercicio_03_01</h1>
 * <p>Imprimir la suma de los numeros enteros comprendidos entre A y B ('A<=B').
 * Sin incluir A y B.</p>
 * @since 02/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_03_01 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int A, B; // Numeros de los extremos.
		int suma; // Acumulador para la suma de los numeros comprendidos entre A y B.
		int contador;
		A=B=suma=contador=0;
		// Leer los numeros A y B.
		System.out.println("Introduzca el numero menor (A): ");
		A=Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca el numero mayor (B): ");
		B=Integer.parseInt(teclado.nextLine());
		teclado.close();
		if (A<=B) {
			suma=0;
			// Sumar los numeros entre A y B, sin incluirlos. 
			for (contador=A+1; contador<B; contador++) {
				suma+=contador;
			}
			System.out.println("\n\tLa suma de los numeros enteros comprendidos entre ("+A+") y ("+B+") es: "+suma);
		} else {
			System.out.println("\n\tParametros introducidos incorrectos "
					+"(A<=B).");
			System.out.println("\n\tFin del programa.");
		}
	}

}
