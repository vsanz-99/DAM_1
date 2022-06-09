package serializacion.ejemplo2;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial3 {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream salida=null;
		Empleado emp;
		try {
			fos=new FileOutputStream("H:/eclipse_myworkspace/personas.dat");
			salida=new ObjectOutputStream(fos);
			emp=new Empleado("12345678A", "Lucas Gonzalez", 30, 1200.40);                                        
			salida.writeObject(emp);
			emp=new Empleado("98765432B", "Anacleto Jimenez", 28, 1000);
			salida.writeObject(emp);
			emp=new Empleado("78234212Z", "Maria Zapata", 35, 1100.25);
			salida.writeObject(emp);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());                                                              
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fos!=null)
					fos.close();
				if (salida!=null)
					salida.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
