package ordinaria1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
import java.util.Collection;
import java.util.Scanner;

public class Insertar {

	String fichero;
	Scanner s = null;
	boolean add = true;

	public Insertar ( String archivo ) {
		fichero = archivo;

		try {
			s = new Scanner(
					new BufferedReader(
							new FileReader(fichero)));
		} catch (FileNotFoundException e1) {
			add = false;
		}
	}


	// FINALIZA
	public void finalizar ( ) {
		if ( s != null )
			s.close();
		s = null;
	}

	//AÑADE VEHICULOS
	public void annadirVehiculo(Vehiculo vh) throws IOException {

		if ( s != null )
			s.close();
		s = null;
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(
					new FileOutputStream(fichero, add));

			oos.writeObject(vh);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			oos.close();
		}
	}

	// INSERTA LOS VEHICULOS DEL FICHERO AL ARRAYLIST
	public void rInsertarVehiculos(ArrayList <Vehiculo> v) {
		try
		{
			FileInputStream fis = new FileInputStream(fichero);
			ObjectInputStream ois = new ObjectInputStream(fis);

			v.add((Vehiculo) ois.readObject());

			ois.close();
			fis.close();
		} 
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
			return;
		} 
		catch (ClassNotFoundException c) 
		{
			System.out.println("Class not found");
			c.printStackTrace();
			return;
		}
	}
	//BORRAR
	public void borrarTodo() throws IOException{
		if ( s != null )
			s.close();
		s = null;
		Writer fw = null;

		try {
			fw = new FileWriter(fichero, false);
			fw.write("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fw.close();
		}
	}
	//FICHERO VACIO
	public boolean tieneSiguiente() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fichero));     
		return br.readLine() == null;

	}
}
