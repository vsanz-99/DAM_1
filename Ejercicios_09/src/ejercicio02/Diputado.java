package ejercicio02;

/**
 * <p><i>Archivo: Diputado.java</i></p>
 * <p><b>Ejercicio 02</b>.</p>
 * @since 07/06/2022
 * @version 1.0
 * @author Victor Sanz*/


public class Diputado extends Partido {

	private int diputados;

	public Diputado(String nombre) {
		super(nombre);
		diputados=0;
	}

	public Diputado(String nombre, int votos) {
		super(nombre, votos);
		this.diputados=1;
	}

	public Diputado(String nombre, int votos, int diputados) {
		super(nombre, votos);
		this.diputados=diputados;
	}

	@Override
	public void addVotos(int n) {
		if (n>0)
			this.diputados+=diputados;
	}

	public int compareTo(Object o) {
		if (diputados !=((Diputado)o).diputados)
			return -(diputados-((Diputado)o).diputados);
		return -(votos-((Diputado)o).votos);
	}

	@Override
	public String toString() {
		return nombre+separador+diputados+separador+votos;
	}

}
