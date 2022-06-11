import java.util.Scanner;

/**
 * <p><i>Archivo: Problema_01</i></p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Problema_01 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int op, result, suma, resta, producto, aciertos, errores;
		op=result=suma=resta=producto=aciertos=errores=0;
		System.out.println("GENERADOR DE PRUEBAS DE CALCULO.");
		System.out.println("================================");
		do {
			System.out.println("\nElige el tipo de operacion: \n"
					+"\t1-. suma.\n"
					+"\t2-. diferencia.\n"
					+"\t3-. producto.\n");
			op=Integer.parseInt(teclado.nextLine());
		} while ((op<1) || (op>3));
		for (int i=0; i<10; i++) {
			int A=(int)(Math.random()*20)+1;
			int B=(int)(Math.random()*20)+1;
			if (op==1) {
				System.out.println((i+1)+". "+A+" + "+B+" = ¿?");
				suma=A+B;
				System.out.print("Introduce el resultado: ");
				result=teclado.nextInt();
				if (result==suma) {
					aciertos++;
				} else {
					errores++;
				}
			} else if (op==2) {
				System.out.println((i+1)+". "+A+" - "+B+" = ¿?");
				resta=A-B;
				System.out.print("Introduce el resultado: ");
				result=teclado.nextInt();
				if (result==resta) {
					aciertos++;
				} else {
					errores++;
				}
			} else {
				System.out.println((i+1)+". "+A+" * "+B+" = ¿?");
				producto=A*B;
				System.out.print("Introduce el resultado: ");
				result=teclado.nextInt();
				if (result==producto) {
					aciertos++;
				} else {
					errores++;
				}
			}
		}
		teclado.close();
		System.out.println("\n\tNumero de aciertos: "+aciertos);
		System.out.println("\n\tNumero de errores: "+errores);
		System.out.println("\n\tNota: "+aciertos+"/10");
	}

}
