package ejercicio02;

/**
 * <p><i>Archivo: Partido.java</i></p>
 * <p><b>Ejercicio 02</b>.</p>
 * @since 07/06/2022
 * @version 1.0
 * @author Victor Sanz*/


public class Partido implements Comparable<Object> {
	
	protected final String nombre;
	protected int votos;
	protected char separador='\t';
	
	public Partido(String nombre) {
		this.nombre=nombre;
		votos=0;
	}
	
	public Partido(String nombre, int votos) {
		this.nombre=nombre;
		this.votos=votos;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getVotos() {
		return votos;
	}
	
	public void addVotos(int votos) {
		if (votos>0)
			this.votos+=votos;
	}
	
	@Override
	public boolean equals(Object o) {
		if (nombre!=null)
			return nombre.equals(o);
		return false;
	}
	
	public int compareTo(Object o) {
		return -(votos-((Partido)o).votos);
		/* if (this.votos<((Partido)o).votos)
		 * 		return -1;
		 * else if (this.votos==((Partido)o).votos)
		 * 		return 0;
		 * else
		 * 		return 1; */
	}
	
	public void setSeparador(char sep) {
		separador=sep;
	}
	
	@Override
	public String toString() {
		return nombre+separador+votos;
	}
	
}
