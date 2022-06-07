package eva03.ejercicio2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

/**
 * <p><i>Archivo: MenuAgenda.java</i></p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class MenuAgenda { // Clase MenuAgenda.

	String fichero="H:/eclipse_myworkspace/Examenes/src/eva03/"
			+"agenda.dat"; // Nombre del fichero que se cargara en la coleccion.

	Agenda agenda=new Agenda(fichero); // Instanciacion de un nuevo objeto de la clase Agenda.

	// Objeto de tipo String que contiene el menu.
	String menu="1-. Anadir un contacto.\r2-. Borrar un contacto.\r3-. Listado en orden alfabetico.\r"
			+"4-. Buscar por nombre.\r5-. Anadir un telefono.\r6-. Borrar un telefono.\r"
			+"7-. Buscar por telefono.\r8-. Asignar sexo.\r0-. Salir."; 

	Scanner teclado=new Scanner(System.in); // Nuevo Scanner;

	// Inicializacion de la secuencia de caracteres.
	PrintStream out=null; // Imprimir datos a una corriente (flujo) de datos determinada.

	public MenuAgenda() { // Constructor de la clase MenuAgenda.
		int opcion;
		do {
			System.out.println(menu); // Imprime el menu por pantalla.
			do {
				System.out.println("-->");
				opcion=teclado.nextInt();
				teclado.nextLine();
			} while (!(opcion<=7 && opcion>=0));
			switch(opcion) {
			case 1 : 
				anadirContacto(); // Anadir un contacto.
				break;
			case 2 : 
				borrarContacto(); // Borrar un contacto.
				break;
			case 3 : 
				listadoOrdenado(); // Listar contactos en orden alfabetico.
				break;
			case 4 : 
				buscaNombre(); // Buscar por nombre.
				break;
			case 5 : 
				anadirTelefono(); // Anadir telefono.
				break;
			case 6 : 
				borrarTelefono(); // Borrar telefono.
				break;
			case 7 : 
				buscaTelefono(); // Buscar por telefono.
				break;
			case 8 :
				asignaSexo(); // Asigna el sexo.
				break;
			}
		} while (opcion!=0); // 0-. Salir del programa.
	}

	// Pedira al anadir un contacto anadir (si no existe previamente) 
	// un telefono automaticamente.
	private void anadirContacto(){ // Llamada al metodos para anadir un contacto.
		// Nombre, apellido, diferentes numeros de telefono y sus tipos.
		String nombre, telefono, tipo;
		do {
			System.out.println("Nombre del contacto a anadir: ");
			nombre=teclado.nextLine();
			// Comprobar si ya existe un contacto con el mismo nombre:
			if (agenda.buscaNombre(nombre)!=null)
				System.out.println("Ya existe otro contacto con este nombre.");
		} while (agenda.buscaNombre(nombre)!=null);
		do {
			System.out.println("Telefono del contacto: ");
			telefono=teclado.nextLine();
		} while (!Telefono.telefonoValido(telefono)); // Llamada al metodo para validar el numero de telefono.
		System.out.println("Tipo: ");
		tipo=teclado.nextLine();
		agenda.addContacto(nombre, telefono, tipo); // Entrada de parametros.
		transaccion();
	}

	private void borrarContacto() { // Llamada al metodo para borrar un contacto.
		String nombre;
		System.out.println("Nombre: ");
		nombre=teclado.nextLine();
		if(!agenda.delContacto(nombre))
			System.out.println("No se pudo eliminar el contacto.");
		transaccion();
	}

	private void listadoOrdenado() { // Llamada al metodo para listar en orden alfabetico.
		System.out.println(agenda.listadoAZ());
	}

	private void buscaNombre() { // Llamada al metodo para buscar por nombre.
		String nombre;
		System.out.println("Nombre: ");
		nombre=teclado.nextLine();
		System.out.println(
				(agenda.buscaNombre(nombre)!=null)?agenda.buscaNombre(nombre):
				"No existe ningun contacto con ese nombre.");
	}

	private void anadirTelefono() { // Llamada al metodo para anadir telefono. 
		String nombre, telefono, tipo;
		do {
			System.out.println("Nombre del contacto: ");
			nombre=teclado.nextLine();
		} while (agenda.buscaNombre(nombre)==null);
		do {
			System.out.println("Telefono: ");
			telefono=teclado.nextLine();
		} while (!Telefono.telefonoValido(telefono));
		System.out.println("Tipo: ");
		tipo=teclado.nextLine();
		agenda.addTelefono(nombre, telefono, tipo); // Entrada de parametros.
		transaccion();
	}

	private void borrarTelefono() { // Llamada al metodo para borrar telefono. 
		String nombre, telefono;
		do {
			System.out.println("Nombre del contacto: ");
			nombre=teclado.nextLine();
		} while (agenda.buscaNombre(nombre)==null);
		do {
			System.out.println("Telefono: ");
			telefono=teclado.nextLine();
		} while (!Telefono.telefonoValido(telefono));
		agenda.delTelefono(nombre, telefono); // Entrada de parametros.
		transaccion();
	}

	private void buscaTelefono() {
		String telefono;
		System.out.println("Telefono: ");
		telefono=teclado.nextLine();
		System.out.println(agenda.buscaTelefono(telefono));
	}

	// Plasma la informacion de todo el programa en el fichero.
	// Siempre que se produzca un cambio en la agenda, se guardara (escribira) el contenido de la 
	// agenda en el mismo fichero que se lee al inicio del programa. 
	private void transaccion() {
		try {
			out=new PrintStream(new FileOutputStream(fichero, false));
			out.print(agenda);
		}catch (FileNotFoundException e) {}
		finally {
			if (out!=null) 
				out.close();
		}
	}
	
	private void asignaSexo() {
		Random r=new Random();
		for (Contacto x : agenda.contactos) {
			int opcion=r.nextInt(2);
			if (opcion<1)
				x.sexo=new Mujer(r.nextInt());
			if (opcion>=1)
				x.sexo=new Hombre(r.nextInt(2)==1);
		}
	}

} // Fin de la clase MenuAgenda.
