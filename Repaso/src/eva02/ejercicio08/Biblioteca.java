package eva02.ejercicio08;

/**
 * <p><i>Archivo: Biblioteca.java</i></p>
 * <p><b>Ejercicio 08</b>. Se quiere informatizar una biblioteca. Crea las clases Publicacion, 
 * Libro y Revista. Las clases deben estar implementadas con la jerarquia correcta. Las caracteristicas 
 * comunes de las revistas y de los libros son el codigo ISBN, el titulo, y el anio de publicacion. Los 
 * libros tienen ademas un atributo prestado. Cuando se crean los libros, no estan prestados. Las 
 * revistas tienen un numero. La clase Libro debe implementar la interfaz Prestable que tiene 
 * los metodos presta, devuelve y estaPrestado.</p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Biblioteca {

	public static void main(String[] args) {

		Libro libro1=new Libro("123456", "La Ruta Prohibida", 2007);
		Libro libro2=new Libro("112233", "Los Otros", 2016);
		Libro libro3=new Libro("456789", "La rosa del mundo", 1995);

		Revista revista1=new Revista("444555", "Anio Cero", 2019, 344);
		Revista revista2=new Revista("002244", "National Geographic", 2003, 255);

		System.out.println(libro1);
		System.out.println(libro2);
		System.out.println(libro3);
		System.out.println(revista1);
		System.out.println(revista2);

		libro2.presta();

		if (libro2.estaPrestado()) {
			System.out.println("El libro esta prestado.");
		}

		libro2.presta();
		libro2.devuelve();

		if (libro2.estaPrestado()) {
			System.out.println("El libro está prestado");
		}

		libro3.presta();
		System.out.println(libro2);
		System.out.println(libro3);

	}

}
