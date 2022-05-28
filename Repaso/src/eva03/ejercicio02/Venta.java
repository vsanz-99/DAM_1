package eva03.ejercicio02;

public class Venta {

	String fecha, cliente, cobrada;
	double importe;
	
	public Venta() {}
	
	public Venta(String fecha, double importe, String cliente, String cobrada) {
		this.fecha=fecha;
		this.importe=importe;
		this.cliente=cliente;
		this.cobrada=cobrada;
	}
	
	public Venta(String entrada) {
		String importeString=String.valueOf(importe);
		
		fecha=entrada.substring(entrada.indexOf(".")+1, entrada.indexOf("|"));
		entrada=entrada.substring(entrada.indexOf("|")+1, entrada.length());
		importeString=entrada.substring(0, entrada.indexOf("|"));
		entrada=entrada.substring(entrada.indexOf("|"+1, entrada.length()));
		cliente=entrada.substring(0, entrada.indexOf("|"));
		cobrada=entrada.substring(entrada.indexOf("|")+1, entrada.indexOf(";"));
	}
	
	@Override
	public String toString() {
		String salida="."+fecha+"|"+importe+"|"+cliente+"|"+cobrada+";";
		return salida;
	}
	
}
