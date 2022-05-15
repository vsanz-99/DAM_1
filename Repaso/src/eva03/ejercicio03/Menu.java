package eva03.ejercicio03;
import java.io.IOException;
import java.util.Scanner;

public class Menu {

	Socio socio=new Socio();
	Pista pista=new Pista();

	public void imprimirOpciones() throws IOException {

		Scanner teclado=new Scanner(System.in);

		System.out.println("\tOpcion (): Annadir socio.");
		System.out.println("\tOpcion (): Eliminar socio.");
		System.out.println("\tOpcion (): Modificar datos del socio.");
		System.out.println("\tOpcion (): Visualizar las cuotas.");
		System.out.println("\tOpcion (): Visualizar la cantidad de pistas que hay.");
		System.out.println("\tOpcion (): Calcular el precio de uso de la pista (determinado por el tiempo de uso).");

		int opcion=teclado.nextInt();

		switch (opcion) {
		case 1 :
			socio.annadirSocio();
			break;
		case 2 :
			socio.eliminarSocio(null);
			break;
		case 3 :
			socio.modificarDatos();
			break;
		case 4 :
			socio.visualizarCuotas(null);
			break;
		case 5 :
			pista.visualizarCantPistas();
			break;
		case 6 :
			pista.calcularPrecioUso();
		}

	}

}
