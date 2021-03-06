import java.util.*;

public class Prueba_TreeSet {

	public static void main(String[] args) {
		/*
		TreeSet<String> ordenaPersonas=new TreeSet<String>();
		// Por defecto, sigue el orden alfabetico (implementa el metodo compareTo).
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		for (String s : ordenaPersonas) {
			System.out.println(s);
		}
		 */
		Articulo primero=new Articulo(1, "Primer articulo");
		Articulo segundo=new Articulo(200, "Segundo articulo");
		Articulo tercero=new Articulo(3, "Este es el tercer articulo");
		// Almacenar estos objetos de tipo Articulo en un TreeSet.
		TreeSet<Articulo> ordenaArticulos=new TreeSet<Articulo>();
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		ordenaArticulos.add(tercero);
		for (Articulo art : ordenaArticulos) {
			System.out.println(art.getDescripcion());
		} // Lo ordena por numero de articulo.
		// Fin del bucle.
		// Creacion de un objeto de tipo Comparator.
		//Articulo comparadorArticulos=new Articulo();
		//TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(comparadorArticulos); // Se van a ordenar alfabeticamente.
		//ComparadorArticulos compara_art=new ComparadorArticulos();
		TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(new Comparator<Articulo>() { // Clase Interna Anonima.
			@Override
			public int compare(Articulo o1, Articulo o2) {
				// TODO Auto-generated method stub
				String desc1=o1.getDescripcion();
				String desc2=o2.getDescripcion();
				return desc1.compareTo(desc2);
			}
		});
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercero);
		System.out.println("");
		for (Articulo art : ordenaArticulos2) {
			System.out.println(art.getDescripcion());
		} // Fin del bucle.
	}

}

class Articulo implements Comparable<Articulo> {

	public Articulo(int num, String desc) { // Los articulos van a numerarse y van a tener una descripcion.
		numero_articulo=num;
		descripcion=desc;
	}

	@Override
	public int compareTo(Articulo o) { // Devuelve un valor negativo, 0 o 1.
		return numero_articulo-o.numero_articulo;
	}

	public String getDescripcion() {
		// TODO Auto-generated method stub
		return descripcion;
	}

	private int numero_articulo;
	private String descripcion;

}