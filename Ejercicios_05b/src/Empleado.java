/**
 * <p><i>Archivo: Empleado.java</i></p>
 * <p><b>Ejercicio 02</b>.</p>
 * @since 06/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Empleado {

	private String nombre;
	private int IdEmpleado;
	private static int IdSiguiente;

	public Empleado(String nombre) {
		this.leerDatos(nombre);
		++IdSiguiente;
		IdEmpleado=IdSiguiente;
	}

	public String getNombre() {
		return nombre;
	}

	public void leerDatos(String nombre) {
		this.nombre=nombre;
	}

	public int getIdEmpleado() {
		return IdEmpleado;
	}

	public String verDatos() {
		return "\t[ Nombre: "+nombre+" | ID: "+IdEmpleado+" ]";
	}

}
