package eva02.ejercicio11;

/**
 * <p><i>Archivo: Perro.java</i></p>
 * @since 26/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Perro implements Mascota {

	private int tipo_perro;
	private int propiedad;
	
	public Perro(int tipo_perro, int propiedad) {
		this.tipo_perro=tipo_perro;
		this.propiedad=propiedad;
	}

	public int getTipo_perro() {
		return tipo_perro;
	}

	public void setTipo_perro(int tipo_perro) {
		this.tipo_perro=tipo_perro;
	}
	
	public int getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(int propiedad) {
		this.propiedad=propiedad;
	}

	@Override
	public String toString() {
		String tipo_perroString="";
		String comida="";
		switch (this.tipo_perro) {
		case 1 :
			tipo_perroString="Pastor islandes";
			break;
		case 2 :
			tipo_perroString="Shiba Inu";
			break;
		case 3 :
			tipo_perroString="Chow chow";
			break;
		case 4 :
			tipo_perroString="Border collie";
			break;
		case 5 :
			tipo_perroString="Boxer";
			break;
		default :
			System.out.println("\tError.");
		}
		switch (this.propiedad) {
		case 1 :
			comida="seca";
			break;
		case 2 :
			comida="en lata";
			break;
		default :
			System.out.println("\tError.");
		}
		return "Perro. Raza: "+tipo_perroString+". Tipo de comida: "+comida+".";
	}
	
	@Override
	public String determinaPrecio() {
		double p_base=60;
		if (this.propiedad==2) {
			p_base*=1.10;
		}
		return "El perro cuesta: "+p_base+" euros";
	}
	
}
