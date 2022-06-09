/**
 * <p><i>Archivo: Ejercicio_06_02.java</i></p>
 * <p><b>Ejercicio 02</b>.</p>
 * @since 09/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_06_02 {

	public static void main(String[] args) {
		int[] vector1={12, 34, 56, 1, 90, 67, 73, 71, 3, 56};
		int [] vector2={45, 56, 34, 1, 5, 7, 90, 30, 3, 45};
		int [] vectorcombi=new int[10];
		for (int i=0; i<vectorcombi.length; i++) {
			vectorcombi[i]=vector1[i]+vector2[i];
		}
		System.out.println("Combinacion de dos vectores predefinidos: ");
		for (int i=0; i<vectorcombi.length; i++) {
			System.out.print(vectorcombi[i]+" ");
		}
	}

}
