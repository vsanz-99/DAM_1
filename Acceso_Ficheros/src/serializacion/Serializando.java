package serializacion;
import java.util.*;
import java.io.*;

/**
 * <p>Prueba con ObjectOutputStream.</p>
 * <p>Errores de compilacion.</p> 
 * @author PC
 *
 */

/*Serializar objetos*/
public class Serializando {

	public static void main(String[] args) {
		Administrador jefe=new Administrador("Juan", 80000, 2005, 12, 15);
		jefe.setIncentivo(5000);
		// Objeto a serializar =>
		Empleado[] personal=new Empleado[3]; // Array de 3 elementos.
		personal[0]=jefe;
		personal[1]=new Empleado("Ana", 25000, 2008, 10, 1);
		personal[2]=new Empleado("Luis", 18000, 2012, 9, 15);
		try {
			// Flujo de datos externo (salida).
			/* ObjectOutputStream escribiendo_fichero=new ObjectOutputStream(
			 * 			new FileOutputStream("H:/eclipse_myworkspace/empleados.dat")); */
			// Llevar un objeto al exterior.
			//escribiendo_fichero.writeObject(personal);
			//escribiendo_fichero.close();
			// Flujo de datos interno (entrada).
			ObjectInputStream recuperando_fichero=new ObjectInputStream(
					new FileInputStream("H:/eclipse_myworkspace/empleados.dat"));
			Empleado[] personal_recuperado=(Empleado[])recuperando_fichero.readObject();
			recuperando_fichero.close();
			for (Empleado e : personal_recuperado) {
				System.out.println(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

// --------------------------------------------------------------------------------

class Empleado implements Serializable { 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1859525275143132405L;

	// Aquellos objetos pertenecientes a esta
	// clase son susceptibles de convertirse en bytes.
	// Add default serial version ID.
	// Add generated serial version ID ==> El compilador de java le asigna un valor automaticamente (20 bytes).
	//private static final long serialVersionUID = 2L; // Declara la constante de clase serialVersionUID.

	public Empleado(String n, double s, int anno, int mes, int dia) {
		nombre=n;
		sueldo=s;
		GregorianCalendar calendario=new GregorianCalendar(anno, mes-1, dia);
		fechaContrato=calendario.getTime();
	}

	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void subirSueldo(double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}

	@Override
	public String toString() { // Pertenece a la clase Object, toString--Object.
		return "El nombre es = "+nombre+", y su sueldo es = "+sueldo+", fecha de contrato = "+fechaContrato;
	} // Este metodo se utiliza para pasar a texto (verbalizar) que es lo que hace nuestra clase.

	private String nombre;
	private double sueldo;
	private Date fechaContrato;

}

// --------------------------------------------------------------------------------

class Administrador extends Empleado implements Serializable {

	/*
	private static final long serialVersionUID = 2L; // Se cambia la huella de forma manual.
	// Java detecta que no tiene la misma huella.
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1881056236380136510L;

	public Administrador(String n, double s, int anno, int mes, int dia) {
		super(n, s, anno, mes, dia);
		incentivo=0;
	}

	@Override
	public double getSueldo() {
		double sueldoBase=super.getSueldo();
		return sueldoBase+incentivo;
	}

	public void setIncentivo(double b) {
		incentivo=b;
	}

	@Override
	public String toString() {
		return super.toString()+" Incentivo="+incentivo;
	}

	private double incentivo;

}
