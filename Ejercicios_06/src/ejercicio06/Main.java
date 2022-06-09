package ejercicio06;

/**
 * <p><i>Archivo: Main.java</i></p>
 * <p><b>Ejercicio 06</b>.</p>
 * @since 09/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Main {

	public static void main(String[] args) {
		final int N=50;
		int n, c, t;
		n=c=t=0;
		double sueldo;
		// Crear el array de emplados.
		Empleado[] empleados=new Empleado[N];
		// N determina el tamanio del array.
		String[] nombres={"Juan Ocabo", "Victor Sanz", "Pedro Lahoz", 
				"Manuel Gutierrez", "Paula Lopez", "Ines Cruz", "Marcos Moros", 
				"Maria Martinez", "Roberto Bueno", "Raul Garces"};
		String[] casado={"si", "no"};
		char[] turno={'D', 'N'};
		// Crea todos los discos que van en cada una de las 
		// celdas del array.
		for (int i=0; i<empleados.length; i++) {
			n=(int)(Math.random()*10);
			sueldo=(double)(Math.random()*(2800-900));
			c=(int)(Math.random()*2);
			t=(int)(Math.random()*2);
			empleados[i]=new Empleado(nombres[n], sueldo, casado[c], turno[t]);
		}
		for (int i=0; i<empleados.length; i++) {
			System.out.println(empleados[i]);
		}
	}

}
