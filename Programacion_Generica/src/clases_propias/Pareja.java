package clases_propias;

/*Clase generica*/ // Se adapta al objeto de tipo String
public class Pareja<T> { // T, U, K (por convencion)

	// Los metodos genericos pueden estar construidos dentro de clases genericas
	// o clases ordinarias
	public Pareja() {

		primero=null;

	}

	/*SETTER*/
	public void setPrimero(T nuevoValor) { // Va a recibir un objeto generico

		primero=nuevoValor;

	}
	
	public static void imprimirTrabajador(Pareja<? extends Empleado> p) { // Para todas las subclases pertenecientes a Empleado
		
		// Tipo comodin <? extends Superclase>
		Empleado primero=p.getPrimero();
		
		System.out.println(primero);
		
	}

	/*GETTER*/
	public T getPrimero() {

		return primero;

	}

	private T primero;

}
