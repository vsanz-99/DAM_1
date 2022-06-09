/**
 * <p><i>Archivo: Ejercicio_06_01.java</i></p>
 * <p><b>Ejercicio 01</b>.</p>
 * @since 09/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_06_01 {

	public static void main(String[] args) {
		int size=20;
		float media=0.0f;
		int sup, inf, igu, aux, suma;
		sup=inf=igu=aux=suma=0;
		int[] aleatorios=new int[size];
		for (int i=0; i<size; i++) {
			aleatorios[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("Numeros generados: ");
		for (int i=0; i<size; i++) {
			System.out.print(aleatorios[i]+" ");
			aux=aleatorios[i];
			suma+=aux;
		}
		System.out.println("\n");
		media=(float)(suma/size);
		System.out.println();
		System.out.println("\tTamanio del vector: "+size);
		System.out.println("\tSuma: "+suma);
		System.out.println("\tMedia: "+media);
		System.out.println("\n");
		System.out.println("Numeros superiores a la media:");
		for (int i=0; i<size; i++) {
			if (aleatorios[i]>media) {
				System.out.print(aleatorios[i]+" ");
				sup++;
			}
		}
		System.out.print("| Superiores a la media: "+sup);
		System.out.println("\n");
		System.out.println("\nNumeros inferiores a la media:");
		for (int i=0; i<size; i++) {
			if (aleatorios[i]<media) {
				System.out.print(aleatorios[i]+" ");
				inf++;
			}
		}
		System.out.print("| Inferiores la media: "+inf);
		System.out.println("\n");
		System.out.println("\nNumeros iguales a la media:");
		for (int i=0; i<size; i++) {
			if (aleatorios[i]==media) {
				System.out.print(aleatorios[i]+" ");
				igu++;
			}
		}
		System.out.print("| Iguales a la media: "+igu);
	}

}
