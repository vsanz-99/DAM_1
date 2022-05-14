package ficheros_directorios;

import java.io.File;

public class Eliminar {

	public static void main(String[] args) {

		File ruta=new File("C:"+File.separator+"Users"+File.separator+
				"PC"+File.separator+"Downloads"+File.separator+"reciente"+
				File.separator+"java_ser"+File.separator+"prueba_texto.txt");

		ruta.delete();

	}

}