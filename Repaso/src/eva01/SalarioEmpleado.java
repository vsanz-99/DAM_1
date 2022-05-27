package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: SalarioEmpleado.java</i></p>
 * <p><b>Ejercicio 04</b>. Escribe un programa que calcule el salario semanal de un 
 * empleado en base a las horas trabajadas, a razon de 12 euros la hora.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class SalarioEmpleado {

	public static void main(String[] args) {

		int h_trabajadas=0; int h_euros=12; double sueldo_semanal=0;

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		System.out.println("\tCALCULAR SALARIO SEMANAL DE UN EMPLEADO.");
		System.out.println("\t----------------------------------------");
		System.out.println();

		System.out.println("\tPor favor, introduzca el numero de horas trabajadas durante la semana: ");
		h_trabajadas=teclado.nextInt();

		sueldo_semanal=(double)h_trabajadas*h_euros;

		if (h_trabajadas>40 && h_trabajadas<=80) {
			h_euros=16;
			int h_extra=(h_trabajadas-40)*h_euros;
			sueldo_semanal=480+h_extra;
		}

		System.out.print("\tEl sueldo semanal que le corresponde es de "+sueldo_semanal+" euros");

	}

}
