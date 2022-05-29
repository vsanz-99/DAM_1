package colecciones;

import java.util.ArrayList;

/**
 * 1. Crea un ArrayList con los nombres de 6 companeros de clase. A
 *    continuacion, muestra esos nombres por pantalla. Utiliza para
 *    ello un bucle for que recorra todo el ArrayList sin usar ningun
 *    indice.
 *
 * @author Victor Sanz*/

public class S10Ejercicio01 {

	public static void main(String[] args) {

		ArrayList<String> a=new ArrayList<String>();

		a.add("Jose Manuel");
		a.add("Salvador");
		a.add("Ruben");
		a.add("Noemi");
		a.add("Begona");

		System.out.println("Contenido de la lista: \n");

		for (String nombre : a) {
			System.out.println("\t"+nombre);
		}

	}

}
