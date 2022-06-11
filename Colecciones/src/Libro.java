import java.util.Objects;

@SuppressWarnings("unused")
public class Libro {

	public Libro(String titulo, String autor, int ISBN) {
		this.titulo=titulo;
		this.autor=autor;
		this.ISBN=ISBN;
	}

	public String getDatos() {
		return "El titulo es: "+titulo+". El autor es: "+autor+". Y el ISBN es: "+ISBN+".";
	}

	/*
	public boolean equals(Object obj) { // Objeto que se le pasa como parametro fijo.
		// Operador instanceof: comprueba si un objeto es una instancia de una clase en concreto.
		if (obj instanceof Libro) { // Comprueba si es una instancia perteneciente a la clase Libro.
			Libro otro=(Libro)obj; // Convierte a obj en un objeto de tipo Libro (casting).
			// Compara si el ISBN de los dos objetos es o no es igual.
			if (this.ISBN==otro.ISBN) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	 */

	@Override
	public int hashCode() {
		final int prime=31;
		int result=1;
		result=prime*result+ISBN;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		if (obj==null)
			return false;
		if (getClass()!=obj.getClass())
			return false;
		Libro other=(Libro)obj;
		if (ISBN!=other.ISBN)
			return false;
		return true;
	}

	private String titulo; 
	private String autor;
	private int ISBN;

}
