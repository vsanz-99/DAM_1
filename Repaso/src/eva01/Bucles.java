package eva01;

/**
 * <p><i>Archivo: Bucles.java</i></p>
 * <p><b>Ejercicio 12</b>. Muestra los números del 320 al 160, contando de 20 en 20 hacia atras utilizando un bucle for, 
 * un bucle while y un bucle do-while.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Bucles {

	public static void main(String[] args) {

		// Bucle for
		System.out.print("FOR [ ");
		for (int i=320; i>=160; i--) {
			if (i%20==0) {
				System.out.print(i+" ");
			}
		}
		System.out.print("]\n");

		// Bucle while
		int j=320;
		System.out.print("WHILE [ ");
		while (j>=160) {
			if (j%20==0) {
				System.out.print(j+" ");
			}
			j--;
		}
		System.out.print("]\n");

		// Bucle do-while
		int m=320;
		System.out.print("DO-WHILE [ ");
		do {
			if (m%20==0) {
				System.out.print(m+" ");
			}
			m--;
		} while (m>=160);
		System.out.print("]");

	}

}
