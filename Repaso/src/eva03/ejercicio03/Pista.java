package eva03.ejercicio03;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Pista {

	Scanner teclado=new Scanner(System.in);

	public void visualizarCantPistas() {

		int num_pistas_tenis;
		int num_pistas_padel;
		int num_pistas_squash;

		System.out.println("\t¿Cuantas pistas de tenis hay en el club deportivo?: ");
		num_pistas_tenis=teclado.nextInt();

		System.out.println("\t¿Cuantas pistas de padel hay en el club deportivo?: ");
		num_pistas_padel=teclado.nextInt();

		System.out.println("\t¿Cuantas pistas de squash hay en el club deportivo?: ");
		num_pistas_squash=teclado.nextInt();

		// Imprimir resultados
		System.out.println("\tNumero de pistas de tenis: "+num_pistas_tenis+".");
		System.out.println("\tNumero de pistas de padel: "+num_pistas_padel+".");
		System.out.println("\tNumero de pistas de squash: "+num_pistas_squash+".");

	}

	public void calcularPrecioUso() {

		System.out.println("\tPrecio por usar las pistas de tenis.");
		System.out.println("\tCalculando el precio para 30 minutos ...");

		double precioFinal=0;
		int tiempoFinal=0;
		double precioBase=0;
		int tiempoBase=0;

		// Pedir datos por teclado
		System.out.println("\tTiempo final: ");
		tiempoFinal=Integer.parseInt(teclado.nextLine());

		System.out.println("\tPrecio base: ");
		precioBase=Double.parseDouble(teclado.nextLine());

		System.out.println("\tTiempo base: ");
		tiempoBase=Integer.parseInt(teclado.nextLine());

		// Calcular el resultado
		precioFinal=(tiempoFinal*precioBase)/tiempoBase;

		System.out.println("\n\tPrecio final: "+precioFinal+".");
		System.out.println("\tPrecio de uso para las pistas de padel.");
		System.out.println("\tCalculando el precio para 90 minutos ...");

		// Pedir datos por teclado
		System.out.println("\tTiempo final: ");
		tiempoFinal=Integer.parseInt(teclado.nextLine());

		System.out.println("\tPrecio base: ");
		precioBase=Double.parseDouble(teclado.nextLine());

		System.out.println("\tTiempo base: ");
		tiempoBase=Integer.parseInt(teclado.nextLine());

		// Calcular el resultado
		precioFinal=(tiempoFinal*precioBase)/tiempoBase;

		System.out.println("\n\tPrecio final calculado: "+precioFinal+".");
		System.out.println("\tPrecio de uso para las pistas de squash.");
		System.out.println("\tCalculando el precio para 70 minutos ...");

		// Pedir datos por teclado
		System.out.println("\tTiempo final: ");
		tiempoFinal=Integer.parseInt(teclado.nextLine());

		System.out.println("\tPrecio base: ");
		precioBase=Double.parseDouble(teclado.nextLine());

		System.out.println("\tTiempo base: ");
		tiempoBase=Integer.parseInt(teclado.nextLine());

		// Calcular el resultado
		precioFinal=(tiempoFinal*precioBase)/tiempoBase;
		double result_redon=Math.round(precioFinal*100.0)/100.0;

		System.out.println("\n\tPrecio final calculado: "+result_redon+".");

	}

	/**
	 * Cuota infantil: 140 €; Cuota juvenil: 180 €; Cuota adulto: 270 €
	 * Numero de pistas de tenis: 4 (1h - 4.80€) - (2h - 9.60€);
	 * Numero de pistas de padel: 5 (1h - 6.40€) - (2h - 12.80€);
	 * Numero de pistas de squash: 3 (1h - 8€) - (2h - 13.40€) 
	 */

}
