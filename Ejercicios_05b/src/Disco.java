import java.util.Date;
import java.util.GregorianCalendar;

/**
 * <p><i>Archivo: Disco.java</i></p>
 * <p><b>Ejercicio 01</b>.</p>
 * @since 06/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Disco {

	private String titulo;
	private int n_canciones;
	private double precio;
	private Date fechaCompra;

	public Disco(String titulo, int n_canciones, double precio, int dia, 
			int mes, int anio) {
		this.setTitulo(titulo);
		this.setN_canciones(n_canciones);
		this.setPrecio(precio);
		GregorianCalendar calendario=new GregorianCalendar(anio, mes-1, dia);
		setFechaCompra(calendario.getTime());
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}

	public int getN_canciones() {
		return n_canciones;
	}

	public void setN_canciones(int n_canciones) {
		this.n_canciones=n_canciones;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio=precio;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra=fechaCompra;
	}

}
