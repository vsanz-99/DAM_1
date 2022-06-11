import java.util.*;

public class PruebaLinkedList {

	public static void main(String[] args) {
		/*Cuando se agregan elementos, por defecto, se agregan siempre al final de la lista.*/
		LinkedList<String> personas=new LinkedList<String>(); // Creacion de la instancia.
		// Estas listas estan ordenadas.
		personas.add("Pepe");
		personas.add("Sandra");
		personas.add("Ana");
		personas.add("Laura");
		System.out.println("Contiene: "+personas.size());
		/*El Iterador se encarga tanto de recorrer la lista como de agregar/quitar elementos.*/
		ListIterator<String> it=personas.listIterator();
		it.next(); // Se mueve una posicion hacia delante, entre la posicion 0 y la posicion 1.
		it.add("Juan"); // Este elemento estara entre "Pepe" y "Sandra".
		for (String persona : personas) {
			System.out.println(persona);
		}
	}

}
