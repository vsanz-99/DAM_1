package eva03.ejercicio01.version2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p><i>Archivo: Menu.java</i></p>
 * <p><b>Ejercicio 01</b>. Gestionar las multas de los 
 * vehiculos de un municipio. <b>Acabado</b>.</p>
 * @since 28/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Menu {

	// Nombre del archivo de String de vehiculos.
	String fichero;
	// Nombre del archivo de Objetos vehiculo.
	String fichero2;

	// Entrada de datos.
	Scanner teclado=new Scanner(System.in);

	// Arrays:
	ArrayList<Vehiculo> vehiculos=new ArrayList<Vehiculo>();
	ArrayList<String> datos=new ArrayList<String>();

	public Menu(String fichero, String fichero2) throws IOException {
		this.fichero=fichero;
		this.fichero2=fichero2;
		Inserta ins1=new Inserta(fichero);
		if (!ins1.tieneSiguiente()) {
			ins1.rInsertarDatos(datos);
		}
		ins1.finalizar();
		Inserta ins2=new Inserta(fichero2);
		if (!ins2.tieneSiguiente()) {
			ins2.rInsertarVehiculos(vehiculos);
		}
		ins2.finalizar();
		boolean fin;
		do {
			fin=trabajo();
			modFichero();
		} while (!fin);
	}

	private void imprimir() {
		System.out.println("Elija una opcion: \n");
		System.out.println("1.- Anadir un vehiulo al municipio.\n"
				+"2.- Eliminar un vehiculo.\n"
				+"3.- Anadir una sancion a un vehiculo.\n"
				+"4.- Consultar las sanciones que tiene un vehiculo."
				+"5.- Eliminar las sanciones de un vehiculo.\n"
				+"6.- Mostrar un listado de los vehiculos.\n"
				);
		System.out.println("7.- Terminar.");
	}

	private boolean trabajo() throws IOException {
		int opcion;
		do {
			imprimir();
			try {
				opcion=teclado.nextInt();
				teclado.nextLine();
			} catch(Exception e) {
				System.out.println("Debe introducir un numero entre 1 y 7 (ambos inclusive).");
				opcion=0;
				teclado.next();
			}
		} while (opcion<1 || opcion>7);
		if (opcion==7)
			return true;
		switch (opcion) {
		case 1:
			aVehiculo();
			break;
		case 2:
			bVehiculo();
			break;
		case 3:
			aSancion();
			break;
		case 4:
			cSanciones();
			break;
		case 5:
			eSancion();
			break;
		case 6:
			System.out.println("Validar.");
			break;
		}
		return false;
	}

	private void aVehiculo() throws IOException {
		Inserta i=new Inserta(fichero);
		String matricula, marca, modelo, propietario; 
		int aMatricula;
		boolean verify=false;
		do {
			System.out.println("Matricula: ");
			matricula=teclado.nextLine();
			for (int index=0; index<matricula.length(); index++) {
				if (index<3 && matricula.charAt(index)>=0 && matricula.charAt(index)<10) {
					verify=true;
				} else if (index>2 && matricula.charAt(index)>='A' && matricula.charAt(index)<='Z' 
						|| matricula.charAt(index)>='a' && matricula.charAt(index)<='z') {
					verify=true;
				} else {
					verify=false;
				}
			}
		} while(!verify);
		System.out.println("Marca: ");
		marca=teclado.nextLine();
		System.out.println("Modelo: ");
		modelo=teclado.nextLine();
		System.out.println("Propietario: ");
		propietario=teclado.nextLine();
		System.out.println("aMatricula: ");
		aMatricula=teclado.nextInt();
		teclado.nextLine();
		String v=matricula+" "+marca+" "+modelo+" "+propietario+" "+aMatricula;
		if (i.comprobarVehiculo(v)) {
			i.finalizar();
			System.out.println("Ese vehiculo ya existe.");
		} else {
			Vehiculo vh=new Vehiculo(matricula, marca, modelo, propietario, aMatricula);
			datos.add(v);
			vehiculos.add(vh);
			modFichero();
			System.out.println("Vehiculo anadido.");
			i.finalizar();
		}
	}

	public void bVehiculo() throws IOException {
		System.out.println("¿Que vehiculo desea borrar?");
		System.out.println("Introduzca la matricula del vehiculo: ");
		String matricula=teclado.next();
		boolean verify=false;
		int index=0;
		try {
			do {
				if (vehiculos.get(index).getMatricula().equals(matricula)) {
					vehiculos.remove(index);
					datos.remove(index);
					verify=true;
					modFichero();
				} else {
					verify=false;
					index++;
				}
			} while (!verify);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("No se ha encontrado el vehiculo.");
		}
		modFichero();
	}

	// Anadir sancion: 
	public void aSancion() throws IOException {
		System.out.println("Introduce la matricula del vehiculo al que quieras poner una "
				+"sancion: ");
		String matricula=teclado.nextLine();
		System.out.println("Introduce la fecha de la sancion: ");
		String fecha=teclado.nextLine();
		teclado.next();
		System.out.println("Introduce le motivo de la sancion: ");
		String motivo=teclado.nextLine();
		System.out.println("Introduce el importe de la sancion: ");
		int importe=teclado.nextInt();
		for (Vehiculo v : vehiculos) {
			if (matricula.equals(v.getMatricula())) {
				v.ponerSancion(fecha, motivo, importe);
			}
		}
	}

	// Consultar sanciones:
	public void cSanciones() {
		System.out.println("Introduce la matricula del vehiculo "
				+"del que quieres consultar las sanciones: ");
		String matricula=teclado.nextLine();
		for (Vehiculo v : vehiculos) {
			if (matricula.equals(v.getMatricula())) {
				v.mostrarSanciones();
			}
		}
	}

	// Eliminar sanciones: 
	public void eSancion() {
		System.out.println("Introduce la matricula del vehiculo del que "
				+ "se quieren eliminar las sanciones: ");
		String matricula=teclado.nextLine();
		for (Vehiculo v : vehiculos) {
			if (matricula.equals(v.getMatricula())) {
				v.eliminarSanciones();
			}
		}
	}

	// Mostrar listado: 
	public void mListado() {
		System.out.println("Introduce el valor minimo de la cuantia de las "
				+"sanciones: ");
		int cuantia=teclado.nextInt();
		for (Vehiculo v : vehiculos) {
			if (v.totalSanciones()>cuantia) {
				System.out.println(v.getAll());
			}
		}
	}

	public void modFichero() throws IOException {
		Inserta in=new Inserta(fichero);
		Inserta ins=new Inserta(fichero2);
		in.borrarTodo();
		ins.borrarTodo();
		vehiculos.forEach(n -> {
				try {
					ins.anadirVehiculo(n);
				} catch (IOException e) {
					e.printStackTrace();
				}
		});
		datos.forEach(n -> in.anadirDatos(n));
		in.finalizar();
		ins.finalizar();
	}

}
