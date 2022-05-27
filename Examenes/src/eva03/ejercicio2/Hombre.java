package eva03.ejercicio2;

public class Hombre implements Sexo { // Clase Hombre.

	String nombre=H;
	boolean barba;
	
	public Hombre(boolean barba) {
		this.barba=barba;
	}
	
	@Override
	public String toString() {
		return nombre+" "+((barba)?"con barba.":"sin barba.");
	}
	
} // Fin de la clase Hombre.
