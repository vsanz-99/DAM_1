package ordinaria2_posible;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <p><i>Archivo: MenuRestaurante.java</i></p>
 * <p><b>PruebaExamen</b>.</p>
 * @since 07/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class MenuRestaurante {

	String fichero="menu.txt";
	Restaurante carta=new Restaurante(fichero);
	String menu="Elige una opcion: \n"
			+"\t1-. Annadir un plato.\n"
			+"\t2-. Borrar un plato.\n"
			+"\t3-. Listado en orden alfabetico.\n"
			+"\t4-. Buscar por plato.\n"
			+"\t5-. Annadir un ingrediente.\n"
			+"\t6-. Borrar un ingrediente.\n"
			+"\t7-. Buscar un ingrediente.\n"
			+"\t8-. Buscar platos sin un ingrediente.\n"
			+"\t9-. Salir.";
	Scanner teclado=new Scanner(System.in);
	PrintStream out=null;

	public MenuRestaurante() { // Constructor
		int op;
		do {
			System.out.println(menu);
			do {
				System.out.println("--> ");
				op=teclado.nextInt();
				teclado.nextLine();
			} while (!(op<=9 && op>=0));
			switch (op) {
			case 1 :
				annadirPlato();
				break;
			case 2 :
				borrarPlato();
				break;
			case 3 :
				listadoOrdenado();
				break;
			case 4 :
				buscaNombre();
				break;
			case 5 :
				annadirIngrediente();
				break;
			case 6 :
				borrarIngrediente();
				break;
			case 7 :
				buscaIngrediente();
				break;
			case 8 :
				buscaContrario();
				break;
			case 9 :
				transaccion();
				break;
			default :
			}
		} while (op !=0);
	}

	private void annadirPlato() {
		String nombrePlato="";
		double precio=0;
		do {
			System.out.println("\t¿Nombre del plato?");
			nombrePlato=teclado.nextLine();
			if (carta.buscaNombre(nombrePlato)!=null) 
				System.out.println("\tYa existe otro plato con este nombre.");
			System.out.println("¿Precio del plato?");
			precio=teclado.nextDouble();
			transaccion();
		} while (carta.buscaNombre(nombrePlato)!=null);
		carta.addPlato(nombrePlato, precio);
	}

	private void borrarPlato() {
		String nombrePlato="";
		System.out.println("¿Nombre del plato?");
		nombrePlato=teclado.nextLine();
		if (!carta.delPlato(nombrePlato))
			System.out.println("\tNo se pudo eliminar.");
		transaccion();
	}

	private void listadoOrdenado() {
		System.out.println(carta.listadoAZ());
	}

	private void buscaNombre() {
		String nombrePlato="";
		System.out.println("Nombre del plato: ");
		nombrePlato=teclado.nextLine();
		System.out.println((carta.buscaNombre(nombrePlato)!=null)?carta.buscaNombre(nombrePlato):
				"\tNo existe ningun plato con ese nombre.");
	}

	private void annadirIngrediente() {
		String nombrePlato, nombre;
		int cantidad=0;
		do {
			System.out.println("Nombre del plato: ");
			nombrePlato=teclado.nextLine();
		} while (carta.buscaNombre(nombrePlato)==null);
		int num=0;
		System.out.println("¿Cuantos ingredientes desea annadir?");
		num=teclado.nextInt();
		teclado.nextLine();
		for (int i=0; i<num; i++) {
			System.out.println("Ingrediente: ");
			nombre=teclado.nextLine();
			do {
				try {
					System.out.println("Cantidad: ");
					cantidad=teclado.nextInt();
					teclado.nextLine();
				} catch(InputMismatchException ime) {
					System.out.println("\tError: introduce un valor VALIDO.");
					ime.printStackTrace();
				}
			} while (!Ingrediente.valida(cantidad));
			carta.addIngrediente(nombrePlato, nombre, cantidad);
			transaccion();
		}
	}

	private void borrarIngrediente() {
		String nombrePlato, nombre;
		nombrePlato=nombre="";
		int cantidad=0;
		do {
			System.out.println("Nombre del plato: ");
			nombrePlato=teclado.nextLine();
		} while (carta.buscaNombre(nombrePlato)==null);
		do {
			System.out.println("Ingrediente: ");
			nombre=teclado.nextLine();
		} while (carta.buscaIngrediente(nombre)==null);
		carta.delIngrediente(nombrePlato, nombre, cantidad);
		transaccion();
	}

	private void buscaIngrediente() {
		String nombre;
		System.out.println("Ingrediente: ");
		nombre=teclado.nextLine();
		System.out.println(carta.buscaIngrediente(nombre));
	}

	private void buscaContrario() {
		String nombre="";
		System.out.println("Ingrediente: ");
		nombre=teclado.nextLine();
		System.out.println(carta.buscaContrario(nombre));
	}

	private void transaccion() {
		try {
			out=new PrintStream(
					new FileOutputStream(fichero, false));
			out.print(carta);
		} catch(FileNotFoundException fne) {
			System.out.println("\tError: fichero NO encontrado.");
			fne.printStackTrace();
		} finally {
			if (out!=null) {
				out.close();
			}
		}
	}

}
