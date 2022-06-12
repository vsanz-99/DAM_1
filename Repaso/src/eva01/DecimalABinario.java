package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: DecimalABinario.java</i></p>
 * <p><b>Ejercicio 21</b>. Escribe un programa que imprima en binario un numero introducido 
 * por teclado.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class DecimalABinario {

	public static void main(String[] args) {
		int numero, exp, digito;
		numero=exp=digito=0;
		double binario=0.0d;
		Scanner sc=new Scanner(System.in);
		do { 
			System.out.print("Introduce un numero entero >= 0: ");                                                
			numero=sc.nextInt();
		} while (numero<0);
		sc.close();
		while (numero!=0) {
			digito=numero%2;           
			binario=binario+digito*Math.pow(10, exp);                                                   
			exp++;
			numero=numero/2;
		}
		System.out.println();
		System.out.printf("\tBinario: %.0f %n", binario);
	}

}
