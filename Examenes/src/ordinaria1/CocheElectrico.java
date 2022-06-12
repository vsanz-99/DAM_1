package ordinaria1;
import java.io.Serializable;

/**
 * <p><i>Archivo: CocheElectrico.java</i></p>
 * <p><b>1ª Convocatoria</b>.</p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class CocheElectrico extends Coche implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID=1L;
	private int autonomia;
	private int cargaRapida;

	public CocheElectrico(String marca, String modelo,
			int aAparicion, int tiempoVida, int plazas, int ptn,
			int autonomia, int cargaRapida) {
		super(marca, modelo, aAparicion, tiempoVida, plazas, ptn);
		this.autonomia=autonomia;
		this.cargaRapida=cargaRapida;
	}

	public String imprimirTodo() {
		return super.getAll()+autonomia+" km "+cargaRapida+" minutos ";
	}

}