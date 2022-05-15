package eva03.ejercicio03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Socio {
	
	enum Tipo {
		
		infantil, 
		juvenil, 
		adulto
	
	}
	
	String nombre="";
	String n="";

	public void annadirSocio() throws IOException {
	
		final String RUTA="club_deportivo.txt";
		
		String apellidos="";
		int fecha_alta=0;
		int num_socio=0;
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("\tIntroduce el nombre: ");
		nombre=teclado.next();
		
		System.out.println("\tIntroduce los apellidos: ");
		apellidos=teclado.next();
		
		System.out.println("\tIntroduce la fecha de alta: ");
		fecha_alta=teclado.nextInt();
		
		System.out.println("\tIntroduce el numero de socio: ");
		num_socio=teclado.nextInt();
		
		System.out.println("\tOpcion (1): infantil.");
		System.out.println("\tOpcion (2): juvenil.");
		System.out.println("\tOpcion (3): adulto.");
		
		int opcion=teclado.nextInt();
		
	     switch (opcion) {
	     	case 1 :
	     		Tipo tipo1=Tipo.infantil;
	     		break;
	     	case 2 :
	     		Tipo tipo2=Tipo.juvenil;
	     		break;
	     	case 3 :
	     		Tipo tipo3=Tipo.adulto;
	     		break;
	     }
	     
	     try (BufferedWriter bw=new BufferedWriter(
	    		 new FileWriter(RUTA))) {
	    	 
	    	 introducirDatos(bw, nombre, apellidos, fecha_alta, num_socio, opcion);
	     
	     } catch (IOException ioe) {
	    	 
	    	 System.err.println("\n\tError de escritura.");
	     }
	}
	
	public void introducirDatos(BufferedWriter bw, String nombre, String apellidos, int fecha_alta, int num_socio, int opcion) throws IOException {
		
		bw.write(nombre);
		bw.write(apellidos);
		bw.write(fecha_alta);
		bw.write(num_socio);
		bw.write(opcion);
		
	}

	public void eliminarSocio(File RUTA) throws IOException {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("\t¿Que socio quieres eliminar?: ");
		nombre=teclado.next();
		
		try {
			BufferedWriter bufout=new BufferedWriter(
					new FileWriter("club_deportivo.txt"));
			BufferedReader bufread=new BufferedReader(
					new FileReader("club_deportivo.txt"));
			
			while ((n=bufread.readLine())!=null) {
				if (!nombre.equals(n)) {
					bufout.write(n);
					bufout.newLine();
				}
			}
		} catch (IOException ioe) {
			System.err.println("\n\tError de escritura/lectura.");
		
		} finally {
			BufferedWriter bufout=null;
			if (bufout!=null)
				 bufout.close();
			BufferedReader bufread=null;
			if(bufread!=null)
				bufread.close();
		}
		
	}

	public void modificarDatos() {}

	public void visualizarCuotas(Tipo opcion) {
		
		final int cuota_infantil=140;
		final int cuota_juvenil=180;
		final int cuota_adulto=270;
		
		System.out.println("\n\tLa cuota infantil es: " +cuota_infantil+".");
		
		/*if ((opcion=Tipo.infantil)!=null) {
			System.out.println(cuota_infantil);
		}
		
		if ((opcion=Tipo.juvenil)!=null) {
			System.out.println(cuota_juvenil);
		}

		if ((opcion=Tipo.adulto)!=null) {
			System.out.println(cuota_adulto);
		}*/
		
	}
	
}
