package ejercicio04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Validar {

	String fichero;
	Scanner s = null;
	Scanner re = null;
	boolean add = true;
	Scanner teclado = new Scanner(System.in);
	public Validar ( String archivo ) {
		fichero = archivo;

		//System.out.println("Abro fichero: " + fichero);
		try {
			s = new Scanner(
					new BufferedReader(
							new FileReader(fichero)));
		} catch (FileNotFoundException e1) {
			add = false;
			System.out.println("fichero no encontrado");
		}
	}
	public boolean comprobarUsuario ( String nombre ) {
		if ( s == null )
			return false;
		boolean encontrado = false;
		// System.out.println("Compruebo nombre de usuario en archivo");
		while ( ! encontrado && s.hasNext() ) {
			String usuario = s.next();
			if ( nombre.equals(usuario) )
				return true;
			s.nextLine();
		}
		return false;
	}
	public boolean validar(String nombre, String passwd) {
		try {
			re= new Scanner(
					new BufferedReader(
							new FileReader(fichero)));
		} catch (FileNotFoundException e1) {
		}
		while(re.hasNext()) {
			String n=re.next();
			String p=re.next();
			if((n).equals(nombre)&&(p).equals(passwd)) {
				return true;
			}}
		return false;

	}
}