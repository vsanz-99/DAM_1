/**
 * <p><i>Archivo: Fibonacci.java</i></p>
 * @since 26/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Fibonacci {

	public int tamanio;
	public String nombre;

	public Fibonacci(String nombre, int tamanio) {
		this.nombre=nombre;
		this.tamanio=tamanio;
	}

	Fibonacci() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio=tamanio;
	}

	public void mostrarSerie() {
		System.out.println(this.nombre+" de tamanio "+this.tamanio+":");
		for (int i=0; i<tamanio; i++) {
			System.out.print(fibonacci(i)+" ");
		}
		System.out.println();
	}

	int fibonacci(int n) {
		if (n>1) {
			return fibonacci(n-1)+fibonacci(n-2);
		} else if (n==1) {
			return 1;
		} else if (n==0) {
			return 0;
		} else {
			System.out.println("\tDebes ingresar un tamanio mayor o igual a 1.");
			return -1;
		}
	}

}
