package eva03.ejercicio01.version2;

/**
* <p><i>Archivo: Sancion.java</i></p>
* <p><b>Ejercicio 01</b>. Gestionar las multas de los 
* vehiculos de un municipio. <b>Acabado</b>.</p>
* @since 28/05/2022
* @version 1.0
* @author Victor Sanz*/

public class Sancion {

	private String fecha;
	private String motivo;
	private int importe;
	
	public Sancion(String fecha, String motivo, int importe) {
		this.fecha=fecha;
		this.motivo=motivo;
		this.importe=importe;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public String getMotivo() {
		return motivo;
	}
	
	public int getImporte() {
		return importe;
	}
	
	public String imprimirTodo() {
		return "Sancion: "+" "+fecha+" "+motivo+" "+importe;
	}
	
}
