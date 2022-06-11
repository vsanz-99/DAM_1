import java.util.*;

/**
 * <p>Leer un numero y mostrar por pantalla si es perfecto o no.</p>
 * @since 09/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_03_09 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int suma, num;
		suma=num=0;
		do {
			System.out.print("Introduce un numero para averiguar "
					+"si es un un numero perfecto: ");
			num=Integer.parseInt(teclado.nextLine());
		} while (num<=0);
		teclado.close();
		for (int i=1; i<num; i++) { // La variable i son los divisores. Se divide desde 1 hasta n-1.
			if (num%i==0) {
				suma+=i; // Si es divisor se suma.
			}
		}
		if (suma==num) { // Si el numero es igual a la suma de sus divisores es perfecto.
			System.out.println("\n\tEl numero introducido SI es perfecto.");
		} else {
			System.out.println("\n\tEl numero introducido NO es perfecto.");
		}		
	}

}
