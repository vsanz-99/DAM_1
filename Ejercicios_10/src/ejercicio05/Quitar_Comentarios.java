package ejercicio05;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <p><i>Archivo: Quitar_Comentarios.java</i></p>
 * <p>Quitar los comentarios de un programa en java.</p>
 * <p>Crear un fichero con nombre holav2.java que contiene el codigo de 
 * hola.java pero sin los comentarios.</p>
 * @since 09/05/2022
 * @version 1.0
 * @author Victor*/

public class Quitar_Comentarios {

	public static void main(String[] args) {

		String programa_original="C:/Users/PC/Downloads/reciente/java_ser/hola.java";
		String programa_limpio="C:/Users/PC/Downloads/reciente/java_ser/hola2.java";

		try {
			BufferedReader br=new BufferedReader(new FileReader(programa_original));
			BufferedWriter bw=new BufferedWriter(new FileWriter(programa_limpio));

			String lineaOrigen="";
			String lineaDestino="";
			boolean comentarioDeBloque=false;
			int i=0;

			while ((lineaOrigen=br.readLine())!=null) {

				int l=lineaOrigen.length();
				lineaDestino=lineaOrigen;

				// Detecta inicio de comentario de bloque 
				if ((i=lineaOrigen.indexOf("/*"))!=-1) {
					comentarioDeBloque=true;
					lineaDestino=lineaOrigen.substring(0, i);
					lineaOrigen=lineaDestino;
				}

				// Detecta fin de comentario de bloque 
				if ((i=lineaOrigen.indexOf("*/"))!=-1) {
					comentarioDeBloque=false;
					lineaDestino=lineaOrigen.substring(i+2, l);
				}
				
				// Detecta comentario de línea
				if (((i=lineaOrigen.indexOf("//"))!=-1) && !comentarioDeBloque) {
					lineaDestino=lineaOrigen.substring(0, i);
				}

				if (!comentarioDeBloque) {
					bw.write(lineaDestino+"\n");
				}
			}

			br.close();
			bw.close();

		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}

	}

}
