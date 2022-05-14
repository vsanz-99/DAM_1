package clases_propias;
import java.util.*;

public class MetodosGenericos {

	public static void main(String[] args) {

		String nombres[]={"Jose", "Maria", "Pepe"};

		System.out.println(MisMatrices.getMenor(nombres));
		
		//Empleado paco=new Empleado("Paco", 45, 2500);
		//Empleado ana=new Empleado("Ana", 45, 2500);
		//Empleado maria=new Empleado("Maria", 45, 2500);
		
		//Empleado misEmpleados[]={paco, ana, maria};
		
		//System.out.println(MisMatrices.getMenor(misEmpleados)); // No implementan la
																// clase Comparable
		/*
		String elementos=MisMatrices.<String>getElementos(nombre);

		System.out.println(elementos);

		Empleado listaEmpleados[]={new Empleado("Ana", 45, 2500), 
				new Empleado("Ana", 45, 2500),
				new Empleado("Ana", 45, 2500),
				new Empleado("Ana", 45, 2500),
				new Empleado("Ana", 45, 2500)
		};

		System.out.println(MisMatrices.getElementos(listaEmpleados));
		 */

		GregorianCalendar fechas[]={new GregorianCalendar(2015,07,12),
				new GregorianCalendar(2015,05,12),
				new GregorianCalendar(2015,04,12)
		};
		
		System.out.println(MisMatrices.getMenor(fechas).getTime());
		
	}

}

class MisMatrices {

	// Metodo de generico y de clase
	public static <T extends Comparable> T getMenor(T[]a) { // Comparar dos elementos genericos entre si

		// Todos los objetos que pasen por este metodo generico tienen que ser objetos que implementen la interfaz comparable

		if (a==null || a.length==0) {

			return null;

		}

		T elementoMenor=a[0]; // Posicion almacenada

		for (int i=1; i<a.length; i++) {

			if (elementoMenor.compareTo(a[i])>0) {

				elementoMenor=a[i];

			}
		}

		return elementoMenor;

	}

}
