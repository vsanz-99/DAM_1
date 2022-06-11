import java.util.Scanner;

/**
 * <p>Leer una cadena de hasta 80 caracteres y pasarla, 
 * en funcion de una variable, a mayusculas y minusculas.
 * Imprimir la cadena resultante.</p>
 * @since 15/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_04_04 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String miCadena, opcion;
		miCadena=opcion="";
		do {
			System.out.println("Introduce una cadena de caracteres: ");
			miCadena=teclado.nextLine();
		} while (miCadena.isEmpty());
		if (miCadena.length()<=80) {
			do {
				System.out.println("Elegir una opcion: ");
				System.out.println("\n\t(1) Convertir cadena a mayusculas. Introduce 'U'/'u'.");
				System.out.println("\n\t(2) Convertir cadena a minusculas. Introduce 'L'/'l'.");
				opcion=teclado.nextLine();
			} while (opcion.isEmpty());
			teclado.close();
			switch (opcion) {
			case "U" :
			case "u" :
				System.out.println("\tConvirtiendo cadena a mayusculas ...");
				System.out.println("\n\t"+miCadena.toUpperCase());
				break;
			case "L" :
			case "l" :
				System.out.println("\tConvirtiendo cadena a minusculas ...");
				System.out.println("\n\t"+miCadena.toLowerCase());
				break;
			default :
				System.out.println("\n\tNo ha introducido una opcion valida.");
				System.out.println("\n\tFin del programa.");
			}
		} else {
			System.out.println("\n\tHa introducido mas de 80 caracteres.");
			System.out.println("\n\tFin del programa.");
		}
	}

}
