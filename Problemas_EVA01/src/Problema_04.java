import java.util.Scanner;

/**
 * <p><i>Archivo: Problema_04</i></p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Problema_04 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String cadenaIntro, palabra;
		cadenaIntro=palabra="";
		boolean verifica=true;
		do {
			System.out.println("Introduce una frase por teclado: ");
			cadenaIntro=teclado.nextLine();
		} while (cadenaIntro.isEmpty());
		System.out.println("\n");
		do {
			System.out.println("Introduce una palabra por teclado: ");
			palabra=teclado.nextLine();
			for (int x=0; x<palabra.length(); x++) {
				char c=palabra.charAt(x);
				// Si no esta entre a y z, ni entre A y Z, ni es un espacio
				if (!((c>='a'&&c<='z') || (c>='A'&&c<='Z') || c==' ' || Character.isDigit(palabra.charAt(x)))) {
					verifica=false;
				}
			}
		} while (!verifica);
		teclado.close();
		System.out.println("\n\tFrase introducida: "+cadenaIntro);
		System.out.println("\tPalabra introducida: "+palabra);
		int times=0;
		for (int i=0; i<cadenaIntro.length(); i++) {
			if (cadenaIntro.substring(i).startsWith(palabra)) {
				times++;
			}
		}
		System.out.println("\nLa palabra '"+palabra+"' aparece "+times+" veces en la frase <'"+cadenaIntro+"'>.");
		System.out.println("Fin del programa.");
	}

}
