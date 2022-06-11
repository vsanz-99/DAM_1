import java.util.Scanner;

/**
 * <p>Leer un numero N y mostrar por pantalla si es
 * o no primo.</p>
 * @since 08/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_03_04 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		boolean primo=true;
		int num=0;
		do {
			System.out.println("Introduce un numero: ");
			num=Integer.parseInt(teclado.nextLine());
		} while (num<=0);
		teclado.close();
		/*
		 * int numero=0;
		 * boolean primo=true;
		 * int divisor=numero-1; 
		 * while (primo==true && divisor<numero) {
		 * 		if (numero%divisor==0)
		 * 			primo=false;
		 * 		divisor+=1;
		 * 		//primo=numero%divisor--!=0;
		 * } */
		for (int i=2; i<num/2; i++) {
			if (num%i==0) {
				primo=false;
				break;
			}
		}
		if (primo) {
			System.out.println("\n\tEl numero introducido es primo.");
		} else {
			System.out.println("\n\tEl numero introducido NO es primo.");
		}
	}

}

