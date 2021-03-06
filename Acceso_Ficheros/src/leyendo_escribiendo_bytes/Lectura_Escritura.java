package leyendo_escribiendo_bytes;
import java.io.*;

public class Lectura_Escritura {

	public static void main(String[] args) {
		int contador=0;
		int datos_entrada[]=new int[85317]; // Array de 85317 posiciones.
		try {
			FileInputStream archivo_lectura=new FileInputStream("H:/eclipse_myworkspace/me.jpg");
			boolean final_ar=false;
			while (!final_ar) { // Mientras sea cierto.
				int byte_entrada=archivo_lectura.read();
				if (byte_entrada!=-1) { // En el caso de que haya llegado al final, no meta el -1 en el array.
					datos_entrada[contador]=byte_entrada;
				} else {
					final_ar=true;
				}
				if (byte_entrada==-1)
					final_ar=true;
				//System.out.println(byte_entrada); // Donde se almacenan los bytes que va leyendo (uno a uno).
				System.out.println(datos_entrada[contador]); // Valores almacenados en datos_entrada.
				contador++;
			}
			archivo_lectura.close();
		} catch (IOException e) {
			System.out.println("Error al acceder al archivo");
			e.printStackTrace();
		}
		System.out.println(contador);
		crea_fichero(datos_entrada);
	}

	static void crea_fichero(int datos_nuevo_fichero[]) {
		try {
			FileOutputStream fichero_nuevo=new FileOutputStream("H:/eclipse_myworkspace/me_copia.jpg");
			for (int i=0; i<datos_nuevo_fichero.length; i++) {
				fichero_nuevo.write(datos_nuevo_fichero[i]);
			}
			fichero_nuevo.close();
		} catch (IOException e) {
			System.out.println("\tError al crear el archivo.");
			e.printStackTrace();
		}
	}

}
