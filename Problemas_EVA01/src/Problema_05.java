import java.util.Scanner;

/**
 * <p><i>Archivo: Problema_05</i></p>
 * @since 11/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Problema_05 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double s=0.0d; char simbolo=0;
		String confirmacion, afirmacion, secuencia;
		afirmacion="Si"; confirmacion="";
		int saldo=10;
		// Premios:
		String premio1="$$$"; String premio2="$@@";
		String premio3="$##"; String premio4="@@@";
		String premio5="@##"; String premio6="@$$";
		System.out.println("MAQUINA TRAGAPERRAS EN JAVA.");
		System.out.println("============================");
		System.out.println("//////////Premios///////////");
		System.out.println("\n\t1. "+premio1+" 50 euros\n"
				+"\t2. "+premio2+" 25 euros\n"
				+"\t3. "+premio3+" 15 euros\n"
				+"\t4. "+premio4+" 10 euros\n"
				+"\t5. "+premio5+" 5 euros\n"
				+"\t6. "+premio6+" 3 euros\n");
		do {
			// Eleccion del jugador para iniciar el programa.
			System.out.println("¿Quieres jugar? Si/No");
			confirmacion=teclado.nextLine();
			System.out.println("Tu saldo "+saldo+" euros");
			secuencia="";
			do {
				// Genera los numeros y los relaciona para formar 
				// una cadena de 3 simbolos.
				saldo--;
				s=Math.random()*10;
				switch ((int)s) {
				case 1 : simbolo='$'; break;
				case 2 : simbolo='$'; break;
				case 3 : simbolo='$'; break;
				case 4 : simbolo='@'; break;
				case 5 : simbolo='@'; break;
				case 6 : simbolo='@'; break;
				case 7 : simbolo='#'; break;
				case 8 : simbolo='%'; break;
				case 9 : simbolo='>'; break;
				case 10 : simbolo='<'; break;
				default : 
				}
				secuencia+=simbolo;
			} while (secuencia.length()<3);
			// Comprueba si la secuencia coincide con un premio 
			// y suma el premio al saldo.
			System.out.println(secuencia+"\n");
			if (secuencia.equalsIgnoreCase(premio1)) {
				saldo+=50;
				System.out.println("\nWIN! +50");
			} else if (secuencia.equalsIgnoreCase(premio2)) {
				saldo+=25;
				System.out.println("\nWIN! +25");
			} else if (secuencia.equalsIgnoreCase(premio4)) {
				saldo+=15;
				System.out.println("\nWIN! +15");
			} else if (secuencia.equalsIgnoreCase(premio4)) {
				saldo+=10;
				System.out.println("\nWIN! +10");
			} else if (secuencia.equalsIgnoreCase(premio5)) {
				saldo+=5;
				System.out.println("\nWIN! +5");
			} else if (secuencia.equalsIgnoreCase(premio6)) {
				saldo+=3;
				System.out.println("\nWIN! +3");
			} else {
				saldo++;
				System.out.println("\nLOSE!");
			}
		} while (confirmacion.equalsIgnoreCase(afirmacion) && saldo>0);
		teclado.close();
	}

}
