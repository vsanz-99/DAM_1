package eva02.ejercicio05;

/**
 * <p><i>Archivo: Pinguino.java</i><p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Pinguino extends Ave {

	public Pinguino() {}

	public Pinguino(Sexo s) {
		super(s);
	}

	public void vuela() {
		System.out.println("\tSoy un pingüino, no puedo volar.");
	}

	public void programa() {
		System.out.println("\tSoy un pingüino programador, estoy programando en Java.");
	}

	public void nada() {
		System.out.println("\tEstoy nadando.");
	}

}
