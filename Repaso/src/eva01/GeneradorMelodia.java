package eva01;

/**
 * <p><i>Archivo: GeneradorMelodia.java</i></p>
 * <p><b>Ejercicio 19</b>. Realiza un generador de melodia con las 
 * siguientes condiciones: </p>
 * <ol type="a">
 * <li>Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.</li>
 * <li>Una melodia esta formada por un numero aleatorio de notas mayor o igual a 4, menor o igual a 28 
 * y siempre multiplo de 4 (4, 8, 12 ...).</li>
 * <li>Cada grupo de 4 notas sera un compas y estara separado del siguiente compas mediante la barra vertical 
 * "|". El final de la melodia se marca con dos barras.</li>
 * <li>La ultima nota de la melodia debe coincidir con la primera.</li>
 * </ol>
 * @since 23/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class GeneradorMelodia {

	public static void main(String[] args) {

		int hueco=4*(int)(Math.random()*7+1);
		String notas="";
		String primeraNota="";

		for (int i=1; i<=hueco; i++) {
			int nota=(int)(Math.random()*7);
			switch (nota) {
			case 0 :
				notas="do";
				break;
			case 1 :
				notas="re";
				break;
			case 2 :
				notas="mi";
				break;
			case 3 :
				notas="fa";
				break;
			case 4 :
				notas="sol";
				break;
			case 5 :
				notas="la";
				break;
			case 6 :
				notas="si";
				break;
			default :
			}
			if (i==1) {
				primeraNota=notas;
			}
			if (i==hueco) {
				notas=primeraNota;
			}
			System.out.print(notas+" ");
			if (i==hueco) {
				System.out.print("||");
			} else if (i%4==0) {
				System.out.print("| ");
			}
		}

	}

}
