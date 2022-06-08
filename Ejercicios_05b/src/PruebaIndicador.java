import java.util.Scanner;

/**
 * <p><i>Archivo: PruebaIndicador.java</i></p>
 * <p></b>Ejercicio 05</b>.</p>
 * @since 08/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class PruebaIndicador {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Indicador nuevo=new Indicador();
		int op=0;
		@SuppressWarnings("unused")
		boolean verify=true;
		nuevo.introDatos();
		nuevo.modDatos();
		do {
			System.out.println();
			System.out.println("¿Que desea hacer?\n"
					+"\t1-. Acelerar.\n"
					+"\t2-. Reducir.\n"
					+"\t3-. Salir.\n");
			op=teclado.nextInt();
			teclado.nextLine();
			switch (op) {
			case 1 :
				nuevo.acelera();
				break;
			case 2 :
				nuevo.reduce();
				break;
			case 3 :
				verify=false;
				break;
			default :
				System.out.println("\tATENCION: el sistema NO contempla la opcion"
						+"introducida.");
			}
		} while (verify=true);
		teclado.close();
	}

}
