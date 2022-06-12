package eva01;
import java.util.Scanner;

/**
 * <p><i>Archivo: FechaNacimiento.java</i></p>
 * <p><b>Ejercicio 03, EXAMEN 1EVA</b>.</p>
 * @since 12/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class FechaNacimiento {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int contador, diaIni, mesIni, anioIni, diaFin, mesFin, anioFin,
		dia, mes, anio, diaFinal;
		contador=diaIni=mesIni=anioIni=diaFin=mesFin=anioFin=dia=
				mes=anio=diaFinal=0;
		System.out.println("Fecha de inicio: \n");
		do {
			System.out.print("Introduce dia: ");
			diaIni=Integer.parseInt(teclado.nextLine());
		} while ((diaIni<1) || (diaIni>31));
		do {
			System.out.print("Introduce mes: ");
			mesIni=Integer.parseInt(teclado.nextLine());
		} while ((mesIni<1) || (mesIni>12));
		do {
			System.out.println("Introduce el anio: ");
			anioIni=Integer.parseInt(teclado.nextLine());
		} while (anioIni<1901);
		System.out.println("\n");
		System.out.println("Fecha de finalizacion: \n");
		do {
			System.out.print("Introduce dia: ");
			diaFin=Integer.parseInt(teclado.nextLine());
		} while ((diaIni<1) || (diaIni>31));
		do {
			System.out.print("Introduce mes: ");
			mesFin=Integer.parseInt(teclado.nextLine());
		} while ((mesIni<1) || (mesIni>12));
		do {
			System.out.println("Introduce el anio: ");
			anioFin=Integer.parseInt(teclado.nextLine());
		} while (anioIni<1901);
		// Recorrer el calendario desde la fecha de inicio hasta la de
		// finalizacion, sumando uno cada dia transcurrido; para ello,
		// se hace variable la fecha de inicio, incrementandola en un dia 
		// cada vez.
		dia=diaIni;
		mes=mesIni;
		anio=anioIni;
		if (!(anio<anioFin 
				|| anio==anioFin && (mes<mesFin 
						|| mes==mesFin && dia<diaFin))) {
			System.out.println("\tError: la fecha inicial NO es anterior "
					+" a la final.");
		} else { // Mientras la fecha sea distinta a la final.
			if (anioFin>anio+1) {
				int aniosIntermedios=anioFin-anio-1;
				contador=aniosIntermedios*365;
				contador+=(anioFin-1)/4-(anio+1)/4;
				if ((anio+1)%4==0)
					contador++;
				anio=anioFin-1;
			}
			while (anio<anioFin 
					|| anio==anioFin && (mes<mesFin
							|| mes==mesFin && dia<diaFin)) {
				switch (mes) {
				case 4 : case 6 : case 9 : case 11 :
					diaFinal=30;
					break;
				case 2 :
					diaFinal=28;
					if (anio%4==0)
						diaFinal=29;
					break;
				default :
					diaFinal=31;
				}
				if (anio<anioFin) {
					contador+=diaFinal-dia;
					dia=0; // Ya no existe el dia de inicio.
					if (++mes==13) {
						mes=1;
						anio=anioFin;
					}
				} else if (mes<mesFin) {
					contador+=diaFinal;
					mes++;
				} else {
					contador+=diaFin-dia;
					dia=diaFin;
				}
			}
			System.out.println("\tEl numero de dias "
					+"trasncurridos son: "+contador);
		}
		teclado.close();
	}

}
