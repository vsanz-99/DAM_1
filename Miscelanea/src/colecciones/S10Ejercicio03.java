package colecciones;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 3. Escribe un programa que ordene 10 numeros enteros introducidos por
 *    teclado y almacenados en un objeto de la clase ArrayList .
 *
 * @author Victor Sanz*/

public class S10Ejercicio03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce 10 numeros enteros: ");
		
		for (int i=0; i<10; i++) {
			a.add(teclado.nextInt());
		}
		
		System.out.println("\tLista original: "+a);
		
		Collections.sort(a);
		
		System.out.println("\tLista ordenada de menor a mayor: "+a);
		
		// Descomentar el siguiente bloque para ordenar la lista de mayor a
	    // menor:
	    /*
	      ArrayList<Integer> b=new ArrayList<Integer>();
	      for (int n : a) {
	        b.add(0, n);
	      }
	        
	      System.out.print("\tLista ordenada de mayor a menor: "+b);
	    */
		
	}

}
