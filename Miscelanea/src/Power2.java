import java.util.Scanner;

/**
 * <p><i>Archivo: Power2.java</i></p>
 * @since 26/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Power2 {

	public static void main(String[] args) {

		int n, base;

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		System.out.println("\tIngrese la base: ");
		base=teclado.nextInt();

		System.out.println("\tIngrese el exponente: ");
		n=teclado.nextInt();

		int resultado=(int)Math.pow(base, n);

		System.out.println("\t"+base+" elevado a la "+n+" es igual a "+resultado+".");

	}

}
