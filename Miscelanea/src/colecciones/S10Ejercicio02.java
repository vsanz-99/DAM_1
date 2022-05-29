package colecciones;
import java.util.ArrayList;

/**
 * 2. Realiza un programa que introduzca valores aleatorios (entre 0 y
 *    100) en un ArrayList y que luego calcule la suma, la media, el
 *    maximo y el minimo de esos numeros. El tamaño de la lista tambien
 *    sera aleatorio y podra oscilar entre 10 y 20 elementos ambos
 *    inclusive.
 *
 * @author Victor Sanz*/

public class S10Ejercicio02 {

	public static void main(String[] args) {
		
		int suma=0;
		int minimo=100;
		int maximo=0;
		int tamano=(int)(Math.random()*11+10);
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		for (int i=0; i<tamano; i++) {
			a.add((int)(Math.random()*101));
		}
		
		System.out.println("Lista generada: "+a);
		
		for (int n : a) {
			suma+=n;
			if (n<minimo) {
				minimo=n;
			}
			if (n>maximo) {
				maximo=n;
			}
		}
		
		System.out.println("\tLa suma total es: "+suma);
		System.out.println("\tLa media es: "+suma/tamano);
		System.out.println("\tEl minimo es: "+minimo);
		System.out.println("\tEl maximo es: "+maximo);

	}

}
