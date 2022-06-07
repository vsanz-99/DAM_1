import java.util.Scanner;

/**
 * <p><i>Archivo: PruebaMcd.java</i></p>
 * <p><b>Ejercicio 05</b>. Metodo que con dos parametros enteros <b>p</b> y 
 * <b>q</b> nos devuelva el m.c.d. de ambos.</p>
 * @since 06/06/2022
 * @version 1.0 
 * @author Victor Sanz*/

public class PruebaMcd {

	public static void main(String[] args) {
		int p=0; int q=0;
		Scanner teclado=new Scanner(System.in);
		do {
			System.out.println("\tIntroduce un numero entero (p): ");
			p=teclado.nextInt();
		} while (p<=0);
		do {
			System.out.println("\tIntroduce un numero entero (q): ");
			q=teclado.nextInt();
		} while (q<=0);
		System.out.println("Calculando el m.c.d. de p y q ...\n");
		int res=mcd(p, q);
		System.out.println("\tMCD: "+res);
		System.out.println("\tFin del programa.");
		teclado.close();
	}

	public static int mcd(int num1, int num2) {
		int a=Math.max(num1, num2);
		int b=Math.min(num1, num2);
		int resultado=0;
		do {
			resultado=b;
			b=a%b;
			a=resultado;
		} while (b!=0);
		return resultado;
	}

}
