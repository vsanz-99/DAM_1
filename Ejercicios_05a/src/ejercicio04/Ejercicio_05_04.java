package ejercicio04;
import java.util.*;

/**
 * <p><i>Ejercicio_05_04: </i></p>
 * <p>Dado un numero <b>N</b> positivo introducido por teclado, 
 * imprimir la lista de todos los numeros primos hasta dicho numero incluido.</p>
 * <p><b>Hacer este programa usando el metodo primo ya construido.</b></p>
 * @since 26/02/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_05_04 {

	static Scanner teclado = new Scanner(System.in);

	/**
	 * @param args the command line arguements
	 */

	public static void main(String[] args) {
		int num;

		System.out.println("\n\tIntroduce el numero para imprimir la lista de numeros primos hasta ese numero: ");
		num=teclado.nextInt();

		if ( num>0 ) {
			System.out.println("\n\tLos numeros primos hasta el " + num + " son: ");
			calcular(num);
		} else {
			System.out.println("\n\tIntroduce un numero que sea positivo.");	
		}
	}

	static boolean primo( int num ) {
		boolean primo=true;

		for ( int x=2; x<num; x++ ) {
			if ( num%x == 0 ) {
				primo=false;
			}
		}
		return primo;
	}

	static void calcular( int num ) { // Recorre todos los numeros a partir del tercero.
		for ( int x=3; x<=num; x++ ) {
			boolean primo=primo(x); // Evalue X.
			if ( primo==true ) { // Si un numero es primo, lo muestra por pantalla.
				System.out.println(x + " ");
			}
		}
	}
}
