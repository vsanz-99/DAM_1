import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		boolean vacioF1=false;
		@SuppressWarnings("unused")
		boolean vacioF2=false;
		Scanner entrada1=null;
		Scanner entrada2=null;
		PrintStream printStream=null;
		try {
			String lineaF1="";
			String lineaF2="";
			int contador=1;
			entrada1=new Scanner(
					new BufferedReader(
							new FileReader("ej3_primero.txt")));
			entrada2=new Scanner(
					new BufferedReader(
							new FileReader("ej3_segundo.txt")));
			printStream=new PrintStream(
					new FileOutputStream("ejercicio3.txt"));
			while (entrada1.hasNext() || entrada2.hasNext()) {
				if (contador%2!=0 && entrada1.hasNext()) {
					lineaF1=entrada1.nextLine();
					printStream.println(lineaF1);
				} else if (contador%2!=0) {
					lineaF2=entrada2.nextLine();
					printStream.println(lineaF2);
				} else if (contador%2==0 && entrada2.hasNext()) {
					lineaF2=entrada2.nextLine();
					printStream.println(lineaF2);
				} else if (entrada1.hasNext()) {
					lineaF1=entrada1.nextLine();
					printStream.println(lineaF1);
				}
				contador++;
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} finally {
			if (entrada1!=null)
				entrada1.close();
			if (entrada2!=null)
				entrada2.close();
			if (printStream!=null)
				printStream.close();
		}
	}

}
