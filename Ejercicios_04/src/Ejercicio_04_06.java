import java.util.Scanner;

/**
 * <p>Leer una frase por teclado (maximo 80 caracteres)
 * y, a continuacion, escribir cuantas vocales, consonantes
 * y caracteres numericos posee.</p> 
 * @since 17/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_04_06 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String cadenaintro="";
		int contnums, contvocales, contconsonantes;
		contnums=contvocales=contconsonantes=0;
		do {
			System.out.println("Introduce una frase por teclado: ");
			cadenaintro=teclado.nextLine();
		} while (cadenaintro.isEmpty());
		teclado.close();
		cadenaintro=cadenaintro.toLowerCase();
		String cadenanueva=cadenaintro.replace(" ", "");
		int longitud=cadenanueva.length();
		if (longitud<=80) {
			for (int i=0; i<longitud; i++) {
				// Numeros:
				if (Character.isDigit(cadenanueva.charAt(i)))
					contnums++;
				// Vocales:
				if ((cadenanueva.charAt(i)=='a') || (cadenanueva.charAt(i)=='e') || 
						(cadenanueva.charAt(i)=='i') || (cadenanueva.charAt(i)=='o') || 
						(cadenanueva.charAt(i)=='u')) {
					contvocales++;
					// Consonantes:
				} else if ((cadenanueva.charAt(i)>='a') && (cadenanueva.charAt(i)<='z')) {
					contconsonantes++;
				}
			}
		} else {
			System.out.println("\n\tHa introducido mas de 80 caracteres.");
			System.out.println("\t\nFin del programa.");
		}
		System.out.println("\n\tNumero de caracteres numericos de la cadena: "+contnums);
		System.out.println("\n\tNumero de vocales de la cadena: "+contvocales);
		System.out.println("\n\tNumero de consonantes de la cadena: "+contconsonantes++);
	}

}
