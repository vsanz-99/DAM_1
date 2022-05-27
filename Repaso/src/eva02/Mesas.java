package eva02;
import java.util.Scanner;

/**
 * <p><i>Archivo: Mesas.java</i></p>
 * <p><b>Ejercicio 04</b>. Un restaurante nos ha encargado una aplicacion para colocar a los 
 * clientes en sus mesas. En una mesa se pueden sentar de 0 (mesa vacia) a 4 comensales (mesa llena). 
 * Cuando llega un cliente se le pregunta cuantos son. De momento el programa no esta 
 * preparado para colocar a grupos mayores a 4, por tanto, si un cliente dice por ejemplo que 
 * son un grupo de 6, el programa dara el mensaje "Lo siento, no admitimos grupos de 6, solo 
 * grupos de 4 personas como maximo". Para el grupo que llega, se busca siempre la primera 
 * mesa libre (con 0 personas). Si no quedan mesas libres, se indica con el mensaje "Lo 
 * siento, no quedan mesas libres". Una mesa puede quedar libre porque sus comensales han 
 * finalizado. Escribe un programa interactivo en el que puedas ir ocupando/liberando 10 mesas 
 * (de la 1 a la 10), hasta que decidas finalizar. El programa debe mostrar el estado de las 
 * mesas cada vez que este cambia.</p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Mesas {

	public static void main(String[] args) {

		int[] mesa=new int[10];

		// Rellena las mesas de forma aleatoria.
		for (int i=0; i<10; i++) {
			mesa[i]=(int)(Math.random()*5);
		}

		int clientes=0; // Numero de clientes que llegan al restaurante buscando mesa.

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		do {

			// Muestra el estado de ocupacion de las mesas:
			System.out.println("\n|---------|----|----|----|----|----|----|----|----|----|----|");
			System.out.print("|Mesa nº: ");
			for (int i=1; i<11; i++) {
				System.out.printf("| %2d ", i);
			}
			System.out.println("\n|---------|----|----|----|----|----|----|----|----|----|----|");
			System.out.print("|Ocupacion");
			for (int m : mesa) {
				System.out.printf("| %2d ", m);
			}
			System.out.println("\n|---------|----|----|----|----|----|----|----|----|----|----|");

			System.out.print("¿Cuantos son? (Introduzca -1 para salir del programa): ");
			clientes=Integer.parseInt(teclado.nextLine());

			if (clientes>4) { // Comprueba si el grupo de clientes es mayor que 4.
				System.out.print("\tLo siento, no admitimos grupos de mas de 4 personas, haga grupos de "
						+ "4 personas como maximo. Intentelo de nuevo.");
			} else if (clientes==-1) {
				System.out.println("\tFinalizando programa ...");
			} else {
				// Primero busca una mesa que este vacia.
				int iVacia=0;
				boolean hayMesaVacia=false;
				for (int i=9; i>=0; i--) {
					if (mesa[i]==0) {
						iVacia=i;
						hayMesaVacia=true;
					}
				}
				if (hayMesaVacia && clientes!=-1) {
					mesa[iVacia]=clientes; // Coloca a los clientes en la mesa libre.
					System.out.println("\tPor favor, sientese en la mesa numero "+(iVacia+1)+".");
				} else {
					// Busca un hueco para todo el grupo.
					int iHueco=0;
					boolean hayHueco=false;
					for (int i=9; i>=0; i--) {
						if (clientes<=(4-mesa[i])) {
							iHueco=i;
							hayHueco=true;
						}
					}
					if (hayHueco && clientes!=-1) {
						mesa[iHueco]+=clientes; // Coloca a los clientes en el primer hueco disponible
						System.out.println("\tTendran que compartir mesa. Por favor, sientese en la mesa numero "
								+(iHueco+1)+".");
					} else {
						System.out.println("\tLo siento, en estos momentos no hay ningun sitio disponible.");
					}
				}
			}

		} while (clientes!=-1);

	}

}
