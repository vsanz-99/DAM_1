package ordinaria1;

import java.io.Serializable;

public class Coche extends Vehiculo implements Serializable {
	
	protected int nPlazas;
	protected int potencia;
	public Coche(String marca, String modelo, 
				 int aAparicion, int tiempoVida, int plazas, int ptn){
		
		super(marca, modelo, aAparicion, tiempoVida);
		this.nPlazas = plazas;
		this.potencia = ptn;
	}
	
	public String getAll() {
		return super.getAll() + nPlazas+"(plazas) " + potencia + "CV ";
	}
}
