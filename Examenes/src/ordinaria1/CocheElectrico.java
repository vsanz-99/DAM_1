package ordinaria1;

import java.io.Serializable;

public class CocheElectrico extends Coche implements Serializable {
	private int autonomia;
	private int cargaRapida;

	public CocheElectrico(String marca, String modelo,
			int aAparicion, int tiempoVida, int plazas, int ptn,
			int autonomia, int cargaRapida) {

		super(marca, modelo, aAparicion, tiempoVida, plazas, ptn);

		this.autonomia = autonomia;
		this.cargaRapida = cargaRapida;
	}

	public String imprimirTodo() {
		return super.getAll() + autonomia + "KM " + cargaRapida + "minutos";
	}
}