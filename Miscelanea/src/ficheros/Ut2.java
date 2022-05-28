package ficheros;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * <p><i>Archivo: Ut2.java</i></p>
 * <p>Introducir la ruta de un fichero a traves del paso de 
 * parametros de Eclipse e indicar si el fichero existe o de lo contrario 
 * no existe. Si faltan argumentos en el main() se debe mostrar un mensaje 
 * indicandolo. Posteriormente si por el paso de parametros pasamos un fichero 
 * cuyo contenido son caracteres en mayusculas los debe transformar en 
 * caracteres en minuscula y viceversa.</p>
 * @since 27/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ut2 {
	
	public static void main(String[] args) {
		
		if (args.length<1) {
			System.out.println("\tNo hay argumentos.");
			return;
		}
		
		File file=new File(args[0]);
		
		if (file.exists()) {
			System.out.println("\tEl fichero existe.");
		} else {
			System.out.println("\tEl fichero no existe.");
			return;
		}
		
		new ThreadMostrarFichero(file).start();
	
	}
	
}

class ThreadMostrarFichero extends Thread {
	
	File file;
	
	public ThreadMostrarFichero(File file) {
		super();
		this.file=file;
	}
	
	@Override
	public void run() {
		System.out.println("\tContenido del fichero cambiando las mayusculas por minusculas y viceversa:");
		leerFicheroCambiarMayuscula();
	}
	
	private void leerFicheroCambiarMayuscula() {
		char caracter;
		try (FileReader fileReader=new FileReader(file)) {
			do {
				caracter=(char)fileReader.read();
				if (caracter==65535) {
					return;
				}
				if (caracter ==' ') {
					System.out.print(caracter);
					continue;
				}
				if (caracter<'a') {
					System.out.print((char)(caracter+('a'-'A')));
				}else{
					System.out.print((char)(caracter-('a'-'A')));
				}
			} while (true);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}