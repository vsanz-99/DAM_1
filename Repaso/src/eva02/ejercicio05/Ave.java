package eva02.ejercicio05;

/**
 * <p><i>Archivo: Ave.java</i><p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ave extends Animal {

	public Ave() {
		super(Sexo.HEMBRA);
	}

	public Ave(Sexo s) {
		super(s);
	}

	public void ponHuevo() {
		if (this.getSexo()==Sexo.MACHO) {
			System.out.println("\tSoy macho, no puedo poner huevos.");
		} else {
			System.out.println("\tAhi va eso ... un huevo.");
		}
	}

	public void limpiate() {
		System.out.println("\tMe estoy limpiando las plumas.");
	}

	public void vuela() {
		System.out.println("\tEstoy volando.");
	}

}
