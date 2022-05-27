package eva02;
import javax.swing.JOptionPane;

/**
 * <p><i>Archivo: MinimoMaximo.java</i></p>
 * <p><b>Ejercicio 03</b>. Escribe un programa que rellene un vector de 100 elementos con numeros 
 * enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuacion, 
 * el programa mostrara el minimo y el maximo de los cien.</p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class MinimoMaximo {

	public static void main(String[] args) {

		int maximo; int minimo;
		int[] serie=new int[100];
		int i;

		for (i=0; i<100; i++) {
			serie[i]=(int)(Math.random()*501);
		}

		System.out.println("Array generado: ");
		for (i=0; i<100; i++) {
			System.out.print(serie[i]+" ");
		}

		maximo=serie[0];
		minimo=serie[0];

		for (int valor : serie) {
			if (valor>maximo) {
				maximo=valor;
			}
			if (valor<minimo) {
				minimo=valor;
			}
		}

		JOptionPane.showMessageDialog(null, "Valor Maximo = "+maximo+"\nValor Minimo = "+minimo);

	}

}
