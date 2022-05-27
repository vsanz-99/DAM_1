package eva03.ejercicio01;
import java.util.Scanner;

/**
 * <p><i>Archivo: Menu.java</i></p>
 * <p><b>Ejercicio 01</b>. Gestionar las multas de los 
 * vehiculos de un municipio.</p>
 * @since 27/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Menu {
	
	Scanner teclado=new Scanner(System.in);
	boolean fin;
	String fichero;
	Trafico t;
	
	public Menu(String fichero) {
		this.fichero=fichero;
		t=new Trafico(fichero);
		do {
			fin=eleccion();
		} while (!fin);
	}
	
	private boolean eleccion() {
		int opcion;
		do {
			imprimir();
			opcion=teclado.nextInt();
			teclado.nextLine();
		} while (opcion<1 || opcion>7);
		if (opcion==7)
			return true;
		switch (opcion) {
		case 1 :
			anadirV(); // Anadir un vehiculo al municipio.
			break;
		case 2: 
			eliminarV(); // Eliminar un vehiculo.
			break;
		case 3 :
			anadirSancion(); // Anadir una sancion.
			break;
		case 4 :
			consultar(); // Consultar las sanciones que tiene un vehiculo.
			break;
		case 5 :
			eliminarS(); // Eliminar las sanciones.
			break;
		case 6 :
			listado(); // Listar los vehiculos para los que la cuantia de las 
			break;     // sanciones sea superior a una cantidad.
		default :
			System.out.println("\tError ...");
		}
		return false;
	}
	
	private void imprimir() {
		System.out.println("Elige una opcion: ");
		System.out.println("\t1-. Anadir un vehiculo al municipio.\n"
				+"\t2-. Eliminar un vehiculo (si existen sanciones, debe mostrar el numero de las mismas"
				+ "y no realizar la eliminacion).\n"
				+"\t3-. Anadir una sancion a un vehiculo.\n"
				+"\t4-. Consultar las sanciones que tiene un vehiculo.\n"
				+"\t5-. Eliminar las sanciones de un vehiculo.\n"
				+"\t6-. Mostrar un listado de los vehiculos para los que la cuantia de las sanciones es "
				+ "superior a una cantidad (que se debe solicitar).\n"
				+"\t7-. Terminar el programa.");
		System.out.println();
	}
	
	private void anadirV() {
		String matricula, marca, modelo, propietario, anio;
		do {
			System.out.println("Matricula del vehiculo: ");
			matricula=teclado.next();
			if (Vehiculo.valida(matricula)==false)
				System.out.println("\tMatricula NO valida.");
		} while (!Vehiculo.valida(matricula));
		System.out.println("Marca del vehiculo: ");
		marca=teclado.next();
		System.out.println("Modelo del vehiculo: ");
		modelo=teclado.next();
		System.out.println("Propietario del vehiculo: ");
		propietario=teclado.next();
		System.out.println("Anio de matriculacion: ");
		anio=teclado.next();
		t.anadirVehiculo(matricula, marca, modelo, propietario, anio);
	}
	
	private void eliminarV() {
		String matricula;
		System.out.println("Matricula del vehiculo: ");
		matricula=teclado.next();
		t.eliminarVehiculo(matricula);
	}
	
	private void anadirSancion() {
		String matricula, fecha, motivo, importe;
		System.out.println("Matricula del vehiculo: ");
		matricula=teclado.next();
		System.out.println("Fecha: ");
		// Conversion String to Date.
		fecha=teclado.next();
		System.out.println("Motivo: ");
		teclado.nextLine();
		motivo=teclado.nextLine();
		System.out.println("Importe: ");
		importe=teclado.next();
		t.anadirSancion(matricula, fecha, motivo, importe);
	}
	
	private void consultar() {
		String matricula;
		System.out.println("Matricula del vehiculo: ");
		matricula=teclado.next();
		t.consultaSanciones(matricula);
	}
	
	public void eliminarS() {
		String matricula;
		System.out.println("Matricula del vehiculo: ");
		matricula=teclado.next();
		t.quitarSanciones(matricula);
	}
	
	private void listado() {
		int num;
		System.out.println("Numero de sanciones: ");
		num=teclado.nextInt();
		t.vehiculosCon(num);
	}

}
