package arraylist;
import java.util.*;
import java.util.ArrayList;

public class UsoEmpleado {

	public static void main(String[] args) {
		// A veces el uso de vectores se vuelve algo incomodo
		// Solucion: clase ArrayList (capacidad inicial de 10) para crear listas dinamicas. Tiene sobrecarga de constructores
		/*
		Empleado listaEmpleados[]=new Empleado[4];

		listaEmpleados[0]=new Empleado("Ana", 45, 2500);

		listaEmpleados[1]=new Empleado("Antonio", 55, 2000);

		listaEmpleados[2]=new Empleado("Maria", 25, 2600);

		listaEmpleados[3]=new Empleado("Maria", 25, 2600);
		 */
		// Si se superan los 10 elementos del espacio en memoria, se crea una
		// copia diferente de otro ArrayList (mas consumo de recursos)

		// Los ArrayList permiten almacenar objetos en su interior
		// Creacion de un ArrayList (no es lo mismo que un array)
		ArrayList<Empleado> listaEmpleados=new ArrayList<Empleado>(); // <parametro de tipo>

		/*listaEmpleados.ensureCapacity(11);*/ // Le dices cuantos elementos va a tener. Se crea previamente
		// y se evita todo el consumo de recursos (sigue creando un ArrayList mas grande si se supera)

		// Ventaja: no hace falta tener en cuenta el numero de elementos
		// add para annadir objetos
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Jose", 35, 2200));
		listaEmpleados.add(new Empleado("Jose", 35, 2200));
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Jose", 35, 2200));
		listaEmpleados.add(new Empleado("Jose", 35, 2200));
		listaEmpleados.add(new Empleado("Pedro", 22, 2200));
		listaEmpleados.add(new Empleado("Pedro", 22, 2200));
		listaEmpleados.add(new Empleado("Pedro", 22, 2200));
		listaEmpleados.add(new Empleado("Pedro", 22, 2200));
		// Se agregan uno detras de otro

		//Para optimizar recursos:
		/*listaEmpleados.trimToSize();*/ // Este metodo corta el exceso en memoria, recorta el espacio
									     // sobrante en memoria
		/*listaEmpleados.add(new Empleado("Olga", 22, 2200));*/
		
		/*
		listaEmpleados.set(1, new Empleado("Olga", 22, 2200)); // Se incluye en la 2a posicion
		
		System.out.println(listaEmpleados.get(4).getDatos());
		*/
		
		//System.out.println(listaEmpleados.size()); // Muestra cuantos elementos tiene

		/*for (Empleado e : listaEmpleados) {

			System.out.println(e.getDatos());

		}*/
		
		// Creacion del iterador
		Iterator<Empleado> mi_iterador=listaEmpleados.iterator();
		
		while (mi_iterador.hasNext()) {
			System.out.println(mi_iterador.next().getDatos());
		}
		
		/*
		for (int i=0; i<listaEmpleados.size(); i++) {
			
			Empleado e=listaEmpleados.get(i);
			
			System.out.println(e.getDatos());
			
		} // Mas complejo
		*/
		
		// Copiar lo de dentro del ArrayList en un array convencional
		/*Empleado arrayEmpleados[]=new Empleado[listaEmpleados.size()]; // Array convencional
		
		listaEmpleados.toArray(arrayEmpleados);
		
		for (int i=0; i<arrayEmpleados.length; i++) {
			
			System.out.println(arrayEmpleados[i].getDatos());
			
		}*/
		
	}

}

class Empleado {

	public Empleado(String nombre, int edad, double salario) {
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}

	public String getDatos() {
		return "El empleado se llama "+nombre+". Tiene "+edad+" annos."+" Y un salario de "+salario+".";
	}

	private String nombre;
	private int edad;
	private double salario;

}
