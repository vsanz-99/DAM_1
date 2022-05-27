package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: PosicionDigito.java</i></p>
 * <p><b>Ejercicio 15</b>. Realiza un programa que pida primero un numero y a continuacion un digito. El programa nos 
 * debe dar la posicion (o posiciones) contando de izquierda a derecha que ocupa ese digito en el 
 * numero introducido.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class PosicionDigito {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("\tIntroduce un numero entero: ");
		long numIntroducido=teclado.nextLong();
		
		System.out.println("\tIntroduce un digito: ");
		int digito=teclado.nextInt();
		
		System.out.println();
		
		System.out.print("Contando de izquierda a derecha, el "+digito);
		System.out.println(" aparece dentro de "+numIntroducido);
		System.out.print("en las siguientes posiciones: ");
		
		// Copia del numero introducido
		long numero=numIntroducido;
		
		// Anade un 1 al final por si el numero introducido termina en ceros, 
		// por ej. 10, 1000, etc.
		numero=numero*10+1;
		
		// Le da la vuelta al numero y calcula la longitud
		long volteado=0;
		@SuppressWarnings("unused")
		int longitud=0;
		int posicion=1;
		
		if (numero==0)
			longitud=1;
		
		while (numero>0) {
			volteado=(volteado*10)+(numero%10);
			numero/=10;
			longitud++;
		} // while
		
		// Comprobar la posicion
		while (volteado !=1) {
			if ((volteado%10)==digito) {
				System.out.print(posicion+" ");
			}
			volteado/=10;
			posicion++;
		} // while
		
		System.out.println();
		
	}

}
