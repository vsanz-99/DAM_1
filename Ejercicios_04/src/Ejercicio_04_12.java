import java.util.Scanner;

/**
 * <p>Introducir una palabra de no mas de 20 caracteres y
 * efectuar todas las rotaciones posibles de dicha palabra
 * introducida.</p>
 * @since 15/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_04_12 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String palabraintro="";
		int cont=1; int m=0;
		do {
			System.out.println("Introduce una palabra: ");
			palabraintro=teclado.nextLine();
		} while (palabraintro.isEmpty());
		teclado.close();
		int longitud=palabraintro.length();
		String palabraactu=palabraintro;
		if (longitud<=20) {
			System.out.println("\nPalabra introducida: "+palabraintro); 
			for (int i=0; i<longitud-1; i++) {
				palabraintro=palabraintro.charAt(longitud-1)+palabraintro.substring(m, longitud-1);
				System.out.print("\nEsta es la rotacion numero: "+cont++);
				System.out.println("\n--> "+palabraintro);
			}
			System.out.print("\nEsta es la rotacion numero: "+cont++);
			System.out.println("\n--> "+palabraactu);
		} else {
			System.out.println("\n\tHa introducido mas de 20 caracteres.");
			System.out.println("\n\tFin del programa.");
		}
	}

}