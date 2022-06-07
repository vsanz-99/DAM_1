package ejercicio04;
import java.util.Collection;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

/**
 * <p><i>Archivo: Ordenar_palabras.java</i></p>
 * <p>Ordenar alfabeticamente las palabras contenidas en un fichero
 * de texto. El nombre del fichero que contiene las palabras se debe 
 * pasar como argumento. El nombre del fichero resultado debe ser el
 * mismo que el original, annadiendo la coletilla sort.</p>
 * <p><i>Cada palabra ocupa una linea.</i></p>
 * @since 09/05/2022
 * @version 1.0
 * @author Victor Sanz*/

@SuppressWarnings("unused")
public class Ordenar_palabras {

	public static void main(String[] args) {

		String fichero_sinordenar="C:"+File.separator+"Users"+
				File.separator+"PC"+File.separator+"Downloads"+File.separator+
				"reciente"+File.separator+"palabras.txt";

		try {

			BufferedReader br=new BufferedReader(new FileReader(fichero_sinordenar));

			int l=fichero_sinordenar.length();

			String nombre=fichero_sinordenar.substring(0, l-4);
			String extension=fichero_sinordenar.substring(l-4, l);

			BufferedWriter bw=new BufferedWriter(new FileWriter(nombre+"_sort"+extension));

			Vector<String> vector=new Vector<String>();

			String linea="";

			while (linea!=null) {
				vector.addElement(linea);
				linea=br.readLine();
			}

			br.close();

			vector.removeElementAt(0);
			Collections.sort(vector);

			for (String e : vector) {
				bw.write(e+"\n");
			}

			bw.close();

		} catch(IOException ioe) {
			System.err.println(ioe.getMessage());
		}
	}

}
