package eva03.ejercicio04;

import java.util.Scanner;

public class Menu {

	// Nombre del archivo de trabajo
	String fichero;
	
	// Entrada de datos
	Scanner in = new Scanner(System.in);
	
	public Menu ( String archivo ) {
		fichero = archivo;
		boolean fin;
		do {
			fin = trabajo();
		} while ( ! fin );
	}
	
	private void imprimir ( ) {
		System.out.println("Elija una opci�n");
		System.out.println("1.- Insertar usuario, clave\n"
				+ "2.- Borrar usuarios\n"
				+ "3.- Modificar claves de un usuario\n"
				+ "4.- Validar si la clave de un usuario es correcta");
		System.out.println("5.- Terminar");
		
	}
	private boolean trabajo ( ) {
		int opcion;
		do {
			imprimir();
			try {
				opcion = in.nextInt();
			} catch ( Exception e ) {
				System.out.println("Debe introducir un n�mero entre 1 y 5");
				opcion = 0;
				in.next();
			}
		} while ( opcion < 1 || opcion > 5 );
		if ( opcion == 5 )
			return true;
		switch ( opcion ) {
		case 1:
			insertar();
			break;
		case 2:
			borrar();
			break;
		case 3:
			modificar();
			break;
		case 4:
			validar();
			break;
		}
		return false;
	}
	
	private void insertar ( ) {
		Insertar i = new Insertar(fichero);
		String nombre;

		System.out.println("introduzca un nombre de usaurio");
		try {
			nombre = in.next();
		} catch ( Exception e ) {
			System.out.println("Debe introducir un nombre v�lido");
			in.next();
			i.finalizar();
			return;
		}
		
		String passwd;
		if ( i.comprobarUsuario(nombre) ) {
			i.finalizar();
			System.out.println("Ese usuario ya existe");
		} else {
			System.out.println("Introduzca la contrase�a");
			try {
				passwd = in.next();
				i.annadirUsuario(nombre, passwd);
			} catch ( Exception e ) {
				System.out.println("Debe introducir una contrase�a v�lido");
				in.next();
				return;
			} finally {
				i.finalizar();
			}
		}
	}
	private void borrar() {
		Borrar borra = new Borrar(fichero);
		System.out.println("escribe el nombr edel usuario que deseas borrar:");
		String nombre=in.next();
		
		if(borra.comprobarUsuario(nombre)) {
			System.out.println("escribe la contrase�a:");
			String contrase�a=in.next();
			borra.borrar(nombre,contrase�a);
		}
	}
	private void modificar() {
		Modificar modifica = new Modificar(fichero);
		System.out.println("escribe el nombr edel usuario que deseas modificar:");
		String nombre=in.next();
		if(modifica.comprobarUsuario(nombre)) {
			System.out.println("escribe la contrase�a:");
			String contrase�a=in.next();
			System.out.println("escribe la nueva contrase�a:");
			String ncontrase�a=in.next();
			modifica.modificar(nombre,contrase�a,ncontrase�a);
		}
	}
	private void validar() {
		Validar valida = new Validar(fichero);
		System.out.println("escribe el nombr edel usuario que deseas modificar:");
		String nombre=in.next();
		if(valida.comprobarUsuario(nombre)) {
			System.out.println("escribe la contrase�a:");
			String contrase�a=in.next();
			if(valida.validar(nombre, contrase�a)==true)System.out.println("contrase�a correcta");
			else System.out.println("contrase�a incorrecta");
		
	}}
}