package eva02.ejercicio09;

/**
 * <p><i>Archivo: Domino.java</i></p>
 * <p><b>Ejercicio 09</b>. Implementa la clase FichaDomino. Una ficha de domino 
 * tiene dos lados y en cada lado hay un número del 1 al 6 o bien ningun numero (blanco). 
 * Cuando se crea una ficha, se proporcionan ambos valores. Utiliza la clase anterior para 
 * crear un Domino: posee todas las posibles combinaciones, sin repetir fichas; por ejemplo, 
 * las fichas [4|5] y [5|4] son la misma. Utiliza el Domino anterior para generar 
 * una secuencia de 8 fichas seleccionadas de forma aleatoria, que encajen bien y que esten 
 * bien colocadas segun las reglas del juego del domino: dos fichas encajan si se pueden 
 * colocar una al lado de la otra.</p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Domino {

	public static void main(String[] args) {

		int cuentaFichas=0;

		FichaDomino[] fichas=new FichaDomino[8];

		fichas[0]=new FichaDomino();

		for (int i=1; i<8; i++) {
			FichaDomino aux;
			do {
				aux=new FichaDomino();
			} while (!fichas[i-1].encajaEnFila(aux));
			fichas[i]=aux;
		}
		
		for (FichaDomino ficha : fichas) {
			System.out.print(ficha);
		}

	}

}
