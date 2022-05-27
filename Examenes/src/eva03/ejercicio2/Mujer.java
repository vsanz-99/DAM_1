package eva03.ejercicio2;

public class Mujer implements Sexo { // Clase Mujer.
	
	String nombre=M;
	int hijos;
	
	public Mujer(int hijos) {
		this.hijos=hijos;
	}
	
	public String toString() {
		return nombre+" "+((hijos>0)?hijos+" hijos.":" sin hijos.");
	}

} // Fin de la clase Mujer.
