package eva03.ejercicio01.version1;
import java.util.ArrayList;

/**
 * <p><i>Archivo: Vehiculo.java</i></p>
 * <p><b>Ejercicio 01</b>. Gestionar las multas de los 
 * vehiculos de un municipio. <b>Sin acabar</b>.</p>
 * @since 27/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Vehiculo {

	String matricula, marca, modelo, propietario, anio;
	ArrayList<Sancion> multas=new ArrayList<Sancion>();

	public Vehiculo(String matricula, String marca, String modelo, 
			String propietario, String anio) {
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
		this.propietario=propietario;
		this.anio=anio;
	}

	public Vehiculo(String entrada) {
		sort(entrada);
	}

	@Override
	public String toString() {
		String salida=matricula+":"+marca+":"+modelo+":"+propietario+":"+anio+":";
		for (Sancion x : multas) {
			salida+=x;
		}
		return salida;
	}

	public void addSancion(String fecha, String motivo, String importe) {
		multas.add(
				new Sancion(fecha, motivo, importe));
	}

	public void sort(String entrada) {
		matricula=entrada.substring(0, entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1, entrada.length());
		marca=entrada.substring(0, entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1, entrada.length());
		modelo=entrada.substring(0, entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1, entrada.length());
		propietario=entrada.substring(0, entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1, entrada.length());
		anio=entrada.substring(0, entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":"), entrada.length());
		if (entrada.indexOf(";")>=0) {
			while (entrada.indexOf(";")<=entrada.lastIndexOf(";") && entrada.indexOf(";")>0) {
				multas.add(
						new Sancion(entrada.substring(0, entrada.indexOf(";")+1)));
				entrada=entrada.substring(entrada.indexOf(";")+1, entrada.length());
			}
		}
	}

	public static boolean valida(String matricula) {
		if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
			System.out.println("Matricula valida.");
			return true;
		} else {
			System.out.println("Matricula invalida.");
			return false;
		}      
	}

}
