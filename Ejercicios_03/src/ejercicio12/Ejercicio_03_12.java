package ejercicio12;
import java.util.*;

/**
 * <p>Menu que permite elegir un tipo de figura: triangulo, cuadrado
 * y rectangulo. Elegir entre las opciones anteriores para calcular 
 * el area y mostrarla en pantalla.</p>
 * @since 03/11/2021
 * @version 1.0
 * @param args
 * @author Victor Sanz*/

public class Ejercicio_03_12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int forma;
		int h, b, a;
		float atriangulo;
		int acuadrado, arectangulo;

		System.out.print("Bienvenido al programa del Ejercicio_3_12. ");
		System.out.println("Elige entre una de las siguientes opciones: ");
		System.out.println("\n Opcion(1): Triangulo.");
		System.out.println("\n Opcion(2): Cuadrado.");
		System.out.println("\n Opcion(3): Rectangulo.");

		forma = teclado.nextInt();

		switch (forma) {
		case 1:
			System.out.print("Calcular el area del triangulo. ");
			System.out.println("Area del triangulo = b*h/2");
			System.out.println("Introduce longitud de la altura: ");
			h = teclado.nextInt();
			System.out.println("Introduce longitud de la base: ");
			b = teclado.nextInt();
			atriangulo = (float)(b*h)/2;
			System.out.print("\n El area de un triangulo de base " + b + " y altura " + h + " es igual a " + atriangulo);
			break;
		case 2:
			System.out.print("Calcular el area del cuadrado. ");
			System.out.println("Area del cuadrado = a*a");
			System.out.println("Introduce longitud del lado: ");
			a = teclado.nextInt();
			acuadrado = a*a;
			System.out.print("\n El area de un cuadrado de lado " + a + " es igual a " + acuadrado);
			break;
		case 3:
			System.out.print("Calcular el area del rectangulo. ");
			System.out.println("Area del rectangulo = b*h");
			System.out.println("Introduce longitud de la altura: ");
			h = teclado.nextInt();
			System.out.println("Introduce longitud de la base: ");
			b = teclado.nextInt();
			arectangulo = b*h;
			System.out.print("\n\t El area de un rectangulo de base " + b + " y altura " + h + " es igual a "  + arectangulo);
			break;
		default:
			System.out.println("\n\t El programa no contempla la opcion que ha introducido");
		}

		teclado.close();
	}
}	