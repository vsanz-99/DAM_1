package eva03.ejercicio02;
import java.util.ArrayList;

/**
 * <p><i>Archivo: Viajante.java</i></p>
 * <p><b>Ejercicio 02</b>. Gestionar el control de viajantes.</p>
 * @since 27/05/2022
 * @version 1.0 
 * @author Victor Sanz*/

public class Viajante {

	String dni, nombre;
	double distancia_km;
	int antiguedad, n_ventas;
	ArrayList<Venta> ventas=new ArrayList<Venta>();
	
	public Viajante() {}
	
	public Viajante(String dni, String nombre, double distancia_km, 
			int antiguedad, int n_ventas) {
		this.dni=dni;
		this.nombre=nombre;
		this.distancia_km=distancia_km;
		this.antiguedad=antiguedad;
		this.n_ventas=n_ventas;
	}
	
	public Viajante(String entrada) {
		acortar(entrada);
	}
	
	@Override
	public String toString() {
		String salida=dni+":"+nombre+":"+distancia_km+":"+antiguedad+":"+n_ventas;
		for (Venta x : ventas) {
			salida+=x;
		}
		return salida;
	}
	
	public void addVenta(String fecha, double importe, String cliente, String cobrada) {
		ventas.add(
				new Venta(fecha, importe, cliente, cobrada));
	}
	
	public void acortar(String entrada) {
		String distancia_kmString=String.valueOf(distancia_km);
		String antiguedadString=String.valueOf(antiguedad);
		String n_ventasString=String.valueOf(n_ventas);
		
		dni=entrada.substring(0, entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1, entrada.length());
		nombre=entrada.substring(0, entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1, entrada.length());
		distancia_kmString=entrada.substring(0, entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1, entrada.length());
		antiguedadString=entrada.substring(0, entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1, entrada.length());
		n_ventasString=entrada.substring(0, entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":"), entrada.length());
		if (entrada.indexOf(";")>=0) {
			while (entrada.indexOf(";")<=entrada.lastIndexOf(";") && entrada.indexOf(";")>0) {
				ventas.add(
						new Venta(entrada.substring(0, entrada.indexOf(";")+1)));
				entrada=entrada.substring(entrada.indexOf(";")+1, entrada.length());
			}
		}
	}
	
}
