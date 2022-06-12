package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: Asteriscos.java</i></p>
 * <p><b>Ejercicio 01, EXAMEN 1EVA</b>.</p>
 * @since 12/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Asteriscos {

	public static void main(String[] args) {
		int numero=0;
		Scanner teclado=new Scanner(System.in);
		do {
			System.out.println("Introduce un numero entero positivo: ");
			numero=Integer.parseInt(teclado.nextLine());
		} while (numero<=0);
		teclado.close();
		System.out.println("\nN="+numero+"\n");
		// Imprimir tantas lineas como su altura.
		for (int i=1; i<=numero; i++) {
			// Imprimir blancos para construir la parte externa.
			for (int j=1; j<=numero-i; j++) {
				System.out.print(" ");
			}
			// Imprimir asteriscos para construir la parte interna.
			for (int x=1; x<=i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
