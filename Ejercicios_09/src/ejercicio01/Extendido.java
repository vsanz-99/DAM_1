package ejercicio01;
import java.util.*;

public class Extendido extends Pila {

	private int[] pila=new int[MAXSIZE]; // Vector que almacena la pila

	private int cima=0; // Ultima posicion usada en la pila: elementos en la pila

	@Override
	public void push(int x) { // Si la pila no esta llena

		if (cima<MAXSIZE) {

			pila[cima++]=x;

		} else { 

			throw new IndexOutOfBoundsException("\tPila llena :("); // Devuelve el error si esta llena (lanza la excepcion)

		}

	}

	@Override
	public int pop() { // Si la pila no esta vacia

		if (cima>0) {

			return pila[--cima];

		} throw new IndexOutOfBoundsException("\tPila vacia :("); // Devuelve el error si esta vacia (lanza la excepcion)

	}

	@Override
	public int size() {

		return cima; // Devuelve la cima 

	}

}
