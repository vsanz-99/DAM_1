package ficheros_directorios;
import java.io.File;

public class Eliminar {

	public static void main(String[] args) {
		File ruta=new File("H:"+File.separator+"eclipse_myworkspace"+File.separator+
				"java_ser"+File.separator+"prueba_texto.txt");
		ruta.delete();
	}

}