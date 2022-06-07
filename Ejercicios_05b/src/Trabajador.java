import java.util.Random;

/**
 * <p><i>Archivo: Trabajador.java</i></p>
 * <p><b>Ejercicio 03</b>.</p>
 * @since 06/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Trabajador {

	private String nombre;
	private char estado_civil; private char turno;
	private int titulacion; private int anios_empresa;
	private int IdTrabajador;

	public Trabajador(String nombre, char estado_civil, char turno, 
			int titulacion, int anios_empresa) {
		this.setNombre(nombre);
		this.setEstado_civil(estado_civil);
		this.setTurno(turno);
		this.setTitulacion(titulacion);
		this.setAnios_empresa(anios_empresa);
		int aleatorio=(int)(Math.random()*(100-1));
		IdTrabajador=aleatorio;
	}

	public int getIdTrabajador() {
		return IdTrabajador;
	}

	public String verDatos() {
		return "Datos del trabajador: \n"+
				"\tID: "+IdTrabajador+"\n"+
				"\tNombre: "+nombre+"\n"+
				"\tEstado_civil: "+estado_civil+"\n"+
				"\tTurno: "+turno+"\n"+
				"\tTitulacion: "+titulacion+"\n"+
				"\tAnios en la empresa: "+anios_empresa;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public void setEstado_civil(char estado_civil) {
		this.estado_civil=estado_civil;
	}

	public void setTurno(char turno) {
		this.turno=turno;
	}

	public void setTitulacion(int titulacion) {
		this.titulacion=titulacion;
	}

	public void setAnios_empresa(int anios_empresa) {
		this.anios_empresa=anios_empresa;
	}

	public int nomina_trabajador() {
		int salario_base=425;
		if (turno=='N')
			salario_base+=100;
		if (anios_empresa!=0)
			salario_base=salario_base+(75*anios_empresa);
		switch (titulacion) {
		case 0 :
			salario_base+=250;
			break;
		case 1 :
			salario_base+=500;
			break;
		case 2 :
			salario_base+=1000;
			break;
		case 3 :
			salario_base+=1250;
			break;
		case 4 :
			salario_base+=1500;
			break;
		default :
		}
		int res;
		if (estado_civil=='C') {
			res=(salario_base*10)/100;
			salario_base=salario_base-res;
		} else {
			res=(salario_base*12)/100;
			salario_base=salario_base-res;
		}
		return salario_base;
	}

}
