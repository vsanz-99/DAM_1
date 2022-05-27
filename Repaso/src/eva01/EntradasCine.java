package eva01;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <p><i>Archivo: EntradasCine.java</i></p>
 * <p><b>Ejercicio 11</b> Realiza un programa que calcule el precio de unas entradas de cine en funcion del numero de 
 * personas y del dia de la semana. El precio base de una entrada son 8 euros. El miercoles (dia del 
 * espectador), el precio base es de 5 euros. Los jueves son el dia de la pareja, por lo que la 
 * entrada para dos cuesta 11 euros. Con la tarjeta CinePas se obtiene un 10% de descuento. Si un 
 * jueves, un grupo de 6 personas compran entradas, el precio total seria de 33 euros ya que son 3 
 * parejas; pero si es un grupo de 7, pagaran 3 entradas de pareja mas 1 individual que son 41 
 * euros (33+8).</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class EntradasCine {

	public static void main(String[] args) {

		int personas; int diaSemana=0; double precio_total=0; int opcion; 

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		System.out.println("\tCALCULAR EL PRECIO DE LAS ENTRADAS DE CINE.");
		System.out.println("\t-------------------------------------------");
		System.out.println();

		do {
			System.out.println("\tIntroduce el numero de personas: ");
			personas=Integer.parseInt(teclado.nextLine());
		} while (personas<=0 || personas>10);

		do {
			System.out.println("\t(0)Lunes; (1)Martes; (2)Miercoles; (3)Jueves; (4)Viernes; (5)Sabado; (6)Domingo");
			System.out.println("\tIntroduce el dia de la semana: ");
			diaSemana=teclado.nextInt();
		} while (diaSemana<0 || diaSemana>6);

		switch (diaSemana) {
		case 0, 1, 4, 5, 6:
			precio_total=(double)personas*8;
		break;
		case 2 :
			precio_total=(double)personas*5;
			break;
		case 3 :
			int parejas=0;
			if (personas%2==0) {
				parejas=personas/2;
				precio_total=(double)parejas*11;
			} else {
				personas--;
				parejas=personas/2;
				precio_total=(double)parejas*11+8;
			}
			break;
		default :
		}

		try {
			do {
				System.out.println("\t¿Tiene tarjeta CinePas? (1)Si (0)No");
				opcion=teclado.nextInt();
			} while (opcion!=0 && opcion!=1 );
			if (opcion==1) {
				System.out.println("\tSe aplica el descuento.");
				precio_total=precio_total-(precio_total*0.10);
			} else {
				System.out.println("\tNo se aplica el descuento.");
			}	
		} catch(InputMismatchException e) {
			e.printStackTrace();
		}

		System.out.println("\tPrecio de las entrada: "+precio_total+" euros");

	}

}
