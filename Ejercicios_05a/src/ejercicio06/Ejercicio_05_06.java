package ejercicio06;
import java.util.*;

/**
 * <p><i>Ejercicio_05_06: </i></p>
 * <p>Escribir un metodo que reciba dos parametros enteros <b>p</b> y <b>q</b> y devuelva 
 * el minimo comun multiplo de ambos.</p>
 * @since 26/02/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_05_06 {

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
		int mcm=(p/mcd)*q; // Reutilizar todo el ejercicio anterior;
		System.out.println("\n\tEl m.c.m. de " + p + " y " + q + " es " + mcm + ".");		
	}

	public static int minimocomundivisor(int p,int q) {
		int temp; // Crear este 'temporal' para no perder 'q'.
		while ( q!=0 ) {
			temp=q;
			q=p%q;
			p=temp;
		}
		return p;
	}

}
