/**
 * <p><i>Archivo: Ejercicio_06_04.java</i></p>
 * <p><b>Ejercicio 04</b>.</p>
 * @since 09/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_06_04 {

	public static void main(String[] args) {
		int size=10;
		int v2uno, v2dos, v2tres, v2cuatro, v2cinco;
		v2uno=v2dos=v2tres=v2cuatro=v2cinco=0;
		int[] vector1=new int[size];
		int[] vector2=new int[size];
		for (int i=0; i<size; i++) {
			vector1[i]=(int)(Math.random()*5)+1;
			vector2[i]=(int)(Math.random()*5)+1;
			switch (vector2[i] ){ 
			case 1 : v2uno++; break;
			case 2 : v2dos++; break;
			case 3 : v2tres++; break;
			case 4 : v2cuatro++; break;
			case 5 : v2cinco++; break;
			}
		}
		System.out.println("Primer vector unidimensional: ");
		for (int i=0; i<size; i++) {
			System.out.print(vector1[i]+" ");
		}
		System.out.println("\n");
		System.out.println("Segundo vector unidimensional: ");
		for (int i=0; i<size; i++) {
			System.out.print(vector2[i]+" ");
		}
		System.out.println("\n");
		for (int i=0; i<size; i++) {
			System.out.print("elemento "+(i+1)+" ("+vector1[i]+"): ");
			if (vector1[i]==1) {
				System.out.print(v2uno+" veces\n");
			} else if (vector1[i]==2) {
				System.out.print(v2dos+" veces\n");
			} else if (vector1[i]==3) {
				System.out.print(v2tres+" veces\n");
			} else if (vector1[i]==4) {
				System.out.print(v2cuatro+" veces\n");
			} else {
				System.out.print(v2cinco+" veces\n");
			}
		}
	}

}
