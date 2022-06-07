package excepcion01;
import java.io.IOException;
import java.util.Scanner;

/**
 * <p><i>Archivo: Excepciones_01.java</i></p>
 * <p><b>Ejercicio 01</b>. Programa que pida los datos de dos alumnos: 
 * nombre, edad y altura. Visualiza los datos de dichos alumnos e indica 
 * cual es el mayor de los dos. Si ambos tienen la misma edad hay que mostrar un 
 * mensaje que lo indique.</p>
 * <p>Si se produce el error IOException, se visualizara el mensaje correspondiente 
 * y se cerrara el programa.</p>
 * <p>En la entrada de datos, tanto de la altura como de la edad, se comprobara que el 
 * usuario no haya insertado letras. Si es asi, se volvera a pedir el dato correspondiente 
 * hasta que la entrada sea correcta.</p>
 * @since 07/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Excepciones_01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		String nombre1, nombre2;
		nombre1=nombre2="";
		String edad1, edad2;
		edad1=edad2="";
		String altura1, altura2;
		altura1=altura2="";
		Scanner teclado=new Scanner(System.in);
		// -------------------------------------------------------------------
		System.out.println("PRIMER ALUMNO: \n");
		do {
			System.out.println("\tIntroduce el nombre del primer alumno: ");
			nombre1=teclado.next();
			teclado.nextLine();
		} while (nombre1.isEmpty());
		do {
			System.out.println("\tIntroduce la edad del primer alumno: ");
			edad1=teclado.next();
			teclado.nextLine();
		} while (!contieneSoloNumeros(edad1));
		do {
			System.out.println("\tIntroduce la altura del primer alumno (en cm): ");
			altura1=teclado.next();
			teclado.nextLine();
		} while (!contieneSoloNumeros(altura1));
		System.out.println("\tNombre: "+nombre1+"\n"
				+"\tEdad: "+edad1+"\n"
				+"\tAltura: "+altura1+"\n");
		System.out.println();
		// -------------------------------------------------------------------
		System.out.println("SEGUNDO ALUMNO: \n");
		do {
			System.out.println("\tIntroduce el nombre del segundo alumno: ");
			nombre2=teclado.next();
			teclado.nextLine();
		} while (nombre2.isEmpty());
		do {
			System.out.println("\tIntroduce la edad del segundo alumno: ");
			edad2=teclado.next();
			teclado.nextLine();
		} while (!contieneSoloNumeros(edad2));
		do {
			System.out.println("\tIntroduce la altura del segundo alumno (en cm): ");
			altura2=teclado.next();
			teclado.nextLine();
		} while (!contieneSoloNumeros(altura2));
		System.out.println("\tNombre: "+nombre2+"\n"
				+"\tEdad: "+edad2+"\n"
				+"\tAltura: "+altura2+"\n");
		System.out.println();
		// -------------------------------------------------------------------
		int numedad1=Integer.parseInt(edad1);
		int numedad2=Integer.parseInt(edad2);
		if (numedad1!=0 && numedad2!=0) {
			if (numedad1>numedad2) {
				System.out.println("\tEl primer alumno, "+nombre1+", es mayor que el segundo alumno, "+nombre2+".");
			} else if (numedad1<numedad2){
				System.out.println("\tEl primer alumno, "+nombre1+", es menor que el segundo alumno, "+nombre2+".");
			} else {
				System.out.println("\tLos dos alumnos, "+nombre1+" y "+nombre2+", tienen la misma edad.");
			}
		} else {
			throw new IOException("Error de Entrada/Salida. La edad no puede ser 0.");
		}
		System.out.println("\tFin del programa.");
		teclado.close();
	}

	public static boolean contieneSoloNumeros(String cadena) {
		// Si la cadena esta vacia, debemos devolver false.
		if (cadena.length()==0) {
			return false;
		}
		for (int x=0; x<cadena.length(); x++) {
			char c=cadena.charAt(x);
			// Si no esta entre 0 y 9.
			if (!(c>='0' && c<='9')) {
				return false;
			}
		}
		return true;
	}

}
