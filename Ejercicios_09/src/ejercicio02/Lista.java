package ejercicio02;

import java.util.Arrays;

/**
 * <p><i>Archivo: Lista.java</i></p>
 * <p><b>Ejercicio 02</b>.</p>
 * @since 07/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Lista <T> {

	private final int MAXSIZE=100;
	//lista de partidos con sus votos
	private T[] l;
	int limite=0;

	public Lista() {
		l=(T[])new Object[MAXSIZE];
	}

	public Lista(int size) {
		l=(T[])new Object[size];
	}

	/* public void annadirVotos(String partido, int votos) {
	 * 		for (int i=0; i<limite; i++)
	 * 			if (l[i].getNombre().equals(partido)) {
	 * 				l[i].addVotos(votos);
	 * 				return;
	 * 			}
	 * 			l[limite++]=new Partido(partido, votos);
	 * }
	 * 
	 * public void annadirVotos(Partido p) {
	 *		for (int i=0; i<limite; i++)
	 *			if (l[i].getNombre().equals(p.getNombre())) {
	 *				l[i].addVotos(p.getVotos());
	 *				return;
	 *			}
	 *			l[limite++]=p;
	 * } */

	/* public Partido buscar(String nombre) {
	 * 		for (int i=0; i<limite; i++)
	 * 			if (l[i].getNombre().equals(nombre)) {
	 * 				return l[i];
	 * 			}
	 * 		return null;
	 * } */

	public T buscar(Partido miAux) {
		for (int i=0; i<limite; i++) {
			if (l[i].equals(miAux)) {
				return l[i];
			}
		}
		return null;
	}

	public void insertar(T p) {
		l[limite++]=p;
	}

	/* public void insertarVotos(String partido, int votos) {
	 * 		l[limite++]=new Partido(partido, votos);
	 * } */

	/* public int getVotos(int posicion) {
	 * 		return l[posicion].getVotos();
	 * } */

	/* public String getNombre(int posicion) {
	 * 		return l[posicion].getNombre();
	 * } */	

	public T getPartido(int i) {
		return l[i];
	}

	public int getCantidad() {
		return limite;
	}

	public void ordenar() {
		Arrays.sort(l);
	}

}
