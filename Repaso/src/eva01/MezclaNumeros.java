package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: MezclaNumeros.java</i></p>
 * <p><b>Ejercicio 16.</b>Escribe un programa que pida dos numeros por teclado y que luego mezcle en dos numeros 
 * diferentes los digitos pares y los impares. Se van comprobando los digitos de la siguiente 
 * manera: primer digito del primer numero, primer digito del segundo numero, segundo digito 
 * del primer numero, segundo digito del segundo numero, tercer digito del primer numero, etc. 
 * Para facilitar el ejercicio, podemos suponer que el usuario introducira dos numeros de la misma 
 * longitud y que siempre habra al menos un digito par y uno impar. <i>Usa long para admitir 
 * numeros largos. No se permite el uso de String</i>.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class MezclaNumeros {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		System.out.print("Mezclar dos numeros introducidos por "
				+ "teclado, en uno los PARES y en otro los IMPARES.");
		System.out.println();

		System.out.print("Introduce un numero: ");
		long numero=teclado.nextLong();

		System.out.print("Introduce otro numero: ");
		long numeroDos=teclado.nextLong();

		long numeroPrincipio=numero;
		long vuelta=0;
		long numeroIntroducidoDos=numeroDos;
		long vueltaDos=0;

		// Dar la vuelta al numero 1
		while (numeroPrincipio>0) {
			vuelta=(vuelta*10)+(numeroPrincipio%10);
			numeroPrincipio=numeroPrincipio/10;
		}

		// Dar la vuelta al numero 2
		while (numeroIntroducidoDos>0) {
			vueltaDos=(vueltaDos*10)+(numeroIntroducidoDos%10);
			numeroIntroducidoDos=numeroIntroducidoDos/10;
		}

		long ultimaCifraUna=0;
		long ultimaCifraDos=0;
		long vueltaPar=vuelta;
		long vueltaParDos=vueltaDos;

		// Comprobar los pares
		System.out.print("\tEl numero formado por las cifras PARES es: ");
		do {
			ultimaCifraUna=vueltaPar%10;
			ultimaCifraDos=vueltaParDos%10;
			if (ultimaCifraUna%2==0) {
				System.out.print(ultimaCifraUna);
			}
			if (ultimaCifraDos%2==0) {
				System.out.print(ultimaCifraDos);
			}
			vueltaPar=vueltaPar/10;
			vueltaParDos=vueltaParDos/10;
		} while (vueltaPar>0 || vueltaParDos>0);

		System.out.println("");

		// Comprobar los impares
		System.out.print("\tEl numero formado por las cifras IMPARES es: ");
		do {
			ultimaCifraUna=vuelta%10;
			ultimaCifraDos=vueltaDos%10;
			if (ultimaCifraUna%2!=0) {
				System.out.print(ultimaCifraUna);
			}
			if (ultimaCifraDos%2!=0) {
				System.out.print(ultimaCifraDos);
			}
			vuelta=vuelta/10;
			vueltaDos=vueltaDos/10;
		} while (vuelta>0 || vueltaDos>0);

	}

}
