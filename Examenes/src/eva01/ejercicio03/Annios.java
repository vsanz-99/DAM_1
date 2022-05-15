package eva01.ejercicio03;

/**
 * Programa que calcula el n�mero de d�as transcurridos desde el nacimiento de
 * un alumno hasta hoy. El algoritmo que implementa es el gen�rico entre dos
 * fechas cualesquiera, pero aplicado solo a fechas de los siglos XX y XXI.
 * 202112
 * @author DAM1
 */
import java.util.Scanner;
public class Annios {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0; // de d�as
		int diaIni, mesIni, a�oIni, diaFin, mesFin, a�oFin;
		int dia, mes, a�o, diaFinal;

		System.out.println("Fecha de inicio");
		System.out.print("Introduzca d�a: ");
		diaIni = entrada.nextInt();
		System.out.print("Introduzca mes: ");
		mesIni = entrada.nextInt();
		System.out.print("Introduzca a�o: ");
		a�oIni = entrada.nextInt();

		System.out.println("Fecha de finalizaci�n");
		System.out.print("Introduzca d�a: ");
		diaFin = entrada.nextInt();
		System.out.print("Introduzca mes: ");
		mesFin = entrada.nextInt();
		System.out.print("Introduzca a�o: ");
		a�oFin = entrada.nextInt();

		/*
		 * El algoritmo b�asico consiste en recorrer el calendario desde la
		 * fecha de inicio hasta la de finalizaci�n, sumando uno cada d�a
		 * transcurrido; para ello, se hace variable la fecha de inicio,
		 * increment�ndola en un d�a cada vez.
		 */
		dia = diaIni;
		mes = mesIni;
		a�o = a�oIni;

		if ( ! ( a�o < a�oFin
			||   a�o == a�oFin && ( mes < mesFin
			||   mes == mesFin && dia < diaFin ) ) )
			System.out.println("Error: la fecha inicial no es anterior a la final");
		else { // Mientras la fecha sea distinta a la final
			/*

			while ( ( a�o < a�oFin
			 	   || a�o == a�oFin && ( mes < mesFin
			 	   || mes == mesFin && dia < diaFin ) ) ) {
				contador++;

			 * Para incrementar el d�a, basta con sumar uno al mismo pero, si
			 * es fin de mes o de a�o, debemos incrementar tambio�n,
			 * respectivamente, el mes y/o el a�o, poniendo a uno el valor
			 * anterior.

				switch ( mes ) {
					case 1, 3, 5, 7, 8, 10, 12: 
						diaFinal = 31;
						break;
					case 2:
						diaFinal = 28;
						if ( a�o % 4 == 0 )
							diaFinal = 29;
						break;
					default:
						diaFinal = 30;
				}

				if( dia == diaFinal ) {
					dia=1;
					if( mes == 12 ) {
						mes = 1;
						a�o++;
					} else
						mes++;			
				} else
					dia++;

			 * Este algoritmo puede mejorarse sabiendo, como sabemos, que los
			 * a�os tienen 365 d�as. Para ello, tomamos los a�os que transcurren
			 * entre el inicial y el final: estos dos no porque son parciales.
			 * Bastar� usar un bucle que sume 365 por cada a�o y 1 m�s si es
			 * bisiesto. Pero, en realidad, multiplicando 365 por el n�mero de
			 * a�os transcurridos ser� suficiente; para tener en cuenta los
			 * bisiestos, podemos hacer el bucle o aprovechar que sabemos que,
			 * al ser cada 4 a�os, dividiendo el n�mero de a�os por 4, tenemos
			 * ese n�mero. Sin embargo, �qu� dividimos por cuatro? El n�mero real
			 * de a�os es enga�oso porque puede incluir dos bisiestos y no ser�
			 * el resultado que esperamos: debemos normalizar el primer a�o a 0.
			 * Calculamos el n�mero de bisiestos transcurridos para ambos a�os y
			 * restamos los del inicial a los del final. Aun as�, todav�a falta
			 * un a�o si el primero tambi�n es bisieto.
			 * Por �ltimo, el a�o con el que trabajaremos ser� el anterior al final.
			 */
			if ( a�oFin > a�o + 1 ) {
				int a�osIntermedios = a�oFin - a�o - 1;
				contador = a�osIntermedios * 365;
				contador += (a�oFin-1)/4 - (a�o+1)/4;
				if ( ( a�o + 1 ) % 4 == 0 )
					contador++;
				a�o = a�oFin - 1;
			}

			while ( a�o < a�oFin
				 || a�o == a�oFin && ( mes < mesFin
				 || mes == mesFin && dia < diaFin ) ) {

				switch ( mes ) {
				case 4: case 6: case 9: case 11: 
					diaFinal = 30;
					break;
				case 2:
					diaFinal = 28;
					if ( a�o % 4 == 0 )
						diaFinal = 29;
					break;
				default:
					diaFinal = 31;
				}

				/*
				 * Podemos tambi�n mejorar el conteo de los d�as en los meses
				 * intermedios sabiendo que, del primer mes, solo necisitamos
				 * los que hay hasta fin de mes: los d�as del mes menos el
				 * inicial; del resto, el n�mero de d�as que contiene el mes en
				 * cuesti�n y, del �ltimo, el d�a final es igual al n�mero de
				 * d�as transcurridos.
				 * Nota: o estamos en el mismo a�o o pasamos de un a�o al
				 * siguiente porque los otros (a�os) ya est�n contabilizados.
				 */
				if ( a�o < a�oFin ) {
					contador += diaFinal - dia;
					dia = 0; // ya no existe el d�a de inicio
					if ( ++mes == 13) {
						mes = 1;
						a�o = a�oFin;
					}
				} else if ( mes < mesFin ) {
					contador += diaFinal;
					mes++;	
				}
				else {
					contador += diaFin - dia;
					dia = diaFin;
				}
			}
			System.out.println("El n�mero de d�as trasncurridos son: " + contador);	
		}
	}

}
