package eva02.ejercicio05;

/**
 * <p><i>Archivo: Gato.java</i><p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Gato extends Mamifero {

	private String raza;

	public Gato(Sexo s, String r) {
		super(s);
		this.raza=r;
	}

	public Gato(Sexo s) {
		super(s);
		this.raza="siames";
	}

	public Gato(String r) {
		super(Sexo.HEMBRA);
		this.raza=r;
	}

	public Gato() {
		super(Sexo.HEMBRA);
		raza="siames";
	}

	public void maulla() {
		System.out.println("\tMiauuuu!");
	}

	public void ronronea() {
		System.out.println("\tmrrrrrr.");
	}

	public void come(String comida) {
		if (comida.equals("pescado")) {
			System.out.println("\tHmmmm, gracias.");
		} else {
			System.out.println("\tLo siento, yo solo como pescado.");
		}
	}

	public void peleaCon(Gato contrincante) {
		if (this.getSexo()==Sexo.HEMBRA) {
			System.out.println("\tNo me gusta pelear.");
		} else {
			if (contrincante.getSexo()==Sexo.HEMBRA) {
				System.out.println("\tNo peleo contra gatitas.");
			} else {
				System.out.println("\tVen aqui que te vas a enterar!");
			}
		}
	}

	public void limpiate() {
		System.out.println("\tMe estoy lamiendo.");
	}

	public void caza() {
		System.out.println("\tEstoy cazando ratones.");
	}

}