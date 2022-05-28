package ficheros;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * <p><i>Archivo: Fichero04.java</i></p>
 * <p>Introducir la ruta de un fichero a traves del paso de parametros 
 * de Eclipse e indicar si el fichero existe o de lo contrario no existe.
 * Si faltan argumentos en el main() se debe mostrar un mensaje indicandolo.
 * Posteriormente mostrar el numero de palabras del fichero.</p>
 * @since 27/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Fichero04 {

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
				System.out.println("\tEl fichero tiene: "+ContarPalabras(fich)+" palabras.");
			} else {
				System.out.printf("\tEl fichero [%s] no existe ...%n", args[i]);
			}
		}

	}

	static int ContarPalabras(FileReader fich) throws IOException {
		int palabras=0;
		BufferedReader lee=new BufferedReader(fich);
		String linea;
		while ((linea=lee.readLine())!=null) {
			StringTokenizer st=new StringTokenizer(linea);
			while (st.hasMoreTokens()) {
				String palabra=st.nextToken();
				palabras++;
			}
		} 
		lee.close();
		return palabras;
	}

}