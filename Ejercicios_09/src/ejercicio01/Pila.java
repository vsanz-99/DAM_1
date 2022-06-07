package ejercicio01;

/**
 * <p><i>Archivo: Pila.java</i></p>
 * </p><b>Ejercicio 01</b>.</p>
 * @since 07/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public abstract class Pila {
	// Numero maximo de elementos que se pueden insertar en la pila.
	public final int MAXSIZE=100; 
	// Metodo para insertar.							  
	public abstract void push(int n);
	// Metodo para sacar
	public abstract int pop();
	// Metodo para conocer el numero de elementos apilados.
	public abstract int size();
}
