package poo;

public class Coche {

	private int ruedas;

	private int largo;

	private int ancho;

	private int motor;

	private int peso_plataforma;

	private String color;

	private int peso_total;

	private boolean asientos_cuero, climatizador;

	public Coche() {

		ruedas=4;

		largo=2000;

		ancho=300;

		motor=1600;

		peso_plataforma=500;

	}

	public String getDatosGenerales() { // GETTER
		return "\tLa plataforma del vehiculo tiene "+ruedas+" ruedas"+
				". Mide "+largo/1000+" metros con un ancho de "+ancho+" cm y un peso de plataforma de "+
				peso_plataforma+" kg.";
	}

	public void setColor(String color_coche) { // SETTER
		color=color_coche;
	}

	public String getColor() { // GETTER
		return "\tEl color del coche es "+color+".";
	}

	public void setAsientos(String asientos_cuero) { // SETTER
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
		} else {
			this.asientos_cuero=false;
		}
	}

	public String getAsientos() { // GETTER
		if (asientos_cuero) {
			return "\tEl coche tiene asientos de cuero.";
		} else {
			return "\tEl coche tiene asientos de serie.";
		}
	}

	public void setClimatizador(String climatizador) { // SETTER
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		} else {
			this.climatizador=false;
		}
	}

	public String getClimatizador() { // GETTER
		if (climatizador) {
			return "\tEl coche incorpora climatizador.";
		} else {
			return "\tEl coche no incorpora climatizador.";
		}
	}

	public String getPesoCoche() { // SETTER + GETTER
		int peso_carroceria=500;
		peso_total=peso_plataforma+peso_carroceria;
		if (asientos_cuero==true) {
			peso_total+=50;
		}
		if (climatizador==true) {
			peso_total+=20;
		}
		return "\tEl coche pesa" +peso_total+"kg en total.";
	}
	
	public int precio_coche() {
		int precio_final=10000;
		if (asientos_cuero) {
			precio_final+=2000;
		}
		if (climatizador) {
			precio_final+=1500;
		}
		return precio_final;
	}

}
