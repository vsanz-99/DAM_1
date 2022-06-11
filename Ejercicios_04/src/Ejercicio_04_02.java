import java.util.Scanner;

/**
 * <p>Leer una frase de maximo 80 caracteres y mostrar por pantalla el numero de
 * mayuscula y minusculas que contiene.</p>
 * @since 15/11/2021
 * @version 1.0;
 * @author Victor Sanz*/

public class Ejercicio_04_02 {

	public static void main(String[] args) {
		 	Scanner teclado=new Scanner(System.in);
			String miCadena="";
			System.out.println("Introduce una cadena de caracteres: ");
			miCadena=teclado.nextLine();
			teclado.close();
			if (miCadena.length()<=80) {
				System.out.println("\n\tCadena de caracteres introducida: "+miCadena);
				System.out.println("\n\tLongitud de la cadena introducida: "+miCadena.length());
				var upperCase=0;
				var lowerCase=0;
				// Metodos utilizados: isUpperCase(char ch) y isLowerCase(char ch). 
				for (int i=0; i<miCadena.length(); i++) {
					// letra=miCadena.charAt();
					// int minusculas=0, mayusculas=0;
					// BUCLE (condicion) {
					// if ((letra>="a") || (letra<="z"))
					//		minusculas++;
					// if ((letra >= "A") || (letra <= "Z"))
					//		mayusculas++;
					// }
					// Letras mayusculas.
					if (Character.isUpperCase(miCadena.charAt(i))) 
						upperCase++;
					// Letras minusculas.
					if (Character.isLowerCase(miCadena.charAt(i))) 
						lowerCase++;
				}
				System.out.println("\n\tHay "+upperCase+" letras mayusculas y "+lowerCase+" letras minusculas.");
			} else {
				System.out.println("\n\tHa introducido mas de 80 caracteres.");
				System.out.println("\n\tFin del programa.");
			}
		}

}
