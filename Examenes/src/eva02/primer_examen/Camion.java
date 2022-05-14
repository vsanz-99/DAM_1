package eva02.primer_examen;

public class Camion extends Vehiculo {

	public final int ejesc;
	
	public Camion(int ejes) {
		ejesc=ejes;
		precio_pintura=300+200*ejes;
	}
	
	public int getEjes() {
		return ejesc;
	}
	
	public boolean debeRevisarse() {
		if(km>10000 || dias>180) {
			return true;
		} else {
			return false;
		}
	}
	
}
