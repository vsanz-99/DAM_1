package eva02.ejercicio05;

/**
 * <p><i>Archivo: Mamifero.java</i><p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Mamifero extends Animal {

	public Mamifero() {
		super();
	}
	
	public Mamifero(Sexo s) {
		super(s);
	}
	
	public void amamanta() {
		if (this.getSexo()==Sexo.MACHO) {
			System.out.println("\tSoy macho no puedo amamantar :(.");
		} else {
			System.out.println("\tToma pecho, hazte grande.");
		}
	}
	
	public void cuidaCrias() {
		System.out.println("\tEstoy cuidando a mis crias.");
	}
	
	public void anda() {
		System.out.println("\tEstoy andando.");
	}

}
