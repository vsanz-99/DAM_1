import java.util.Scanner;

/**
 * <p>Leer una secuencia de numeros (para finalizar introducir 0).
 * Imprimir la media de todos ellos, el mayor y el menor.</p>
 * @since 08/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_03_07 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num, suma, introducidos, mayor, menor;
		num=suma=introducidos=mayor=menor=0;
		float media=0.0f;
		System.out.println("MEDIA, MAYOR Y MENOR.\n");
		System.out.println("Introducir 0 para finalizar la entrada de datos.");
		do {
			System.out.println("Introduce un numero: ");
			num=Integer.parseInt(teclado.nextLine());
			if (num>mayor) {
				mayor=num;
			} else if (num!=0) { 
				menor=num;
			}
			suma+=num;
			++introducidos;
		} while (num!=0);
		teclado.close();
		--introducidos;
		media=(float)(suma/=introducidos);
		System.out.println("\n\tHa introducido "+introducidos+" numeros.");
		System.out.println("\n\tMedia de los numeros introducidos: "+media);
		System.out.println("\n\tEl mayor numero de la secuencia introducida es: "+mayor);
		System.out.println("\n\tEl menor numero de la secuencia introducida es: "+menor);
	}

}