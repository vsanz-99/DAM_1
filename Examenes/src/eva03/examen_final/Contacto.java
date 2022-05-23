package eva03.examen_final;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class Contacto implements Comparable<Contacto>{
	String nombre;
	ArrayList<Telefono> numeros = new ArrayList<Telefono>();
	public Contacto(String nombre,String telefono, String tipo) {

		this.nombre = nombre;
		addTelefono(telefono,tipo);
	}

	//constructor para cuando se obtiene del fichero
	public Contacto(String entrada) {

		fromString(entrada);

	}

	public void addTelefono(String entrada) {
		numeros.add(new Telefono(entrada));
	}

	public void addTelefono(String telefono,String tipo) {
		numeros.add(new Telefono(telefono,tipo));
	}

	public void delTelefono(String telefono) {

		/*aqui capturo una excepcion que se genera al modificar un elemento de una lista ,
			durante la iteracion ya que no nos interesa seguir iterando 
			una vez se halla encontrado el telefono buscado por lo que no importa el manejarla o no*/
		try {
			for(Telefono x : numeros) {

				if(x.numero.equals(telefono))numeros.remove(x);

			}

		}catch(ConcurrentModificationException e) {}
	}

	//el formato sera: nombre; num1; num2; ...; numN;
	public String toString() {

		String salida=nombre+"; ";
		for(Telefono x : numeros) {
			salida+=x+"; ";
		}
		if(numeros.isEmpty())salida+="sin telefonos";
		return salida;

	}

	//este metodo cogera como parametro un string en el formato fichero y lo dividira en los atributos de la clase Contacto
	private void fromString(String entrada) {

		nombre=entrada.substring(0,entrada.indexOf(";"));
		entrada=entrada.substring(entrada.indexOf(";")+1,entrada.length()-1);
		while(entrada.indexOf(";")<=entrada.lastIndexOf(";") && entrada.indexOf(";")>=0) {
			addTelefono(entrada.substring(0,entrada.indexOf(";")+1));
			entrada=entrada.substring(entrada.indexOf("; ")+1,entrada.length()-1);
		}

	}

	public int compareTo(Contacto o) {
		return nombre.compareTo(o.nombre);

	}
}
