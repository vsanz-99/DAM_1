package eva03.ejercicio01.version2;
import java.io.Serializable;
import java.util.ArrayList;

/**
* <p><i>Archivo: Vehiculo.java</i></p>
* <p><b>Ejercicio 01</b>. Gestionar las multas de los 
* vehiculos de un municipio. <b>Acabado</b>.</p>
* @since 28/05/2022
* @version 1.0
* @author Victor Sanz*/

public class Vehiculo implements Serializable {
	
	private String matricula;
	private String marca;
	private String modelo;
	private String propietario;
	private int aMatricula;
	ArrayList<Sancion> snc=new ArrayList<Sancion>();
	
	public Vehiculo(String matricula, String marca, String modelo, String propietario, 
			int aMatricula) {
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
		this.propietario=propietario;
		this.aMatricula=aMatricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula=matricula;
	}
	
	public void ponerSancion(String fecha, String motivo, int importe) {
		Sancion sancion=new Sancion(fecha, motivo, importe);
		snc.add(sancion);
	}
	
	public void mostrarSanciones() {
		for (Sancion s : snc) {
			System.out.println(s.imprimirTodo());
		}
	}
	
	public void eliminarSanciones() {
		snc.removeAll(snc);
	}
	
	public boolean haySanciones() {
		return snc.isEmpty();
	}
	
	public int totalSanciones() {
		int total=0;
		for (Sancion s : snc) {
			total=s.getImporte();
		}
		return total;
	}
	
	public String getAll() {
		return matricula+" "+marca+" "+modelo+" "+propietario;
	}
	
}
