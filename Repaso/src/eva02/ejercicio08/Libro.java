package eva02.ejercicio08;

/**
 * <p><i>Archivo: Libro.java</i></p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Libro extends Publicacion implements Prestable {
	
	private boolean prestado=false;
	
	public Libro(String isbn, String titulo, int anio) {
		super(isbn, titulo, anio);
	}
	
	@Override
	public void presta() {
		if (this.prestado) {
			System.out.println("Lo siento, ese libro ya esta prestado.");
		} else {
			this.prestado=true;
		}
	}
	
	@Override
	public void devuelve() {
		this.prestado=false;
	}
	
	@Override
	public String toString() {
		return super.toString()+" ("+(this.prestado?"prestado":"no prestado")+")";
	}
	
	@Override
	public boolean estaPrestado() {
		return this.prestado;
	}
	
}

