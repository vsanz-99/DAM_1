package ejercicio09;
import java.util.*;

/**
 * <p><i>Ejercicio_05_09: </i></p>
 * <p>Llamar a un metodo con los coeficientes de una ecuacion de segundo grado, 
 * <b>a</b>, <b>b</b> y <b>c</b>, y devuelva sus raices en el caso de ser reales.</p>
 * <p>Nota. Las raices de una ecuacion son: </p>
 * <p>R1=(-b+raiz(b^2-4*a_c))/(2*a)</p>
 * <p>R2=(-b-raiz(b^2-4*a_c))/(2*a)</p>
 * <p>Para la raiz llamar a la clase Math y el metodo raiz que es sqrt.</p>
 * <p>Esta funcion solo se puede aplicar en el caso de que valor sea positivo es decir: 
 * b^2-4*a_c>0.</p> 
 * @since 26/02/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Ejercicio_05_09 {
	
	static Scanner teclado=new Scanner(System.in);

	/**
	 * @param args the command line arguements
	 */
	
	public static void main(String[] args) {
		double a=0;
		double b=0;
		double c=0;

		System.out.println("\n\tIntroduce de la ecuacion de segundo grado, el valor 'a': ");
		a=teclado.nextDouble();
		System.out.println("\n\tIntroduce de la ecuacion de segundo grado, el valor 'b': ");
		b=teclado.nextDouble();
		System.out.println("\n\tIntroduce de la ecuacion de segundo grado, el valor 'c': ");
		c=teclado.nextDouble();
			
		raiz(a,b,c);	
	}
	
	static void raiz(double a,double b,double c) {
		
		double raiz1=0;
		double raiz2=0;
		
		if ( b*b-4*a*c>0 ) {
			raiz1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
			raiz2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
			
			System.out.println("\n\tEl resultado de la raiz (-b+raiz(b^2-4*a_c))/(2*a) es: " + raiz1);
			System.out.println("\n\tEl resultado de la raiz (-b-raiz(b*b-4*a*c))/(2*a) es: " + raiz2);
		}else {
			System.out.println("\n\t(b^2-4*a*c) es un numero negativo, asi que no se puede realizar la ecuacion.");
		}
	}

}
