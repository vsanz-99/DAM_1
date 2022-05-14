package ejercicio08;
import java.util.*;

/**
 * <p><i>Ejercicio_05_08: </i></p>
 * <p>Dados <b>m</b> elementos de un conjunto que se desean agrupar 
 * de <b>n</b> en <b>n</b>, el numero de combinaciones posibles es 
 * <b>m!/(n!*(m-n)!)</b>, siendo siempre <b>m>=n</b> (hay que validarlo). 
 * Escribir un metodo para que, dados como parametros <b>m</b> y <b>n</b>, 
 * nos calcule el numero de combinaciones de <b>m</b> sobre <b>n</b>. 
 * <b><u>Usad el metodo factorial del ejercicio 3.</u></b></p>
 * @since 26/02/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_05_08 {

	static Scanner teclado=new Scanner(System.in);

	/**
	 * @param args the command line arguements
	 */

	public static void main(String[] args) {
		int n=0;
		int m=0;
		long combinaciones=0;

		System.out.println("\n\tIntroduce el numero de elementos: ");
		m=teclado.nextInt();
		System.out.println("\n\t¿En cuanto lo quiere agrupar?");
		n=teclado.nextInt();

		long factorialM=factorialM(m),factorialN=factorialN(n),
				factorialM_N=factorialM_N(m,n);
		combinaciones=factorialM/factorialN*factorialM_N;

		if ( m>n ) {
			System.out.println("\n\tLas posibles combinaciones son: " + combinaciones);
		} else {
			System.out.println("\n\tEl conjunto de elementos es menor de como lo quiere agrupar.");
		}
	}

	static long factorialM(int m) { // Factorial de m.
		int factorial=1;

		if ( m<=0 ) { // Si es inferior a 0 no se ejecuta.
			System.out.println("\n\tNo puede ser inferior a 0 para hacer el factorial.");
		} else {
			for ( int x=m; x>0; x-- ) {
				factorial=factorial*x;
			}
		}
		return factorial;
	}

	static long factorialN(int n) { // Factorial de n.
		int factorial=1;

		if ( n<=0 ) { // Si el numero es inferior a 0 no se ejecuta.

		} else {
			for ( int x=n; x>0; x-- ) {
				factorial=factorial*x;
			}
		}
		return factorial;
	}

	static long factorialM_N(int m,int n) { // Factorial de m-n.
		int factorial=1;
		int m_n=m-n;

		if ( m_n<=0 ) {
			System.out.println("\n\tNo puede ser inferior a 0 para hacer el factorial.");
		} else {
			for ( int x=m_n; x>0; x-- ) {
				factorial=factorial*x;
			}
		}
		return factorial;
	}

}
