package ejercicio01;
import java.util.*;

/**
 * <p><i>Ejercicio_05_01:</i></p>
 * <p>Leer un numero <b>N</b> y mostrar un mensaje por pantalla de 
 * si es o no primo (NOTA: Numero primo es aquel que es divisible solo 
 * por si mismo y por la unidad).</p>
 * <p><b>Desarrollar este programa creando un metodo llamado <u>primo</u> 
 * que devuelva true si el numero es primo y false si no lo es.</b></p>
 * @since 26/02/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_05_01 {
	
	static Scanner teclado = new Scanner(System.in);
	static boolean primo(int num) {
		boolean primo=true;
		for ( int x=2; x<num; x++ ) {
			if ( num%x==0 ) {
				primo=false;
			}
		}
		return primo;
	}
	
	/**
	 * @param args the command line arguments
	 */
	
	public static void main(String[] args) {
		int num=0;
		System.out.println("\n\tIntroduce un numero, para verificar si es primo o no: ");
		num = teclado.nextInt();
		boolean siPrimo=primo(num);
		System.out.println("\n\tEl resultado es: " + siPrimo);
	}
}
