package serializacion.ejemplo1;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial1 {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream salida=null;
		Persona p;
		try {
			// Se crea el fichero.
			fos=new FileOutputStream("H:/eclipse_myworkspace/personas.dat");                                                 
			salida=new ObjectOutputStream(fos);
			// Se crea el primer objeto Persona.
			p=new Persona("12345678A", "Lucas Gonzalez", 30);
			// Se escribe el objeto en el fichero.
			salida.writeObject(p);
			// Se crea el segundo objeto Persona.
			p=new Persona("98765432B", "Anacleto Jimenez", 28);
			// Se escribe el objeto en el fichero.
			salida.writeObject(p);
			// Se crea el tercer objeto Persona.
			p=new Persona("78234212Z", "Maria Zapata", 35);
			// Se escribe el objeto en el fichero.
			salida.writeObject(p);
		} catch (FileNotFoundException e) {
			System.out.println("\t1"+e.getMessage());                                                          
		} catch (IOException e) {
			System.out.println("\t2"+e.getMessage());
		} finally {
			try {
				if (fos!=null) {
					fos.close();
				}
				if (salida!=null) {
					salida.close();
				}
			} catch (IOException e) {
				System.out.println("\t3"+e.getMessage());
			}
		}
	}

}
