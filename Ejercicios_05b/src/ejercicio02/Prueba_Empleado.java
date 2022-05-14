package ejercicio02;
import java.util.*;

/*Clase Principal*/
public class Prueba_Empleado {

	public static void main(String[] args) {
		
		String nom="";
		int n=0;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("\tIntroduce el nombre del empleado: ");
		nom=teclado.nextLine();
		
		System.out.println("\tIntroduce el numero del empleado: ");
		n=teclado.nextInt();
		
		Empleado emple1=new Empleado();
		
		emple1.leerDatos(nom, n);
		
		System.out.println(emple1.verDatos());
		
		teclado.close();
	
	}

}
