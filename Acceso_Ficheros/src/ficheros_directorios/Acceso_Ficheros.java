package ficheros_directorios;
import java.io.*;

public class Acceso_Ficheros {

	public static void main(String[] args) {
		// Rutas absolutas.
		// File.separator ==> Compatibilidad entre S.O. (no es necesario).
		File ruta=new File("H:"+File.separator+"eclipse_myworkspace"+File.separator+"java_ser");
		System.out.println(ruta.getAbsolutePath());	// Muestra la ruta absoluta del fichero/directorio.
		System.out.println();
		System.out.println("Lo que contiene: ");
		System.out.println();
		// String[] list()
		String[] nombres_archivos=ruta.list();
		// Mostrar el listado de lo que hay
		for (int i=0; i<nombres_archivos.length; i++) {
			System.out.println(nombres_archivos[i]);
			// Examina la ruta y muestra, si es un directorio, lo que contiene.
			File f=new File(ruta.getAbsolutePath(), nombres_archivos[i]);
			if (f.isDirectory()) {
				String[] archivos_subcarpeta=f.list();
				// Recorrer el array anterior.
				for (int j=0; j<archivos_subcarpeta.length; j++) {
					System.out.println("\t"+archivos_subcarpeta[j]);
				}
			}
		}
	}

}