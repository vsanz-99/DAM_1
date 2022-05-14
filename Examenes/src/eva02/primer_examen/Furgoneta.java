package eva02.primer_examen;

public class Furgoneta extends Vehiculo {

	public final int ejesf;
	
	public Furgoneta(int ejes) {
		ejesf=ejes;
		precio_pintura=500+100*ejes;
	}
	
	public int getEjes() {
		return ejesf;
	}
	
	public boolean debeRevisarse() {
		if (km>12000 || dias>180) {
			return true;
		} else {
			return false;
		}
	}
	
}
