import java.util.Scanner;

/**
 * <p><i>Archivo: PruebaFactorial.java</i></p>
 * <p><b>Ejercicio 03</b>. Calcular el factorial de un numero 
 * <b>N</b>. <b>La funcion a construir aqui se llamara factorial. 
 * El metodo main solo debe leer un valor y devolver su factorial 
 * (version iterativa)</b>.</p>
 * @since 06/06/2022 
 * @author Victor Sanz*/

public class PruebaFactorial {

	public static void main(String[] args) {
		int N=0;
		Scanner teclado=new Scanner(System.in);
		do {
			System.out.println("\tIntroduce un numero entero >= 0: ");
			N=teclado.nextInt();
		} while (N<=0);
		System.out.println("\tEl factorial de "+N+" es: "+factorial(N));
		System.out.println("\tFin del programa.");
		teclado.close();
	}

	public static long factorial(int numero) {
		long factorial=1;
		for (int i=1; i<=numero; i++) {
			factorial*=i;
		}
		return factorial;
	}
}
