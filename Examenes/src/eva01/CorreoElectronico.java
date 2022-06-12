package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: CorreoElectronico.java</i></p>
 * <p><b>Ejercicio 04, EXAMEN 1EVA</b>.</p>
 * @since 12/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class CorreoElectronico {

	public static void main(String[] args) {
		boolean valido=false;
		String direccion, direccionLocal, direccionDominio;
		direccion=direccionLocal=direccionDominio="";
		Scanner teclado=new Scanner(System.in);
		do {
			// Leer la direccion.
			System.out.println("Introduce una direccion de correo electronico: ");
			direccion=teclado.nextLine();
			// Validar el tamanio de la direccion.
			valido=true;
			if (direccion.length()>254 || direccion.length()==0)
				valido=false;
			System.out.println("Cumple con la longitud: "+valido);
			// Comprobar caracteres de la direccion.
			final String VALIDOS="ABCDEFGHIUJKLMNOPQRSTUVWXYZ0123456789.-_@";
			direccion=direccion.toUpperCase();
			for (int i=0; valido && i<direccion.length(); i++) {
				valido=VALIDOS.indexOf(direccion.charAt(i))!=-1;
				System.out.println(direccion.charAt(i)+" - "+VALIDOS.indexOf(
						direccion.charAt(i))+" "+valido);
			}
			// Comprobar 2 puntos o AT seguidos.
			valido&=direccion.indexOf("..")==-1;
			valido&=direccion.indexOf("@@")==-1;
			// Localizar el AT y separar local de dominio.
			if (valido) {
				int posicion=direccion.indexOf('@');
				if (posicion!=-1) {
					direccionLocal=direccion.substring(0, posicion);
					direccionDominio=direccion.substring(posicion+1, 
							direccion.length());
				} else {
					valido=false;
				}
			}
			// Validar el tamanio de la parte local.
			valido&=direccionLocal.length()>0 && direccionLocal.length()<=64;
			// Ambas partes no pueden empezar o terminar por punto.
			valido&=!direccionLocal.startsWith(".");
			valido&=!direccionLocal.endsWith(".");
			valido&=!direccionDominio.startsWith(".");
			valido&=!direccionDominio.endsWith(".");
			// La parte de dominio NO puede contener caracter de subrayado ni AT.
			valido&=direccionDominio.indexOf('_')==-1;
			valido&=direccionDominio.indexOf('@')==-1;
			// Cada etiqueta de dominio debe ser de menos de 64 caracteres.
			while (valido && direccionDominio.length()>0) {
				int posPunto=direccionDominio.indexOf('.');
				if (posPunto!=-1) {
					valido&=direccionDominio.substring(0, posPunto).length()<64;
					direccionDominio=direccionDominio.substring(posPunto+1, direccionDominio.length());
				} else {
					valido&=direccionDominio.length()<64;
					direccionDominio="";
				}
			}
			if (!valido)
				System.out.println("\tDatos incorrectos.");
		} while (!valido);
		System.out.println("\tLa direccion es valida.");
		teclado.close();
	}

}
