package ejercicio02;
import java.util.*;

/**
 * <p>Leer un numero N que debe filtrarse entre 1 y 10. A continuacion calcular
 * y escribir la tabla de multiplicar de dicho numero.</p>
 * @since 02/11/2021
 * @version 1.0
 * @param num el numero introducido por teclado
 * @param producto resultado de la multiplicacion del numero por el contador
 * @author Victor Sanz*/

public class Ejercicio_03_02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		int producto = 0;

		System.out.println("Introduce un numero entre 1 y 10 para mostrar su tabla de multiplicar: ");
		num = teclado.nextInt();

		System.out.println("TABLA DE MULTIPLICAR DEL " + num + "\n");

		for ( int i = 1; i <= 10; i++ ) {
			producto = num * i;
			System.out.println( num + " * " + i + " = " + producto);
		}

		teclado.close();
	}

}

