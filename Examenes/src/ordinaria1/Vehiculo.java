package ordinaria1;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * <p><i>Archivo: Vehiculo.java</i></p>
 * <p><b>1ª Convocatoria</b>.</p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Vehiculo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID=1L;
	protected String marca;
	protected String modelo;
	protected int aAparicion;
	protected int tiempoVida;

	public Vehiculo(String marca,String modelo,int aAparicion,int tiempoVida) {
		this.marca=marca;
		this.modelo=modelo;
		this.aAparicion=aAparicion;
		this.tiempoVida=tiempoVida;
	}

	public String getMarca() {
		return marca;
	}
	
	public int getAAparicion() {
		return aAparicion;
	}
	
	public String getMarcaModelo() {
		return marca+" "+modelo;
	}
	
	public String getAll() {
		return marca+" "+modelo+" "+aAparicion+" "+tiempoVida;
	}
	
	public String getTCombustible(CocheCombustion v){
		return v.getTCombustible(v);
	}
	
}
