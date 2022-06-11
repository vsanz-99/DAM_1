import java.util.Scanner;

/**
 * <p>Leer numeros por teclado hasta que se lea 0.
 * Calcular y escribir la suma de los numeros introducidos
 * en lugar par y de los introducidos en lugar impar.</p>
 * @since 08/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_03_06 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num, suma_par, suma_impar, contador;
		num=suma_par=suma_impar=contador=0;
		System.out.println("Introducir 0 para finalizar la entrada de datos.\n");
		do {
			System.out.print("Introduce un numero: ");
			num=Integer.parseInt(teclado.nextLine());
			if (contador%2==0) {
				suma_impar+=num;
				contador++;
			} else {
				suma_par+=num;
				contador++;
			}
		} while (num!=0);
		teclado.close();
		System.out.println("\n\tSe han introducido: "+--contador+" numeros.");
		System.out.println("\n\tSuma de los numeros introducidos en lugar par: "+suma_par);
		System.out.println("\n\tSuma de los numeros introducidos en lugar impar: "+suma_impar);
	}

}
