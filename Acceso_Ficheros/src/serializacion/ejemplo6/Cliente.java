package serializacion.ejemplo6;

public class Cliente {

	@SuppressWarnings("unused")
	private String nombre;
	@SuppressWarnings("unused")
	private transient String passWord; // Un atributo transient no se serializa.

	public Cliente(String nombre, String passWord) {                                                             
		this.nombre=nombre;
		this.passWord= passWord;
	}

}
