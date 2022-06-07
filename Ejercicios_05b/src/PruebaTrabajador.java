import java.util.Scanner;

/**
 * <p><i>Archivo: PruebaTrabajador.java</i></p>
 * <p><b>Ejercicio 03</b>.</p>
 * @since 06/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class PruebaTrabajador {

	public static void main(String[] args) {
		String nombre=""; char estado_civil=' ';
		char turno=' '; int titulacion=0; int anios_empresa=0;
		Scanner teclado=new Scanner(System.in);
		do {
			System.out.println("Introduce el nombre del trabajador: ");
			nombre=teclado.next();
			teclado.nextLine();
		} while (nombre.isEmpty());
		do {
			System.out.println("¿Cual es su estado civil? (S/C)");
			estado_civil=teclado.next().charAt(0);
			estado_civil=Character.toUpperCase(estado_civil);
		} while (estado_civil!='S' && estado_civil!='C');
		do {
			System.out.println("¿Turno? (D/N)");
			turno=teclado.next().charAt(0);
			turno=Character.toUpperCase(turno);
		} while (turno!='D' && turno!='N');
		do {
			System.out.println("Introduce la titulacion del trabajador: \n"
					+"\t0. Ninguna.\n"
					+"\t1. Basica.\n"
					+"\t2. Intermedia.\n"
					+"\t3. Profesional.\n"
					+"\t4. Universitaria.");
			titulacion=teclado.nextInt();
		} while ((titulacion<0) || (titulacion>4));
		do {
			System.out.println("Introduce los anios que lleva en la empresa el trabajador: ");
			anios_empresa=teclado.nextInt();
		} while ((anios_empresa<0) || (anios_empresa>40));
		System.out.println("\tCreando trabajador ...");
		Trabajador tr=new Trabajador(nombre, estado_civil, turno, titulacion, 
				anios_empresa);
		// Visualizar datos:
		System.out.println(tr.verDatos());
		// Calcular nomina:
		String respuesta="";
		do {
			System.out.println("¿Desea calcular la nomina del trabajador? (si/no)");
			respuesta=teclado.next();
			teclado.nextLine();
		} while (respuesta.isEmpty());
		if (respuesta.toLowerCase().equals("si")) {
			System.out.println("\tCalculando nomina ...");
			System.out.println("\tNomina del trabajador: "+tr.nomina_trabajador());
		} else if (respuesta.toLowerCase().equals("no")) {
			System.out.println("\tCancelando operacion.");
		} else {
			System.out.println("\tATENCION: opcion NO reconocida.");
		}
		System.out.println();
		System.out.println("\tFin del programa.");
		teclado.close();
	}

}
