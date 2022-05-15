package eva01.ejercicio04;

/**
 * Programa que valida una direcci�n de correo electr�nico, introducida por
 * teclado, hasta que �sta cumple las reglas.
 * 202112
 * @author DAM1
 */
import java.util.Scanner;
public class Correos {

	public static void main(String[] args) {
		boolean valido;
		String direccion;
		String direccionLocal, direccionDominio;
		Scanner teclado = new Scanner(System.in);
		do {
			//leemos la direccion
			System.out.println("Introduce una direcci�n de correo electronico");
			direccion = teclado.nextLine();
			
			//validamos el tama�o de la direccion
			valido = true;
			direccionLocal = direccionDominio = "";
			if ( direccion.length() > 254 || direccion.length() == 0 ) {
				valido = false;
			}
			System.out.println("Longitud guay " + valido);
			// Comrpuebo caracteres de direcci�n
			final String VALIDOS="ABCDEFGHIUJKLMNOPQRSTUVWXYZ0123456789.-_@";
			direccion = direccion.toUpperCase();
			for ( int i = 0; valido && i < direccion.length(); i++ ) {
				valido = VALIDOS.indexOf(direccion.charAt(i)) != -1;
				System.out.println(direccion.charAt(i) + " - " + VALIDOS.indexOf(direccion.charAt(i)) + " " + valido);
			}

			// Compruebo 2 puntos o AT seguidos
			valido &= direccion.indexOf("..") == -1;
			valido &= direccion.indexOf("@@") == -1;

			// localizar el AT y separar local de dominio
			if ( valido ) {
				int posicion = direccion.indexOf('@');
				if ( posicion != -1 ) {
					direccionLocal = direccion.substring(0, posicion);
					direccionDominio = direccion.substring(posicion+1, direccion.length());
				} else
					valido = false;
			}

			// validamos el tama�o de la parte local
			valido &= direccionLocal.length() > 0 && direccionLocal.length() <= 64;

			// ambas partes no pueden empezar o terminar por punto
			valido &= ! direccionLocal.startsWith(".");
			valido &= ! direccionLocal.endsWith(".");
			valido &= ! direccionDominio.startsWith(".");
			valido &= ! direccionDominio.endsWith(".");

			// La parte de dominio no puede contenter caracter de subrayado ni AT
			valido &= direccionDominio.indexOf('_') == -1;
			valido &= direccionDominio.indexOf('@') == -1;

			// cada etiqueta de dominio debe ser de menos de 64 caracteres
			while ( valido && direccionDominio.length() > 0 ) {
				int posPunto = direccionDominio.indexOf('.');
				if ( posPunto != -1 ) {
					valido &= direccionDominio.substring(0, posPunto).length() < 64;
					direccionDominio = direccionDominio.substring(posPunto+1, direccionDominio.length());
				} else {
					valido &= direccionDominio.length() < 64;
					direccionDominio = "";
				}
			}

			if ( ! valido ) {
				System.out.println("No lo has metido bien.");
			}
			
		} while ( ! valido );
		
		System.out.println("La direccion es valida");

	}

}
