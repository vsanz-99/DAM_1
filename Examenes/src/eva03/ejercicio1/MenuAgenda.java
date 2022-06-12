package eva03.ejercicio1;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * <p><i>Archivo: MenuAgenda.java</i></p>
 * </p><b>Examen 3EVA</b>.</p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class MenuAgenda {

	String fichero;
	Agenda agenda;
	String menu="Elige una opcion: \n"
			+"\t1-. Anadir un contacto en la agenda.\n"
			+"\t2-. Borrar un contacto en la agenda.\n"
			+"\t3-. Listar en orden alfabetico todos los contactos "
			+"de la agenda.\n"
			+"\t4-. Buscar por nombre.\n"
			+"\t5-. Anadir un telefono a un contacto.\n"
			+"\t6-. Borrar un telefono de un contacto.\n"
			+"\t7-. Buscar por telefono.\n"
			+"\t0-. Salir del programa.";
	Scanner teclado;
	PrintStream out;

	public MenuAgenda(String nombre_f) {
		this.fichero=nombre_f;
		agenda=new Agenda(nombre_f);
		teclado=new Scanner(System.in);
		out=null;
		int opcion=0;
		do {
			System.out.println(menu);
			do {
				System.out.println("--> ");
				opcion=teclado.nextInt();
				teclado.nextLine();
			} while (!(opcion<=7 && opcion>=0));
			switch (opcion) {
			case 1 :
				anadirContacto();
				break;
			case 2 :
				borrarContacto();
				break;
			case 3 :
				listadoOrdenado();
				break;
			case 4 :
				buscarNombre();
				break;
			case 5 :
				anadirTelefono();
				break;
			case 6 :
				borrarTelefono();
				break;
			case 7 :
				buscarTelefono();
				break;
			default :
			}
		} while (opcion!=0);
	}

	// Pedira al anadir un contacto anadir (si no existe ya) un 
	// telefono automaticamente
	public void anadirContacto() {
		String nombre, telefono, tipo;
		nombre=telefono=tipo="";
		do {
			System.out.println("¿Nombre del contacto?");
			nombre=teclado.nextLine();
			if (agenda.buscarNombre(nombre)!=null)
				System.out.println("\tYa existe otro contacto con este nombre.");
		} while (agenda.buscarNombre(nombre)!=null);
		do {
			System.out.println("¿Telefono?");
			telefono=teclado.nextLine();
		} while (!Telefono.telefonoValido(telefono));
		System.out.println("¿Tipo?");
		tipo=teclado.nextLine();
		agenda.anadirContacto(nombre, telefono, tipo);
		transaccion();
	}

	public void borrarContacto() {
		String nombre="";
		System.out.println("¿Nombre?");
		nombre=teclado.nextLine();
		if (!agenda.borrarContacto(nombre))
			System.out.println("\tNo se pudo eliminar el contacto.");
		transaccion();
	}

	private void listadoOrdenado() {
		System.out.println(agenda.listadoOrdenado());
	}

	private void buscarNombre() {
		String nombre="";
		System.out.println("¿Nombre?");
		nombre=teclado.nextLine();
		System.out.println((agenda.buscarNombre(nombre)!=null)?
				agenda.buscarNombre(nombre):"\tNo existe ningun contacto "
				+"con ese nombre.");
	}

	private void anadirTelefono() {
		String nombre, telefono, tipo;
		nombre=telefono=tipo="";
		do {
			System.out.println("¿Nombre?");
			nombre=teclado.nextLine();
		} while (agenda.buscarNombre(nombre)==null);
		do {
			System.out.println("¿Telefono?");
			telefono=teclado.nextLine();		
		} while (!Telefono.telefonoValido(telefono));
		System.out.println("¿Tipo?");
		tipo=teclado.nextLine();
		agenda.anadirTelefono(nombre, telefono, tipo);
		transaccion();
	}

	private void borrarTelefono() {
		String nombre, telefono;
		nombre=telefono="";
		do {
			System.out.println("¿Nombre?");
			nombre=teclado.nextLine();
		} while (agenda.buscarNombre(nombre)==null);
		do {
			System.out.println("¿Telefono?");
			telefono=teclado.nextLine();
		} while (!Telefono.telefonoValido(telefono));
		agenda.borrarTelefono(nombre, telefono);
		transaccion();
	}

	private void buscarTelefono() {
		String telefono="";
		System.out.println("¿Telefono?");
		telefono=teclado.nextLine();
		System.out.println(agenda.buscarTelefono(telefono));
	}

	// Plasma la informacion de todo el programa en el fichero.
	private void transaccion() {
		try {
			out=new PrintStream(
					new FileOutputStream(fichero, false));
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} finally {
			if (out!=null)
				out.close();
		}
	}

}
