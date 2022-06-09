package ejercicio05;

import java.util.Scanner;

/**
 * <p><i>Archivo: Coleccion.java</i></p>
 * <p><b>Ejercicio 05</b>.</p>
 * @since 09/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Coleccion {

	public static void main(String[] args) {
		// N determina el tamanio del array.
		final int N=100;
		// Crea el array de discos.
		Disco[] discos=new Disco[N];
		// Crea todos los discos que van en cada una de las 
		// celdas del array.
		for (int i=0; i<N; i++) {
			discos[i]=new Disco();
		}
		// Carga varios discos.
		discos[0]=new Disco(
				"GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 5);
		discos[1]=new Disco(
				"FGHQ64", "Metallica", "Black album", "hard rock", 46);
		discos[2]=new Disco(
				"TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);
		int op;
		Scanner tec=new Scanner(System.in);
		String codigoIntroducido;
		String autorIntroducido;
		String tituloIntroducido;
		String generoIntroducido;
		int duracionIntroducida;
		String menu="\nCOLECCION DE DISCOS.\n"
				+"Elige una opcion: \n"
				+"\t1. Listado.\n"
				+"\t2. Nuevo Dsico.\n"
				+"\t3. Modificar.\n"
				+"\t4. Borrar.\n"
				+"\t5. Salir.\n";
		do {
			System.out.println(menu);
			do {
				System.out.println("--> ");
				op=Integer.parseInt(tec.nextLine());
			} while ((op<=0) || (op>5));
			switch (op) {
			case 1 :
				System.out.println("LISTADO: \n");
				for (Disco d : discos) {
					if (!d.getCodigo().equals("LIBRE")) {
						System.out.println(d);
					}
				}
				break;
			case 2 :
				System.out.print("NUEVO DISCO: \n");
				// Busca la primera posicion libre del array.
				int primeraLibre=-1;
				do {
					primeraLibre++;
				} while (!((discos[primeraLibre].getCodigo()).equals("LIBRE")));
				System.out.println("Por favor, introduzca los datos del disco.");
				System.out.print("Codigo: ");
				codigoIntroducido=tec.nextLine();
				System.out.print("Autor: ");
				autorIntroducido=tec.nextLine();
				System.out.print("Titulo: ");
				tituloIntroducido=tec.nextLine();
				System.out.print("Genero: ");
				generoIntroducido=tec.nextLine();
				System.out.print("Duracion: ");
				duracionIntroducida=Integer.parseInt(tec.nextLine());
				discos[primeraLibre]=new Disco(
						codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida);
				break;
			case 3 :
				System.out.println("MODIFICAR: \n");
				System.out.print("Por favor, introduzca el codigo del disco cuyos datos desea cambiar: ");
				codigoIntroducido=tec.nextLine();
				int i=-1;
				do {
					i++;
				} while (!((discos[i].getCodigo()).equals(codigoIntroducido)));
				System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
				System.out.println("Codigo: "+discos[i].getCodigo());
				System.out.print("Nuevo codigo: ");
				codigoIntroducido=tec.nextLine();
				if (!codigoIntroducido.equals("")) {
					discos[i].setCodigo(codigoIntroducido);
				}
				System.out.println("Autor: "+discos[i].getAutor());
				System.out.print("Nuevo autor: ");
				autorIntroducido=tec.nextLine();
				if (!autorIntroducido.equals("")) {
					discos[i].setAutor(autorIntroducido);
				}
				System.out.println("Titulo: "+discos[i].getTitulo());
				System.out.print("Nuevo titulo: ");
				tituloIntroducido=tec.nextLine();
				if (!tituloIntroducido.equals("")) {
					discos[i].setTitulo(tituloIntroducido);
				}
				System.out.println("Genero: "+discos[i].getGenero());
				System.out.print("Nuevo genero: ");
				generoIntroducido=tec.nextLine();
				if (!generoIntroducido.equals("")) {
					discos[i].setGenero(generoIntroducido);
				}
				System.out.println("Duracion: "+discos[i].getDuracion());
				System.out.print("Duracion: ");
				final String duracionIntroducidaString=tec.nextLine();
				if (!duracionIntroducidaString.equals("")) {
					discos[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
				}
				break;
			case 4 :
				System.out.println("BORRAR: \n");
				System.out.print("Por favor, introduzca el codigo del disco que desea borrar: ");
				codigoIntroducido=tec.nextLine();
				i=-1;
				do {
					i++;
				} while (!((discos[i].getCodigo()).equals(codigoIntroducido)));
				discos[i].setCodigo("LIBRE");
				System.out.println("\tAlbum borrado.");
				break;
			default :
			}
		} while (op!=5);
		tec.close();
	}

}
