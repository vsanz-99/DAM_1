/**
 * <p><i>Archivo: Reloj.java</i></p>
 * <p><b>Ejercicio 06</b>.</p>
 * @since 06/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Reloj {

	int modo, hora, minutos, segundos;

	int getModo() {
		return modo;
	}

	public void setmodo(int modo) {
		this.modo=modo;
	}

	int getHora() {
		return hora;
	}

	public void sethora(int hora) {
		this.hora=hora;
	}

	public int getminutos() {
		return minutos;
	}

	public void setminutos(int minutos) {
		this.minutos=minutos;
	}

	public int getsegundos() {
		return segundos;
	}

	public  void setsegundos(int segundos) {
		this.segundos=segundos;
	}

	public Reloj() {
		modo=24; // Por defecto ponemos 24 horas.
		hora=0;
		minutos=0;
		segundos=0;
	}

	public Reloj(int h, int m, int s) {
		this.modo=24;
		this.hora=h%24;
		this.minutos=m%60;
		this.segundos=s%60;
	}

	public void ponerEnHora(int md, int hh, int mm, int ss) { 
		modo=md;
		hora=hh%24;
		minutos=mm%60;
		segundos=ss%60;
	}

	public void incrementa() {
		segundos++;
		if (segundos==60) {
			segundos=0;
			minutos++;
			if (minutos==60) {
				minutos=0;
				hora=(hora+1)%24;
			}
		}
	}

	public void decrementa(){
		segundos--;
		if (segundos<00) {
			segundos=59;
			minutos--;
			if (minutos<00) {
				minutos=59;
				hora=(hora-1)%24;
			}
		}
	}

	public String verHora(){
		String hms="Son las ";
		if (modo==12) { // Modo 12 horas.    
			hms+=(hora>12)?hora-12:hora;
			hms+=":"+minutos+":"+segundos;
			hms+=(hora>=12)?"pm":"am";
		} else { // Modo 24h.
			hms+=hora+":"+minutos+":"+segundos;
		}
		return (hms);
	}

}
