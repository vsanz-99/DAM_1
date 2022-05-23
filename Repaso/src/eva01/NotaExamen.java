package eva01;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * <p><i>Archivo: NotaExamen.java</i></p>
 * <p><b>Ejercicio 05</b>. Escribe un programa que calcule la nota que hace falta sacar en el segundo examen de la 
 * asignatura Programacion para obtener la media deseada. Hay que tener en cuenta que la nota 
 * del primer examen cuenta el 12% y la del segundo examen un 28%.</p>
 * <p><b>Nota: </b>Al normalizar sus valores, la nota del primer examen cuenta el 30% y del 
 * segundo examen el 70%.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class NotaExamen {

	public static void main(String[] args) {

		double first_exam=0.0; double second_exam=0.0; double eva02=0.0;

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		System.out.println("\tCALCULO DE LA NOTA DEL SEGUNDO EXAMEN.");
		System.out.println("\t--------------------------------------");
		System.out.println();

		do {

			System.out.println("\tIntroduce la nota del primer examen: ");
			first_exam=teclado.nextDouble();

		} while (first_exam<=0);

		do {

			System.out.println("\t¿Que nota quieres sacar en la segunda evaluacion?");
			eva02=teclado.nextDouble();

		} while (eva02<=0);

		second_exam=(eva02-first_exam*0.3)/0.7;

		DecimalFormat df=new DecimalFormat("###.##");

		System.out.println("\tPara tener un "+eva02+" en la segunda evaluacion necesitas sacar un "+df.format(second_exam)+
				" en el segundo examen.");

	}

}
