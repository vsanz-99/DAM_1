package eva03.ejercicio2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/**
 * <p><i>Archivo: Contacto.java</i></p>
 * </p><b>Examen 3EVA</b>.</p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Contacto implements Comparable<Contacto> {

	Sexo sexo=null;
	String nombre;
	ArrayList<Telefono> numeros=new ArrayList<Telefono>();

	public Contacto(String nombre, String telefono, String tipo) {
		this.nombre=nombre;
		anadirTelefono(telefono, tipo);
	}

	// Constructor en el caso de que se obtenga del fichero, el booleano
	// es solo para distinguir los constructores.
	public Contacto(String entrada) {
		fromString(entrada);
	}

	public void anadirTelefono(String telefono) {
		numeros.add(
				new Telefono(telefono));
	}

	public void anadirTelefono(String telefono, String tipo) {
		numeros.add(
				new Telefono(telefono, tipo));
	}

	public void eliminarTelefono(String telefono) {
		/* Aqui se captura una excepcion que genera un elemento de
		 * una lista, durante la iteracion ya que NO nos interesa seguir iterando
		 * una vez se haya encontrado el telefono buscado por lo que no importa 
		 * manejarla o no. */
		try {
			for (Telefono t : numeros) {
				if (t.numero.equals(telefono))
					numeros.remove(t);
			}
		} catch (ConcurrentModificationException cme) {
			cme.printStackTrace();
		}
	}

	// El formato sera: nombre; num1; num2; ...; numN;
	@Override
	public String toString() {
		String salida=nombre+"; ";
		for (Telefono t : numeros) {
			salida+=t+"; ";
		}
		if (numeros.isEmpty())
			salida+="sin telefonos";
		return salida+" sexo:"+sexo;
	}

	// Este metodo cogera como parametro un String en el formato fichero 
	// y lo dividira en los atributos de la clase Contacto.
	private void fromString(String entrada) {
		nombre=entrada.substring(0, entrada.indexOf(";"));
		entrada=entrada.substring(entrada.indexOf(";")+1, entrada.length()-1);
		while (entrada.indexOf(";")<=entrada.lastIndexOf(";") && entrada.indexOf(";")>=0) {
			anadirTelefono(entrada.substring(0, entrada.indexOf(";")+1));
			entrada=entrada.substring(entrada.indexOf("; ")+1, entrada.length()-1);
		}
	}

	@Override
	public int compareTo(Contacto o) {
		return nombre.compareTo(o.nombre);
	}

}
