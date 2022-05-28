package ficheros;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * <p><i>Archivo: Fichero02.java</i></p>
 * <p>Introducir la ruta de un fichero por teclado y un texto que se 
 * quiera escribir en el fichero con JOptionPane.showInputDialog.
 * Despues mostrar el contenido del fichero.</p>
 * @since 27/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Fichero02 {

	public static void main(String[] args) {
		String ruta=JOptionPane.showInputDialog("Introduce la ruta del fichero: ");
		String texto=JOptionPane.showInputDialog("Introduce el texto que quieres escribir en el fichero: ");
		escribirFichero(ruta, texto);
		mostrarFichero(ruta);
	}

	public static void escribirFichero(String nomFich, String texto) {
		try (FileWriter fich=new FileWriter(nomFich)) {
			// Escribimos el texto en el fichero.
			fich.write(texto);
		} catch(IOException e) {
			System.out.println("\tError al escribir en el fichero "+e);
		}
	}

	public static void mostrarFichero(String nomFich) {
		System.out.println("El contenido de: "+nomFich+" es: ");
		// Leemos texto del fichero.
		try (FileReader fr=new FileReader(nomFich)) {
			int caracter=fr.read();
			while (caracter!=-1) {
				System.out.print((char)caracter);
				caracter=fr.read();
			}
		} catch(IOException e) {
			System.out.println("\tProblema con la lectura/excritura en el fichero "+e);
		}
	}

}
