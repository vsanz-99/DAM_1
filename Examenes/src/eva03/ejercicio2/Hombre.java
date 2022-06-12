package eva03.ejercicio2;

/**
 * <p><i>Archivo: Hombre.java</i></p>
 * </p><b>Examen 3EVA</b>.</p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Hombre implements Sexo {

	String nombre=H;
	boolean barba;

	public Hombre(boolean barba) {
		this.barba=barba;
	}

	@Override
	public String toString() {
		return nombre+" "+((barba)?"con barba":"sin barba");
	}

}
