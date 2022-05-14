package ejercicio03;
import java.util.Random;
import java.util.ArrayList;

/**
 * <p>Generar los datos a partir de dos vectores de 10 nombres y 
 * 10 apellidos combinandolos al azar. Hay que generar un vector de 
 * 50 alumnos que almacenan nombre, apellido y las notas obtenidas en tres 
 * examenes parciales que se puntuan de 0 a 100.</p>
 * <p>El programa debe: </p>
 * <ol>
 * <li>Generar aleatoriamente los datos de los 50 alumnos.</li>
 * <li>Generar dos listados: </li>
 * <ol>
 * <li>	Con los alumnos ordenados por el par (apellido, nombre)</li>
 * <li> Con los alumnos ordenados por la nota media de las tres calificaciones, de mayor a menor.</li>
 * </ol>
 * </ol>
 * <p><b>Nota: </b>Podeis elegir la posibilidad de que haya nombres de alumnos repetidos o no: si lo permitis, 
 * seria apropiado annadir un dato identificador que tambien se mostraria en los listados.</p>
 * @since 02/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Prueba_Alumnos {

	public static void main(String[] args) {
		
		// Vector que contiene los posibles nombres de los alumnos
		String[] nombres={"Ana", "Juan", "Maria", "Antonio", "Andrea", "Raul", "Paula", "Vicente", "Sara", "Pedro"}; 
		
		// Vector que contiene los posibles apellidos de los alumnos
		String[] apellidos={"Moreno", "Sanz", "Garcia", "Rodriguez", "Castelar", "Ramos", "Gracia", "Sanchez", "Flores", "Alonso"}; 
		
		ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
	
	}

}
