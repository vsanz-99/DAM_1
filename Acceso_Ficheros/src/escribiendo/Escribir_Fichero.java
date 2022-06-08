package escribiendo;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir_Fichero {

	public static void main(String[] args) {
		Escribiendo accede_escritura=new Escribiendo();
		accede_escritura.escribir();
	}

}

class Escribiendo {

	public void escribir() {
		String frase="Esto es otra prueba de escritura";
		try {
			FileWriter escritura=new FileWriter("C:/Users/PC/Downloads/reciente/texto_nuevo.txt", true); // En el caso de que exista el fichero
																										 // Sin el true, sobreescribe el fichero
			for (int i=0; i<frase.length(); i++) { // Muestra lo que escribe
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
