package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: InsertaDigito.java</i></p>
 * <p><b>Ejercicio 17</b>. Escribe un programa que sea capaz de insertar un digito dentro 
 * de un numero indicando la posicion. El nuevo digito se colocara en la posicion indicada y el 
 * resto de digitos se desplazara hacia la derecha. Las posiciones se cuentan de izquierda a 
 * derecha empezando por el 1. Suponemos que el usuario introduce correctamente los datos. 
 * No se permite el uso de String.</p>
 * @since 27/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class InsertaDigito {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("\tIntroduce un numero entero: ");
		long numeroIntroducido=teclado.nextLong();
		
		System.out.println("\tIntroduce un digito: ");
		int digito=teclado.nextInt();
		
		System.out.println("\tContando de izquierda a derecha ...");
		System.out.println("\tEl digito aparece dentro de "+numeroIntroducido+
				" en las siguientes posiciones: ");
		
		// Se hace una copia del numero introducido.
		long numero=numeroIntroducido;
		
		// Anade un 1 al final por si el numero introducido termina en ceros,
		// por ej. 10, 1000, etc.
		
		long volteado=0;
		@SuppressWarnings("unused")
		int longitud=0;
		int posicion=1;
		
		if (numero==0) {
			longitud=1;
		}
		
		while (numero>0) {
			volteado=(volteado*10)+(numero%10);
			numero/=10;
			longitud++;
		} // while
		
		System.out.print("\t");
		// Comprueba la posicion: 
		while (volteado!=1) {
			if ((volteado%10)==digito) {
				System.out.print(posicion+" ");
			}
			volteado/=10;
			posicion++;
		} // while
		System.out.println();

	}

}
