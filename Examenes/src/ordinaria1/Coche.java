package ordinaria1;
import java.io.Serializable;

/**
 * <p><i>Archivo: Coche.java</i></p>
 * <p><b>1ª Convocatoria</b>.</p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Coche extends Vehiculo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID=1L;
	protected int nPlazas;
	protected int potencia;
	public Coche(String marca, String modelo, int aAparicion, 
			int tiempoVida, int plazas, int ptn) {
		super(marca, modelo, aAparicion, tiempoVida);
		this.nPlazas=plazas;
		this.potencia=ptn;
	}

	@Override
	public String getAll() {
		return super.getAll()+nPlazas+"(plazas) "+potencia+" CV ";
	}

}
