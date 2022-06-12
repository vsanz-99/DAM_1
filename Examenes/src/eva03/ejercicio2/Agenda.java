package eva03.ejercicio2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * <p><i>Archivo: Agenda.java</i></p>
 * </p><b>Examen 3EVA</b>.</p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/


public class Agenda {

	ArrayList<Contacto> contactos=new ArrayList<Contacto>();
	Scanner in=null;

	public Agenda(String fichero) {
		try {
			in=new Scanner(
					new BufferedReader(
							new FileReader(fichero)));
			while (in.hasNext()) {
				contactos.add(
						new Contacto(in.nextLine()));
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} finally {
			if (in !=null)
				in.close();
		}
	}

	// Devolvera true si NO existe otro contacto con ese nombre y false si SI existe y, 
	// en consecuencia, no lo anadira.
	public boolean anadirContacto(String nombre, String telefono, String tipo) {
		for(Contacto c : contactos) {
			if (c.nombre.equals(nombre))
				return false;
		}
		contactos.add(
				new Contacto(nombre, telefono, tipo));
		return true;
	}

	// Devolvera true si SI existe el contacto, eliminandolo, y false si NO existe.
	public boolean borrarContacto(String nombre) {
		for (Contacto c : contactos) {
			if (c.nombre.equals(nombre)) {
				contactos.remove(c);
				return true;
			}
		}
		return false;
	}

	public String listadoOrdenado() {
		String salida="";
		ArrayList<Contacto> ordenados=new ArrayList<Contacto>();
		for (Contacto c : contactos) {
			ordenados.add(c);
		}
		Collections.sort(ordenados);
		for (Contacto c : ordenados) {
			salida+=c+"\n";
		}
		return salida;
	}

	// Devolvera el objeto con el nombre buscado o null si no lo encuentra.
	public Contacto buscarNombre(String nombre) {
		for (Contacto c : contactos) {
			if (c.nombre.equals(nombre))
				return c;
		}
		return null;
	}

	public void anadirTelefono(String nombre, String telefono, String tipo) {
		for (Contacto c : contactos) {
			if (c.nombre.equals(nombre))
				c.anadirTelefono(telefono, tipo);
		}
	}

	public void borrarTelefono(String nombre, String telefono) {
		for (Contacto c: contactos) {
			if (c.nombre.equals(nombre))
				c.borrarTelefono(telefono);		
		}
	}

	public String buscarTelefono(String telefono) {
		String salida="";
		for (Contacto c : contactos) {
			for (Telefono t : c.numeros) {
				if (t.numero.equals(telefono))
					salida+=c.nombre+"\n";
			}
		}
		return ((salida.equals(""))?"\tNadie tiene este numero.":"Personas con este telefono: \n"
				+salida);
	}

	@Override
	public String toString() {
		String salida="";
		for (Contacto c : contactos) {
			salida+=c+"\n";
		}
		return salida;
	}

}
