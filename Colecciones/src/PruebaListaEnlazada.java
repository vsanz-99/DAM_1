import java.util.*;

public class PruebaListaEnlazada {

	public static void main(String[] args) {
		LinkedList<String> paises=new LinkedList<String>();
		paises.add("Espania");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");
		LinkedList<String> capitales=new LinkedList<String>();
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("DF");
		capitales.add("Lima");
		// Imprimir ambas listas:
		System.out.println(paises);
		System.out.println(capitales);
		ListIterator<String> iterA=paises.listIterator();
		ListIterator<String> iterB=capitales.listIterator();
		while (iterB.hasNext()) {
			if (iterA.hasNext()) {
				iterA.next(); // Salta al siguiente elemento.
			}
			iterA.add(iterB.next()); // Agregar a la primera vuelta del bucle "Madrid" debajo de "Espania".
		}
		System.out.println("\n"+paises);
		iterB=capitales.listIterator(); // Vuelve a su posicion inicial.
		while (iterB.hasNext()) { // Si existe algun elemento a continuacion ...
			iterB.next();
			if (iterB.hasNext()) { // Si existe otra posicion ...
				iterB.next();
				iterB.remove(); // Elimina las posiciones pares
			}
		}
		System.out.println("\n"+capitales);
		paises.removeAll(capitales);
		System.out.println("\n"+paises);
	}

}
