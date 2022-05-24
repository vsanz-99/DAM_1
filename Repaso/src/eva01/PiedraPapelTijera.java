package eva01;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <p><i>Archivo: PiedraPapelTijera.java</i></p>
 * <p><b>Ejercicio 12</b>. Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce su jugada y luego el 
 * usuario 2. Si alguno de los usuarios introduce una opcion incorrecta, el programa debera 
 * mostrar un mensaje de error.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class PiedraPapelTijera {

	public static void main(String[] args) {

		int seleccionJugador1=0; int seleccionJugador2=0;
		int opcion=0;

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		System.out.println("\tJuego Piedra-Papel-Tijera.");
		System.out.println("\t--------------------------");
		System.out.println();

		do {
			System.out.println("\t[1=Piedra, 2=Papel, 3=Tijera]");
			System.out.println();
			do {
				System.out.println("\tSeleccion Jugador1: ");
				seleccionJugador1=teclado.nextInt();
			} while (seleccionJugador1<1 || seleccionJugador1>3);
			do {
				System.out.println("\tSeleccion Jugador2: ");
				seleccionJugador2=teclado.nextInt();
			} while (seleccionJugador2<1 || seleccionJugador2>3);
			switch (seleccionJugador1) {
			case 1 :
				System.out.println("\tJugador1: Piedra");
				switch (seleccionJugador2) {
				case 1 : 
					System.out.println("\tJugador2: Piedra");
					System.out.println("\tEmpate!"); 
					break;
				case 2 : 
					System.out.println("\tJugador2: Papel");
					System.out.println("\tJugador2 gana!"); 
					break;
				case 3 : 
					System.out.println("\tJugador2: Tijera");
					System.out.println("\tJugador1 gana!"); 
					break;
				}
				break;
			case 2 :
				System.out.println("\tJugador1: Papel");
				switch (seleccionJugador2) {
				case 1 : 
					System.out.println("\tJugador2: Piedra");
					System.out.println("\tJugador1 gana!"); 
					break;
				case 2 : 
					System.out.println("\tJugador2: Papel");
					System.out.println("\tEmpate!"); 
					break;
				case 3 : 
					System.out.println("\tJugador2: Tijera");
					System.out.println("\tJugador2 gana!"); 
					break;
				}
				break;
			case 3 :
				System.out.println("\tJugador1: Tijera");
				switch (seleccionJugador2) {
				case 1 : 
					System.out.println("\tJugador2: Piedra");
					System.out.println("\tJugador2 gana!"); 
					break;
				case 2 : 
					System.out.println("\tJugador2: Papel");
					System.out.println("\tJugador1 gana!"); 
					break;
				case 3 : 
					System.out.println("\tJugador2: Tijera");
					System.out.println("\tEmpate!"); 
					break;
				}
				break;
			}
			try {
				do {
					System.out.println("\t�Continuar? (1)Si (0)No");
					opcion=teclado.nextInt();
				} while (opcion!=1 && opcion!=0);
			} catch(InputMismatchException e) {
				System.out.println("\tError: opcion desconocida.");
			}
		} while (opcion!=0);

	}

}
