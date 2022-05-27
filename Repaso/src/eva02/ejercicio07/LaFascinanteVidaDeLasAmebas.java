package eva02.ejercicio07;

/**
 * <p><i>Archivo: LaFascinanteVidaDeLasAmebas.java</i></p>
 * <p>Ejercicio 07<b>. Las amebas son seres unicelulares de forma cambiante ya que carecen 
 * de pared celular. Fagocitan cualquier cosa que se les pone por delante. Crea la clase Ameba 
 * con el atributo peso, un numero entero que indica los microgramos que pesa: sera un dato entero. 
 * Cuando se crea la ameba su peso es de 3 microgramos. Al comer, va incrementando su peso; 
 * gasta un microgramo en el proceso de fagocitar y el resto hace que aumente de peso. Por ejemplo, 
 * si come una particula de 6 microgramos miAmeba.come(6) engordaria 5 microgramos. Una ameba se puede 
 * comer a otra ameba miAmeba.come(otraAmeba). En este caso, sucede lo mismo que anteriormente, se 
 * gasta un microgramo en el proceso de fagocitado y el resto lo engorda la ameba que come. Por ejemplo, 
 * si una ameba de 7 microgramos se come a una de 4, acaba pesando 10 microgramos; la ameba comida 
 * no se destruye pero se quedaria con un peso de 0 microgramos y ya no podria fagocitar nada. Pero si 
 * la ameba de 4 microgramos intenta comerse a la de 7, no puede.</b></p>
 * @since 25/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class LaFascinanteVidaDeLasAmebas {

	public static void main(String[] args) {
		
		Ameba a1=new Ameba();
		a1.come(2);
		System.out.println(a1);
		Ameba a2=new Ameba();
		a2.come(4);
		System.out.println(a2);
		a1.come(a2);
		System.out.println(a1);
		System.out.println(a2);
		a2.come(3);
		System.out.println(a2);

	}

}
