package eva02.ejercicio07;

/**
 * <p><i>Archivo: Ameba.java</i></p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ameba {

	int peso; // Peso en microgramos.
	
	public Ameba() {
		this.peso=3;
	}
	
	void come(int pesoComida) {
		this.peso+=pesoComida-1;
	}
	
	void come(Ameba a) {
		this.peso+=a.peso-1;
		a.peso=0; // La ameba comida se queda sin sustancia.
	}
	
	@Override
	public String toString() {
		return "Soy una ameba y peso "+peso+" microgramos.";
	}
	
}
