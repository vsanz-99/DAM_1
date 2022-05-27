package eva02.ejercicio05;

/**
 * <p><i>Archivo: PruebaAnimales.java</i><p>
 * <p><b>Ejercicio 05</b>. Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, 
 * Pinguino y Lagarto. Crea, al menos, tres metodos especificos de cada clase e invalida 
 * el/los metodo/s cuando sea necesario. Prueba las clases creadas en un conductor en el 
 * que se instancien objetos y se 
 * les apliquen metodos.</p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class PruebaAnimales {

	public static void main(String[] args) {

		Pinguino tux=new Pinguino(Sexo.MACHO);
		tux.come("palomitas");
		tux.programa();

		System.out.println();

		Perro laika=new Perro(Sexo.HEMBRA);
		laika.duerme();
		laika.dameLaPata();
		laika.amamanta();
		laika.cuidaCrias();

		System.out.println();

		Lagarto godzilla=new Lagarto(Sexo.MACHO);
		godzilla.tomaElSol();
		godzilla.duerme();

	}

}