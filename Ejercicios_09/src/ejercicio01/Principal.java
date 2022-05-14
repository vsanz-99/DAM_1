package ejercicio01;
import java.util.Random;

/**
 * <p>Implementar un TAD <u>pila</u> de enteros (se podran almacenar hasta 100 numeros enteros 
 * y a la hora de extraer informacion el ultimo elemento que se haya annadido sera el primero en salir) 
 * mediante un vector (LIFO), con las operaciones de: </p>
 * <ul>
 * <li type="disc">Apilar en la cima (<i>push</i>)</li>
 * <li type="disc">Desapilar de la cima (<i>pop</i>)</li>
 * <li type="disc">Conocer el numero de elementos apilados (<i>size</i>)</li>
 * </ul>
 * <p>Crear un programa que utilice la pila, insertando y extrayendo numeros de forma aleatoria. Al final: </p>
 * <ul>
 * <li type="disc">Visualizar los elementos de la pila. <b>Importante:</b> Para mostrar un elemnto de la pila 
 * hay que extraerlo, es decir, borrarlo.</li>
 * </ul>
 * @since 01/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Principal {

	public static void main(String[] args) {
		final int MAXOPERACIONES=100; // Numero de elementos a usar;

		Random r=new Random(123456);

		Pila p=new PilaReferencia(); // Podremos poner tanto Extendido() como PilaReferencia() 
		// Habra que ejecutar el que tenga el codigo
		for (int i=0; i<MAXOPERACIONES; i++) {

			int x=r.nextInt();

			boolean meter=r.nextBoolean();

			System.out.println("\tOperacion "+i+": "+(meter ? "meter" : "sacar"));

			if (meter || i<20) {

				p.push(x);

			} else {

				p.pop();

			}

		}

		Pila aux=new Extendido();

		while (p.size()>0) { // Cada elemento que se extrae de la pila p, se introduce en aux.

			aux.push(p.pop());

		}


		while (p.size()>0) {

			int x=aux.pop();

			p.push(x);

			System.out.println(x);

		}

		System.out.println(" ");

	}

}
