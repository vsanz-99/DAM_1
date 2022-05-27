package eva02.ejercicio11;

/**
 * <p><i>Archivo: Pez.java</i></p>
 * @since 26/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Pez implements Mascota {

	private int tipo_pez;
	private int propiedad;
	
	public Pez(int tipo_pez, int propiedad) {
		this.setTipo_pez(tipo_pez);
		this.setPropiedad(propiedad);
	}

	public int getTipo_pez() {
		return tipo_pez;
	}

	public void setTipo_pez(int tipo_pez) {
		this.tipo_pez=tipo_pez;
	}

	public int getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(int propiedad) {
		this.propiedad=propiedad;
	}
	
	@Override
	public String toString() {
		String tipo_pezString="";
		String agua="";
		switch (this.tipo_pez) {
		case 1 :
			tipo_pezString="Goldfish";
			break;
		case 2 :
			tipo_pezString="Carpa";
			break;
		case 3 :
			tipo_pezString="Molly negro";
			break;
		case 4 :
			tipo_pezString="Platy";
			break;
		default :
			System.out.println("\tError.");
		}
		switch (this.propiedad) {
		case 1 :
			agua="salada";
			break;
		case 2 :
			agua="dulce";
			break;
		default :
			System.out.println("\tError.");
		}
		return "Pez. Tipo: "+tipo_pezString+". El pez es de agua "+agua+".";
	}
	
	@Override
	public String determinaPrecio() {
		double p_base=60;
		if (this.propiedad==2) {
			p_base*=1.20;
		} 
		return "El pez cuesta: "+p_base+" euros";
	}

}
