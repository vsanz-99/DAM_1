package serializacion.ejemplo4;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import serializacion.ejemplo1.Persona;

public class Serial2 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		ObjectInputStream entrada=null;
		Persona p;
		try {
			fis=new FileInputStream("H:/eclipse_myworkspace/personas.dat");
			entrada=new ObjectInputStream(fis);
			p=(Persona)entrada.readObject(); // Es necesario el casting.
			System.out.println(p.getNif()+" "+p.getNombre()+" "+p.getEdad());                             
			p=(Persona)entrada.readObject();
			System.out.println(p.getNif()+" "+p.getNombre()+" "+p.getEdad());
			p=(Persona)entrada.readObject();
			System.out.println(p.getNif()+" "+p.getNombre()+" "+p.getEdad());                             
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
