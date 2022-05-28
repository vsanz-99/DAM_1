package eva03.ejercicio01.version2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p><i>Archivo: Inserta.java</i></p>
 * <p><b>Ejercicio 01</b>. Gestionar las multas de los 
 * vehiculos de un municipio. <b>Acabado</b>.</p>
 * @since 28/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Inserta {

	String fichero;
	Scanner s=null;
	boolean add=true;

	public Inserta(String fichero) {
		this.fichero=fichero;
		//System.out.println("Abro fichero: "+fichero);
		try {
			s=new Scanner(
					new BufferedReader(
							new FileReader(fichero)));
		} catch(FileNotFoundException e1) {
			add=false;
		}
	}

	public void finalizar() {
		if (s!=null)
			s.close();
		s=null;
	}

	public boolean comprobarVehiculo(String v) {
		if (s==null)
			return false;
		boolean encontrado=false;
		// System.out.println("Comprobando nombre del usuario en el fichero ...");
		while (!encontrado && s.hasNext()) {
			String vh=s.next();
			if (v.equals(vh))
				return true;
			s.nextLine();
		}
		return false;
	}

	public boolean comprobarVehiculoIdentificador(int v) {
		if (s==null )
			return false;
		boolean encontrado=false;
		// System.out.println("Comprobando nombre del usuario en el fichero ...");
		while (!encontrado && s.hasNext()) {
			String vh=s.next();
			if (v==vh.charAt(0)) 
				return true;
			s.nextLine();
		}
		return false;
	}

	public void borrarTodo() throws IOException {
		if (s!=null )
			s.close();
		s=null;
		Writer fw=null;
		try {
			fw=new FileWriter(fichero, false);
			fw.write("");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fw.close();
		}
	}

	public void anadirDatos(String v) {
		//System.out.println("Inserta usuario: "+nombre);
		if (s!=null )
			s.close();
		s=null;
		PrintStream ps=null;
		try {
			ps=new PrintStream(
					new FileOutputStream(fichero, add));
			ps.println(v);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			ps.close();
		}
	}

	public void anadirVehiculo(Vehiculo vh) {
		// System.out.println("Inserta usuario: "+nombre);
		if (s!=null)
			s.close();
		s=null;
		PrintStream ps=null;
		try {
			ps=new PrintStream(
					new FileOutputStream(fichero, add));
			ps.println(vh);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			ps.close();
		}
	}

	public void rInsertarDatos(ArrayList <String> v) {
		while (s.hasNext()){
			v.add(s.next());
		}
	}

}
