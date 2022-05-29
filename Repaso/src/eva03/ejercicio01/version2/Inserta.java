package eva03.ejercicio01.version2;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
		try {
			s=new Scanner(
					new BufferedReader(
							new FileReader(fichero)));
		} catch(FileNotFoundException e1) {
			add=false;
		}
	}
	
	// Finaliza:
	public void finalizar() {
		if (s!=null)
			s.close();
		s=null;
	}
	
	// Comprueba si el vehiculo existe:
	public boolean comprobarVehiculo(String v) {
		if (s==null)
			return false;
		boolean encontrado=false;
		while (!encontrado && s.hasNext()) {
			String vh=s.next();
			if (v.equals(vh))
				return true;
			s.nextLine();
		}
		return false;
	}

	// Anade datos:
	public void anadirDatos(String v) {
		if (s!=null)
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
	
	// Anade vehiculos:
	public void anadirVehiculo(Vehiculo vh) throws IOException {
		if (s!=null)
			s.close();
		s=null;
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(
					new FileOutputStream(fichero, add));
			oos.writeObject(vh);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			oos.close();
		}
	}

	// Inserta los datos del fichero al ArrayList: 
	public void rInsertarDatos(ArrayList <String> v) {
		while (s.hasNext()) {
			v.add(s.nextLine());
		}
	}

	// Inserta los vehiculos del fichero al ArrayList:
	public void rInsertarVehiculos(ArrayList <Vehiculo> v) {
		try {
			FileInputStream fis=new FileInputStream(fichero);
			ObjectInputStream ois=new ObjectInputStream(fis);
			v.add((Vehiculo)ois.readObject());
			ois.close();
			fis.close();
		} catch(IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch(ClassNotFoundException c) {
			System.out.println("Class not found.");
			c.printStackTrace();
			return;
		}
	}
	
	// Borrar datos:
	public void borrarTodo() throws IOException {
		if (s!=null)
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
	
	// Fichero vacio:
	public boolean tieneSiguiente() throws IOException {
		BufferedReader br=new BufferedReader(
				new FileReader(fichero));     
		return br.readLine()==null;
	}

}
