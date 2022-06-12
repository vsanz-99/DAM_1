package eva03.ejercicio2;

/**
 * <p><i>Archivo: Telefono.java</i></p>
 * </p><b>Examen 3EVA</b>.</p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Telefono {

	String numero, tipo;

	public Telefono(String numero, String tipo) {
		this.numero=numero;
		this.tipo=tipo;
	}

	// Constructor para cuando se obtiene del fichero.
	public Telefono(String entrada) {
		fromString(entrada);
	}

	@Override
	public String toString() {
		return tipo+"_"+numero;
	}

	// Este metodo cogera como parametro un String en formato fichero 
	// y lo dividira en los atributos de la clase Telefono.
	private void fromString(String entrada) {
		tipo=entrada.substring(1, entrada.indexOf("_"));
		numero=entrada.substring(entrada.indexOf("_")+1, entrada.length()-1);
	}

	// Determina si un numero de telefono cumple con las normas expuestas 
	// en el examen. Devuelve true si es valido.
	public static boolean telefonoValido(String numero) {
		for (int i=0 ; i<numero.length() ; ++i) {
			if ((numero.charAt(i)<'0' || numero.charAt(i)>'9') && 
					numero.charAt(i)!='+' && numero.charAt(i)!=' ')
				return false;
		}
		return true;
	}

}
