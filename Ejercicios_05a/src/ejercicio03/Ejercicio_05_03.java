package ejercicio03;
import java.util.*;

/**
 * <p><i>Ejercicio_05_03: </i></p>
 * <p>Se define el factorial de un numero <b>N</b> como <b>N*(N-1)*(N-2)*.......*3*2*1</b>. 
 * Hacer un programa que lea un numero <b>N</b> filtrando a que sea mayor que cero y calcule su 
 * factorial.</p>
 * <p><b>La funcion a construir aqui se llamara factorial. El metodo main solo debe leer 
 * un valor y devolver su factorial (version iterativa).</b></p>
 * @since 26/02/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_05_03 { // Llega hasta el factorial de 33.

	static Scanner teclado=new Scanner(System.in);

	/**
	 * @param args the command line arguements
	 */

	public static void main(String[] args) {
		int num=0;
		System.out.println("\n\tIntroduce el numero para mostrar el factorial: ");
		num=teclado.nextInt();

		long factorial;

		factorial=factorial(num); // Invocacion al metodo.
		System.out.println("\n\tEl factorial del numero " + num + " es: " + factorial + ".");
	}

	static long factorial(int num) {
		int factorial=1;

		if ( num<=0 ) { // Si es inferior a 0 no se ejecuta.
			System.out.println("\n\tPara calcular el factorial el numero introducido no puede ser inferior a 0.");
		} else {
			for ( int x=num; x>0; x-- ) {
				factorial=factorial*x;
			}
		}
		return factorial;
	}
}
