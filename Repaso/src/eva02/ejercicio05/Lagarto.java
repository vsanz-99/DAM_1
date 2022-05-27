package eva02.ejercicio05;

/**
 * <p><i>Archivo: Lagarto.java</i><p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Lagarto extends Animal {

	public Lagarto() {}
	
	public Lagarto(Sexo s) {
		super(s);
	}
	
	public void tomaElSol() {
		System.out.println("\tEstoy tomando el Sol.");
	}
	
	public void baniate() {
		System.out.println("\tMes estoy dando un chapuzon.");
	}
	
	public void escondete() {
		System.out.println("\tMes he escondido, ya no me puedes ver.");
	}

}
