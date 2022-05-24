package eva01;
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

		int num1=0; int num2=0;
		int suma=0; int resta=0; int multiplicacion=0; double division=0;

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		System.out.println("\tBienvenido al Programa para Sumar, Restar, Multiplicar y Dividir dos numeros.");
		System.out.println("\t-----------------------------------------------------------------------------");

		do {

			System.out.println("\tIntroduce el primer numero: ");
			num1=teclado.nextInt();

		} while (num1<=0.0);

		do {

			System.out.println("\tIntroduce el segundo numero (tiene que ser menor que el primero): ");
			num2=teclado.nextInt();

		} while (num2<=0.0 && num2>num1);

		// Suma
		suma=num1+num2;

		System.out.println("\tLa suma de los dos numeros es: "+num1+"+"+num2+"="+suma);

		// Resta
		resta=num1-num2;

		System.out.println("\tLa resta de los dos numeros es: "+num1+"-"+num2+"="+resta);

		// Multiplicacion
		multiplicacion=num1*num2;

		System.out.println("\tLa multiplicacion de los dos numeros es: "+num1+"*"+num2+"="+multiplicacion);

		// Division 
		division=(double)num1/num2;

		System.out.println("\tLa division de los dos numeros es: "+num1+"/"+num2+"="+division);

	}

}
