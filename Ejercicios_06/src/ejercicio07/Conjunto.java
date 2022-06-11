package ejercicio07;

import java.util.Arrays;

/**
 * <p><i>Archivo: Conjunto.java</i></p>
 * <p><b>Ejercicio 07</b>.</p>
 * @since 09/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Conjunto {

	final int MAXSIZE=100;
	public int[] tabla=new int[100];
	public int contador=0;

	public Conjunto() {}

	public void agregar(int n) {
		boolean valido=true;
		for (int i=0; i<contador && valido==true; ++i) {
			if (tabla[i]==n)
				valido=false;
		}
		if (valido==true) {
			tabla[contador]=n;
			++contador;
		} else {
			System.out.println("\tEste numero ya pertenece al conjunto.");
		}
	}

	public void vaciar() {
		Arrays.fill(tabla, 0);
	}
	
	public void eliminar(int posicion) {
		for (int i=posicion+1;i<tabla.length;++i) {
			tabla[i-1]=tabla[i];
		}
	}

	public void copiar(int[] tabla2) {
		for (int i=0; i<tabla.length; ++i) {
			tabla2[i]=tabla[i];
		}
	}

	public boolean esMiembro(int n) {
		boolean miem=false;
		for (int i=0; i<tabla.length && miem==false; ++i) {
			if (n==tabla[i])
				miem=true;
		}
		return miem;
	}

	public int posicion(int n) {
		int f=-1;
		for (int i=0; i<tabla.length; ++i) {
			if (n==tabla[i])
				f=1;
		}
		return f;
	}

	public boolean esIgual(int[] tabla1) {
		boolean igual=true;
		for (int i=0; i<tabla.length && igual==true; ++i) {
			if (tabla[i]!=tabla[i])
				igual=false;
		}
		return igual;
	}

	public void imprimir() {
		for (int i=0; i<tabla.length; ++i) {
			if (i%10==0)
				System.out.println();
			System.out.println(tabla[i]+" ");
		}
		System.out.println();
	}

}
