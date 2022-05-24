package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: Piramide.java</i></p>
 * <p><b>Ejercicio 14</b>. Escribe un programa que pinte una piramide rellena con un caracter introducido por teclado 
 * que podra ser una letra, un numero o un simbolo como *, +, -, $, &, etc. El programa debe 
 * permitir al usuario mediante un menu elegir si el vertice de la piramide esta apuntando hacia 
 * arriba, hacia abajo, hacia la izquierda o hacia la derecha y la altura de la misma.
</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Piramide {

	public static void main(String[] args) {

		int altura=0;

		Scanner teclado=new Scanner(System.in);

		System.out.println("\tPIRAMIDE DE CARACTERES.");
		System.out.println("\t-----------------------");
		System.out.println();

		System.out.println("\tIntroduce la altura de la piramide: ");
		altura=teclado.nextInt();




	}

}
