package eva02.ejercicio10;
import java.util.ArrayList;
import java.util.Random;

/**
 * <p><i>Archivo: Baraja.java</i></p>
 * <p><b>Ejercicio 10</b>. Implementa la clase Carta. La carta debe pertenecer a la baraja espanola, de cuatro palos 
 * (oros, copas, espadas, bastos) y diez posibles valores (as, 2, 3, 4, 5, 6, 7, sota, caballo, rey) por palo. 
 * Utiliza la clase anterior para crear una Baraja. Utiliza la Baraja anterior para escoger 10 cartas al azar y mostrarlas 
 * como texto: por ejemplo, "tres de bastos" o "sota de espadas". A continuacion, debe mostrar la suma de 
 * los valores de las 10 cartas, teniendo en cuenta que el as vale 1, la sota, 10, el caballo 11 y el rey 12.</p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Baraja {

	public static ArrayList<Carta> mazo=new ArrayList();
	public static int contador;

	public static void main(String[] args) {

		// Generar 10 cartas:
		for (int i=0; i<10; i++) {
			mazo.add(generaCarta());
		}

		// Mostrar las 10 cartas:
		for (int i=0; i<mazo.size(); i++) {
			System.out.println(mazo.get(i).toString());
		}

		System.out.print("\n\tSuma de todos los valores: "+(contador));
	}

	// Generar Carta sin Repetir:
	public static Carta generaCarta() {

		Random rnd=new Random();
		Carta n;
		boolean found;
		int numero, palo;

		do {
			found=false;
			numero=rnd.nextInt(12-1+1)+1;
			palo=rnd.nextInt(4-1+1)+1;
			for (int i=0; i<mazo.size(); i++) {
				if (mazo.get(i).getNumero()==numero && mazo.get(i).getPalo()==palo) {
					found=true;
					break;
				}
			}
			contador+=numero;
		} while (found);

		return new Carta(numero, palo);

	}

}
