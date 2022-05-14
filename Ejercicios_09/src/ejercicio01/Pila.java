package ejercicio01;

public abstract class Pila {

	public final int MAXSIZE=100; // Numero maximo de elementos que se pueden
								  // insertar en la pila
	public abstract void push(int x); // Metodo para insertar
	
	public abstract int pop(); // Metodo para sacar
	
	public abstract int size(); // Metodo para conocer el numero de elementos apilados
	
}
