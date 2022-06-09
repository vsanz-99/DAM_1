package serializacion.ejemplo5;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import serializacion.ejemplo2.Empleado;

public class Serial4 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		ObjectInputStream entrada=null;
		Empleado emp;
		try {
			fis=new FileInputStream("H:/eclipse_myworkspace/personas.dat");
			entrada=new ObjectInputStream(fis);
			emp=(Empleado)entrada.readObject();
			System.out.println(emp.getNif()+" "
					+emp.getNombre()+" "+emp.getEdad()+" "+emp.getSueldo());                  
			emp=(Empleado)entrada.readObject();
			System.out.println(emp.getNif()+" "
					+emp.getNombre()+" "+emp.getEdad()+" "+emp.getSueldo());
			emp=(Empleado)entrada.readObject();
			System.out.println(emp.getNif()+" "
					+emp.getNombre()+" "+emp.getEdad()+" "+emp.getSueldo());                  
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis!=null) 
					fis.close();
				if (entrada!=null) 
					entrada.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
