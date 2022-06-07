package eva01;

/**
 * <p><i>Archivo: Tragaperras.java</i></p>
 * <p><b>Ejercicio 20</b>. Realiza un simulador de maquina tragaperras 
 * simplificada que cumpla los siguientes requisitos: </p>
 * <p>El ordenador mostrara una tirada que consiste en mostrar 3 figuras. 
 * Hay 5 figuras posibles: corazon, diamante, herradura, campana y limon.</p>
 * <ol type="a">
 * <li>Si las tres figuras son diferentes se debe mostrar el mensaje "Lo siento, ha perdido".</li>
 * <li>Si hay dos figuras iguales y una diferente se debe mostrar el mensaje "Bien, ha recuperado su moneda".</li>
 * <li>Si las tres figuras son iguales se debe mostrar "Enhorabuena, ha ganado 10 monedas".</li>
 * </ol>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Tragaperras {

	public static void main(String[] args) {

		// Presentacion del programa.
		System.out.print("\nBienvenid@ a la maquina tragaperras, si consigue 2 figuras iguales le devolveremos");
		System.out.println(" su dinero, si consigue las 3, habra ganado el premio. ¡Buena suerte!.");
		System.out.println("-----------------------------------------------------------------------------");
		int figuras; // Almacena las figuras al azar.
		int figura1=0; // Almacena la figura 1.
		int figura2=0; // Almacena la figura 2.
		int figura3=0; // Almacena la figura 3.
		System.out.println();

		// Genera 3 figuras al azar.
		for (int i=1; i<=3; i++) {
			figuras=(int)(Math.random()*5+1);
			// Almacena las 3 figuras.
			if (i==1) {
				figura1=figuras;
			} else if (i==2) {
				figura2=figuras;
			} else if (i==3) {
				figura3=figuras;
			}
			switch (figuras) {
			case 1 :
				System.out.print("Corazon ");
				break;
			case 2 :
				System.out.print("Diamante ");
				break;
			case 3 :
				System.out.print("Herradura ");
				break;
			case 4 :
				System.out.print("Campana ");
				break;
			case 5 :
				System.out.print("Limon ");
				break;
			default :
				System.out.print("Nada");
			}
		}

		System.out.println("\n---------------------------------------------------------------------------");

		// Muestra los resultados por pantalla segun las condiciones.
		if ((figura1==figura2) && (figura2==figura3)) {
			System.out.print("\n¡Enhorabuena, ha ganado el premio!, aqui tiene sus 10 monedas.");
		} else if ((figura1==figura2) || (figura1==figura3) || (figura2==figura3)) {
			System.out.println("\n¡Uy!, ha estado a punto, aqui tiene su moneda de nuevo. En la siguiente tirada tendra mas suerte.");
		} else {
			System.out.print("\nVaya ... ha perdido, no se desanime, a la siguiente tendra mas suerte ...");
		}

	}

}
