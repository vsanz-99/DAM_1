package ordinaria1;
import java.io.Serializable;

/**
 * <p><i>Archivo: Moto.java</i></p>
 * <p><b>1ª Convocatoria</b>.</p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Moto extends Vehiculo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID=1L;
	private int cilindrada;
	private boolean sidecar;

	public Moto(String marca, String modelo, int aAparicion, int tiempoVida, 
			int cilindrada, boolean sidecar) {
		super(marca, modelo, aAparicion, tiempoVida);
		this.cilindrada=cilindrada;
		this.sidecar=sidecar;
	}

	public String imprimirTodo() {
		return super.getAll()+" "+cilindrada+" cc "+"sidecar: "+sidecar;
	}

}