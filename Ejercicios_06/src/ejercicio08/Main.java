package ejercicio08;

/**
 * <p><i>Archivo: Main.java</i></p>
 * <p><b>Ejercicio 08</b>.</p>
 * @since 09/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Main {

	public static void main(String[] args) {
		Cuentas cuenta=new Cuentas();
		cuenta.add("1234578", "Sandra Romero", 1006);
		cuenta.add("1234573", "David Jimenez", 100);
		cuenta.esRico();
	}
	
}
