package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: ApareceDigito.java</i></p>
 * <p><b>Ejercicio 18</b>. Realiza un programa que diga los digitos 
 * que aparecen y los que no aparecen en un numero entero introducido 
 * por teclado.</p>
 * @since 27/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class ApareceDigito {

	public static void main(String[] args) {

		int contador=0;
		int numero;
		String cero=null, uno=null, dos=null, tres=null, cuatro=null, 
				cinco=null, seis=null, siete=null, ocho=null, nueve=null;

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		do {
			System.out.println("\tIntroduce un numero entero para mostrar los digitos que "
					+ "aparecen en el: ");
			numero=teclado.nextInt();
		} while (numero<=0 || numero>=100000);

		String numCadena=Integer.toString(numero);

		while (contador<numCadena.length()) { 
			if (numCadena.charAt(contador)=='0')
				cero="si";
			if (numCadena.charAt(contador)=='1')
				uno="si";
			if (numCadena.charAt(contador)=='2')
				dos="si";
			if (numCadena.charAt(contador)=='3')
				tres="si";
			if (numCadena.charAt(contador)=='4')
				cuatro="si";
			if (numCadena.charAt(contador)=='5')
				cinco="si";
			if (numCadena.charAt(contador)=='6')
				seis="si";
			if (numCadena.charAt(contador)=='7')
				siete="si";
			if (numCadena.charAt(contador)=='8')
				ocho="si";
			if (numCadena.charAt(contador)=='9')
				nueve="si";
			contador++;
		}

		System.out.println("\t(1): "+uno);
		System.out.println("\t(2): "+dos);
		System.out.println("\t(3): "+tres);
		System.out.println("\t(4): "+cuatro);
		System.out.println("\t(5): "+cinco);
		System.out.println("\t(6): "+seis);
		System.out.println("\t(7): "+siete);
		System.out.println("\t(8): "+ocho);
		System.out.println("\t(9): "+nueve);
		System.out.println("\t(0): "+cero);

	}

}
