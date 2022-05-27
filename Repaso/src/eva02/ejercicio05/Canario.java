package eva02.ejercicio05;

/**
 * <p><i>Archivo: Canario.java</i><p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Canario extends Ave {

	public Canario() {}
	
	public Canario(Sexo s) {
		super(s);
	}
	
	public void canta() {
		System.out.println("\tTralaralariiiiiiii.");
	}

	public void caza() {
		System.out.println("\tLos canarios no cazan.");
	}
	
	public void pia() {
		System.out.println("\tPio pio pio.");
	}

}
