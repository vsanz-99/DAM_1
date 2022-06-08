package ficheros_directorios;
import java.io.*;

public class Creando {

	public static void main(String[] args) {
		File ruta=new File("C:"+File.separator+"Users"+File.separator+
				"PC"+File.separator+"Downloads"+File.separator+"reciente"+
				File.separator+"java_ser"+File.separator+"prueba_texto.txt");
		//ruta.mkdir(); // Crear un directorio
		String archivo_destino=ruta.getAbsolutePath(); // Almacenar la ruta de la carpeta/fichero
		try {
			ruta.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Crear un fichero
		Escribiendo accede_es=new Escribiendo();
		accede_es.escribir(archivo_destino);
	}

}

//--------------------------------------------------------------------------------

class Escribiendo {

	public void escribir(String ruta_archivo) {
		String frase="Esto es un ejemplo. Espero que salga";
		try {
			// Escribir en el archivo indicado
			FileWriter escritura=new FileWriter(ruta_archivo);
			for (int i=0; i<frase.length(); i++) {
				escritura.write(frase.charAt(i)); // Caracter a caracter ...
			}
			escritura.close();
		} catch(IOException e) {}
	}

}