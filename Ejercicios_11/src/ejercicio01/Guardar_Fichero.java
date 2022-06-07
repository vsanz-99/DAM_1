package ejercicio01;
import java.util.*;
import java.io.*;

/**
 * <p><i>Archivo: Guardar_Fichero</i></p>
 * <p>Escribir un programa que guarde en un fichero llamado <i>primos.txt</i>
 * los numeros primos que hay entre 1 y 500.</p>
 * <p><i>"Criba de Eratostenes"</i></p>
 * @since 09/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Guardar_Fichero {

	public static void main(String[] args) {

		char opcion=0;

		File ruta=new File("C:"+File.separator+"Users"+File.separator+
				"PC"+File.separator+"Downloads"+File.separator+"reciente"+
				File.separator+"java_ser"+File.separator+"primos.txt");

		String archivo_destino=ruta.getAbsolutePath(); // Almacenar la ruta del fichero

		try {
			ruta.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Crea el fichero primos.txt

		System.out.println("Archivo creado: "+archivo_destino);

		Eratostenes acceso_escritura=new Eratostenes();

		acceso_escritura.escribir_primos(archivo_destino);

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		System.out.println("\t¿Desea mostrar el contenido del fichero (s/n)?");
		opcion=teclado.next().charAt(0);

		if (opcion=='s' || opcion=='S') {
			Mostrar mostrar_pantalla=new Mostrar();
			mostrar_pantalla.leer(ruta);
		} else if (opcion=='n' || opcion=='n') {
			System.out.println("\tFin del programa");
		} else {
			System.out.println("\tEl programa no contempla la opcion indicada");
			System.out.println("\tAdios");
			System.exit(-1);
		}

	}

}
