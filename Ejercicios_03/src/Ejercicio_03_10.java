import java.util.*;

/**
 * <p>Leer un numero N y encontrar el numero P primo 
 * mas cercano a el por exceso.</p>
 * @since 08/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_03_10 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num=0; int x=2;
		do {
			System.out.println("Introduce un numero: ");
			num=Integer.parseInt(teclado.nextLine());
		} while (num<=0);
		teclado.close();
		while (num!=x && num>0) {
			while (num%x!=0) {
				x++;
			}
			if (x==num) {
				System.out.println("\n\tEl primo mas cercano al numero introducido es: "+num);
			} else {
				num++;
			}
		}
	}

}
