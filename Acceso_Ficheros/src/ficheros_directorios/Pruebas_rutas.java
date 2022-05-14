package ficheros_directorios;
import java.io.*;

public class Pruebas_rutas {

	public static void main(String[] args) {
		
		File archivo=new File("bin"); // Toma como ruta por defecto la del workspace

		// Comprobacion
		System.out.println(archivo.getAbsolutePath()); // Imprime la ruta absoluta de este archivo
		
		// Comprobar si existe en la ruta absoluta
		System.out.println(archivo.exists());
		
	}

}
