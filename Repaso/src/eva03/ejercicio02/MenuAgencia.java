package eva03.ejercicio02;
import java.util.Scanner;

/**
 * <p><i>Archivo: MenuAgencia.java</i></p>
 * <p><b>Ejercicio 02</b>. Gestionar el control de viajantes.</p>
 * @since 27/05/2022
 * @version 1.0 
 * @author Victor Sanz*/

public class MenuAgencia {

	String fichero;
	AgenciaViajes a=new AgenciaViajes(fichero);
	String menu="Elige una opcion: \n"
			+"\t1-. Anadir un viajante.\n"
			+"\t2-. Eliminar un viajante.\n"
			+"\t3-. Mostrar un listado de todos los viajantes "
			+"(distancia recorrida e importe acumulado de las ventas cobradas).\n"
			+"\t4-. Inicializar ventas (pasar distancia recorrida a 0 y almacenar "
			+"ventas cobradas en el historico).\n"
			+"\t5-. Incrementar la distancia recorrida por un viajante (numero de km recorridos).\n"
			+"\t6-. Anadir una venta de un viajante.\n"
			+"\t7-. Cobrar una venta de un viajante.\n"
			+"\t8-. Mostrar un listado de todas las ventas no cobradas.\n"
			+"\t0-. Terminar el programa.";

	Scanner teclado=new Scanner(System.in);

	public MenuAgencia(String fichero) {
		this.fichero=fichero;
		int opcion;
		do {
			System.out.println(menu);
			do {
				System.out.println("-->");
				opcion=teclado.nextInt();
				teclado.nextLine();
			} while (!(opcion<=8 && opcion>=0));
			switch (opcion) {
			case 1 :
				anadirViajante();
				break;
			case 2 :
				eliminarV();
				break;
			case 3 :
				listarViajantes();
				break;
			case 4 :
				iniV();
				break;
			case 5 :
				incrementarKm();
				break;
			case 6 :
				anadirVenta();
				break;
			case 7 :
				cobrarV();
				break;
			case 8 :
				listarVentas();
				break;
			default :
			}
		} while (opcion!=0);
	}

	private void anadirViajante() {
		String dni, nombre;
		double distancia_km;
		int antiguedad, n_ventas;
		do {
			System.out.println("Introduce el NIF: ");
			dni=teclado.next();
		} while (!validaDni(dni));
		do {
			System.out.println("Introduce el nombre del viajante: ");
			nombre=teclado.next();
		} while (nombre.isEmpty());
		System.out.println("Introduce la antiguedad del viajante: ");
		antiguedad=teclado.nextInt();
		do {
			System.out.println("Introduce la distancia recorrida del viajante (en km): ");
			distancia_km=teclado.nextDouble();
		} while (distancia_km<=0 || distancia_km>100000);
		do {
			System.out.println("Introduce el numero de ventas realizadas: ");
			n_ventas=teclado.nextInt();
		} while (n_ventas<=0);
		a.anadirViajante(dni, nombre, distancia_km, antiguedad, n_ventas);
	}

	private void eliminarV() {
		String dni;
		System.out.println("NIF del viajante: ");
		dni=teclado.next();
		a.eliminarV(dni);
	}

	private void listarViajantes() {
		System.out.println("Listando todos los viajantes ...");
		AgenciaViajes.listarViajantes();
	}

	private void iniV() {
		System.out.println("Inicializando ventas ...");
		AgenciaViajes.iniV();
	}

	private void incrementarKm() {
		double distancia_km;
		String dni="";
		do {
			System.out.println("Introduce el NIF del viajantes: ");
			dni=teclado.next();
		} while (!validaDni(dni));
		do {
			System.out.println("Introduce numero de km recorridos: ");
			distancia_km=teclado.nextDouble();
		} while (distancia_km<=0 || distancia_km>10000);
		a.incrementarKm(dni, distancia_km);
	}

	private void anadirVenta() {
		int dia, mes, anio; double importe;
		String dni, cliente; String cobrada="no";
		do {
			System.out.println("Introduce el NIF del viajantes: ");
			dni=teclado.next();
		} while (!validaDni(dni));
		System.out.println("Introduce la fecha de realizacion de la venta: ");
		do {
			System.out.println("\tDia: ");
			dia=teclado.nextInt();
		} while (dia<=0 || dia>31);
		do {
			System.out.println("\tMes: ");
			mes=teclado.nextInt();
		} while (mes<=0 || mes>12);
		do {
			System.out.println("\tAnio: ");
			anio=teclado.nextInt();
		} while (anio<1999);
		String fecha=dia+"/"+mes+"/"+anio;
		do {
			System.out.println("Introduce el nombre del cliente: ");
			cliente=teclado.next();
		} while (cliente.isEmpty());
		System.out.println("Introduce el importe. (0)Si no se ha cobrado");
		importe=teclado.nextDouble();
		if (importe<=0 ) {
			System.out.println("\tLa venta "+cobrada+" ha sido cobrada.");
		} else {
			cobrada="si";
			System.out.println("\tLa venta "+cobrada+" ha sido cobrada.");
		}
		a.anadirVenta(dni, fecha, importe, cliente, cobrada);
	}

	private void cobrarV() {
		int dia, mes, anio;
		String fecha;
		String cliente=""; String dni="";
		do {
			System.out.println("Introduce el NIF del viajantes: ");
			dni=teclado.next();
		} while (!validaDni(dni));
		System.out.println("Introduce la fecha de realizacion de la venta: ");
		do {
			System.out.println("\tDia: ");
			dia=teclado.nextInt();
		} while (dia<=0 || dia>31);
		do {
			System.out.println("\tMes: ");
			mes=teclado.nextInt();
		} while (mes<=0 || mes>12);
		do {
			System.out.println("\tAnio: ");
			anio=teclado.nextInt();
		} while (anio<1999);
		fecha=dia+"/"+mes+"/"+anio;
		System.out.println("Cobrando venta de un viajante ...");
		a.cobrarV(dni, fecha, cliente);
	}

	private void listarVentas() {
		System.out.println("Listando ventas no cobradas ...");
		AgenciaViajes.listarVentas();
	}

	public boolean validaDni(String dni) {
		String letraMayuscula="";
		if (dni.length()!=9 || Character.isLetter(dni.charAt(8))==false) {
			return false;
		}
		letraMayuscula=(dni.substring(8)).toUpperCase();
		if (soloNumeros(dni)==true && letraDNI(dni).equals(letraMayuscula)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean soloNumeros(String dni) {
		int i, j=0;
		String numero="";
		String miDNI="";
		String[] unoNueve={"0", "1", "2", "3", "4", "5", 
				"6", "7", "8", "9"};
		for (i=0; i<dni.length()-1; i++) {
			numero=dni.substring(i, i+1);
			for (j=0; j<unoNueve.length; j++) {
				if (numero.equals(unoNueve[j])) {
					miDNI+=unoNueve[j];
				}
			}
		}
		if (miDNI.length()!=8) {
			return false;
		} else {
			return true;
		}
	}

	private String letraDNI(String dni) {
		int miDNI=Integer.parseInt(dni.substring(0, 8));
		int resto=0;
		String miLetra="";
		String[] asignacionLetra={"T", "R", "W", "A", "G", "M", "Y", "F", 
				"P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", 
				"C", "K", "E"};
		resto=miDNI%23;
		miLetra=asignacionLetra[resto];
		return miLetra;
	}

}
