package clases_propias;

public class Empleado {

	public Empleado(String nombre, int edad, double salario) {
		
		this.nombre=nombre;
		
		this.edad=edad;
		
		this.salario=salario;
		
	}
	
	public String getDatos() {
		
		return "El empleado se llama "+nombre+". Tiene "+edad+" annos."+"Y un salario de "+salario+".";
	}
	
	private String nombre;
	
	private int edad;
	
	private double salario;

}
