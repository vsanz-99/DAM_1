/**
 * <p><i>Archivo: PruebaFibonacci.java</i></p>
 * @since 26/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class PruebaFibonacci {

	public static void main(String[] args) {

		Fibonacci f1=new Fibonacci("fibonacci 1", 10);
		f1.mostrarSerie();

		Fibonacci f2=new Fibonacci();
		f2.setNombre("fibonacci 2");
		f2.setTamanio(10);
		f2.mostrarSerie();

	}

}
