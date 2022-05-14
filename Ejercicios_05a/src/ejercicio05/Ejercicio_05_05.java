package ejercicio05;
import java.util.*;

/**
 * <p><i>Ejercicio_05_05: </i></p>
 * <p>Escribir un metodo que con dos parametros enteros <b>p</b> y <b>q</b> nos devuelva el m.c.d. 
 * (maximo comun divisor) de ambos.</p>
 * @since 26/02/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_05_05 {

	static Scanner teclado=new Scanner(System.in);

	/**
	 * @param args the command line arguements
	 */

	public static void main(String[] args) {
		int p=0;
		int q=0;

		System.out.println("\n\tIntroduce el numero mas pequeño: ");
		p=teclado.nextInt();
		System.out.println("\n\tIntroduce el numero mas grande: ");
		q=teclado.nextInt();

		int mcd=minimocomundivisor(p,q);
		System.out.println("\n\tEl m.c.d. de " + p + " y " + q + " es " + mcd + ".");

	}

	public static int minimocomundivisor(int p, int q) {
		int temp; // Crear este 'temporal' para no perder 'q'.

		while ( q!=0 ) {
			temp=q;
			q=p%q;
			p=temp;
		}
		return p;
	}

}
