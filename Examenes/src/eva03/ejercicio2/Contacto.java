package eva03.ejercicio2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/**
 * <p><i>Archivo: Contacto.java</i></p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Contacto implements Comparable<Contacto> { // Clase Contacto.

	Sexo sexo=null;
	String nombre;
	ArrayList<Telefono> numeros=new ArrayList<Telefono>();

	public Contacto(String nombre, String telefono, String tipo) {
		this.nombre=nombre;
		addTelefono(telefono, tipo);
	}

	// Constructor para cuando se obtiene del fichero.
	public Contacto(String entrada) {
		fromString(entrada);
	}

	public void addTelefono(String entrada) {
		numeros.add(
				new Telefono(entrada));
	}

	public void addTelefono(String telefono, String tipo) {
		numeros.add(
				new Telefono(telefono, tipo));
	}

	public void delTelefono(String telefono) {
		/*Aqui capturo una excepcion que se genera al modificar un elemento de una lista,
		durante la iteracion ya que no nos interesa seguir iterando 
		una vez se halla encontrado el telefono buscado por lo que no importa el manejarla o no.*/
		try {
			for (Telefono x : numeros) {
				if (x.numero.equals(telefono))
					numeros.remove(x);
			}
		} catch (ConcurrentModificationException e) {}
	}

	// El formato sera: nombre; num1; num2; ...; numN;
	@Override
	public String toString() {
		String salida=nombre+"; ";
		for (Telefono x : numeros) {
			salida+=x+"; ";
		}
		if (numeros.isEmpty())
			salida+="Sin telefonos.";
		return salida;
	}

	// Este metodo cogera como parametro un String en el formato fichero y lo dividira en los atributos de la clase Contacto
	private void fromString(String entrada) {
		nombre=entrada.substring(0, entrada.indexOf(";"));
		entrada=entrada.substring(entrada.indexOf(";")+1, entrada.length()-1);
		while (entrada.indexOf(";")<=entrada.lastIndexOf(";") && entrada.indexOf(";")>=0) {
			addTelefono(entrada.substring(0, entrada.indexOf(";")+1));
			entrada=entrada.substring(entrada.indexOf("; ")+1, entrada.length()-1);
		}
	}

	public int compareTo(Contacto o) {
		return nombre.compareTo(o.nombre);
	}

} // Fin de la clase Contacto.
