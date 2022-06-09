package ejercicio06;

/**
 * <p><i>Archivo: Empleado.java</i></p>
 * <p><b>Ejercicio 06</b>.</p>
 * @since 09/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Empleado {

	private String nombre;
	private double sueldo;
	private String casado;
	private char turno;

	Empleado() {}

	Empleado(String nombre, double sueldo, String casado, char turno) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.casado=casado;
		this.turno=turno;
	}

	@Override
	public String toString() {
		return "\t[Nombre: "+nombre+" | Sueldo: "+sueldo+" | Casado: "+casado+" | Turno: "+turno+"]";
	}

}
