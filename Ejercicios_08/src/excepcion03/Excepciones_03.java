package excepcion03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <p><i>Archivo: Excepciones_03.java</i></p>
 * <p><b>Ejercicio 03</b>. Programa que pida el dividendo y el 
 * divisor y muestre el cociente de la division entera. Este proceso 
 * se repetira hasta que se inserte como divisor un cero o se introduzca 
 * un dato que no sea valido como numero. La division por cero se controla 
 * con el error ArithmeticException.</p>
 * <p>Para hacerlo se usaran, al menos, estos tres metodos: </p>
 * <ul>
 * <li>Uno que pida una cadena.</li>
 * <li>Otro que pida un numero entero.</li>
 * <li>Otro que calcule y visualice el cociente de dicha division.</li>
 * </ul>
 * <p>Si se produce un error en uno de estos metodos hay que dejar que se propague.</p>
 * @since 07/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Excepciones_03 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		float dividendo, divisor, resultado=0.0f;
		int bandera=1;
		while (bandera==1) {
			try {
				System.out.print("Ingrese el dividendo: ");
				dividendo=teclado.nextFloat();
				System.out.print("Ingrese el divisor: ");
				divisor=teclado.nextFloat();
				if (divisor==0.0f) {
					throw new ArithmeticException();  // Lanza la excepcion
				} else {
					resultado=dividendo/divisor;
					System.out.println("\nEl resultado es "+resultado);
				}
			} catch (ArithmeticException ae) {
				System.out.println("\n* No es posible dividir por cero, vuelva a intentarlo *");
			} catch (InputMismatchException ime) {
				System.out.println("\n* Solo se pueden ingresar numeros *");
			} finally {
				System.out.println("\nIngrese 1 para realizar otra division, otro numero para salir.");
				teclado.nextLine();
				bandera=teclado.nextInt();
				if (bandera!=1) {
					teclado.close();
				}
			}
		}
	}

}
