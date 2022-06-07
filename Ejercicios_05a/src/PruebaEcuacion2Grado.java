import java.util.Scanner;

/**
 * <p><i>Archivo: PruebaEcuacion2Grado.java</i></p>
 * <p><b>Ejercicio 09</b>. Programa que llame a un metodo con los coeficientes 
 * de una ecuacion de segundo grado, <b>a</b>, <b>b</b> y <b>c</b>, y devuelva sus 
 * raices en el caso de ser reales.</p>
 * <p>R1=(-b+raiz(b^2-4*a*c))/(2*a)</br>
 * R2=(-b-raiz(b^2-4*a*c))/(2*a)</p>
 * @since 06/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class PruebaEcuacion2Grado {

	public static void main(String[] args) {
		int a=0; int b=0; int c=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("ECUACION DE SEGUNDO GRADO.\n");
		do {
			System.out.println("\tIntroduce un numero entero (a!=0): ");
			a=teclado.nextInt();
		} while (a==0);
		do {
			System.out.println("\tIntroduce un numero entero (b!=0): ");
			b=teclado.nextInt();
		} while (b==0);
		do {
			System.out.println("\tIntroduce un numero entero (c!=0): ");
			c=teclado.nextInt();
		} while (c==0);
		double resultados[]=ecuacion2Grado(a, b, c);
		if (resultados==null) {
			System.out.println("\tNo tiene solucion");
		} else {
			for (int i=0; i<resultados.length; i++) {
				if (resultados[i]>0) {
					System.out.println(resultados[i]);
				}
			}
		}
		System.out.println("\tFin del programa.");
		teclado.close();
	}

	public static double[] ecuacion2Grado(int a, int b, int c) {
		double discriminante=(Math.pow(b, 2)-(4*a*c));
		if (discriminante>=0) {
			double soluciones[];
			// Una solucion.
			if (discriminante==0) {
				soluciones=new double[1];
				soluciones[0]=((-b)-(4*a*c))/(2*a);
			} else { // Dos soluciones.
				soluciones=new double[2];
				soluciones[0]=((-b)+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
				soluciones[1]=((-b)-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
			}
			return soluciones;
		} else {
			// Sin solucion.
			return null;
		}
	}

}
