package eva03.ejercicio03;
import java.io.IOException;

public class Ejecutable {

	public static void main(String[] args) throws IOException {

		Menu menu=new Menu();

		menu.imprimirOpciones();

		Socio socio=new Socio();

		//socio.annadirSocio();
		//socio.eliminarSocio();
		//socio.modificarDatos();
		//socio.visualizarCuotas(null);

		Pista pista=new Pista();

		pista.visualizarCantPistas();
		//pista.calcularPrecioUso();

	}

}
