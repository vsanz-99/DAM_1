package ficheros;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * <p><i>Archivo: Fichero01.java</i></p>
 * <p>Crear un fichero de texto plano con el nombre "Ejercicio1.txt". 
 * Leer el fichero caracter por caracter y mostrar su contenido por
 * pantalla sin espacios.</p>
 * @since 27/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Fichero01 {

	public static void main(String[] args) {
		
		final String nomFichero="H:"+File.separator+"eclipse_myworkspace"+File.separator+"Miscelanea"+
		File.separator+"src"+File.separator+"ficheros"+File.separator+"Ejercicio1.txt";
		
		try (FileReader fich=new FileReader(nomFichero)) {
			int valor=fich.read();
			while (valor!=-1) {
				// El caracter ASCII 32 es el espacio. Si el caracter es un
				// espacio no lo escribe.
				if (valor!=32) {
					System.out.print((char)valor);
				}
				valor=fich.read();
			}
		} catch(IOException e) {
			System.out.println("\tEl fichero no existe o ruta del fichero "
					+ "incorrecta "+e);
		}

	}

}
