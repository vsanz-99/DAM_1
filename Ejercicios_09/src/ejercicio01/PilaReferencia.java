package ejercicio01;

/**
 * <p><i>Archivo: PilaReferencia.java</i></p>
 * </p><b>Ejercicio 01</b>.</p>
 * @since 07/06/2022
 * @version 1.0
 * @author Victor Sanz*/
 
public class PilaReferencia extends Pila {

	class ElementoPila {
		int elto; // Numero de elementos.
		ElementoPila sig;
		ElementoPila(int n) {
			elto=n;
			sig=null;
		}
	}
	
	ElementoPila cima=null; // Vector que almacena la pila.

	int tam=0; // Elementos almacenados en la pila.

	@Override
	public void push(int n) {
		if (tam==MAXSIZE) { 
			throw new IndexOutOfBoundsException("\tPila llena :("); // Devuelve el error si esta llena (lanza la excepcion).
		}
		ElementoPila aux=new ElementoPila(n);
		aux.sig=cima;
		cima=aux;
		tam++;
	}

	@Override
	public int pop() {
		if (cima!=null) {
			ElementoPila aux=cima; // Guarda el elemento.
			cima=cima.sig; // Apunta al siguiente elemento.
			tam--;
			return aux.elto; // Devuelve el valor anterior.
		} else {
			throw new IndexOutOfBoundsException("\tPila vacia :("); // Devuelve el error si esta vacia (lanza la excepcion).
		}
	}

	@Override
	public int size() {
		/**
		ElementoPila aux=cima;
		int size=0;
		while (aux!=null) {
			size++;
			aux=aux.sig;
		}
		return size;		 
		*/
		return tam;
	}

}
