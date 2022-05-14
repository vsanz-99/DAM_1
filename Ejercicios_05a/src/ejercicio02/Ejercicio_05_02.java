package ejercicio02;
import java.util.*;

/**
 * <p><i>Ejercicio_05_02: </i></p>
 * <p>Dados dos numeros <b>P</b> y <b>Q</b> positivos leidos por teclado,  
 * decir cual de los dos tiene mas divisores, con un mensaje que diga 
 * "P tiene mas divisores que Q" o viceversa.</p>
 * <p><b>Este programa debe llamar a un metodo que calcule los 
 * divisores de un numero, lo aplique para P y para Q y luego compare 
 * y decida.</b></p>
 * @since 26/02/2022
 * @version 1.0 
 * @author Victor Sanz*/

public class Ejercicio_05_02 {

	static Scanner teclado=new Scanner(System.in);
	
	/**
	 * @param args the command line arguments
	 */

	public static void main(String[] args) {
		int p=0; int q=0;

		System.out.println("\n\tIntroduce el primer numero(P): ");
		p = teclado.nextInt();
		System.out.println("\n\tIntroduce el segundo numero(Q): ");
		q = teclado.nextInt();

		boolean masDiv;
		int contp=0; int contq=0;

		masDiv=PruebaNumero(p,q,contp,contq); // Invocacion al metodo.

		if (masDiv) {
			System.out.println("\n\tEl numero " + p + " tiene mas divisores que el numero " + q + ".");
		} else {
			System.out.println("\n\tEl numero " + q + " tiene mas divisores que el numero " + p + ".");
		}

	}

	static boolean PruebaNumero(int p,int q,int contp, int contq) {
		boolean masP=true;

		if ( p>=0 && q>=0 ) { // Si ambos son positivos ...
			for ( int x=2; p<x; x++ ) {
				if ( p%x == 0 ) {
					contp++;
				}
			}
			for ( int x=2; q<x; x++ ) {
				if ( q%x == 0 ) {
					contq++;
				}
			}
		} else {
			System.out.println("\n\tUno de los numeros introducidos es inferior a 0. No se puede continuar.");
		}
		if ( contp<contq ) {
			masP=false;
		}
		return masP;
	}
}
