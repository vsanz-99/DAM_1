package eva02.ejercicio08;

/**
 * <p><i>Archivo: Publicacion.java</i></p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Publicacion {
	
	private String isbn;
	private String titulo;
	private int anio;
	
	public Publicacion(String isbn, String titulo, int anio) {
		this.isbn=isbn;
		this.titulo=titulo;
		this.anio=anio;
	}
	
	@Override
	public String toString() {
		return "ISBN: "+isbn+", titulo: "+titulo+", anio de publicacion: "+anio;
	}
	
}

