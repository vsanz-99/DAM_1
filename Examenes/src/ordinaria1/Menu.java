package ordinaria1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Menu {

	// Nombre del archivo de Objetos vehiculo.
	String fichero;
	// Entrada de datos.
	Scanner tec=new Scanner(System.in);
	// Arrays.
	ArrayList <Vehiculo> vehiculos=new ArrayList<Vehiculo>();

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
	private void imprimir ( ) {
		System.out.println("Elija una opcion: ");
		System.out.println("1.- Anadir un vehiculo.\n"
						+ "2.- Eliminar un vehiculo.\n"
						+ "3.- Listado Vehiculos.\n"
						+ "4.- Datos del Vehiculo\n"
						+ "5.- Vehiculos por marca\n"
						+ "6.- Coches por tipo de combustible\n"
						+ "7.- Vehiculos por año de venta\n"
						+ "8.- Guardar datos\n"
				);
		System.out.println("0.- Terminar");

	}

	// MENU
	private boolean trabajo ( ) throws IOException {
		int opcion;
		do {
			imprimir();
			try {
				opcion = tec.nextInt();
				tec.nextLine();
			} catch ( Exception e ) {
				System.out.println("Debe introducir un numero entre 1 y 7");
				opcion = 0;
				tec.next();
			}
		} while ( opcion < 0 || opcion > 8 );
		if ( opcion == 0 )
			return true;
		switch ( opcion ) {
		case 1:
			aVehiculo();
			break;
		case 2:
			bVehiculo();
			break;
		case 3:
			lVehiculos();
			break;
		case 4:
			cDatos();
			break;
		case 5:
			listaMarca();
			break;
		case 6:
			listaTCombustible();
			break;
		case 7:
			//listaAVenta();
			break;
		case 8:
			modFichero();
			System.out.println("Guardado con exito");
			break;
		}
		return false;
	}

	// AÑADE VEHICULO
	//AÑADE UN VEHICULO
	private void aVehiculo( ){
		boolean verify = false;

		do {
			System.out.println("Que tipo de vehiculo desea añadir:");
			System.out.println(
					"1. Coche de combustible \n" +
							"2. Coche electrico \n"+
					"3. Moto");
			int opcion = tec.nextInt();
			tec.nextLine();

			switch(opcion) {
			case 1:
				crearCombustible();
				verify = true;
				break;
			case 2:
				crearElectrico();
				verify = true;
				break;
			case 3:
				crearMoto();
				verify = true;
				break;
			default:
				System.out.println("Opcion no valida");
				verify = false;
			}
		}while(!verify);
	}

	// CREA COCHE DE COMBUSTIBLE
	// CREA COCHE DE COMBUSTIBLE
	public void crearCombustible() {
		String marca;
		String modelo;
		int aAparicion;
		int tVida;
		int plazas;
		int potencia;
		String tipoCombustible;
		int cilindrada;
		Random r = new Random();

		System.out.println("Introduzca los siguientes datos:");

		System.out.println("Marca: ");
		marca = tec.nextLine();

		System.out.println("Modelo: ");
		modelo = tec.nextLine();

		System.out.println("Año aparición: ");
		do {
			aAparicion = tec.nextInt();
		}while(aAparicion < 1885);
		tec.nextLine();
		System.out.println("Tiempo de vida: ");
		do
			tVida = r.nextInt(21);
		while(tVida>20 && tVida<5);
		System.out.println("El tiempo de vida añadido de forma aleatoria es: " + tVida);

		System.out.println("Numero de plazas: ");
		do
			plazas = tec.nextInt();
		while(plazas>7 && tVida<1);

		System.out.println("Potencia (CV): ");
		potencia = tec.nextInt();

		System.out.println("Tipo de combustible (gasolina, diesel, etanol): ");
		do {
			tipoCombustible = tec.nextLine();
		}while((!tipoCombustible.equalsIgnoreCase("gasolina")) || (!tipoCombustible.equalsIgnoreCase("diesel")) || 
				(!tipoCombustible.equalsIgnoreCase("etanol")));

		System.out.println("Cilindrada (cc): ");
		cilindrada = tec.nextInt();

		String vCreado = marca + " " + modelo;

		if(!existeVehiculo(vCreado)) {
			Vehiculo c = new CocheCombustion(marca, modelo, aAparicion, tVida, plazas, potencia, tipoCombustible, cilindrada);
			vehiculos.add(c);
			System.out.println("Vehiculo añadido");
		}
	}

	// CREA COCHE ELECTRICO
	// CREA COCHE ELECTRICO
	public void crearElectrico() {
		String marca;
		String modelo;
		int aAparicion;
		int tVida;
		int plazas;
		int potencia;
		int autonomia;
		int cRapida;
		Random r = new Random();

		System.out.println("Introduzca los siguientes datos:");

		System.out.println("Marca: ");
		marca = tec.nextLine();

		System.out.println("Modelo: ");
		modelo = tec.nextLine();

		System.out.println("Año aparición: ");
		do {
			aAparicion = tec.nextInt();
		}while(aAparicion < 1885);
		tec.nextLine();
		System.out.println("Tiempo de vida: ");
		do
			tVida = r.nextInt(21);
		while(tVida>20 && tVida<5);
		System.out.println("El tiempo de vida añadido de forma aleatoria es: " + tVida);

		System.out.println("Numero de plazas: ");
		do {
			plazas = tec.nextInt();
			tec.nextLine();
		}while(plazas>7 && tVida<1);

		System.out.println("Potencia (CV): ");
		potencia = tec.nextInt();
		tec.nextLine();

		System.out.println("Autonomia(KM): ");
		autonomia = tec.nextInt();
		tec.nextLine();

		System.out.println("CargaRapida (minutos): ");
		cRapida = tec.nextInt();
		tec.nextLine();

		String vCreado = marca + " " + modelo;

		if(!existeVehiculo(vCreado)) {
			Vehiculo c = new CocheElectrico(marca, modelo, aAparicion, tVida, plazas, potencia, autonomia, cRapida);
			vehiculos.add(c);
			System.out.println("Vehiculo añadido");
		}
	}

	// CREA MOTO
	// CREA UNA MOTO
	public void crearMoto() {
		String marca;
		String modelo;
		int aAparicion;
		int tVida;
		int cilindrada;
		boolean sidecar;
		Random r = new Random();

		System.out.println("Introduzca los siguientes datos:");

		System.out.println("Marca: ");
		marca = tec.nextLine();

		System.out.println("Modelo: ");
		modelo = tec.nextLine();

		System.out.println("Año aparición: ");
		do {
			aAparicion = tec.nextInt();
		}while(aAparicion < 1885);
		tec.nextLine();
		System.out.println("Tiempo de vida: ");
		do
			tVida = r.nextInt(21);
		while(tVida>20 && tVida<5);
		System.out.println("El tiempo de vida añadido de forma aleatoria es: " + tVida);

		System.out.println("Cilindrada(cc): ");
		cilindrada = tec.nextInt();
		tec.nextLine();

		System.out.println("CargaRapida (minutos): ");
		sidecar = r.nextBoolean();

		String vCreado = marca + " " + modelo;

		if(!existeVehiculo(vCreado)) {
			Vehiculo c = new Moto(marca, modelo, aAparicion, tVida, cilindrada, sidecar);
			vehiculos.add(c);
			System.out.println("Vehiculo añadido");
		}
	}

	// COMPRUEBA SI EXISTE EL VEHICULO
	// COMPRUEBA SI EXISTE EL VEHICULO
	public boolean existeVehiculo(String vCreado) {
		if(!vehiculos.isEmpty()) {
			for(Vehiculo v : vehiculos) {
				if(vCreado.equals(v.getMarcaModelo())) {
					System.out.println("El vehiculo ya existe");
					return true;
				}
			}
		}
		return false;
	}

	// BORRA UN VEHICULO
	// BORRA UN VEHICULO
	public void bVehiculo(){
		System.out.println("¿Que vehiculo desea borrar?");

		System.out.print("Introduzca la marca: ");
		String marca = tec.nextLine();
		System.out.print("Introduzca la marca: ");
		String modelo = tec.nextLine();


		String vCreado = marca + " " + modelo;

		if(!vehiculos.isEmpty()) {
			for(Vehiculo v : vehiculos) {
				if(vCreado.equals(v.getMarcaModelo())) {
					vehiculos.remove(v);
					System.out.println("borrado con exito");
				}
				System.out.println("No se ha encontrado el vehiculo");
			}
		}


	}

	// MUESTRA UN LISTADO DE VEHICULOS EN ORDEN ALFABETICO
	// LISTADO DE VEHICULOS EN ORDEN ALFABETICO
	public void lVehiculos() {
		ArrayList <String> datos = new ArrayList <String>();

		for(Vehiculo v : vehiculos) {
			datos.add(v.getAll());
		}

		System.out.println("Lista de vehiculos ordenados alfabéticamente:\n");
		Collections.sort(datos);

		datos.forEach(n -> System.out.println(n));
	}

	// DATOS DE UN VEHICULO

	// CONSULTA LOS DATOS DE UN VEHICULO
	public void cDatos() {
		boolean verify = false;
		System.out.println("¿Que vehiculo desea consultar?");

		System.out.print("Introduzca la marca: ");
		String marca = tec.nextLine();
		System.out.print("Introduzca la marca: ");
		String modelo = tec.nextLine();


		String vCreado = marca + " " + modelo;

		if(!vehiculos.isEmpty()) {
			for(Vehiculo v : vehiculos) {
				if(vCreado.equals(v.getMarcaModelo())) {
					verify = true;
					System.out.println("Datos del vehiculo solicitado: ");
					v.getAll();
				}
			}
		}

		if(!verify) {
			System.out.println("El vehiculo no existe");
		}
	}

	// LISTADO DE VEHICULOS DE UNA MARCA

	// LISTADO DE VEHICULOS POR MARCA
	public void listaMarca() {
		boolean verify = false;
		System.out.print("Introduzca la marca que desea buscar: ");
		String marca = tec.nextLine();

		System.out.println("Lista de vehiculos de la marca " + marca + ": ");
		for(Vehiculo v : vehiculos) {
			if(marca.equals(v.getMarca())) {
				System.out.println(v.getMarcaModelo());
				verify = true;
			}
		}
		if(!verify) {
			System.out.println("No se han encontrado vehiculos de esa marca");
		}

	}

	// LISTADO COCHES POR TIPO DE COMBUSTIBLE

	// LISTADO DE VEHICULOS POR TIPO DE COMBUSTIBLE
	public void listaTCombustible() {
		boolean verify = false;
		int opcion = 0;

		System.out.print("Introduzca el tipo de combustible que desea buscar(omita acentos): ");
		String tComb = tec.nextLine();

		if(tComb.equalsIgnoreCase("gasolina"))
			opcion = 1;
		else if(tComb.equalsIgnoreCase("diesel"))
			opcion = 2;
		else if(tComb.equalsIgnoreCase("etanol"))
			opcion = 3;
		else {
			opcion = 0;
		}
		switch(opcion) {
		case 1: 
			System.out.println("Lista de vehiculos de "+ tComb + ": ");
			for(Vehiculo v : vehiculos) {
				/*if(tComb.equals(v.getTCombustible(v))) {
						System.out.println(v.getMarcaModelo());
						verify = true;
					}*/
			}
			break;
		case 2: 
			System.out.println("Lista de vehiculos de "+ tComb + ": ");
			for(Vehiculo v : vehiculos) {
				/*if(tComb.equals(v.getTCombustible(v))) {
						System.out.println(v.getMarcaModelo());
						verify = true;
					}*/
			}
			break;
		case 3: 
			System.out.println("Lista de vehiculos de "+ tComb + ": ");
			for(Vehiculo v : vehiculos) {
				/*if(tComb.equals(v.getTCombustible(v))) {
						System.out.println(v.getMarcaModelo());
						verify = true;
					}*/
			}
			break;
		default:
			System.out.println("Tipo de combustible no válido");


		}

		if(!verify) {
			System.out.println("No se han encontrado vehiculos que usen ese tipo de combustible");
		}
	}

	// LISTADO DE VEHICULOS COMANZADOS A VENDER EN EL AÑO INTRODUCIDO

	// LISTADO DE VEHICULOS POR AÑO DE SALIDA
	public void listaAVenta() {
		System.out.println("Introduce el año que desea buscar: ");
		int annio;
		int cont = 0;
		do {
			System.out.println("Introduce un año superior a 1885");
			annio = tec.nextInt();
		}while(annio < 1885);
		for(Vehiculo v : vehiculos) {
			if(v.getAAparicion() == annio) {
				System.out.println(v.getMarcaModelo());
				cont++;
			}
		}

		if(cont == 0) {
			System.out.println("Ese año no se vendio ningun vehiculo");
		}
		else {
			System.out.println("El numero de vehiculos comercializados el año " + annio + "es: " + cont);
		}
	}

	// GUARDA LOS DATOS
	//	GUARDA LOS CAMBIOS EN EL FICHERO
	public void modFichero() throws IOException{
		Insertar in = new Insertar(fichero);
		in.borrarTodo();
		vehiculos.forEach(n -> {
			try {
				in.annadirVehiculo(n);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		in.finalizar();
	}
}