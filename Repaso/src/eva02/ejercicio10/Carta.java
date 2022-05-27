package eva02.ejercicio10;

/**
 * <p><i>Archivo: Carta.java</i></p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Carta {

	private int numero;
	private int palo;

	public Carta(int numero, int palo) {
		this.numero=numero;
		this.palo=palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero=numero;
	}

	public int getPalo() {
		return palo;
	}

	public void setPalo(int Palo) {
		this.palo=palo;
	}

	@Override
	public String toString() {
		String paloString="";
		switch (this.palo) {
		case 1 :
			paloString="Oros";
			break;
		case 2 :
			paloString="Bastos";
			break;
		case 3 :
			paloString="Espadas";
			break;
		case 4 :
			paloString="Copas";
			break;
		default :
			System.out.println("Error.");

		}
		return "Carta: "+numero+" de "+paloString;
	}
}
