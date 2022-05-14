package clases_propias;

public class HerenciaGenericos {

	public static void main(String[] args) {
		
		/*
		Empleado Administrativa=new Empleado("Elena", 45, 1500);
		
		Jefe DirectoraComercial=new Jefe("Ana", 27, 3500);
		
		// Se puede almacenar un objeto de tipo Jefe dentro de una variable de tipo Empleado
		
		Empleado nuevoEmpleado=DirectoraComercial;
		*/
		
		// Manejo con clases genericas
		
		Pareja<Empleado> Administrativa=new Pareja<Empleado>();
		
		Pareja<Jefe> DirectoraComercial=new Pareja<Jefe>();
		
		//Pareja<Empleado> nuevoEmpleado=DirectoraComercial;
	
		Pareja.imprimirTrabajador(Administrativa); // Este metodo pide un objeto de tipo Empleado
		
		Pareja.imprimirTrabajador(DirectoraComercial); 
		
	}
	
}
