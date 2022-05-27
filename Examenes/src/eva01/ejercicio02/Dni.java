package eva01.ejercicio02;
import java.util.Scanner;

/**
 * <p><i>Archivo: Dni.java</i></p>
 * <p>Programa que solicite introducir un NIF hasta que sea correcto.</p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Dni {

	public static void main(String[] args) {

		final String LETRA="TRWAGMYFPDXBNJZSQVHLCKE";
		boolean valido=false;

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		do {
			// Leer la direccion:
			System.out.print("Introduce un NIF: ");

			/*Primera opcion: se leen por separado
 			long numero=teclado.nextLong();
			System.out.print("Introduce la letra del NIF: ");
			char letra=teclado.next().toUpperCase().charAt(0);
			 */

			/*Segunda opcion: se lee todo.*/
			String nif=teclado.next();

			// Localizar la letra al final y lo anterior es el numero.
			char letra=nif.charAt(nif.length()-1);
			long numero=Long.parseUnsignedLong(nif.substring(0, nif.length()-1));

			System.out.println("DNI: "+numero+" - "+letra);

			if (numero>0 && numero<100000000) {
				valido=letra==LETRA.charAt((int)(numero%23));
			} else
				valido=false;

			// NOTA: hasta ahora no se valida si el formato es correcto o no: dar
			// por hecho que solo hay una letra y es la ultima.
			if (!valido)
				System.out.println("NIF NO valido.");

			/*Otra posibilidad: podria ser introducido en una unica cadena con
			un formato propio del usuario, como poner la letra separada por
			un espacio, guion ...
			 */
			int pos=0;
			numero=0;
			boolean esNumero=true;

			// Convertir el numero: pero bastaria con
			// localizar la ultima posicion numerica y usar la subcadena.
			while (esNumero && pos<nif.length()) {
				char digito=nif.charAt(pos);
				if (Character.isDigit(digito)) {
					// Similar a: if (digito>='0' && digito<='9')
					numero=numero*10+(digito-'0');
					pos++;
				} else
					esNumero=false;
			}

			// A partir de aqui puede haber algun simbolo
			// (un espacio o guion seria lo normal) que no es
			// numerico, hasta que se encuentre una letra. Considerando que 
			// no puede haber nada tras la letra.
			// Lo anterior puede generar una excepcion.
			letra=' ';
			while (letra==' ' && pos<nif.length()) {
				char aux=nif.charAt(pos++);
				if (Character.isLetter(aux))
					letra=aux;
			}
			if (letra!=' ' && pos==nif.length() &&
					numero>0 && numero<100000000) {
				valido=letra==LETRA.charAt((int)(numero%23));
			} else
				valido=false;
			System.out.println("DNI: "+numero+" - "+letra);
		} while (!valido);

		System.out.println("NIF valido.");

	}

}