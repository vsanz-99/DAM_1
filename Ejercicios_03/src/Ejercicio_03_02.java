import java.util.Scanner;

/**
 * <p>Leer un numero N que debe filtrarse entre 1 y 10. A continuacion calcular
 * y escribir la tabla de multiplicar de dicho numero.</p>
 * @since 02/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_03_02 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num, producto;
		num=producto=0;
		do {
			System.out.println("Introduce un numero entre 1 y 10 para mostrar su tabla de multiplicar: ");
			num=Integer.parseInt(teclado.nextLine());
		} while ((num<1) || (num>10));
		teclado.close();
		System.out.println("TABLA DE MULTIPLICAR DE "+num+"\n");
		for (int i=1; i<=10; i++) {
			producto=num*i;
			System.out.println(num+" * "+i+" = "+producto);
		}
	}

}

