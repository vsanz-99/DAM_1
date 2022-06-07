package ejercicio06;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * <p><i>Archivo: Repeticiones.java</i></p>
 * <p>Programa que muestre por pantalla cuantas veces aparece una 
 * palabra en un fichero. Pasar como parametros el nombre del fichero y de 
 * la palabra.</p>
 * @since 09/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Repeticiones {

	public static void main(String[] args) {

		String fichero="C:/Users/PC/Downloads/reciente/palabras.txt";
		String palabra="elefante";

		try {

			BufferedReader br=new BufferedReader(new FileReader(fichero));

			String linea="";
			int i=0;
			int repeticiones=0;

			while ((linea=br.readLine())!=null) {

				while ((i=linea.indexOf(palabra))!=-1) {
					linea=linea.substring(i+palabra.length(), linea.length());
					repeticiones++;
				}
			}

			br.close();

			System.out.println("\tLa palabra "+palabra+" aparece "+repeticiones+" veces en el fichero.");

		} catch(IOException ioe) {
			System.err.println(ioe.getMessage());
		}
	}
}