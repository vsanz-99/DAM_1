package ejercicio03;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private int nota1;
	private int nota2;
	private int nota3;
	
	public Alumno(String nombre, String apellido, int nota1, 
			int nota2, int nota3) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.nota1=nota1;
		this.nota2=nota2;
		this.nota3=nota3;
	}
	
	@Override
	public String toString() {
		return "\t[ Nombre: "+nombre+" | Apellido: "+apellido+" | Nota 1EVA: "
				+nota1+" | Nota2 : "+nota2+" | Nota3: "+nota3+" ]";
	}

}
