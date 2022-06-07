import java.util.Scanner;

/**
 * <p><i>Archivo: PruebaAgruparElementos.java</i></p>
 * <p><b>Ejercicio 08</b>. Dados <b>m</b> elementos de un conjunto que se desean 
 * agrupar de <b>n</b> en <b>n</b>, el numero de combinaciones posibles es 
 * <b>m!/(n!*(m-n)!)</b>, siendo siempre <b>m>=n</b>. Escribir un metodo para que, 
 * dados como parametros <b>m</b> y <b>n</b>, calcule el numero de combinaciones de 
 * <b>m</b> sobre <b>n</b>. <b><u>Usad el metodo factorial del ejercicio 3</u></b>.</p>
 * @since 06/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class PruebaAgruparElementos {

	public static void main(String[] args) {
		int m=0; int n=0;
		Scanner teclado=new Scanner(System.in);
		do {
			System.out.println("\tIntroduce un numero entero (m>0): ");
			m=teclado.nextInt();
		} while (m<=0);
		do {
			System.out.println("\tIntroduce un numero entero (n>0): ");
			n=teclado.nextInt();
		} while ((n<=0) || (n>m));
		System.out.println("\tCalculando el numero posible de combinaciones de m sobre n ...\n");
		long comb=factorial(m)/(factorial(n)*(factorial(m-n)));
		System.out.println("\tNumero de combinaciones posibles: "+comb);
		System.out.println("\tFin del programa.");
		teclado.close();
	}

	public static long factorial(int numero) {
		long factorial=1;
		for (int i=1; i<=numero; i++) {
			factorial*=i;
		}
		return factorial;
	}

}
