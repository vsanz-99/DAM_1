import java.util.Scanner;

/**
 * <p><i>Archivo: PruebaCuentaCorriente.java</i></p>
 * <p><b>Ejercicio 04</b>.</p>
 * @since 06/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class PruebaCuentaCorriente {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int op=0;
		boolean verify=true;
		do {
			System.out.println("¿Que desea hacer?\n"
					+"\t1-. Consultar saldo.\n"
					+"\t2-. Ingresar dinero.\n"
					+"\t3-. Sacar dinero.\n"
					+"\t4-. Salir.");
			op=teclado.nextInt();
			teclado.nextLine();
			switch (op) {
			case 1 :
				CuentaCorriente.consultarSaldo();
				break;
			case 2 :
				CuentaCorriente.ingresarDinero();
				break;
			case 3 :
				CuentaCorriente.retiraDinero();
				break;
			case 4 :
				verify=false;
				break;
			default :
				System.out.println("\tATENCION: el sistema NO contempla la opcion"
						+"introducida.");
			}
		} while (verify);
		teclado.close();
	}

}
