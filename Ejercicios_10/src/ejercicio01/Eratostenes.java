package ejercicio01;
import java.io.*;

/**
 * <p><i>Archivo: Eratostenes.java</i></p>
 * @since 09/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Eratostenes {

	public void escribir_primos(String ruta_archivo) {

		int n=500; // Rango: 0-500

		// Criba de Eratostenes - Sieve of Eratosthenes

		int tope=(int)Math.floor(Math.sqrt(n));

		// Crear una matriz booleana "primos" e inicializa toda las entradas como true
		boolean primos[]=new boolean[n+1];

		for (int i=2; i<=tope; i++) {
			if (primos[i]==false) {}

			for (int j=i; j<=n/i; j++) {
				primos[j*i]=true;
			}
		}

		int count=1;
		try {

			FileWriter escritura=new FileWriter(ruta_archivo);

			for (int i=2; i<n; i++) {
				if (primos[i]==false) {
					count++;
					escritura.write(i+" ");
				}

				if (count==10) {
					count=1;
					escritura.write("\n");	
				}
			}

			System.out.println("Fichero escrito correctamente");

			escritura.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
