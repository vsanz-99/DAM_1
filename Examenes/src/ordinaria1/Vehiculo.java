package ordinaria1;

import java.io.Serializable;
import java.util.ArrayList;

public class Vehiculo implements Serializable {


	protected String marca;
	protected String modelo;
	protected int aAparicion;
	protected int tiempoVida;

	public Vehiculo(String marca,String modelo,int aAparicion,int tiempoVida) {


		this.marca = marca;
		this.modelo = modelo;
		this.aAparicion = aAparicion;
		this.tiempoVida = tiempoVida;

	}



	public String getMarca() {
		return marca;
	}
	public int getAAparicion() {
		return aAparicion;
	}
	public String getMarcaModelo() {
		return marca + " " + modelo;
	}
	public String getAll() {
		return marca + " " + modelo + " " + aAparicion + " " + tiempoVida;
	}
	public String getTCombustible(CocheCombustion v){
		return v.getTCombustible(v);
	}
}
