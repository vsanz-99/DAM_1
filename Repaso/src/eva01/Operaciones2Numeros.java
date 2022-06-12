package eva01;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * <p><i>Archivo: Operaciones2Numeros.java</i></p>
 * <p><b>Ejercicio 02</b>. Escribe un programa que sume, reste, multiplique y divida dos 
 * numeros introducidos por teclado.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Operaciones2Numeros {

	public static void main(String[] args) {
		int num1, num2, suma, resta, multiplicacion;
		num1=num2=suma=resta=multiplicacion=0;
		double division=0.0d;
		Scanner teclado=new Scanner(System.in);
		System.out.println("\tBienvenido al Programa para Sumar, Restar, Multiplicar y Dividir dos numeros.");
		System.out.println("\t-----------------------------------------------------------------------------");
		do {
			System.out.println("\tIntroduce el primer numero: ");
			num1=Integer.parseInt(teclado.nextLine());
		} while (num1<=0);
		do {
			System.out.println("\tIntroduce el segundo numero: ");
			num2=Integer.parseInt(teclado.nextLine());
		} while (num2<=0);
		teclado.close();
		// Suma:
		suma=num1+num2;
		System.out.println("\n\tLa suma de los dos numeros es: "+num1+" + "+num2+" = "+suma);
		// Resta:
		resta=num1-num2;
		System.out.println("\n\tLa resta de los dos numeros es: "+num1+" - "+num2+" = "+resta);
		// Multiplicacion:
		multiplicacion=num1*num2;
		System.out.println("\n\tLa multiplicacion de los dos numeros es: "+num1+" * "+num2+" = "+multiplicacion);
		// Division:
		DecimalFormat df=new DecimalFormat("###.##");
		division=(double)num1/num2;
		System.out.println("\n\tLa division de los dos numeros es: "+num1+" / "+num2+" = "+df.format(division));
	}

}
