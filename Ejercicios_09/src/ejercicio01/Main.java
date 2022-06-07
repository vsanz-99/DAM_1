package ejercicio01;
import java.util.Random;

/**
 * <p><i>Archivo: Main.java</i></p>
 * <p><b>Ejercicio 01</b>. Implementar un tipo abstracto de datos pila de enteros 
 * (se podran almacenar hasta cien numeros enteros y a la hora de extraer informacion el 
 * ultimo elemento que se haya annadido sera el primero en salir) mediante un vector, con las 
 * operaciones de: </p>
 * <ul>
 * <li>Apilar en la cima(push)</li>
 * <li>Desapilar de la cima(pop)</li>
 * <li>Conocer el numero de elementos apilados(size)</li>
 * </ul>
 * <p>Extraer e insertar numeros de forma aleatoria. Al final: </p>
 * <ul>
 * <li>Visualizar los elementos de la pila. <b>Para mostrar un elemento de una pila 
 * hay que borrarlo.</b></li>
 * </ul>
 * @since 07/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Main {

	public static void main(String[] args) {
		final int MAXOPERACIONES=100; // Numero de elementos a usar;
		Random r=new Random();
		// Random r=new Random(123456)
		Pila p=new PilaReferencia(); // Se podra usar tanto Extendido() como
		// PilaReferencia(). --> Usar el que tenga codigo.
		for (int i=0; i<MAXOPERACIONES; i++) {
			int n=r.nextInt(); // Generador aleatorio de numeros enteros.
			boolean meter=r.nextBoolean(); // Generador aleatorio de valores booleanos.
			System.out.println("\tOperacion "+(i+1)+": "+(meter?"meter":"sacar"));
			if (meter || i<20) {
				p.push(n); // Apilar.
			} else {
				p.pop(); // Desapilar.
			}
		}
		Pila aux=new Extendido();
		while (p.size()>0) // Cada elemento que se extrae de la pila p, se introduce en aux.
			aux.push(p.pop()); // Los que se desapila de p, se apila en aux.
		while (p.size()>0) {
			int n=aux.pop();
			p.push(n);
			System.out.println(n);
		}
		System.out.println();
	}

}
