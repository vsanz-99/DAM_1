import java.util.Scanner;

/**
 * <p><i>Archivo: PruebaRadioFigura.java</i></p>
 * <p><b>Ejercicio 07</b>. Escribir un metodo que reciba como parametro 
 * un valor <b>r</b>, que representa el radio de una figura. El metodo debe 
 * devolver: </p>
 * <ol>
 * <li>Longitud del circulo de radio <b>r</b> dada por la expresion <b>2*PI*r</b>.</li>
 * <li>Superficie del circulo dada por la expresion <b>PI*r^2</b>.</li>
 * <li>Volumen de una esfera de radio <b>r</b> dada por la expresion <b>4/3*PI*r^3</b>.</li>
 * </ol>
 * @since 06/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class PruebaRadioFigura {

	public static void main(String[] args) {
		int r=0; int op;
		Scanner teclado=new Scanner(System.in);
		do {
			System.out.println("\t Introduce el radio (r) de la figura: ");
			r=teclado.nextInt();
		} while (r<=0);
		System.out.println("Elige una opcion: \n"
				+"\t1. Calcular la longitud del circulo (2*PI*r).\n"
				+"\t2. Calcular la superficie del circulo (PI*r^2).\n"
				+"\t3. Calcular el volumen de la esfera (4/3*PI*r^3)");
		op=teclado.nextInt();
		if (op==1) {
			System.out.println("\tLongitud de la figura: "+calculoRadio(r, op));
		} else if (op==2) {
			System.out.println("\tSuperficie de la figura: "+calculoRadio(r, op));
		} else if (op==3) {
			System.out.println("\tVolumen de la figura: "+calculoRadio(r, op));
		} else {
			System.out.println("\tATENCION: opcion desconocida.");
		}
		System.out.println("\tFin del programa.");
		teclado.close();
	}

	public static double calculoRadio(int radio, int opcion) {
		double PI=3.14159;
		double result=0;
		switch (opcion) {
		case 1 :
			result=2*PI*radio;
			break;
		case 2 :
			result=PI*(radio*radio);
			break;
		case 3 :
			result=(4*PI*(radio*radio*radio))/3;
			break;
		default :
			// System.out.println("\tATENCION: Opcion desconocida.");
		}
		return result;
	}

}
