package eva02.ejercicio08;

/**
 * <p><i>Archivo: Revista.java</i></p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Revista extends Publicacion {
	
	private int numero;
	
	public Revista(String isbn, String titulo, int anio, int numero) {
		super(isbn, titulo, anio);
		this.numero=numero;
	}
	
}

