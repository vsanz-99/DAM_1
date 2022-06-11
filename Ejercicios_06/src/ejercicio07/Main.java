package ejercicio07;
import java.util.Scanner;

/**
 * <p><i>Archivo: Main.java</i></p>
 * <p><b>Ejercicio 07</b>.</p>
 * @since 09/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Main {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Conjunto nuevoConjunto1=new Conjunto();
		Conjunto nuevoConjunto2=new Conjunto();
		nuevoConjunto1.agregar(1);
		nuevoConjunto1.agregar(10);
		nuevoConjunto1.agregar(21);
		nuevoConjunto1.agregar(2);
		nuevoConjunto1.agregar(5);
		nuevoConjunto1.agregar(67);
		nuevoConjunto1.imprimir();
		nuevoConjunto1.copiar(nuevoConjunto2.tabla);
		nuevoConjunto2.imprimir();
		nuevoConjunto1.vaciar();
		nuevoConjunto1.imprimir();
		if (nuevoConjunto2.esMiembro(2))
			nuevoConjunto2.eliminar(nuevoConjunto2.posicion(2));
		nuevoConjunto2.imprimir();
		teclado.close();
	}

}
