package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: Piramide.java</i></p>
 * <p><b>Ejercicio 14</b>. Escribe un programa que pinte una piramide rellena con un caracter introducido por teclado 
 * que podra ser una letra, un numero o un simbolo como *, +, -, $, &, etc. El programa debe 
 * permitir al usuario mediante un menu elegir si el vertice de la piramide esta apuntando hacia 
 * arriba, hacia abajo, hacia la izquierda o hacia la derecha y la altura de la misma.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Piramide {

	public static void main(String[] args) {
		int numFilas=0;
		char r=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("PIRAMIDE DE CARACTERES.");
		System.out.println("-----------------------");
		System.out.println();
		System.out.println("Introduce un caracter de relleno: ");
		r=teclado.next().charAt(0);
		System.out.println();
		System.out.println("Introduce la altura de la piramide: ");
		numFilas=teclado.nextInt();
		System.out.println();
		System.out.println("Elije un tipo de piramide: ");
		System.out.println("\t1. Con el vertice hacia arriba.");
		System.out.println("\t2. Con el vertice hacia abajo.");
		System.out.println("\t3. Con el vertice hacia la izquierda.");
		System.out.println("\t4. Con el vertice hacia la derecha.");
		int opcion=teclado.nextInt();
		teclado.close();
		switch (opcion) {
		case 1 :
			// Vertice hacia arriba.
			System.out.println();
			for (int altura=1; altura<=numFilas; altura++) {
				// Espacios en blanco.
				for (int blancos=1; blancos<=numFilas-altura; blancos++) {
					System.out.print(" ");
				}
				// Caracteres.
				for (int caracteres=1; caracteres<=(altura*2)-1; caracteres++) {
					System.out.print(r);
				}
				System.out.println();
			}
			break;
		case 2 :
			// Vertice hacia abajo.
			System.out.println();
			for (int numBlancos=0, numCaracteres=(numFilas*2)-1; numCaracteres>0; numBlancos++, numCaracteres-=2) {
				// Espacios en blanco.
				for (int i=0; i<numBlancos; i++) {
					System.out.print(" ");
				}
				// Caracteres.
				for (int j=numCaracteres; j>0; j--) {
					System.out.print(r);
				}
				System.out.println();
			}
			break;
		case 3 :
			// Vertice a la izquierda.
			final int puntoMedio=Math.round(numFilas/2)+1;
			String relleno=" ".repeat(puntoMedio);
			System.out.println();
			for (int i=0; i<numFilas; i++) {
				if ((i + 1)<=puntoMedio) {
					relleno=relleno.substring(1, relleno.length());
					relleno+=r;
				} else {
					relleno=" ".repeat((i + 1)-puntoMedio)+relleno.substring((i+1)-puntoMedio, relleno.length());
				}
				System.out.println(relleno);
			}
			break;
		case 4 :
			// Vertice a la derecha.
			System.out.println();
			for (int i=0; i<numFilas; i++) {            
				for (int j=0; j<i+1; j++) {
					System.out.print(r+" ");
				}
				System.out.println();
			}
			for (int i=1; i<numFilas; i++) {            
				for (int j=0; j<numFilas-i; j++) {
					System.out.print(r+" ");
				}
				System.out.println();
			}
			break;
		default :
		}
	}

}
