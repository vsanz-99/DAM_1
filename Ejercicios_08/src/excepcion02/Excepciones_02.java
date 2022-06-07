package excepcion02;
import java.io.IOException;
import java.util.Scanner;

/**
 * <p><i>Archivo: Excepciones_02.java</i></p>
 * <p><b>Ejercicio 02</b>. Programa que pida numeros hasta que se 
 * introduzca un dato que no sea valido como numero o hasta que se 
 * hayan dado 6 numeros. Despues mostrara el resultado de sumar todos 
 * los numeros insertados. Hay que usar al menos estos 2 metodos: </p>
 * <p>Uno que pida una cadena.</br>
 * Otro que pida un numero entero.</p>
 * <p>Si se produce un error en uno de estos metodos hay que dejar que se propague.</p>
 * @since 07/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Excepciones_02 {

	public static void main(String[] args) {
		try {
			entradaDatos();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println();
		System.out.println("\tFin del programa.");
	}


	public static boolean contieneSoloNumeros(String cadena) {
		// Si la cadena esta vacia, debemos devolver false.
		if (cadena.length()==0) {
			return false;
		}
		for (int x=0; x<cadena.length(); x++) {
			char c=cadena.charAt(x);
			// Si no esta entre 0 y 9.
			if (!(c>='0' && c<='9')) {
				return false;
			}
		}
		return true;
	}

	@SuppressWarnings("resource")
	public static String entradaDatos() throws IOException {
		Scanner teclado=new Scanner(System.in);
		String num1, num2;
		num1=num2="";
		do {
			System.out.println("Introduce un numero entero mayor que cero: ");
			num1=teclado.next();
			teclado.nextLine();
		} while ((!contieneSoloNumeros(num1)) || (num1.length()>6));
		do {
			System.out.println("Introduce otro numero entero mayor que cero: ");
			num2=teclado.next();
			teclado.nextLine();
		} while ((!contieneSoloNumeros(num2)) || (num2.length()>6));
		if (num1=="0" && num2=="0") 
			throw new IOException("\tError de Entrada/Salida. Las numeros no pueden ser igual 0.");
		teclado.close();
		int inum1=Integer.parseInt(num1);
		int inum2=Integer.parseInt(num2);
		System.out.println("\tLa suma de "+num1+" + "+num2+" = "+sumar(inum1, inum2));
		return "\tNumero1: "+num1+"\n"
		+"\tNumero2: "+num2;
	}


}
