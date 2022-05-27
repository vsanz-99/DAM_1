package eva03.ejercicio1;
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

public class Agenda { // Clase Agenda.

	ArrayList<Contacto> contactos=new ArrayList<Contacto>();
	Scanner in=null;

	// Este constructor intentara abrir el fichero y si lo consigue volcara todos los datos en el ArrayList.
	public Agenda(String fichero) { // Constructor de la clase Agenda.
		try {
			in=new Scanner(
					new BufferedReader(
							new FileReader(fichero)));
			while (in.hasNext()) {
				contactos.add(
						new Contacto(in.nextLine()));
			}
		} catch (FileNotFoundException e) {
			System.out.println("\tError: fichero no encontrado.");
		}
		finally {
			if (in!=null)
				in.close();
		}
	}

	// Devolvera true si NO existe otro contacto con ese nombre y false si SI y no lo anadira.
	public boolean addContacto(String nombre, String telefono, String tipo) {
		for (Contacto x : contactos) {
			if (x.nombre.equals(nombre))
				return false;
		}
		contactos.add(
				new Contacto(nombre, telefono, tipo));
		return true;
	}

	// Devolvera true si SI existe el contacto eliminandolo y false si NO existe. 
	public boolean delContacto(String nombre) {
		for (Contacto x : contactos) {
			if (x.nombre.equals(nombre)) {
				contactos.remove(x);
				return true;
			}
		}
		return false;
	}

	public String listadoAZ() { // Ordena los contactos.
		String salida="";
		ArrayList<Contacto> ordenados=new ArrayList<Contacto>();
		for (Contacto x : contactos) {
			ordenados.add(x);
		}
		Collections.sort(ordenados);
		for (Contacto x : ordenados) {
			salida+=x+"\r";
		}
		return salida;
	}

	// Devolvera el objeto con el nombre buscado o null si NO lo encuentra.
	public Contacto buscaNombre(String nombre) {
		for (Contacto x : contactos) {
			if (x.nombre.equals(nombre))
				return x;
		}
		return null;
	}

	public void addTelefono(String nombre, String telefono, String tipo) {
		for (Contacto x : contactos) {
			if (x.nombre.equals(nombre))
				x.addTelefono(telefono, tipo);
		}
	}

	public void delTelefono(String nombre, String telefono) {
		int index=0;
		boolean encontrado=false;
		for (Contacto x : contactos) {
			if (encontrado=x.nombre.equals(nombre))
				index=contactos.indexOf(x);
		}
		if (encontrado)
			contactos.get(index).delTelefono(telefono);
	}

	public String buscaTelefono(String telefono) {
		String salida="";
		for (Contacto x : contactos) {
			for (Telefono y : x.numeros) {
				if (y.numero.equals(telefono))
					salida+=x.nombre+"\r";
			}
		}
		return ((salida.equals(""))?"Nadie tiene este numero.":"Personas con este telefono: \r"+salida);
	}	

	@Override
	public String toString() {
		String salida="";
		for (Contacto x : contactos) {
			salida+=x+"\r";
		}
		return salida;
	}

} // Fin de la clase Agenda.
