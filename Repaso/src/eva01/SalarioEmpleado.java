package eva01;

/**
 * <p><i>Archivo: SalarioEmpleado.java</i></p>
 * <p><b>Ejercicio 04</b>. Escribe un programa que calcule el salario semanal de un 
 * empleado en base a las horas trabajadas, a razon de 12 euros la hora.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class SalarioEmpleado {

	public static void main(String[] args) {

		int h_trabajadas=34; int h_euros=12; double sueldo_semanal;

		System.out.println("\tCALCULAR SALARIO SEMANAL DE UN EMPLEADO.");
		System.out.println("\t----------------------------------------");

		sueldo_semanal=(double)h_trabajadas*h_euros;

		// Cuando las horas de trabajo exceden de 40 se consideran horas extra
		// Las primeras 8 se pagan al doble
		if (h_trabajadas>40)
			sueldo_semanal=sueldo_semanal+(h_trabajadas-40)*h_euros;

		// Si las horas extra exceden de 8 se pagan las primeras 8 al doble de lo 
		// que se pagan las horas normales
		if (h_trabajadas>48)
			sueldo_semanal=sueldo_semanal+(h_trabajadas-48)*h_euros;

		System.out.print("\tSalario semanal del empleado: "+sueldo_semanal+"€.");

	}

}
