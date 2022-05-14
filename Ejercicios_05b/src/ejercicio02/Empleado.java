package ejercicio02;

/**
 * <p>Crear una clase llamada <b>Empleado</b> que contenga
 * como datos miembro el nombre y el numero de empleado, y como 
 * metodos miembro leerDatos() para leer los datos desde teclado y verDatos() 
 * para mostrarlos en pantalla, ademas de los <i>getters</i> y <i>setters</i> que 
 * sean necesarios</p>
 * @since 01/05/2022
 * @version 1.0
 * @author Victor Sanz*/

/*Clase 'Empleado'*/
public class Empleado {
	
	private String nombre;
	
	private int n_empleado;

	/*Constructor de la clase 'Empleado'*/
	public Empleado() {
		
		nombre="";
		
		n_empleado=0000;
		
	} // Fin del constructor de la clase 'Empleado'
	
	public void leerDatos(String nom, int n) {
		
		nombre=nom;
		
		if (n_empleado>1000) { 
		
			n_empleado=n;
		
		} 
		
	}
	
	public String verDatos() {
		
		return "\tEl nombre del empleado es: "+nombre+".\n\tNumero de empleado: "+n_empleado+".";
		
	}

}
