package eva02.ejercicio05;

/**
 * <p><i>Archivo: Animal.java</i><p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public abstract class Animal {

	private Sexo sexo;

	public Animal() {
		this.sexo=Sexo.MACHO;
	}

	public Animal(Sexo s) {
		this.sexo=s;
	}

	public Sexo getSexo() {
		return this.sexo;
	}

	public void duerme() {
		System.out.println("\tZzzzzzz.");
	}

	public void come(String comida) {
		System.out.println("\tEstoy comiendo "+comida+".");
	}

}
