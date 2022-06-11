import java.util.Scanner;

/**
 * <p>Leer una serie de numeros por teclado, cuando el numero
 * leido sea 0 se finalizara la lectura de numeros. Calcular
 * y escribir la suma de los numeros de la serie y mostrar
 * cuantos se han introducido en total.</p>
 * @since 03/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_03_05 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num; // Numero que introducimos por teclado.
		int suma; // Acumulador.
		int introducidos; // Cantidad de numeros introducidos.
		num=suma=introducidos=0;
		do {
			System.out.println("Introducir un numero para sumar (escribir 0 para finalizar): ");
			num=Integer.parseInt(teclado.nextLine());
			suma+=num;
			introducidos++;
		} while (num!= 0);
		teclado.close();
		//--introducidos; --> Para que no cuente el 0.
		System.out.print("\n\tLa suma de los "+(--introducidos)+" numeros introducidos es: "+suma);
	}

}
