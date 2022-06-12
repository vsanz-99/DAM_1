package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: Dni.java</i></p>
 * <p><b>Ejercicio 02, EXAMEN 1EVA</b>.</p>
 * @since 12/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Dni {

	public static void main(String[] args) {
		final String LETRA="TRWAGMYFPDXBNJZSQVHLCKE";
		boolean valido=false; String nif;
		Scanner teclado=new Scanner(System.in);
		do {
			// Leer la direccion.
			do {
				System.out.print("Intriduce un NIF: ");
				// Se lee todo.
				nif=teclado.next();
			} while (nif.isEmpty());
			// Localizar la letra al final.
			char letra=nif.charAt(nif.length()-1);
			long numero=Long.parseUnsignedLong(nif.substring(0, nif.length()-1));
			System.out.println("\tDNI: "+numero+" - "+letra);
			if (numero>0 && numero<100000000) {
				valido=letra==LETRA.charAt((int)(numero%23));
			} else {
				valido=false;
			}
			// NOTA: hasta no se valida que el formato sea correcto: se
			// da por sentado que solo hay una letra y es la ultima.
			if (!valido)
				System.out.println("\tNIF NO valido.");
			int pos=0;
			numero=0;
			boolean esNumero=true;
			// Convertir el numero.
			while (esNumero && pos<nif.length()) {
				char digito=nif.charAt(pos);
				if (Character.isDigit(digito)) {
					// Similar a:
					//if (digito>='0' && digito<='9') {}
					numero=numero*10+(digito-'0');
					pos++;
				} else {
					esNumero=false;
				}
			}
			// Encontrar la letra.
			letra=' ';
			while (letra==' ' && pos<nif.length()) {
				char aux=nif.charAt(pos++);
				if (Character.isLetter(aux))
					letra=aux;
			}
			if (letra!=' ' && pos==nif.length() && 
					numero>0 && numero<100000000) {
				valido=letra==LETRA.charAt((int)(numero%23));
			} else {
				valido=false;
			}
			System.out.println("\tDNI: "+numero+" - "+letra);
		} while (!valido);
		System.out.println("\tNIF valido.");
		teclado.close();
	}

}
