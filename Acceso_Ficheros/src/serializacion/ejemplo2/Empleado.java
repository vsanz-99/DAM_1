package serializacion.ejemplo2;
import serializacion.ejemplo1.Persona;

@SuppressWarnings("serial")
public class Empleado extends Persona {

	private double sueldo;

	public Empleado() {}

	public Empleado(String nif, String nombre, int edad, double sueldo) {                                         
		super(nif, nombre, edad);
		this.sueldo=sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {                                                                        
		this.sueldo=sueldo;
	}

}
