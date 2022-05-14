package eva03.ejercicio01;
import java.util.ArrayList;

/**
 * <p><i>Archivo: Vehiculo.java</i></p>
 * @since 14/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Vehiculo {

	String matricula, marca, modelo, propietario, annio;
	ArrayList<Sancion> multas=new ArrayList<Sancion>();

	public Vehiculo(String matricula, String marca, String modelo,
			String propietario, String a�o){

		this.matricula=matricula.toUpperCase();
		this.marca=marca;
		this.modelo=modelo;
		this.propietario=propietario;
		this.annio=a�o;

	}

	public Vehiculo(String entrada) {

		gnirtSot(entrada);

	}

	@Override
	public String toString() {

		String salida=matricula+":"+marca+":"+modelo+":"+propietario+":"+annio+":";

		for (Sancion x : multas) {
			salida+=x;
		}

		return salida;

	}

	public void addSancion(String fecha, String motivo, String importe) {

		multas.add(
				new Sancion(fecha,motivo,importe));

	}

	public void gnirtSot(String entrada) {

		matricula=entrada.substring(0, entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1, entrada.length());
		marca=entrada.substring(0, entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1, entrada.length());
		modelo=entrada.substring(0, entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1, entrada.length());
		propietario=entrada.substring(0, entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1, entrada.length());
		annio=entrada.substring(0, entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":"), entrada.length());

		if(entrada.indexOf(";")>=0) {
			while(entrada.indexOf(";")<=entrada.lastIndexOf(";") && entrada.indexOf(";")>0) {
				multas.add(
						new Sancion(entrada.substring(0, entrada.indexOf(";")+1)));
				entrada=entrada.substring(entrada.indexOf(";")+1, entrada.length());
			}
		}

	}

	public static boolean valida(String matricula) {

		if(matricula.length()>=7) {		
			matricula=matricula.toUpperCase();
			for(int i=0; i<matricula.length(); ++i) {
				if(i>3 && matricula.charAt(i)<'A' || matricula.charAt(i)>'Z' ||
						matricula.charAt(i)=='�' || matricula.charAt(i)=='Q')
					return false;
				if(i<=3 && matricula.charAt(i)<'0' || matricula.charAt(i)>'9')
					return false;
			}
			return true;
		} else {
			return false;
		}

	}

}
