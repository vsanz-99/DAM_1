package poo;

/*Todas las Clases de Java heredan de java.lang.Object (cosmica)*/
public class Clase1 {

	protected int mivar=5; // protected es mas permisivo que el private

	protected int mivar2=7; 

	protected String mimetodo() {
		return "\tEl valor de mivar2 es: "+mivar2+".";
	}

}
