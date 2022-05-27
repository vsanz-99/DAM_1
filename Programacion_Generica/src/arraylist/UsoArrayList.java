package arraylist;
import java.io.*;

public class UsoArrayList {

	public static void main(String[] args) {

		ArrayList archivos=new ArrayList(5);

		archivos.add("Juan"); // Posicion 0
		archivos.add("Maria"); // ...
		archivos.add("Ana");
		archivos.add("Sandra");
		archivos.add(new File("gestion_Pedidos.accdb")); // Da error en tiempo de compilacion. ClassCastException

		String nombrePersona=(String)archivos.get(4); // Casting

		/*
		archivos.add(new File("gestion_Pedidos.accdb")); // Objeto de tipo File

		File nombrePersona=(File)archivos.get(0);
		 */

		System.out.print(nombrePersona);

		// Inconveniente: el casting

	}

}
