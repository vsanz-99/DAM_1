package eva03.ejercicio02;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p><i>Archivo: AgenciaViajes.java</i></p>
 * <p><b>Ejercicio 02</b>. Gestionar el control de viajantes.</p>
 * @since 27/05/2022
 * @version 1.0 
 * @author Victor Sanz*/

public class AgenciaViajes {

	static ArrayList<Viajante> viajantes=new ArrayList<Viajante>();
	String fichero; Scanner in=null;
	boolean add=true; PrintStream out=null;
	String fichero_nuevo="ventas.txt";
	String fichero_viejo="historico.txt";
	
	public AgenciaViajes(String fichero) {
		this.fichero=fichero;
		if (abrirFichero())
			System.out.println("Todo funciona correctamente.");
		for (Viajante v : viajantes) {
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
						new Viajante(in.nextLine())))
					System.out.println("No se escribe en el fichero.");
			}
		} else {
			System.out.println("\tNo hay viajantes registrados.");
		}
		return add;
	}
	
	public void anadirViajante(String dni, String nombre, double distancia_km, int antiguedad, int n_ventas) {
		viajantes.add(new 
				Viajante(dni, nombre, distancia_km, antiguedad, n_ventas));
	}
	
	public void eliminarV(String dni) {
		for (Viajante v : viajantes) {
			if (v.dni==dni) {
				viajantes.remove(v);
			}
		}
	}
	
	public static void listarViajantes() {
		for (Viajante v : viajantes) {
			System.out.println(v);
		}
	}

	public static void iniV() {
		
	}
	
	public void incrementarKm(String dni, double distancia_km) {
		
	}
	 
	public void anadirVenta(String dni, String fecha, double importe, String cliente, String cobrada) {
		
	}
	
	public void cobrarV(String dni, String fecha, String cliente) {
		
	}
	
	public static void listarVentas() {
		
	} 
	
}
