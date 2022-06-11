import java.util.*;

/**
 * <p>Menu que permite elegir un tipo de figura: triangulo, cuadrado
 * y rectangulo. Elegir entre las opciones anteriores para calcular 
 * el area y mostrarla en pantalla.</p>
 * @since 03/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_03_12 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int forma, h, b, a;
		h=b=a=0;
		float atriangulo=0.0f;
		int acuadrado, arectangulo;
		acuadrado=arectangulo=0;
		do {
			System.out.print("Bienvenido al programa del Ejercicio_3_12.");
			System.out.println("\nElige entre una de las siguientes opciones: ");
			System.out.println("\n\tOpcion(1): Triangulo.");
			System.out.println("\n\tOpcion(2): Cuadrado.");
			System.out.println("\n\tOpcion(3): Rectangulo.");
			forma=Integer.parseInt(teclado.nextLine());
		} while ((forma<=0) || (forma>3));
		switch (forma) {
		case 1 :
			System.out.print("Calcular el area del triangulo.");
			System.out.println("\tArea del triangulo = b*h/2");
			do {
				System.out.println("Introduce longitud de la altura: ");
				h=Integer.parseInt(teclado.nextLine());
			} while (h<=0);
			do {
				System.out.println("Introduce longitud de la base: ");
				b=Integer.parseInt(teclado.nextLine());
			} while (b<=0);
			atriangulo=(float)((b*h)/2);
			System.out.print("\n\tEl area de un triangulo de base "+b+" m y altura "+h+" "
					+"m es igual a "+atriangulo+" m^2.");
			break;
		case 2 :
			System.out.print("Calcular el area del cuadrado.");
			System.out.println("\tArea del cuadrado = a*a");
			do {
				System.out.println("Introduce longitud del lado: ");
				a=Integer.parseInt(teclado.nextLine());
			} while (a<=0);
			acuadrado=a*a;
			System.out.print("\n\tEl area de un cuadrado de lado "+a+" m es igual a "
					+acuadrado+" m^2.");
			break;
		case 3:
			System.out.print("Calcular el area del rectangulo.");
			System.out.println("\tArea del rectangulo = b*h");
			do {
				System.out.println("Introduce longitud de la altura: ");
				h=Integer.parseInt(teclado.nextLine());
			} while (h<=0);
			do {
				System.out.println("Introduce longitud de la base: ");
				b=Integer.parseInt(teclado.nextLine());
			} while (b<=0);
			arectangulo=b*h;
			System.out.print("\n\tEl area de un rectangulo de base "+b+" m y altura "+h+" m "
					+"es igual a "+arectangulo+" m^2.");
			break;
		default :
		}
		teclado.close();
	}

}	