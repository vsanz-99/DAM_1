import java.util.ArrayList;

/**
 * <p><i>Archivo: CribaEratostenes.java</i></p>
 * <p><b>Ejercicio 01</b>.</p>
 * @since 12/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class CribaEratostenes {

	ArrayList<Integer> primos;

	public CribaEratostenes(int n) {
		primos=cribaDeEratostenes(n);
	}

	ArrayList<Integer> cribaDeEratostenes(int n) {
		ArrayList<Integer> primos=new ArrayList<Integer>();
		// Crea una matriz booleana "primo" e inicializa todas las entradas como true.
		// Un valor en primo sera finalmente false si 1 no es un primo (si no es verdadero).
		boolean[] primo=new boolean[n];
		for (int i=0; i<n; i++) {
			primo[i]=true;
		}
		for (int p=2; p*p<=n; p++) {
			// Si el primo no cambia, entonces es primo.
			if (primo[p]==true) {
				// Actualiza todos los multiplos de p.
				for (int i=p*2; i<n; i+=p) {
					primo[i]=false;
				}
			}
		}
		// Imprimir todos los numeros primos.
		for (int i=2; i<n; i++) {
			if (primo[i]==true)
				primos.add(i);
		}
		return primos;
	}

}
