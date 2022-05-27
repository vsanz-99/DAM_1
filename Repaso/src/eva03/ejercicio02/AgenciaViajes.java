package eva03.ejercicio02;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import eva03.ejercicio01.Vehiculo;

public class AgenciaViajes {

	ArrayList<Viajante> viajantes=new ArrayList<Viajante>();
	String fichero; Scanner in=null;
	boolean add=true; PrintStream out=null;
	String fichero_viejo="historico.txt";
	
	public AgenciaViajes(String fichero) {
		this.fichero=fichero;
		if (abrirFichero())
			System.out.println("Todo funciona correctamente.");
		for (Vehiculo v : viajantes) {
			System.out.println(v);
		}
	}
	
	/**
	 * @return false si NO existe el fichero y true si SI existe despues de guardar todos los vehiculos
	 */
	public boolean abrirFichero() {
		try {
			in=new Scanner(
					new BufferedReader(
							new FileReader(fichero)));
		} catch(FileNotFoundException e) {
			add=false;
		}
		if (add) {
			while (in.hasNextLine()) {
				if (!viajantes.add(
						new Vehiculo(in.nextLine())))
					System.out.println("No se escribe en el fichero.");
			}
		} else {
			System.out.println("\tNo hay ventas registradas.");
		}
		return add;
	}
	
	public void anadirViajante(String dni, String nombre, double distancia_km, int antiguedad, int n_ventas) {
		viajantes.add(new 
				Viajante(dni, nombre, distancia_km, antiguedad, n_ventas));
	}

}
