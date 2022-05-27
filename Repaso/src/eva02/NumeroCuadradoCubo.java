package eva02;

/**
 * <p><i>Archivo: NumeroCuadradoCubo.java</i></p>
 * <p><b>Ejercicio 01</b>. Define tres vectores de 20 numeros enteros cada uno, 
 * con nombres numero, cuadrado y cubo. Carga el vector con numeros aleatorios 
 * entre 0 y 100. En el vector cuadrado se deben almacenar los cuadrados de los 
 * valores que hay en el vector numero. En el vector cubo se deben almacenar los 
 * cubos de los valores que hay en numero. A continuacion, muestra el contenido de 
 * los tres vectores dispuesto en tres columnas.</p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class NumeroCuadradoCubo {

	public static void main(String[] args) {

		int[] numero=new int[20]; int[] cuadrado=new int[20]; int[] cubo=new int[20];
		int i;

		for (i=0; i<20; i++) {
			numero[i]=(int)(Math.random()*101);
			cuadrado[i]=numero[i]*numero[i];
			cubo[i]=cuadrado[i]*numero[i];
		}

		System.out.println("\nA continuacion se muestran en tres columnas, un numero "
				+ "aleatorio entre 0 y 100, su cuadrado y su cubo:\n");

		System.out.println("   n  |    n^2  |       n^3\n------|---------|------------");

		for (i=0; i<20; i++) {
			System.out.printf("%4d  |  %5d  |  %8d\n", numero[i], cuadrado[i], cubo[i]);
		} 

	}

}
