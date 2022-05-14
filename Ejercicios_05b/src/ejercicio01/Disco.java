package ejercicio01;
import java.util.*;

/**
 * <p>Crear una clase <b>Disco</b> para guardar informacion sobre los discos de musica que tenemos.</p>
 * <p>La informacion asociada a cada uno de los discos es: </p>
 * <i>Titulo, nº de canciones, precio y fecha de compra.</i>
 * @since 01/05/2022
 * @version 1.0
 * @author Victor Sanz*/

/*Clase 'Disco'*/
public class Disco {

	private String titulo;
	
	private int n_canciones;
	
	private double precio;
	
	private Date fechaCompra;
	
	/*Constructor de la clase 'Disco'*/
	public Disco() { // Pasarle parametros fijos
		
		titulo="Unknown";
		
		n_canciones=1;
		
		precio=7.0;
		
		GregorianCalendar calendario=new GregorianCalendar(); // Construye una fecha. Es necesario pasar parametros (anno, mes-1, dia)
		
		fechaCompra=calendario.getTime();
		
	} // Fin del constructor de la clase 'Disco'

}
