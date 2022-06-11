import java.util.*;

/**
 * <p>Leer un numero N (filtrando que debe ser mayor que 0) y calcular
 * su factorial.</p>
 * @since 08/11/2021
 * @version 1.0
 * @param args
 * @author Victor Sanz*/

public class Ejercicio_03_08 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num=0; long factorial=1;
		do {
			System.out.println("Introduce un numero: ");
			num=Integer.parseInt(teclado.nextLine());
		} while (num<=0);
		teclado.close();
		while (num>0) {
			factorial=factorial*num; 
			num--;
		}
		System.out.println("\n\tEl factorial del numero introducido es: "+factorial);
	}

}