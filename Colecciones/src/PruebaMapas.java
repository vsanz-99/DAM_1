import java.util.*;

public class PruebaMapas {

	public static void main(String[] args) {
		HashMap<String, Empleado> personal=new HashMap<String, Empleado>(); // <Key, Value>
		personal.put("145", new Empleado("Juan"));
		personal.put("146", new Empleado("Ana"));
		personal.put("147", new Empleado("Antonio"));
		personal.put("148", new Empleado("Sandra"));
		System.out.println(personal);
		personal.remove("147"); // Eliminar.
		System.out.println("\n"+personal);
		personal.put("148", new Empleado("Natalia")); // Remplazar.
		System.out.println("\n"+personal);
		//System.out.println("\n"+personal.entrySet()); // Imprimir la coleccion. 
		System.out.println("");
		for (Map.Entry<String, Empleado> entrada : personal.entrySet()) {
			String clave=entrada.getKey();
			Empleado valor=entrada.getValue();
			System.out.println("Clave="+clave+", Valor="+valor);
		}
	}

}

class Empleado {

	public Empleado(String n) {
		nombre=n;
		sueldo=2000;
	}

	@Override
	public String toString() {	
		return "[Nombre="+nombre+", sueldo="+sueldo+"]";
	}

	private String nombre;
	private double sueldo;

}
