package leyendo;
import java.io.*;

public class Acceso_Fichero {

	public static void main(String[] args) {

		Leer_Fichero accediendo=new Leer_Fichero();

		accediendo.lee(); // Muestra los codigos de los caracteres Unicode

	}

}

class Leer_Fichero {

	public void lee() {

		try {

			entrada=new FileReader("C:/Users/PC/Downloads/reciente/ejemplo.txt"); // Se abre el flujo de datos (si va bien)

			// Memoria intermedia
			BufferedReader mibuffer=new BufferedReader(entrada); // Almacenar en el buffer el fichero de texto

			//int c=0; // IOException es la excepcion que lanza el read()

			String linea="";

			while (linea!=null) { // Mientras no haya llegado al final de los datos y/o caracteres que tengamos en el fichero de texto

				linea=mibuffer.readLine(); // Almacena la primera linea que se encuentre en el buffer (la primera vez)

				if (linea!=null)
					System.out.println(linea);

				//c=entrada.read();

				//char letra=(char)c; // Casting

				//System.out.print(letra); // Legible para el ser humano
				// El interrogante hace referencia al -1 (EOF)
			}

			entrada.close(); // Se cierra el flujo de datos (si va bien)

		} catch (IOException e) { // Las excepciones son obligatorias

			System.out.println("No se ha encontrado el archivo");

		} finally {

			try {
				entrada.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	FileReader entrada;

}