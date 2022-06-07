import java.util.Scanner;

/**
 * <p><i>Archivo: PruebaRangoPrimos.java</i></p>
 * <p><b>Ejercicio 04</b>. Introducir un numero <b>N</b> positivo por teclado 
 * e imprimir una lista de todos los numeros primos hasta dicho numero incluido.
 * <b>Hacer este programa usando el metodo primo que ya teneis construido</b>.</p>
 * @since 06/06/2022 
 * @author Victor Sanz*/

public class PruebaRangoPrimos {

	public static void main(String[] args) {
		int N=0;
		Scanner teclado=new Scanner(System.in);
		do {
			System.out.println("\tIntroduce un numero entero >= 0: ");
			N=teclado.nextInt();
		} while (N<=0);
		System.out.println("Imprimiendo lista de numeros primos ...\n");
		for (int i=0; i<=N; i++) {
			if (primo(i))
				System.out.print(i+" ");
		}
		System.out.println("\tFin del programa.");
		teclado.close();
	}

	public static boolean primo(int numero) {
		// El 0, 1 y 4 no son primos.
		if (numero==0 || numero==1 || numero==4) {
			return false;
		}
		for (int x=2; x<numero/2; x++) {
			// Si es divisible por cualquiera de estos numeros, 
			// no es primo.
			if (numero%x==0) 
				return false;
		}
		// Si no se pudo dividir por ninguno de los de arriba, si es primo.
		return true;
	}

}
