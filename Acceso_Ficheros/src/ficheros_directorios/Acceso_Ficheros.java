package ficheros_directorios;
import java.io.*;

public class Acceso_Ficheros {

	public static void main(String[] args) {
		// Rutas absolutas
		// File.separator ==> Compatibilidad entre S.O.
		File ruta=new File("C:"+File.separator+"Users"+File.separator+
				"PC"+File.separator+"Downloads"+File.separator+"reciente"+
				File.separator+"java_ser");
		System.out.println(ruta.getAbsolutePath());
		System.out.println();
		// String[] list()
		String[] nombres_archivos=ruta.list();
		// Mostrar el listado de lo que hay
		for (int i=0; i<nombres_archivos.length; i++) {
			System.out.println(nombres_archivos[i]);
			File f=new File(ruta.getAbsolutePath(), nombres_archivos[i]); // Examina la ruta y muestra, si es un directorio, lo que contiene
			if (f.isDirectory()) {
				String[] archivos_subcarpeta=f.list();
				// Recorrer el array anterior
				for (int j=0; j<archivos_subcarpeta.length; j++) {
					System.out.println("\t"+archivos_subcarpeta[j]);
				}
			}
		}
	}

}