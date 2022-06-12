package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: DecimalAOctal.java</i></p>
 * <p><b>Ejercicio 22</b>. Escribe un programa que imprima en octal un numero introducido 
 * por teclado.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class DecimalAOctal {

	public static void main(String[] args) {
		int numero, exp, digito;
		numero=exp=digito=0;
		double octal=0.0d;
		Scanner sc=new Scanner(System.in);
		do { 
			System.out.print("Introduce un numero entero >= 0: ");                                                
			numero=sc.nextInt();
		} while (numero<0);
		sc.close();
		while (numero!=0) {
			digito=numero%8;           
			octal=octal+digito*Math.pow(10, exp);                                                   
			exp++;
			numero=numero/8;
		}
		System.out.println();
		System.out.printf("\tOctal: %.0f %n", octal);
	}

}
