package ejercicio02;
import java.util.Random;

/**
 * <p><i>Archivo: Main.java</i></p>
 * <p><b>Ejercicio 02</b>. Programa para el calculo de escannios en unas 
 * elecciones, teniendo como datos de entrada: el numero de partidos que se 
 * presentan (N), el numero de escannios a repartir (M) y los votos que ha 
 * obtenido cada partido.</p>
 * <p>Hacer lo siguiente: Dividir los votos de cada partido entre 1, 2, 3 ... M y se 
 * obtienen M divisiones y asi sucesivamente para el partido 2, 3 ... N; se obtendran 
 * N*M cocientes y de estos cocientes se eligen los M mayores, puesto que hay M 
 * diputados a repartir.</p>
 * <p>Una vez hechos los calculos habra que ver a que partidos le corresponden los 
 * <b><u>5 mayores cocientes</u></b>.</p>
 * <p>El listado de resultados debe hacerse orednado por numero de votos.</p>
 * <p>Los partidos que no obtengan un 5% de los votos emitidos debe rechazarse, y no 
 * entraran en el reparto de escannios.</p>
 * <p>Pista: implementar una lista de registros que contendran el partido y el cociente.</p>
 * @since 07/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Main {

	public static void main(String[] args) {
		final int ELECTORES=724983;
		final int MAXVOTOS=500;
		final int PARTIDOS=20;
		final int ESCANNIOS=31;
		Random r=new Random();
		int numVotos;
		int electores=ELECTORES;
		String[] p=new String[PARTIDOS];
		for (int i=1; i<PARTIDOS; i++) {
			p[i-1]="P_"+(i<10?"0":"")+i;
		}
		Votacion v=new Votacion(ESCANNIOS);
		while (electores>0) {
			numVotos=r.nextInt(MAXVOTOS);
			int auxPartido=r.nextInt(PARTIDOS);
			if (auxPartido<PARTIDOS)
				v.insertarVotos(p[auxPartido], numVotos);
			electores-=numVotos;
		}
		v.calcular();
		//v.insertarVotos(p[0], 40000);
		System.out.println(v);
	}

}
