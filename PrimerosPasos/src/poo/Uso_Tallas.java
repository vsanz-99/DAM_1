package poo;
import java.util.Scanner;

/*Los tipos enumerados son variables Objeto en las que solo
 * se pueden almacenar determinados valores*/
public class Uso_Tallas {

	// Instancia de la Clase ENUM
	//enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE}

	enum Talla {

		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

		private Talla(String abreviatura) { // Es necesario que el Constructor tenga el modificador private

			this.abreviatura=abreviatura;

		}

		public String getAbreviatura() {

			return abreviatura;

		}

		private String abreviatura;

	}

	// Los metodos de esta Clase son estaticos
	public static void main(String[] args) {

		/*
		Talla s=Talla.MINI;

		Talla m=Talla.MEDIANO;

		Talla l=Talla.GRANDE;

		Talla xl=Talla.MUY_GRANDE;
		 */

		Scanner teclado=new Scanner(System.in);

		System.out.println("\tEscribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");

		String entrada_datos=teclado.next().toUpperCase();

		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos); // Devuelve el nombre de la constante
		// enumerada a la que pertence
		
		System.out.println("\tTalla= "+la_talla);
		
		System.out.println("\tAbreviatura= "+la_talla.getAbreviatura());
		
	}

}
