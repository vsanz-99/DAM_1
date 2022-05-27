package eva02.ejercicio11;

/**
 * <p><i>Archivo: Gato.java</i></p>
 * @since 26/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Gato implements Mascota{

	private int tipo_gato;
	private int propiedad;
	
	public Gato(int tipo_gato, int propiedad) {
		this.setTipo_gato(tipo_gato);
		this.setPropiedad(propiedad);
	}

	public int getTipo_gato() {
		return tipo_gato;
	}

	public void setTipo_gato(int tipo_gato) {
		this.tipo_gato=tipo_gato;
	}
	
	public int getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(int propiedad) {
		this.propiedad=propiedad;
	}

	@Override
	public String toString() {
		String tipo_gatoString="";
		String garras="";
		switch (this.tipo_gato) {
		case 1 :
			tipo_gatoString="Siames";
			break;
		case 2 :
			tipo_gatoString="Bengali";
			break;
		case 3 :
			tipo_gatoString="Persa";
			break;
		case 4 :
			tipo_gatoString="Bosque de Noruega";
			break;
		case 5 :
			tipo_gatoString="Siberiano";
			break;
		default :
			System.out.println("\tError.");
		}
		switch (this.propiedad) {
		case 1 :
			garras="si";
			break;
		case 2 :
			garras="no";
			break;
		default :
			System.out.println("\tError.");
		}
		return "Gato. Raza: "+tipo_gatoString+". El gato "+garras+" tiene garras.";
	}
	
	@Override
	public String determinaPrecio() {
		double p_base=60;
		if (this.propiedad==1) {
			p_base*=0.95;
		}
		return "El gato cuesta: "+p_base+" euros";
	}
	
}
