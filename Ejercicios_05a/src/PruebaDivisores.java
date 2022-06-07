import java.util.Scanner;

/**
 * <p><i>Archivo: PruebaDivisores.java</i></p>
 * <p><b>Ejercicio 02</b>. Leer dos numeros positivos <b>P</b> y <b>Q</b> y decir 
 * cual de los dos tiene mas divisores con un mensaje. <b>Este programa debe llamar 
 * a un metodo que calcule los divisores de un numero, lo aplique para P y para Q y luego 
 * compare y decida</b>.</p>
 * @since 06/06/2022 
 * @author Victor Sanz*/

public class PruebaDivisores {

	public static void main(String[] args) {
		int P=0; int Q=0;
		Scanner teclado=new Scanner(System.in);
		do {
			System.out.println("\tIntroduce un numero entero (P) >= 0: ");
			P=teclado.nextInt();
		} while (P<=0);
		do {
			System.out.println("\tIntroduce un numero entero (Q) >= 0: ");
			Q=teclado.nextInt();
		} while (Q<=0);
		if (calculaDivisores(P)>calculaDivisores(Q)) {
			System.out.println("\tP tiene mas divisores que Q.");
		} else if (calculaDivisores(P)<calculaDivisores(Q)) {
			System.out.println("\tQ tiene mas divisores que P.");
		} else {
			System.out.println("\tP es igual a Q.");
		}
		System.out.println("\tFin del programa.");
		teclado.close();
	}

	public static int calculaDivisores(int numero) {
		int numDivisores=0;
		for (int i=1; i<=numero; i++) {
			if (numero%i==0) 
				numDivisores++;
		}
		return numDivisores;
	}

}
