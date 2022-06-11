package eva03.ejercicio04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Borrar {
	String tempo="passwd_temp.txt";
	String fichero;
	Scanner s = null;
	Scanner re = null;
	boolean add = true;
	
	public Borrar ( String archivo ) {
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
	public void borrar(String nombre,String passwd) {
		String n="";
		String p="";
		PrintStream ps = null;
		try {
			try {
				re= new Scanner(
						new BufferedReader(
								new FileReader(fichero)));
			} catch (FileNotFoundException e1) {
			}
			try {
				ps = new PrintStream(
						new FileOutputStream(tempo));
			} catch (FileNotFoundException e){}
			while(re.hasNext()) {
				n=re.next();
				p=re.next();
				if(!(n).equals(nombre)&&!(p).equals(passwd)) {
				String salida=n+" "+p+"\r";
				ps.print(salida);
				}
			}
			
		} finally {
			ps.close();
			s.close();
			re.close();
		}
		try {
			s = new Scanner(
					new BufferedReader(
							new FileReader(tempo)));
			ps = new PrintStream(
					new FileOutputStream(fichero,false));
	
		} catch (FileNotFoundException e) {}
			while(s.hasNext()) {
				ps.println(s.next()+" "+s.next());
			}
			
	}
	
}