import java.util.Scanner;

/**
 * <p>Leer una frase de hasta 80 caracteres y construir
 * dos cadenas donde una contenga los caracteres en posicion par
 * y la otra los caracteres en posicion impar.</p>
 * @since 16/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_04_05 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String miCadena="";
		do {
			System.out.println("Introduce una cadena de caracteres: ");
			miCadena=teclado.nextLine();
		} while (miCadena.isEmpty());
		teclado.close();
		int longitud=miCadena.length();
		if (longitud<=80) {
			System.out.print("\nLetras en posicion impar: ");
			for (int impar=0; impar<longitud; impar+=2) {
				if (miCadena.charAt(impar)!=' ')
					System.out.print(miCadena.charAt(impar));
			}
			System.out.print("\nLetras en posicion par: ");
			for (int par=1; par<longitud; par+=2) {
				if (miCadena.charAt(par)!=' ')
					System.out.print(miCadena.charAt(par));
			}
		} else {
			System.out.println("\n\tHa introducido mas de 80 caracteres.");
			System.out.println("\n\tFin del programa.");
		}
	}

}