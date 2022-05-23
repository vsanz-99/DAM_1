package eva01;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * <p><i>Archivo: TiempoCaida.java</i></p>
 * <p><b>Ejercicio 08</b>. Realiza un programa que calcule el tiempo que 
 * tardara en caer un objeto desde una altura h.</p>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/


public class TiempoCaida {

	public static void main(String[] args) {

		int h=0; double g=9.81; double t=0.0;

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		System.out.println("\t¿A que altura se encuentra el objeto en cuestion (metros)?");
		h=teclado.nextInt();

		t=Math.sqrt((2*h)/g);

		DecimalFormat df=new DecimalFormat("###.###");

		System.out.println("\tEl objeto situado a una altura de "+h+" metros tardara "+df.format(t)+
				" segundos en caer al suelo.");

	}

}
