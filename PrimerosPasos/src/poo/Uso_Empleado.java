package poo;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {

		Jefatura jefe_RRHH=new Jefatura("Juan", 55000, 2006, 9, 25);

		jefe_RRHH.setIncentivo(2570);

		Empleado[] misEmpleados=new Empleado[6];

		misEmpleados[0]=new Empleado("Ana", 30000, 2000, 07, 07);

		misEmpleados[1]=new Empleado("Carlos", 50000, 1995, 06, 15);

		misEmpleados[2]=new Empleado("Paco", 25000, 2005, 9, 25);

		misEmpleados[3]=new Empleado("Antonio", 47500, 2009, 11, 9);

		misEmpleados[4]=jefe_RRHH; // Polimorfismo en accion. Principio de sustitucion

		misEmpleados[5]=new Jefatura("Maria", 95000, 1999, 5, 26);

		/*
		double num1=7.5;
		int num2=(int)num1;
		 */

		Jefatura jefa_Finanzas=(Jefatura)misEmpleados[5]; // Casting de Objetos

		jefa_Finanzas.setIncentivo(55000);

		//Jefatura jefe_compras=(Jefatura)misEmpleados[1]; // Da un error. Un empleado no siempre es un Jefe

		System.out.println(jefa_Finanzas.tomar_decisiones("\tDar mas dias de vacaciones a los empleados."));

		System.out.println("\tEl Jefe "+jefa_Finanzas.getNombre()+" tiene un bonus de: "+
				jefa_Finanzas.establece_bonus(500));

		System.out.println("\t"+misEmpleados[3].getNombre()+" tiene un bonus de: "+misEmpleados[3].establece_bonus(200));

		for (Empleado e : misEmpleados) {

			e.subeSueldo(5);

		} // Bucle for-each

		Arrays.sort(misEmpleados); // Ordena todos los objetos del array misEmpleados
		// Necesita el metodo compareTo de la Interfaz Comparable

		for (Empleado e : misEmpleados) {

			System.out.println("\tNombre: "+e.getNombre()+". Sueldo: "+
					+e.getSueldo()+". Fecha de Alta: "
					+e.getFechaContrato()+".");

		} // Bucle for-each

	}

}

// -----------------------------------------------------------------------------------------

class Empleado implements Comparable, Trabajadores {

	public Empleado(String nom, double sue, int anno, int mes, int dia) {

		nombre=nom;

		sueldo=sue;

		GregorianCalendar calendario=new GregorianCalendar(anno, mes-1, dia);

		altaContrato=calendario.getTime();

		++IdSiguiente;

		Id=IdSiguiente;

	}

	public double establece_bonus(double gratificacion) {

		return Trabajadores.bonus_base+gratificacion;

	}

	public Empleado(String nom) {

		this(nom, 30000, 2000, 01, 01);

	}

	public String getNombre() { // GETTER
		return nombre+" Id: "+Id;
	}

	public /*final*/ double getSueldo() { // GETTER
		return sueldo;
	}

	public Date getFechaContrato() { // GETTER
		return altaContrato;
	}

	public void subeSueldo(double porcentaje) { // SETTER
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}

	public int compareTo(Object miObjeto) { // Sobrescribir el metodo compareTo
		Empleado otroEmpleado=(Empleado)miObjeto;
		if (this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		if (this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}

	private String nombre;

	private double sueldo;

	private Date altaContrato;

	private static int IdSiguiente;

	private int Id;

}

// -----------------------------------------------------------------------------------------

/*final*/ class Jefatura extends Empleado implements Jefes { // final detiene la cadena de la herencia

	public Jefatura(String nom, double sue, int anno, int mes, int dia) {

		super(nom, sue, anno, mes, dia);

	}

	public String tomar_decisiones(String decision) { // Metodo de la interfaz

		return "\tUn miembro de la direccion ha tomado la decision de "+decision;

	}

	public double establece_bonus(double gratificacion) {

		double prima=2000;

		return Trabajadores.bonus_base+gratificacion+prima;

	}

	public void setIncentivo(double b) { // SETTER
		incentivo=b;
	}

	public double getSueldo() { // GETTER // Tiene diferente comportamiento
		//double sueldoJefe=getSueldo();
		double sueldoJefe=super.getSueldo();
		return sueldoJefe+incentivo;
	}

	private double incentivo;

}

// -----------------------------------------------------------------------------------------

/*
class Director extends Jefatura {

	public Director(String nom, double sue, int anno, int mes, int dia) {

		super(nom, sue, anno, mes, dia);

	}

}
 */

