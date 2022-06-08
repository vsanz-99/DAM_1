/**
 * <p><i>Archivo: PruebaReloj.java</i></p>
 * <p><b>Ejercicio 06</b>.</p>
 * @since 06/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class PruebaReloj {

	public static void main(String[] args) {
		Reloj reloj1=new Reloj();
		reloj1.ponerEnHora(24, 17, 10, 10);
		System.out.println(reloj1.verHora());
		reloj1.incrementa();
		System.out.println(reloj1.verHora());
		reloj1.decrementa();
		System.out.println(reloj1.verHora());
	}

}
