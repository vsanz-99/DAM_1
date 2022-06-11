import java.util.Scanner;

/**
 * <p>Leer codigos de personas (8 caracteres).</p>
 * <p>cuatro primeros caracteres: 1990-1995 ('1990', '1991', '1992', '1993', '1994', '1995').</p>
 * <p>quinto caracter: 'H'/'M'.</p>
 * <p>sexto caracter: '1'/'2'.</p>
 * <p>septimo y octavo caracter: cualquier valor.</p>
 * <p>Rechazar codigos que no cumplan las 
 * condiciones anteriores.</p>
 * <p>Finalizar programa introduciendo '00000000'.
 * Sacar por pantalla numero de codigos correctos y 
 * numero de hombres y mujeres matriculados en primero y en segundo.</p>
 * @since 17/11/2021
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_04_10 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String codigointro="";
		char hombre='H';
		char mujer='M';
		int contfirst_h, contfirst_m, contsecond_h, contsecond_m, correct;
		contfirst_h=contfirst_m=contsecond_h=contsecond_m=correct=0;
		System.out.println("Introducir '00000000' para finalizar la secuencia.");
		do {
			do {
				System.out.println("Introduce un codigo de alumno: ");
				codigointro=teclado.nextLine();
			} while (codigointro.isEmpty());
			if (codigointro.length()==8) {
				String test1=codigointro.substring(0, 4);
				if ((test1.equals("1990")) || 
						(test1.equals("1991")) || 
						(test1.equals("1992")) || 
						(test1.equals("1993")) || 
						(test1.equals("1994")) || 
						(test1.equals("1995"))) {
					// if (((Integer.parseInt(test1))>=1990) || ((Integer.parseInt(test1))<=1995)) {
					// .......
					// .......
					// }
					char test2=codigointro.charAt(4);
					char test3=codigointro.charAt(5);
					if ((Character.compare(test2, hombre))==0) {
						if (test3=='1') {
							contfirst_h++;
							correct++;
						} else if (test3=='2') {
							contsecond_h++;
							correct++;
						}
					} else if ((Character.compare(test2, mujer))==0) {
						if (test3=='1') {
							contfirst_m++;
							correct++;
						} else if (test3=='2') {
							contsecond_m++;
							correct++;
						}
					}
				}
			} 
		} while (!codigointro.equals("00000000"));
		teclado.close();
		System.out.println("\nSecuencia finalizada.");
		System.out.println("\n\tNumero de codigos correctos: "+correct);
		System.out.println("\n\tHay "+contfirst_h+" hombre/s matriculado/s en primero.");
		System.out.println("\n\tHay "+contfirst_m+" mujere/s matriculada/s en primero.");
		System.out.println("\n\tHay "+contsecond_h+" hombre/s matriculado/s en segundo.");
		System.out.println("\n\tHay "+contsecond_m+" mujere/s matriculada/s en segundo.");
	}

}
