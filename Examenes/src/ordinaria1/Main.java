package ordinaria1;
import java.io.File;
import java.io.IOException;

/**
 * <p><i>Archivo: Main.java</i></p>
 * <p><b>1ª Convocatoria</b>.</p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		File archivo=new File("datos.dat");
		if (!archivo.exists()) {
			System.out.println("\tATENCION!: NO existe el archivo de configuracion.");
			System.out.println("\tCreando el archivo de configuracion ...");
			try {
				archivo.createNewFile();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} else {
			System.out.println(archivo.getAbsolutePath());
		}
		Menu menu=new Menu("datos.dat");
	}

}
