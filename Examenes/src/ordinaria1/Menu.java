package ordinaria1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * <p><i>Archivo: Menu.java</i></p>
 * <p><b>1ª Convocatoria</b>.</p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Menu {

	// Nombre del archivo de Objetos Vehiculo.
	String fichero;
	// Entrada de datos.
	Scanner tec=new Scanner(System.in);
	// Array.
	ArrayList<Vehiculo> vehiculos=new ArrayList<Vehiculo>();

	public Menu(String archivo) throws IOException {	
		fichero=archivo;
		// HAY QUE CREAR EL FICHERO ANTES DE INICIAR EL PROGRAMA, SINO MUESTRA UN ERROR AL INSERTAR LOS DATOS.
		// EL FICHERO TIENE QUE SER CREADO EN LA CARPETA DEL WORKSPACE.
		Insertar ins=new Insertar(fichero);
		if (!ins.tieneSiguiente())
			ins.rInsertarVehiculos(vehiculos);
		ins.finalizar();
		boolean fin;
		do {
			fin=trabajo();
		} while (!fin);
	}

	// MENSAJE MENU.
	private void imprimir() {
		System.out.println("Elige una opcion: \n"
				+"\t1.- Anadir un vehiculo.\n"
				+"\t2.- Eliminar un vehiculo.\n"
				+"\t3.- Listado de vehiculos.\n"
				+"\t4.- Datos de un vehiculo.\n"
				+"\t5.- Listar vehiculos por marca.\n"
				+"\t6.- Listar coches por tipo de combustible.\n"
				+"\t7.- Listar vehiculos por anio de venta.\n"
				+"\t8.- Guardar datos (confirmar cambios).\n"
				+"\t0.- Salir del programa.");
	}

	// MENU.
	private boolean trabajo() throws IOException {
		int opcion;
		do {
			imprimir();
			try {
				System.out.println("--> ");
				opcion=tec.nextInt();
				tec.nextLine();
			} catch (Exception e) {
				System.out.println("\tDebe introducir un numero entre 1 y 7.");
				opcion=0;
				tec.next();
			}
		} while ((opcion<0) || (opcion>8));
		if (opcion==0)
			return true;
		switch (opcion) {
		case 1 :
			aVehiculo();
			break;
		case 2 :
			bVehiculo();
			break;
		case 3 :
			lVehiculos();
			break;
		case 4 :
			cDatos();
			break;
		case 5 :
			listaMarca();
			break;
		case 6 :
			listaTCombustible();
			break;
		case 7 :
			//listaAVenta();
			break;
		case 8:
			modFichero();
			System.out.println("\tGuardado con exito.");
			break;
		}
		return false;
	}

	// ANADE VEHICULO.
	private void aVehiculo() {
		boolean verify=false;
		do {
			System.out.println("¿Que tipo de vehiculo quiere anadir?");
			System.out.println("\t1-. Coche de combustion.\n"
					+"\t2-. Coche electrico \n"
					+"\t3-. Moto");
			int opcion=tec.nextInt();
			tec.nextLine();
			switch (opcion) {
			case 1 :
				crearCombustible();
				verify=true;
				break;
			case 2:
				crearElectrico();
				verify=true;
				break;
			case 3:
				crearMoto();
				verify=true;
				break;
			default :
				System.out.println("\tATENCION: Opcion NO reconocida por el sistema.");
				verify=false;
			}
		} while (!verify);
	}

	// CREA COCHE DE COMBUSTIBLE.
	public void crearCombustible() {
		String marca, modelo, tipoCombustible;
		marca=modelo=tipoCombustible="";
		int aAparicion, tVida, plazas, potencia, cilindrada;
		aAparicion=tVida=plazas=potencia=cilindrada=0;
		Random r=new Random();
		System.out.println("Introduce los siguientes datos:");
		System.out.println("¿Marca?");
		marca=tec.nextLine();
		System.out.println("¿Modelo?");
		modelo=tec.nextLine();
		do {
			System.out.println("¿Anio de aparicion?");
			aAparicion=tec.nextInt();
		}while(aAparicion<1885);
		tec.nextLine();
		do {
			System.out.println("¿Tiempo de vida?");
			tVida=r.nextInt(21);
		} while ((tVida<5) || (tVida>20));
		System.out.println("\tEl tiempo de vida anadido de forma aleatoria es: "+tVida+" anios");
		do {
			System.out.println("¿Numero de plazas?");
			plazas=tec.nextInt();
		} while ((plazas<1) || (plazas>7));
		System.out.println("¿Potencia? (CV)");
		potencia=tec.nextInt();
		do {
			System.out.println("¿Tipo de combustible? (gasolina, diesel, etanol)");
			tipoCombustible=tec.nextLine();
		}while ((!tipoCombustible.equalsIgnoreCase("gasolina")) || 
				(!tipoCombustible.equalsIgnoreCase("diesel")) || 
				(!tipoCombustible.equalsIgnoreCase("etanol")));
		System.out.println("¿Cilindrada? (cc)");
		cilindrada=tec.nextInt();
		String vCreado=marca+" "+modelo;
		if (!existeVehiculo(vCreado)) {
			Vehiculo c=new CocheCombustion(marca, modelo, aAparicion, tVida, 
					plazas, potencia, tipoCombustible, cilindrada);
			vehiculos.add(c);
			System.out.println("\tVehiculo anadido.");
		}
	}

	// CREA COCHE ELECTRICO.
	public void crearElectrico() {
		String marca, modelo;
		marca=modelo="";
		int aAparicion, tVida, plazas, potencia, autonomia, cRapida;
		aAparicion=tVida=plazas=potencia=autonomia=cRapida=0;
		Random r=new Random();
		System.out.println("Introduce los siguientes datos: ");
		System.out.println("¿Marca?");
		marca=tec.nextLine();
		System.out.println("¿Modelo?");
		modelo=tec.nextLine();
		do {
			System.out.println("¿Anio de aparicion?");
			aAparicion=tec.nextInt();
		} while (aAparicion<1885);
		tec.nextLine();
		do {
			System.out.println("¿Tiempo de vida?");
			tVida=r.nextInt(21);
		} while ((tVida<5) || (tVida>20));
		System.out.println("\tEl tiempo de vida anadido de forma aleatoria es: "+tVida+" anios");
		do {
			System.out.println("¿Numero de plazas?");
			plazas=tec.nextInt();
			tec.nextLine();
		} while ((plazas<1) || (plazas>7));
		System.out.println("¿Potencia? (CV)");
		potencia=tec.nextInt();
		tec.nextLine();
		System.out.println("¿Autonomia? (KM)");
		autonomia=tec.nextInt();
		tec.nextLine();
		System.out.println("¿Carga rapida? (minutos)");
		cRapida=tec.nextInt();
		tec.nextLine();
		String vCreado=marca+" "+modelo;
		if (!existeVehiculo(vCreado)) {
			Vehiculo c=new CocheElectrico(marca, modelo, aAparicion, tVida, plazas, 
					potencia, autonomia, cRapida);
			vehiculos.add(c);
			System.out.println("\tVehiculo anadido.");
		}
	}

	// CREA MOTO.
	public void crearMoto() {
		String marca, modelo;
		marca=modelo="";
		int aAparicion, tVida, cilindrada;
		aAparicion=tVida=cilindrada=0;
		boolean sidecar;
		Random r=new Random();
		System.out.println("Introduce los siguientes datos: ");
		System.out.println("¿Marca?");
		marca=tec.nextLine();
		System.out.println("¿Modelo?");
		modelo=tec.nextLine();
		do {
			System.out.println("¿Anio de aparicion?");
			aAparicion=tec.nextInt();
		} while (aAparicion<1885);
		tec.nextLine();
		do {
			System.out.println("¿Tiempo de vida?");
			tVida=r.nextInt(21);
		} while ((tVida<5) || (tVida>20));
		System.out.println("\tEl tiempo de vida anadido de forma aleatoria es: "+tVida+" anios");
		System.out.println("¿Cilindrada? (cc)");
		cilindrada=tec.nextInt();
		tec.nextLine();
		System.out.println("¿Tiene sidecar?");
		sidecar=r.nextBoolean();
		String vCreado=marca+" "+modelo;
		if (!existeVehiculo(vCreado)) {
			Vehiculo c=new Moto(marca, modelo, aAparicion, tVida, 
					cilindrada, sidecar);
			vehiculos.add(c);
			System.out.println("\tVehiculo anadido.");
		}
	}

	// COMPRUEBA SI EXISTE EL VEHICULO.
	public boolean existeVehiculo(String vCreado) {
		if (!vehiculos.isEmpty()) {
			for (Vehiculo v : vehiculos) {
				if (vCreado.equals(v.getMarcaModelo())) {
					System.out.println("\tEl vehiculo introducido ya existe.");
					return true;
				}
			}
		}
		return false;
	}

	// BORRA UN VEHICULO.
	public void bVehiculo(){
		System.out.println("¿Que vehiculo desea borrar?");
		System.out.print("¿Marca?");
		String marca=tec.nextLine();
		System.out.print("¿Modelo?");
		String modelo=tec.nextLine();
		String vCreado=marca+" "+modelo;
		if (!vehiculos.isEmpty()) {
			for (Vehiculo v : vehiculos) {
				if (vCreado.equals(v.getMarcaModelo())) {
					vehiculos.remove(v);
					System.out.println("\tVehiculo borrado con exito.");
				}
				System.out.println("\tNo se ha encontrado ningun vehiculo "
						+"con esas caracteristicas.");
			}
		}
	}

	// MUESTRA UN LISTADO DE VEHICULOS EN ORDEN ALFABETICO.
	public void lVehiculos() {
		ArrayList <String> datos=new ArrayList <String>();
		for (Vehiculo v : vehiculos) {
			datos.add(v.getAll());
		}
		System.out.println("Lista de vehiculos ordenados alfabeticamente: \n");
		Collections.sort(datos);
		datos.forEach(n -> System.out.println(n));
	}

	// CONSULTA LOS DATOS DE UN VEHICULO.
	public void cDatos() {
		boolean verify=false;
		System.out.println("¿Que vehiculo desea consultar?");
		System.out.print("¿Marca?");
		String marca=tec.nextLine();
		System.out.print("¿Modelo?");
		String modelo=tec.nextLine();
		String vCreado=marca+" "+modelo;
		if (!vehiculos.isEmpty()) {
			for (Vehiculo v : vehiculos) {
				if (vCreado.equals(v.getMarcaModelo())) {
					verify=true;
					System.out.println("Datos del vehiculo solicitado: ");
					v.getAll();
				}
			}
		}
		if (!verify)
			System.out.println("\tEl vehiculo solicitado NO existe.");
	}

	// LISTADO DE VEHICULOS POR MARCA.
	public void listaMarca() {
		boolean verify=false;
		System.out.print("Introduce la marca que desea buscar: ");
		String marca=tec.nextLine();
		System.out.println("Lista de vehiculos de la marca "+marca+": ");
		for (Vehiculo v : vehiculos) {
			if (marca.equals(v.getMarca())) {
				System.out.println(v.getMarcaModelo());
				verify=true;
			}
		}
		if (!verify)
			System.out.println("No se han encontrado vehiculos "
					+"perteneciente a esa marca.");
	}

	// LISTADO DE VEHICULOS POR TIPO DE COMBUSTIBLE.
	public void listaTCombustible() {
		boolean verify=false;
		int opcion=0;
		System.out.print("Introduce el tipo de combustible que "
				+"desea buscar (omita acentos): ");
		String tComb=tec.nextLine();
		if (tComb.equalsIgnoreCase("gasolina"))
			opcion=1;
		else if (tComb.equalsIgnoreCase("diesel"))
			opcion=2;
		else if (tComb.equalsIgnoreCase("etanol"))
			opcion=3;
		else {
			opcion=0;
		}
		switch (opcion) {
		case 1 : 
			System.out.println("Lista de vehiculos de "+tComb+": ");
			for (Vehiculo v : vehiculos) {
				/*
				if (tComb.equals(v.getTCombustible(v))) {
					System.out.println(v.getMarcaModelo());
					verify=true;
				}
				 */
			}
			break;
		case 2 : 
			System.out.println("Lista de vehiculos de "+tComb+": ");
			for (Vehiculo v : vehiculos) {
				/*
				if (tComb.equals(v.getTCombustible(v))) {
					System.out.println(v.getMarcaModelo());
					verify=true;
				}
				 */
			}
			break;
		case 3 : 
			System.out.println("Lista de vehiculos de "+tComb+": ");
			for (Vehiculo v : vehiculos) {
				/*
				if(tComb.equals(v.getTCombustible(v))) {
					System.out.println(v.getMarcaModelo());
					verify=true;
				}
				 */
			}
			break;
		default:
			System.out.println("\tTipo de combustible NO valido.");
		}
		if (!verify)
			System.out.println("\tNo se han encontrado vehiculos que usen "
					+"ese tipo de combustible.");
	}

	// LISTADO DE VEHICULOS POR ANIO DE SALIDA.
	public void listaAVenta() {
		System.out.println("Introduce el anio que desea buscar: ");
		int anio, cont;
		anio=cont=0;
		do {
			System.out.println("Introduce un anio superior a 1885: ");
			anio=tec.nextInt();
		} while(anio<1885);
		for (Vehiculo v : vehiculos) {
			if (v.getAAparicion()==anio) {
				System.out.println(v.getMarcaModelo());
				cont++;
			}
		}
		if (cont==0) {
			System.out.println("\tEse anio no se vendio ningun vehiculo.");
		} else {
			System.out.println("\tEl numero de vehiculos comercializados en "
					+"el anio "+anio+" es de: "+cont+" vehiculos");
		}
	}

	//	GUARDA LOS CAMBIOS EN EL FICHERO.
	public void modFichero() throws IOException {
		Insertar in=new Insertar(fichero);
		in.borrarTodo();
		vehiculos.forEach(n -> {
			try {
				in.annadirVehiculo(n);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		in.finalizar();
	}

}