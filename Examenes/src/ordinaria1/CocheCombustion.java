package ordinaria1;

import java.io.Serializable;

public class CocheCombustion extends Coche implements Serializable {

	private String tipoCombustible;
	private int cilindrada;
	public CocheCombustion(String marca, String modelo,
			int aAparicion, int tiempoVida, int plazas, int ptn,
			String tComb, int cld) {

		super(marca, modelo, aAparicion, tiempoVida, plazas, ptn);

		this.tipoCombustible = tComb;
		this.cilindrada = cld;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}
	public String imprimirTodo() {
		return super.getAll() + tipoCombustible + " " + cilindrada + "cc";
	}
}
