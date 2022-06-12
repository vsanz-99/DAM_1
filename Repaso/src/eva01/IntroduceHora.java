package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: IntroduceHora.java</i></p>
 * <p><b>Ejercicio 06.</b> Realiza un programa que pida una hora por teclado y que muestre luego buenos dias, buenas 
 * tardes o buenas noches segun la hora. Se utilizaran los tramos de 6 a 12, de 13 a 20 y de 21 a 5. 
 * respectivamente. Solo se tienen en cuenta las horas, los minutos no se deben introducir por 
 * teclado.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class IntroduceHora {

	public static void main(String[] args) {
		int hora=0;
		Scanner teclado=new Scanner(System.in);
		do {
			System.out.println("¿Que hora es?");
			hora=Integer.parseInt(teclado.nextLine());
		} while (hora<0 || hora>23);
		teclado.close();
		if (hora>=6 && hora<=12) {
			System.out.print("\tBuenos dias.");
		} else if (hora>=13 && hora<=20) {
			System.out.print("\tBuenas tardes.");
		} else {
			System.out.print("\tBuenas noches.");
		}
	}

}
