package serializacion.ejemplo6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import serializacion.ejemplo3.Alumno;

public class Serial6 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		ObjectInputStream entrada=null;
		Alumno a;
		try {
			fis=new FileInputStream("H:/eclipse_myworkspace/personas.dat");
			entrada=new ObjectInputStream(fis);
			a=(Alumno)entrada.readObject();
			System.out.println(a.getNif()+" "+a.getNombre()+" "+a.getEdad()                               
			+" "+a.getFechaMatricula().getDia()+"-"
			+a.getFechaMatricula().getMes()+"-"
			+a.getFechaMatricula().getAnio());
			a=(Alumno)entrada.readObject();
			System.out.println(a.getNif()+" "+a.getNombre()+" "+a.getEdad()                               
			+" "+a.getFechaMatricula().getDia()+"-"
			+a.getFechaMatricula().getMes()+"-"
			+a.getFechaMatricula().getAnio());
			a=(Alumno)entrada.readObject();
			System.out.println(a.getNif()+" "+a.getNombre()+" "+a.getEdad()                               
			+" "+a.getFechaMatricula().getDia()+"-"
			+a.getFechaMatricula().getMes()+"-"
			+a.getFechaMatricula().getAnio());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis!=null) 
					fis.close();
				if (entrada!=null)
					entrada.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
