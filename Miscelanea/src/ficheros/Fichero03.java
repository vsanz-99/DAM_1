package ficheros;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * <p><i>Archivo: Fichero03.java</i></p>
 * <p>Introducir la ruta de un fichero a traves del paso de parametros de 
 * Eclipse e indicar si el fichero existe o de lo contrario no existe.
 * Si faltan argumentos en el main() se debe mostrar un mensaje indicandolo.
 * Mostrar tambien el numero de caracteres del fichero.</p>
 * <p><b>Configurations>Seleccionar archivo>Arguments</b></p>
 * @since 27/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Fichero03 {

	FileReader fich;

	public static void main(String[] args) throws IOException {

		if (args.length==0) {
			System.out.println("\tFaltan argumentos en main ...");
			return;
		}

		for (int i=0; i<args.length; i++) {
			File fichero=new File(args[i]); // Declarar fichero.
			if (fichero.exists()) {
				FileReader fich=new FileReader(fichero); // Crear el flujo de entrada.
				System.out.println("\tEl fichero existe.");
				System.out.println("\tEl fichero tiene: "+contar(fich)+" caracteres.");
			} else {
				System.out.printf("\tEl fichero [%s] no existe ...%n", args[i]);
			}
		}
	}

	private static int contar(FileReader fich) throws IOException {
		int c=0;
		while ((fich.read())!=1) // Se va leyendo un caracter.
			c++;
		return c;
	}

}
