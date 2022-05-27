package ejercicio11;
import java.util.Scanner;

/**
 * <p>Leer una frase por teclado (maximo 60 caracteres) y 
 * mostrar cuantas letras distintas tiene. Filtrar previamente
 * la frase a mayusculas. Indicar ficheros de entrada y salida 
 * del compilador.</p>
 * @since 18/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_04_11 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char [] Arraycadena;
		char caracter = 0;
		String cadenaintro = "";

		System.out.println("Introduce una frase por teclado: \n");
		cadenaintro = teclado.nextLine();
		String cadenamod = cadenaintro.replace(" ", "");

		int longitud = cadenamod.length();

		if ( longitud <= 60 ) {
			
			cadenamod = cadenamod.toUpperCase();
			
			System.out.println("Entrada: \t" + cadenamod + "\n");
			Arraycadena = cadenamod.toCharArray();
			
			char [] Arraycaracteres = new char[longitud];
			int [] ArraycuantasVeces = new int[longitud];

			for ( int i = 0; i < Arraycadena.length; i++ ) {
				caracter = Arraycadena[i];   
				Arraycaracteres[i] = caracter;
				for ( int j = i; j < Arraycadena.length; j++ ) {                  
					if( Arraycadena[j] == caracter ) {
						ArraycuantasVeces[i]++;
						Arraycadena[j] = ' ';
					}
				}    
				if( Arraycaracteres[i] != ' ' )
					System.out.println("Salida: " + Arraycaracteres [i] + "\t" + ArraycuantasVeces[i] + " vez/veces. \n");
			}
		} else {
			System.out.println("\n Ha introducido mas de 60 caracteres.");
			System.out.println("\n Fin del programa.");
		}

		teclado.close();

	}

}
