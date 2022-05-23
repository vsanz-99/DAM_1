package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: AreaRectangulo.java</i></p>
 * <p><b>Ejercicio 03</b>. Escribe un programa que calcule el area de un rectangulo.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class AreaRectangulo {

	public static void main(String[] args) {

		double base=0.0; double altura=0.0; double area=0.0;

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		System.out.println("\tBienvenido al Programa para Calcular el Area de un Triangulo.");
		System.out.println("\t-------------------------------------------------------------");

		do {

			System.out.println("\tIntroduce la base en cm: ");
			base=teclado.nextDouble();

		} while (base<=0.0);

		do {

			System.out.println("\tIntroduce la altura en cm: ");
			altura=teclado.nextDouble();

		} while (base<=0.0);

		// Calcular el Area del Rectangulo
		area=base*altura;

		System.out.println("\tEl area del rectangulo es de "+area+" cm^2.");

	}

}
