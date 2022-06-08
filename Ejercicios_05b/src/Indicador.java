import java.util.Scanner;

/**
 * <p><i>Archivo: Indicador.java</i></p>
 * <p></b>Ejercicio 05</b>.</p>
 * @since 08/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Indicador {

	private int veloMAXIMA;
	Scanner tec=new Scanner(System.in);

	public void introDatos() {
		System.out.println("Introduce la velocidad maxima a la que se puede llegar");
		veloMAXIMA=tec.nextInt();
		tec.nextLine();
	}

	public void modDatos() {
		int op=0;
		System.out.println("La velocidad que se puede alcanzar es de "+veloMAXIMA+" km/h.");
		System.out.println("¿Desea modificarla? (1)Si (0)No");
		op=tec.nextInt();
		tec.nextLine();
		if (op==1) {
			System.out.println("Introduce la velocidad maxima a la que se puede llegar");
			veloMAXIMA=tec.nextInt();
			tec.nextLine();
		} else if (op==0) {
			System.out.println("\tSe mantiene la velocidad maxima.");
		} else {
			System.out.println("\tOpcion desconocida.");
		}
	}

	public void acelera() {
		System.out.println("\tAcelerando ...");
		int valor=(int)(Math.random()*veloMAXIMA);
		for (int v=0; v<valor; v++) {
			System.out.print(v+" ");
		}
		System.out.print("km/h");
	}

	public void reduce() {
		System.out.println("\tReduciendo ...");
		int valor=(int)(Math.random()*veloMAXIMA);
		for (int v=valor; v>0; v--) {
			System.out.print(v+" ");
		}
		System.out.println("km/h");
	}

}
