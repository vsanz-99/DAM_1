import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * <p><i>Archivo: Ejercicio01.java</i></p>
 * <p><b>Ejercicio 01</b>.</p>
 * @since 12/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio01 {

	public static void main(String[] args) {
		CribaEratostenes criba=new CribaEratostenes(500);
		PrintStream ps=null;
		try {
			ps=new PrintStream(
					new FileOutputStream("primos.txt"), true); 
			ps.print(criba.primos);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} finally {
			if (ps!=null)
				ps.close();
		}
	}

}
