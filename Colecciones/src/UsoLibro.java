
public class UsoLibro {

	public static void main(String[] args) {
		
		// El metodo equals() no sabe tratarlos (diferenciarlos)
		// Dos libros no pueden tener el mismo codigo ISBN
		Libro libro1=new Libro("P en Java", "Juan", 25);
		
		Libro libro2=new Libro("P en Java II", "Juan", 25);
		
		//libro1=libro2; // libro1 esta referenciando al mismo espacio en memoria que libro2

		// No es capaz de discernir si los objetos son iguales
		// Se debe sobreescribir el metodo equals
		if (libro1.equals(libro2)) {

			System.out.println("Es el mismo libro.");

			System.out.println(libro1.hashCode()); // Imprime cual es el hashCode del libro1

			System.out.println(libro2.hashCode()); // Imprime cual es el hashCode del libro2

		} else {

			System.out.println("No es el mismo libro.");

			System.out.println(libro1.hashCode()); // Imprime cual es el hashCode del libro1

			System.out.println(libro2.hashCode()); // Imprime cual es el hashCode del libro2

		}

	}

}
