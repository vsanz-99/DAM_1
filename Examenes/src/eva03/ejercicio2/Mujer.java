package eva03.ejercicio2;

/**
 * <p><i>Archivo: Mujer.java</i></p>
 * </p><b>Examen 3EVA</b>.</p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Mujer implements Sexo {

	String nombre=M;
	int hijos;

	public Mujer(int hijos) {
		this.hijos=hijos;
	}

	@Override
	public String toString() {
		return nombre+" "+((hijos>0)?hijos+" hijos":"sin hijos");	
	}

}
