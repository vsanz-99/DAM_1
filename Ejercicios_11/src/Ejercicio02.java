import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * <p><i>Archivo: Ejercicio02.java</i></p>
 * <p><b>Ejercicio 02</b>.</p>
 * @since 12/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner entrada=null;
		try {
			entrada=new Scanner(
					new BufferedReader(
							new FileReader("primos.txt")));

			String linea=entrada.nextLine();
			System.out.print(linea);

		}catch (FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}finally {
			if (entrada!=null) {
				entrada.close();
			}
		}
	}

}
