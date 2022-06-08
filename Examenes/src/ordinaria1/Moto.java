package ordinaria1;

import java.io.Serializable;

public class Moto extends Vehiculo implements Serializable {

	private int cilindrada;
	private boolean sidecar;

	public Moto(String marca, String modelo, 
			int aAparicion, int tiempoVida, int cilindrada, boolean sidecar) {
		super(marca, modelo, aAparicion, tiempoVida);
		this.cilindrada = cilindrada;
		this.sidecar = sidecar;
	}

	public String imprimirTodo() {
		return super.getAll() + " " + cilindrada + "cc " + "Sidecar: " + sidecar;
	}
}