package eva03.ejercicio1;
import java.io.File;
import java.io.IOException;

/**
 * <p><i>Archivo: Main.java</i></p>
 * </p><b>Examen 3EVA</b>.</p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String nombre_f="agenda.dat";
		File archivo=new File(nombre_f);
		if (!archivo.exists()) {
			System.out.println("\tATENCION!: NO existe el archivo de configuracion.");
			System.out.println("\tCreando el archivo de configuracion "+nombre_f+" ...");
			try {
				archivo.createNewFile();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} else {
			System.out.println(archivo.getAbsolutePath());
		}
		MenuAgenda nuevoMenu=new MenuAgenda(nombre_f);
	}

}
