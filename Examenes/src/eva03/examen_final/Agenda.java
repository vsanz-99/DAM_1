package eva03.examen_final;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * <p><i>Archivo: Agenda.java</i></p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Agenda {
	ArrayList<Contacto> contactos = new ArrayList<Contacto>();
	Scanner in=null;


	//este constructor intentara abrir el fichero y si lo consigue volcara todos los datos en el arraylist
	public Agenda(String fichero) {

		try {
			in = new Scanner(new BufferedReader(new FileReader(fichero)));
			while(in.hasNext()) {
				contactos.add(new Contacto(in.nextLine()));
			}
		} catch (FileNotFoundException e) {}
		finally {
			if(in != null)
				in.close();
		}

	}

	//devolvera true si no existe otro contacto con ese nombre y false si si y no lo añadira
	public boolean addContacto(String nombre,String telefono, String tipo) {

		for(Contacto x : contactos) {

			if(x.nombre.equals(nombre))return false;

		}
		contactos.add(new Contacto(nombre,telefono,tipo));
		return true;

	}

	//devolvera true si existe el contacto eliminandolo y false si no 
	public boolean delContacto(String nombre) {

		for(Contacto x : contactos) {

			if(x.nombre.equals(nombre)) {
				contactos.remove(x);
				return true;
			}

		}
		return false;

	}

	public String listadoAZ() {

		String salida="";
		ArrayList<Contacto> ordenados = new ArrayList<Contacto>();
		for(Contacto x : contactos) {

			ordenados.add(x);

		}
		Collections.sort(ordenados);
		for(Contacto x : ordenados) {
			salida+=x+"\r";
		}
		return salida;

	}

	//devolvera el objeto con el nombre buscado o null si no lo encuentra
	public Contacto buscaNombre(String nombre) {

		for(Contacto x : contactos) {

			if(x.nombre.equals(nombre))return x;

		}
		return null;

	}

	public void addTelefono(String nombre, String telefono, String tipo) {

		for(Contacto x : contactos) {

			if(x.nombre.equals(nombre))x.addTelefono(telefono,tipo);

		}

	}

	public void delTelefono(String nombre, String telefono) {

		int index = 0;
		boolean encontrado=false;
		for(Contacto x : contactos) {

			if(encontrado=x.nombre.equals(nombre))index=contactos.indexOf(x);

		}
		if(encontrado)contactos.get(index).delTelefono(telefono);

	}

	public String buscaTelefono(String telefono) {

		String salida="";
		for(Contacto x : contactos) {

			for(Telefono y : x.numeros) {

				if(y.numero.equals(telefono))salida+=x.nombre+"\r";

			}

		}
		return ((salida.equals(""))?"Nadie tiene este numero":"Personas con este telefono: \r"+salida);

	}	

	public String toString() {

		String salida="";
		for(Contacto x : contactos) {

			salida+=x+"\r";

		}
		return salida;

	}
}
