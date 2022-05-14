package test;
import ordenamiento.Ordena;

public class testOrdenar {

	public static void main(String[] args) {

		int[] vals={15, 60, 8, 16, 44, 27, 12, 35};

		Ordena.burbuja(vals); 

		//Ordena.seleccion(vals);

		//Ordena.insercion(vals);

		//Ordena.shell(vals);

		//Ordena.quicksort(vals, 0, 7);

		for (int val : vals) {

			System.out.println(val);

		}

	}

}
