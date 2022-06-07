import java.util.Scanner;

/**
 * <p><i>Archivo: PruebaPrimo.java</i></p>
 * <p><b>Ejercicio 01</b>. Leer un numero <b>N</b> y escribir por pantalla, 
 * mediante un mensaje, si es o no primo. <b>Desarrollar el 
 * programa creando un metodo llamado <u>primo</u> que devuelva 
 * true si el numero es primo y false si no lo es</b>.</p>
 * @since 06/06/2022 
 * @version 1.0
 * @author Victor Sanz*/

public class PruebaPrimo {

	public static void main(String[] args) {
		int N=0;
		Scanner teclado=new Scanner(System.in);
		do {
			System.out.println("\tIntroduce un numero entero >= 0: ");
			N=teclado.nextInt();
		} while (N<=0);
		if (primo(N)) {
			System.out.println("\tEl numero introducido es primo.");
		} else {
			System.out.println("\tEl numero introducido NO es primo.");
		}
		System.out.println("\tFin del programa.");
		teclado.close();
	}

	public static boolean primo(int numero) {
		// El 0, 1 y 4 no son primos.
		if (numero==0 || numero==1 || numero==4) {
			return false;
		}
		for (int x=2; x<numero/2; x++) {
			// Si es divisible por cualquiera de estos numeros, 
			// no es primo.
			if (numero%x==0) 
				return false;
		}
		// Si no se pudo dividir por ninguno de los de arriba, si es primo.
		return true;
	}

}
