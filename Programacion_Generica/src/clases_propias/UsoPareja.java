package clases_propias;

public class UsoPareja {

	public static void main(String[] args) {
		
		Pareja<String> una=new Pareja<String>(); // Primera instancia
		
		una.setPrimero("Juan");
		
		System.out.println(una.getPrimero());
		
		Persona pers1=new Persona("Ana"); // Segunda instancia
		
		Pareja<Persona> otra=new Pareja<Persona>();
		
		otra.setPrimero(pers1);
		
		System.out.println(otra.getPrimero());
	
	}

}

class Persona {
	
	public Persona(String nombre) {
		
		this.nombre=nombre;
		
	}
	
	public String toString() {
		
		return nombre;
		
	}
	
	private String nombre;
	
}
