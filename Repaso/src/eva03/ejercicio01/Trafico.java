package eva03.ejercicio01;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p><i>Archivo: Trafico.java</i></p>
 * <p><b>Ejercicio 01</b>.</p>
 * @since 10/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Trafico {
	
	ArrayList<Vehiculo> coches=new ArrayList<Vehiculo>();
	boolean add=true;
	Scanner in=null;
	PrintStream out=null;
	String fichero;
	String tmp="temp.txt";
	
	public Trafico(String fichero) {
		this.fichero=fichero;
		if (abrirFichero())
			System.out.println("\tTodo funciona correctamente.");
		for (Vehiculo v : coches) {
			System.out.println(v);
		}
	}

	// Devuelve false si NO existe el fichero y true si SI existe, 
	// despues de guardar todos los vehiculos.
	public boolean abrirFichero() {
		try {
			in=new Scanner(
					new BufferedReader(
							new FileReader(fichero)));
		} catch (FileNotFoundException e) {
			add=false;
		}
		if (add) {
			while (in.hasNextLine()) {
				if (!coches.add(
						new Vehiculo(in.nextLine())))
					System.out.println("\tNo se escribe en el fichero.");
			}
		} else {
			System.out.println("\tNo hay vehiculos registrados.");
		}
		return add;
	}

	public void anadirVehiculo(String matricula, String marca, String modelo, String propietario, String anio)  {
		coches.add(
				new Vehiculo(matricula, marca, modelo, propietario, anio));
	}

	public void anadirSancion(String matricula, String fecha, String motivo, String importe) {
		for (Vehiculo x : coches) {
			if (x.matricula.equals(matricula))
				x.multas.add(
						new Sancion(fecha, motivo, importe));
		}
	}

	public void confirmar() {
		if (in!=null)
			in.close();
		if (out!=null)
			out.close();
		try {
			out=new PrintStream(
					new FileOutputStream(fichero, false));
		} catch (FileNotFoundException e) {
			System.out.println("\tFichero NO encontrado: "+e.getMessage());
			e.printStackTrace();
		}
		for(Vehiculo x : coches) {
			out.println(x);
		}
		out.close();
	}

	public void eliminarVehiculo(String matricula) {
		for(Vehiculo x : coches) {
			if (x.matricula==matricula && x.multas.isEmpty())
				coches.remove(x);
			if (x.matricula==matricula && !x.multas.isEmpty())
				System.out.println(x.multas.size());
		}
	}

	public void consultaSanciones(String matricula) {
		int cont=0;
		for (Vehiculo x : coches) {
			if (x.matricula.equals(matricula)) {
				++cont;
				if (!x.multas.isEmpty()) {
					for(Sancion y : x.multas) {
						System.out.println(y.fecha+"-"+y.importe+"-"+y.motivo);
					}
				} else {
					System.out.println("\tNo tiene multas.");
				}
			}
		}
		if (cont==0) 
			System.out.println("\t NO existe ningun vehiculo con esta matricula.");
	}

	public void quitarSanciones(String matricula) {
		for (Vehiculo x : coches) {
			if (x.matricula.equals(matricula) && !x.multas.isEmpty()) {
				System.out.println("\tEliminando sanciones ...");
				x.multas.clear();
			}
		}
	}

	public void vehiculosCantidad(int i) {
		for (Vehiculo x : coches) {
			if (x.multas.size()>=i) 
				System.out.println(x);
		}
	}

}
