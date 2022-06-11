import java.util.Scanner;

/**
 * <p><i>Archivo: Problema_02</i></p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Problema_02 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int contador, random, num;
		contador=random=num=0;
		System.out.println("JUEGO DE ADIVINANZAS.");
		System.out.println("=====================");
		System.out.println("Solo tienes 7 intentos");
		System.out.println("\n\tGenerando numero aleatorio entre 0 y 50 ...");
		random=(int)(Math.random()*50)+1;
		do {
			System.out.println("\n\tIntroduce el numero a comprobar: ");
			num=teclado.nextInt();
			if (num==random) {
				System.out.println("\n\thas acertado.");
				contador=7;
			} else {
				if (num>random) {
					System.out.println("\n\tte pasas.");
				} else if (num<random) {
					System.out.println("\n\tno llegas.");
				}
				contador++;
			}
		} while (contador<7);
		teclado.close();
		System.out.println("\n\tEl numero correcto era "+random+".");
		System.out.println("\tFin del programa.");
	}

}
