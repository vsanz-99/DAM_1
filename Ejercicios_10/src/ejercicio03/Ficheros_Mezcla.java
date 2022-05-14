package ejercicio03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <p><i>Archivo: Ficheros_Prueba</i></p>
 * <p>Escribir un programa que guarde en un fichero el contenido
 * de otros dos ficheros. En el fichero resultante apareceran
 * las lineas de los primeros dos ficheros mezcladas (1a linea del 1er fichero, 
 * 2a linea del 2o fichero, ...).</p>
 * <p><i>Argumentos: ficheros de origen y fichero de destino.</i></p>
 * <p>Los ficheros de origen pueden tener tamannos distintos.</p>
 * @since 09/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ficheros_Mezcla {

	public static void main(String[] args) {

		String fichero1="C:"+File.separator+"Users"+File.separator+"PC"+File.separator+
				"Downloads"+File.separator+"reciente"+File.separator+"fichero1.txt";
		String fichero2="C:"+File.separator+"Users"+File.separator+"PC"+File.separator+
				"Downloads"+File.separator+"reciente"+File.separator+"fichero2.txt";
		String mezcla="C:"+File.separator+"Users"+File.separator+"PC"+File.separator+
				"Downloads"+File.separator+"reciente"+File.separator+"mezcla.txt";

		try {

			BufferedReader bf1=new BufferedReader(new FileReader(fichero1));
			BufferedReader bf2=new BufferedReader(new FileReader(fichero2));
			BufferedWriter bw=new BufferedWriter(new FileWriter(mezcla));

			String linea1="";
			String linea2="";

			while ((linea1!=null) || (linea2!=null)) {
				linea1=bf1.readLine();
				linea2=bf2.readLine();

				if (linea1!=null) {
					bw.write(linea1+"\n");
				}

				if (linea2!=null) {
					bw.write(linea2+"\n");
				}
			}

			bf1.close();
			bf2.close();
			bw.close();

		} catch(IOException ioe) {
			System.out.println("\tSe ha producido un error de lectura/escritura");
			System.err.println(ioe.getMessage());
		}

	}

}
