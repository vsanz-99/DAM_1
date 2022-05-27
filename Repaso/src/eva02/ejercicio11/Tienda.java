package eva02.ejercicio11;

/**
 * <p><i>Archivo: Tienda.java</i></p>
 * <p><b>Ejercicio 11</b>. Noe es el propietario de una tienda de animales domesticos y 
 * te ha pedido que escribas un programa para la administracion, inventariado y facturacion 
 * de su tienda. Vende perros, gatos y peces. El programa debe gestionar la raza de los perros 
 * y el tipo de comida: en lata o seca. La raza de los gatos y si tienen garras o no. De los peces, 
 * el tipo de pez y si es de agua dulce o salada. Todos los animales tienen un costo base de 60€, 
 * al cual se le agrega o decrementa su valor segun sus caracteristicas: si se compra un perro que 
 * se alimenta con comida en lata, el costo se incrementara en un 10%; el costo de los gatos con garras 
 * se decrementa en un 5%; y los peces de agua dulce cuestan un 20% mas. Crea las clases apropiadas y un 
 * conductor que, aleatoriamente, genere 100 animales diferentes y determine su precio, segun sus 
 * caracteristicas.</p>
 * @since 26/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Tienda {

	public static void main(String[] args) {

		System.out.println("Bienvenido a la aplicacion de la tienda de animales.");
		System.out.println("----------------------------------------------------\n");

		System.out.println("Determinando el precio de 100 animales ...");

		String[] animales=new String[100];

		int especie, tipo_pez, tipo_perro, tipo_gato;
		int propiedad;

		for (int i=0; i<animales.length; i++) {
			especie=(int)(Math.random()*3)+1;
			propiedad=(int)(Math.random()*2)+1;
			switch (especie) {
			case 1 :
				tipo_pez=(int)(Math.random()*4)+1;
				Pez f=new Pez(tipo_pez, propiedad);
				animales[i]=f.determinaPrecio();
				break;
			case 2 :
				tipo_perro=(int)(Math.random()*5)+1;
				Perro d=new Perro(tipo_perro, propiedad);
				animales[i]=d.determinaPrecio();
				break;
			case 3 :
				tipo_gato=(int)(Math.random()*5)+1;
				Gato c=new Gato(tipo_gato, propiedad);
				animales[i]=c.determinaPrecio();
				break;
			default :
				System.out.println("\tError. Saliendo del programa ...");
				System.exit(0);
			}
		}
		
		System.out.println();
		
		int contador=0;
		
		for (String a : animales) {
			contador++;
			System.out.println("\t("+contador+"): "+a);
		}

	}

}


