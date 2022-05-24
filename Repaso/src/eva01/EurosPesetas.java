package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: EurosPesetas.java</i></p>
 * <p><b>Ejercicio 01</b>. Realiza un conversor de euros a pesetas. La cantidad 
 * de euros que se quiere convertir debe ser introducida por teclado.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class EurosPesetas {

	public static void main(String[] args) {

		double euros=0; int pesetas=0;

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		System.out.println("\tBienvenido al Conversor Euros Pesetas. Introduce la cantidad de euros que desea convertir a pesetas: ");
		System.out.println("\t-----------------------------------------------------------------------------------------------------");
		euros=teclado.nextDouble();

		pesetas=(int)(euros*166.386);

		System.out.print("\t"+euros+" euros son "+pesetas+" pesetas.");

	}

}
