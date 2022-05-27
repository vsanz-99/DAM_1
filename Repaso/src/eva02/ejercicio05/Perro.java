package eva02.ejercicio05;

/**
 * <p><i>Archivo: Perro.java</i><p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Perro extends Mamifero {

	public Perro(Sexo s) {
		super(s);
	}

	public Perro() {
		super(Sexo.HEMBRA);
	}

	public void ladra() {
		System.out.println("\tGuau guau!");
	}

	public void dameLaPata() {
		System.out.println("\tToma mi patita.");
	}

	public void caza() {
		System.out.println("\tEstoy cazando perdices.");
	}

}