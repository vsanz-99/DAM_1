package ordenamiento;

public class Ordena {

	// Ordenamiento de burbuja:
	public static void burbuja(int[] data) {
		for (int i=0; i<data.length; i++) {
			for (int j=0; j<data.length-1; j++) {
				if (data[j]>data[j+1]) {
					int temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}
	}

	// ----------------------------------------------------------------------------

	// Ordenamiento por selección:
	public static void seleccion(int[] data) {
		for (int i=0; i<data.length; i++) {
			for (int j=i; j<data.length; j++) {
				if (data[i]>data[j]) {
					int aux=data[j];
					data[j]=data[i];
					data[i]=aux;
				}
			}
		}
	}

	// ----------------------------------------------------------------------------

	// Ordenamiento por inserción:
	public static void insercion(int[] data) {
		for (int i=1; i<data.length; i++) {
			int aux=data[i];
			int j=i-1;
			while (j>=0 && data[j]>aux) {
				data[j+1]=data[j];
				j--;
			}
			data[j+1]=aux;
		}
	}

	// ----------------------------------------------------------------------------

	// Ordenamiento por el método Shell:
	public static void shell(int[] data) {

		int salto, aux, i;
		boolean cambios;

		for (salto=data.length/2; salto!=0; salto/=2) {
			cambios=true;
			while (cambios) { // Mientras se intercambie algún elemento.                                         
				cambios=false;
				for (i=salto; i<data.length; i++) { // Se da una pasada
					if (data[i-salto]>data[i]) {    // y si están desordenados
						aux=data[i];                // se reordenan.
						data[i]=data[i-salto];
						data[i-salto]=aux;
						cambios=true;               // Se marca como cambio.                                   
					}
				}
			}
		}
	}

	// ----------------------------------------------------------------------------

	// Ordenamiento rápido (QuickSort):
	public static void quicksort(int[] data, int izq, int der) {

		int pivote=data[izq]; // Tomamos primer elemento como pivote,
		int i=izq;         	  // i realiza la búsqueda de izquierda a derecha y
		int j=der;         	  // j realiza la búsqueda de derecha a izquierda.
		int aux;

		while(i<j){                          	// Mientras no se crucen las búsquedas.                                   
			while(data[i]<=pivote && i<j) i++;  // Busca un elemento mayor que el pivote.
			while(data[j]>pivote) j--;          // Busca un elemento menor que el pivote.
			if (i<j) {                        	// Si no se han cruzado                      
				aux=data[i];                    // los intercambia.
				data[i]=data[j];
				data[j]=aux;
			}
		}

		data[izq]=data[j];   // Se coloca el pivote en su lugar, de forma que tendremos                                    
		data[j]=pivote;      // los menores a su izquierda y los mayores a su derecha.

		if(izq<j-1)
			quicksort(data, izq, j-1);          // Ordenamos el subarray izquierdo.
		if(j+1<der)
			quicksort(data, j+1, der);          // Ordenamos el subarray derecho.

	}

}
