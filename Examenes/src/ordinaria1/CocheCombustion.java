package ordinaria1;
import java.io.Serializable;

/**
 * <p><i>Archivo: CocheCombustion.java</i></p>
 * <p><b>1ª Convocatoria</b>.</p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class CocheCombustion extends Coche implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID=1L;
	private String tipoCombustible;
	private int cilindrada;
	public CocheCombustion(String marca, String modelo, int aAparicion, 
			int tiempoVida, int plazas, int ptn, String tComb, int cld) {
		super(marca, modelo, aAparicion, tiempoVida, plazas, ptn);
		this.tipoCombustible=tComb;
		this.cilindrada=cld;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public String imprimirTodo() {
		return super.getAll()+tipoCombustible+" "+cilindrada+" cc";
	}

}
