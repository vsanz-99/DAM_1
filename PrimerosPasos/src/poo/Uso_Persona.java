package poo;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {

		Persona[] lasPersonas=new Persona[2];
		
		lasPersonas[0]=new Empleado2("Luis Conde", 50000, 2009, 02, 25);
		
		lasPersonas[1]=new Alumno("Ana Lopez", "Biologia");
		
		for (Persona p : lasPersonas) {
			
			System.out.println(p.getNombre()+" => "+p.getDescripcion());
			
		}
		
	}

}

abstract class Persona { // Clase Abstracta porque tiene uno o mas metodos abstractos
	// Clase poco especializada y poco funcional
	public Persona(String nom) {

		nombre=nom;

	}

	public String getNombre() {

		return nombre;

	}

	public abstract String getDescripcion(); // Metodo abstracto
	// Solo marca el disenno
	private String nombre;

}

class Empleado2 extends Persona { // Se debe seguir el patron marcado por la Clase Abstracta Persona

	public Empleado2(String nom, double sue, int anno, int mes, int dia) {

		super(nom);

		sueldo=sue;

		GregorianCalendar calendario=new GregorianCalendar(anno, mes-1, dia);

		altaContrato=calendario.getTime();

		++IdSiguiente;

		Id=IdSiguiente;

	}

	public String getDescripcion() {
		return "\tEste empleado tiene un Id= "+Id+" con un sueldo= "+sueldo+".";
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

	private double sueldo;

	private Date altaContrato;

	private static int IdSiguiente;

	private int Id;

}

class Alumno extends Persona {

	public Alumno(String nom, String car) {

		super(nom);

		carrera=car;

	}
	
	public String getDescripcion() {
		return "\tEste alumno esta estudiando la carrera de "+carrera+".";
	} // Devuelven cosas diferentes

	private String carrera;

}

