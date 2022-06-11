package eva03.ejercicio01;
import java.io.IOException;

/**
 * <p><i>Archivo: Main.java</i></p>
 * <p><b>Ejercicio 01</b>.</p>
 * @since 10/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Main {

	public static void main(String[] args) throws IOException {
		String nombre_f="vehiculos.txt";
		@SuppressWarnings("unused")
		Menu nuevoMenu=new Menu(nombre_f);
	}

}
