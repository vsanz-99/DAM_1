package eva01;

import java.util.Scanner;

/**
 * <p><i>Archivo: ConversorGenerico.java</i></p>
 * <p><b>Ejercicio 23</b>. Escribe un conversor generico, de decimal 
 * a cualquier base, al menos, hasta hexadecimal (base 16); ten en cuenta que, 
 * cuando se terminan los digitos (0 al 9), se utilizan las letras (A a la F).</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class ConversorGenerico {

	public static void main(String[] args) {
		int numero, exp, digito, base;
		numero=exp=digito=base=0;
		double binario, octal;
		binario=octal=0.0d;
		Scanner sc=new Scanner(System.in);
		do { 
			System.out.print("Introduce un numero entero >= 0: ");                                                
			numero=sc.nextInt();
		} while (numero<0);
		System.out.println();
		do {
			System.out.println("¿A que base desea convertirlo?\n"
					+"\t1-. Binario.\n"
					+"\t2-. Octal.\n"
					+"\t3-. Hexadecimal.\n"
					+"\t0-. Salir.");
			base=sc.nextInt();
		} while ((base<0) || (base>3));
		sc.close();
		switch (base) {
		case 1 :
			exp=0;
			binario=0;
			while (numero!=0) {
				digito=numero%2;           
				binario=binario+digito*Math.pow(10, exp);                                                   
				exp++;
				numero=numero/2;
			}
			System.out.println();
			System.out.printf("\tBinario: %.0f %n", binario);
			break;
		case 2 :
			exp=0;
			octal=0;
			while (numero!=0) {
				digito=numero%8;           
				octal=octal+digito*Math.pow(10, exp);                                                   
				exp++;
				numero=numero/8;
			}
			System.out.println();
			System.out.printf("\tOctal: %.0f %n", octal);
			break;
		case 3 :
			char digitosH[]={'0', '1', '2', '3', '4', '5', '6', '7', 
					'8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
			String hexadecimal="";
			int resto, aux=numero;
			while (aux>0) {
				resto=aux%16;
				hexadecimal=digitosH[resto]+hexadecimal;
				aux/=16; 
			}
			System.out.println();
			System.out.printf("\tHexadecimal: %s", hexadecimal);
			break;
		default :
			System.out.println("\tFin del programa.");
			System.exit(0);
		}
	}

}
