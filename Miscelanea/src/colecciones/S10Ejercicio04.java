package colecciones;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 4. Realiza un programa equivalente al anterior pero en esta ocasion,
 *    el programa debe ordenar palabras en lugar de numeros.
 *
 * @author Victor Sanz*/

public class S10Ejercicio04 {

	public static void main(String[] args) {

		ArrayList<String> a=new ArrayList<String>();
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		System.out.println("Introduce 10 palabras: \n");
		for (int i=0; i<10; i++) {
			a.add(teclado.nextLine());
		}

		System.out.println("\nLista original:\n"+a);

		Collections.sort(a);

		System.out.println("\nLista ordenada alfabeticamente:\n"+a);

	}

}
