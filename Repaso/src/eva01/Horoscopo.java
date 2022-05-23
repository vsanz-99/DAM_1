package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: Horoscopo.java</i></p>
 * <p><b>Ejercicio 09</b>. Escribe un programa que nos diga el horoscopo 
 * a partir del dia y el mes de nacimiento.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Horoscopo {

	public static void main(String[] args) {

		int dia=0; int mes=0; String signo="";

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		System.out.println("\tMOSTRAR HOROSCOPO.");
		System.out.println("\t------------------");

		do {

			System.out.println("\tIntroduce el dia en el que nacio: ");
			dia=teclado.nextInt();

		} while (dia<=0 || dia>=32);

		do {

			System.out.println("\tIntroduce el mes en el que nacio: ");
			mes=teclado.nextInt();

		} while (mes<=0 || mes>=13);

		switch (mes) {
		case 1 :
			if (dia>21) {
				signo="ACUARIO";
			} else {
				signo="CAPRICORNIO";
			}
			break;
		case 2 :
			if (dia>19) {
				signo="PISCIS";
			} else {
				signo="ACUARIO";
			}
			break;
		case 3 :
			if (dia>20) {
				signo="ARIES";
			} else {
				signo="PISCIS";
			}
			break;
		case 4 :
			if (dia>20) {
				signo="TAURO";
			} else {
				signo="ARIES";
			}
			break;
		case 5 :
			if (dia>21) {
				signo="GEMINIS";
			} else {
				signo="TAURO";
			}
			break;
		case 6 :
			if (dia>20) {
				signo="CANCER";
			} else {
				signo="GEMINIS";
			}
			break;
		case 7 :
			if (dia>22) {
				signo="LEO";
			} else {
				signo="CANCER";
			}
			break;
		case 8 :
			if (dia>21) {
				signo="VIRGO";
			} else {
				signo="LEO";
			}
			break;
		case 9 :
			if (dia>22) {
				signo="LIBRA";
			} else {
				signo="VIRGO";
			}
			break;
		case 10 :
			if (dia>22) {
				signo="ESCORPION";
			} else {
				signo="LIBRA";
			}
			break;
		case 11 :
			if (dia>21) {
				signo="SAGITARIO";
			} else {
				signo="ESCORPION";
			}
			break;
		case 12 :
			if (dia>21) {
				signo="CAPRICORNIO";
			} else {
				signo="SAGITARIO";
			}
			break;
		}

		System.out.println("\tUsted es "+signo+".");

	}

}
