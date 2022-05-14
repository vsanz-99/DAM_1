package ejercicio01;
import java.io.*;

/**
 * <p><i>Archivo: Mostrar.java</i></p>
 * <p>Leer el fichero primos.txt y mostrar los numeros 
 * por pantalla.</p>
 * @since 09/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Mostrar {

	public void leer(File f) {

		FileReader fr=null;
		BufferedReader br=null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			/*archivo=new File("C:"+File.separator+"Users"+File.separator+
					"PC"+File.separator+"Downloads"+File.separator+"reciente"+
					File.separator+"java_ser"+File.separator+"primos.txt");*/

			fr=new FileReader(f);

			br=new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			while ((linea=br.readLine())!=null)
				System.out.println(linea);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta 
			// una excepcion.
			try {                    
				if (null!=fr) {   
					fr.close();     
				}                  
			} catch(Exception e2) { 
				e2.printStackTrace();
			}
		}
	}
}
