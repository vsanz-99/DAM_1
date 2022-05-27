package eva03.ejercicio01;

/**
 * <p><i>Archivo: Sancion.java</i></p>
 * <p><b>Ejercicio 01</b>. Gestionar las multas de los 
 * vehiculos de un municipio.</p>
 * @since 27/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Sancion {

	String motivo, fecha, importe;

	public Sancion(String fecha, String motivo, String importe) {
		this.fecha=fecha;
		this.motivo=motivo;
		this.importe=importe;
	}

	public Sancion(String entrada) {
		fecha=entrada.substring(entrada.indexOf(".")+1, entrada.indexOf("|"));
		entrada=entrada.substring(entrada.indexOf("|")+1, entrada.length());
		motivo=entrada.substring(0, entrada.indexOf("|"));
		importe=entrada.substring(entrada.indexOf("|")+1, entrada.indexOf(";"));
	}

	@Override
	public String toString() {
		String salida="."+fecha+"|"+"motivo"+"|"+importe+";";
		return salida;
	}

}
