package eva03.ejercicio01;
import java.util.Scanner;

/**
 * <p><i>Archivo: Menu.java</i></p>
 * <p><b>Ejercicio 01</b>.</p>
 * @since 10/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Menu {

	Scanner tec=new Scanner(System.in);
	boolean fin;
	String fichero;
	Trafico t;

	public Menu(String fichero) {
		this.fichero=fichero;
		t=new Trafico(fichero);
		do {
			fin=eleccion();
		} while (!fin);
		t.confirmar();
	}

	private boolean eleccion() {
		int opcion=0;
		do {
			imprimir();
			opcion=Integer.parseInt(tec.nextLine());
		} while ((opcion<1) || (opcion>7));
		if (opcion==7)
			return true;
		switch (opcion) {
		case 1 :
			anadirVehiculo();
			break;
		case 2 :
			eliminarVehiculo();
			break;
		case 3 :
			anadirSancion();
			break;
		case 4 :
			consultar();
			break;
		case 5 :
			eliminarSancion();
			break;
		case 6 :
			listado();
			break;
		default :
		}
		return false;
	}

	private void imprimir() {
		System.out.println("Elige una opcion: \n"
				+"\t1-. Anadir un vehiculo al municipio.\n"
				+"\t2-. Eliminar un vehiculo.\n"
				+"\t3-. Anadir una sancion a un vehiculo.\n"
				+"\t4-. Consultar las sanciones que tiene un vehiculo.\n"
				+"\t5-. Eliminar las sanciones de un vehiculo.\n"
				+"\t6-. Listar los vehiculos para los que la cuantia de las sanciones "
				+"es superior a una cantidad (introduce la cantidad por teclado).\n"
				+"\t7-. Salir del programa.\n");
	}

	private void anadirVehiculo() {
		boolean valida=true;
		String matricula, marca, modelo, propietario, anio;
		matricula=marca=modelo=propietario=anio="";
		do {
			valida=true;
			System.out.println("Introduce la matricula: ");
			matricula=tec.nextLine();
			if (Vehiculo.valida(matricula)==false) {
				System.out.println("\tMatricula NO valida.");
				valida=false;
			}
		} while (!valida);
		System.out.println("Introduce la marca: ");
		marca=tec.nextLine();
		System.out.println("Modelo: ");
		modelo=tec.nextLine();
		System.out.println("Propietario: ");
		propietario=tec.nextLine();
		System.out.println("Anio de matriculacion: ");
		anio=tec.nextLine();
		t.anadirVehiculo(matricula, marca, modelo, propietario, anio);
	}

	private void eliminarVehiculo() {
		String matricula, fecha, motivo, importe;
		matricula=fecha=motivo=importe="";
		System.out.println("Introduce la matricula: ");
		matricula=tec.nextLine();
		t.eliminarVehiculo(matricula);
	}

	private void anadirSancion() {
		String matricula, fecha, motivo, importe;
		System.out.println("Introduce la matricula: ");
		matricula=tec.nextLine();
		System.out.println("Introduce la fecha: ");
		fecha=tec.nextLine();
		System.out.println("Introduce el motivo de la sancion: ");
		motivo=tec.nextLine();
		System.out.println("¿Cual es el importe de la sancion?");
		importe=tec.nextLine();
		t.anadirSancion(matricula, fecha, motivo, importe);
	}

	private void consultar() {
		String matricula="";
		System.out.println("Introduce la matricula: ");
		matricula=tec.nextLine();
		t.consultaSanciones(matricula);
	}

	private void eliminarSancion() {
		String matricula="";
		System.out.println("Introduce la matricula: ");
		matricula=tec.nextLine();
		t.quitarSanciones(matricula);
	}

	private void listado() {
		int num=0;
		System.out.println("Introduce un numero de sanciones: ");
		num=Integer.parseInt(tec.nextLine());
		t.vehiculosCantidad(num);
	}

}
