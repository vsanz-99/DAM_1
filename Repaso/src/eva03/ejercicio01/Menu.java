package eva03.ejercicio01;
import java.util.Scanner;

/**
 * <p><i>Archivo: Menu.java</i></p>
 * @since 14/05/2022
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

		do{
			fin=eleccion();
		} while (!fin);

		t.commit();

	}

	private boolean eleccion() {

		int opcion;

		do {
			imprimir();
			opcion=tec.nextInt();
			tec.nextLine();
		} while (opcion<1 || opcion >7);

		if(opcion==7)
			return true;

		switch (opcion) {
		case 1 : 
			annadirV();
			break;
		case 2 : 
			eliminarV();
			break;
		case 3 :
			annadirSancion();
			break;
		case 4 : 
			consultar();
			break;
		case 5 : 
			eliminarS();
			break;
		case 6 : 
			listado();
			break;
		}

		return false;

	}

	private void imprimir() {

		System.out.println("\tElige una opcion: ");

		System.out.println("\t1. Annadir un vehiculo al municipio.\n"
				+ "\t2. Eliminar un vehiculo: si existen sanciones debe mostrar el numero de las mismas y no realizar la\n"
				+ "eliminacion.\n"
				+ "\t3. Annadir una sancion a un vehiculo.\n"
				+ "\t4. Consultar las sanciones que tiene un vehiculo.\n"
				+ "\t5. Eliminar las sanciones de un vehiculo.\n"
				+ "\t6. Mostrar un listado de los vehiculos para los que la cuantia de las sanciones es superior a una cantidad\n"
				+ "determinada (que se debe solicitar).\n"
				+ "\t7. Terminar el programa.");

	}

	private void annadirV() {

		boolean val=true;

		String matricula, marca, modelo, propietario, annio;

		do {
			val=true;
			System.out.println("\tMatricula: ");
			matricula=tec.next();
			if(Vehiculo.valida(matricula)==false) {
				System.out.println("\tMatricula NO valida.");
				val=false;
			}
		} while (!val);

		System.out.println("\tMarca: ");
		marca=tec.next();

		System.out.println("tModelo: ");
		modelo=tec.next();

		System.out.println("\tPropietario: ");
		propietario=tec.next();

		System.out.println("\tAnnio: ");
		annio=tec.next();

		t.annadirVehiculo(matricula,marca,modelo,propietario,annio);

	}

	private void eliminarV() {

		String matricula;

		System.out.println("\tMatricula del vehiculo: ");
		matricula= tec.next();

		t.eliminarVehiculo(matricula);

	}

	private void annadirSancion() {

		String matricula, fecha, motivo, importe;

		System.out.println("\tMatricula del vehiculo: ");

		System.out.println("\tMatricula: ");
		matricula=tec.next();

		System.out.println("\tFecha: ");
		fecha=tec.next();

		System.out.println("\tMotivo: ");
		tec.nextLine();
		motivo=tec.nextLine();

		System.out.println("\tImporte: ");
		importe=tec.next();

		t.annadirSancion(matricula, fecha, motivo, importe);

	}

	private void consultar() {

		String matricula;

		System.out.println("\tMatricula del vehiculo: ");
		matricula=tec.next();

		t.consultaSanciones(matricula);

	}

	private void eliminarS() {

		String matricula;

		System.out.println("\tMatricula del vehiculo: ");
		matricula= tec.next();

		t.quitarSanciones(matricula);

	}

	private void listado() {

		int num;

		System.out.println("\tNumero de sanciones: ");
		num= tec.nextInt();

		t.vehiculosCon(num);

	}

}