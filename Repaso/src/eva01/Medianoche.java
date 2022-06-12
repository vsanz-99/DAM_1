package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: Medianoche.java</i></p>
 * <p><b>Ejercicio 10</b>. Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos 
 * que faltan para llegar a la medianoche.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Medianoche {

	public static void main(String[] args) {
		int hora, minuto;
		hora=minuto=0;
		Scanner teclado=new Scanner(System.in);
		do {
			System.out.println("Hora (hh): ");
			hora=Integer.parseInt(teclado.nextLine());
		} while (hora<0 || hora>23);
		do {
			System.out.println("Minutos (mm): ");
			minuto=Integer.parseInt(teclado.nextLine());
		} while (minuto<0 || minuto>59);
		teclado.close();
		int segundosTranscurridos=(hora*3600)+(minuto*60);
		int segundosHastaMedianoche=(24*3600)-segundosTranscurridos;
		//System.out.println("\tDesde las "+hora+":"+minuto+" hasta la medianoche faltan "+segundosHastaMedianoche+" segundos.");
		System.out.printf("\tDesde las %02d:%02d hasta la medianoche faltan %d segundos.", hora, minuto, segundosHastaMedianoche);
	}

}
