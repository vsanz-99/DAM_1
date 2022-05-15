package eva01.ejercicio02;
import java.util.Scanner;

/**
 * Programa que valida un NIF introducido por teclado
 * 202112
 * @author DAM1
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		final String LETRA = "TRWAGMYFPDXBNJZSQVHLCKE";
		boolean valido = false;
		Scanner teclado = new Scanner(System.in);
		do {
			//leemos la direccion
			System.out.print("Introduce un NIF: ");
			/* Primera opci�n: se leen por separado
 			long numero = teclado.nextLong();
			System.out.print("Introduce la letra del NIF: ");
			char letra = teclado.next().toUpperCase().charAt(0);
			*
			* Segunda, se lee todo */
			String nif = teclado.next();
			// localizamos la letra al final y lo anterior es el n�mero
			char letra = nif.charAt(nif.length()-1);
			long numero = Long.parseUnsignedLong(nif.substring(0,nif.length()-1));
			
			System.out.println("DNI: " + numero + " - " + letra);
			if ( numero > 0 && numero < 100000000 ) {
				valido = letra == LETRA.charAt((int) (numero % 23));
			} else
				valido = false;
			
			// NOTA: hasta ahora no validamos que el formato es correcto: damos
			//       por hecho que solo hay una letra y es la �ltima
			if ( ! valido )
				System.out.println("NIF no v�lido");
			
			/* Otra posibilidad: podr�a ser introducido en una �nica cadena con
			 * un formato propio del usuario, como poner la letra separada por
			 * un espacio, gui�n...
			 */
			int pos = 0;
			numero = 0;
			boolean esNumero = true;
			// Por cambiar, vamos a convertir el n�mero: pero bastar�a con
			// localizar la �ltima posici�n num�rica y usar la subcadena.
			while ( esNumero && pos < nif.length() ) {
				char digito = nif.charAt(pos);
				if ( Character.isDigit(digito) ) {
				// Es casi lo mismo que: if ( digito >= '0' && digito <= '9' )
					numero = numero * 10 + (digito - '0');
					pos++;
				} else
					esNumero = false;
			}
			// A por la letra: sabemos que, a partir de ahora, puede haber
			// alg�n s�mbolo (espacio o gui�n ser�a lo normal) que no es
			// num�rico hasta que encontremos una letra. Y consideramos
			// que no puede haber nada tras la letra.
			// �� Cuidado !! Lo anterior puede generar una excepci�n
			letra = ' ';
			while ( letra == ' ' && pos < nif.length() ) {
				char aux = nif.charAt(pos++);
				if ( Character.isLetter(aux) )
					letra = aux;
			}
			if ( letra != ' ' && pos == nif.length() &&
			     numero > 0 && numero < 100000000 ) {
				valido = letra == LETRA.charAt((int) (numero % 23));
			} else
				valido = false;

			System.out.println("DNI: " + numero + " - " + letra);
		} while ( ! valido );

		System.out.println("NIF v�lido");
	}

}