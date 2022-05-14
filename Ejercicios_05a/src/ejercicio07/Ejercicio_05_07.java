package ejercicio07;
import java.util.*;

/**
 * <p><i>Ejercicio_05_07: </i></p>
 * <p>Escribir un metodo que se de como paramatro un valor <b>r</b>, que representa 
 * el radio de una figura, una opcion: un dato entero que sera 1, 2 o 3. El metodo debe devolver: </p>
 * <li>En el caso opcion 1, la longitud del circulo de radio <b>r</b> dada por la expresion <b>2*PI*r</b></li>
 * <li>En el caso opcion 2, la superficie del circulo dada por la expresion PI*r^2</li>
 * <li>En el caso opcion 3, el volumen de una esfera de radio <b>r</b> dada por la expresion <b>4/3*PI*r^3</b></li>
 * <p>NOTA: PI es la constante 3,14159</p>
 * @since 26/02/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_05_07 {

	static Scanner teclado=new Scanner(System.in);

	/**
	 * @param args the command line arguements
	 */

	public static void main(String[] args) {
		int r=0;
		int opcion=0;

		System.out.println("\n\tIntroduce el radio: ");
		r=teclado.nextInt();
		System.out.println("\n\tOpcion1: calcular la longitud del circulo.");
		System.out.println("\n\tOpcion2: calcular la superficie del circulo.");
		System.out.println("\n\tOpcion3: calcular el volumen de la esfera.");
		System.out.println("\n\tIntroduce una de las opciones anteriores (1, 2 o 3).");
		opcion=teclado.nextInt();

		double resultado=radio(r,opcion);
		System.out.println("\n\tEl resultado del calculo deseado es: " + resultado);
	}

	public static double radio(int r, int opcion ) {
		double calculo=0;

		switch (opcion) {
		case 1:
			calculo=2*3.14159*r;break;
		case 2:
			calculo=3.14159*r;break;
		case 3:
			calculo=(4/3)*3.14159*Math.pow(r,3);break; // Elevar al cubo.
		default:
			System.out.println("\n\tAlgo ha salido mal.");
		}
		return calculo;
	}

}
