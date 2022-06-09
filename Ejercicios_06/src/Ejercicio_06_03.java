/**
 * <p><i>Archivo: Ejercicio_06_03.java</i></p>
 * <p><b>Ejercicio 03</b>.</p>
 * @since 09/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_06_03 {

	public static void main(String[] args) {
		int[] vector={23, 45, 78, 90, 5, 3, 42, 13, 7, 21};
		System.out.println("Vector predefinido: ");
		for (int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		int menor, mayor;
		menor=mayor=vector[0];
		for (int i=0; i<vector.length; i++) {
			if (vector[i]>mayor) {
				mayor=vector[i];
			}
			if (vector[i]<menor) {
				menor=vector[i];
			}
		}
		System.out.println("\n");
		System.out.println("\tEl mayor valor es: "+mayor);
		System.out.println("\tEl menor valor es: "+menor);
	}

}
