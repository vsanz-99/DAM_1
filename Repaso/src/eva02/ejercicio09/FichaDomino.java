package eva02.ejercicio09;

/**
 * <p><i>Archivo: FichaDomino.java</i></p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class FichaDomino {

	private int lado1;
	private int lado2;

	public FichaDomino() {
		this.lado1=(int)(Math.random()*7);
		this.lado2=(int)(Math.random()*7);
	}

	public FichaDomino(int lado1, int lado2) {
		this.lado1=lado1;
		this.lado2=lado2;
	}

	FichaDomino voltea() {
		return new FichaDomino(lado2, lado1);
	}

	boolean encaja(FichaDomino ficha) {
		return (lado1==ficha.lado1) || (lado1==ficha.lado2)
				|| (lado2==ficha.lado1) || (lado2==ficha.lado2);
	}

	boolean encajaEnFila(FichaDomino ficha) {
		return lado2==ficha.lado1;
	}

	@Override
	public String toString() {
		return "["+(lado1==0?" ":lado1)+"|"+(lado2==0?" ":lado2)+"]";
	}

}
