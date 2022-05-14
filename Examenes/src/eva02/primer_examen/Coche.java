package eva02.primer_examen;

public class Coche extends Vehiculo{

	public int getEjes() {
		return ejes;
	}
	
	public boolean debeRevisarse() {
		if(km>15000 || dias>360) {
			return true;
		} else {
			return false;
		}
	}
	
}
