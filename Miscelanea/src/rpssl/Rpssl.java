package rpssl;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * <p><i>Archivo: Rpssl.java</i></p>
 * @since 27/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Rpssl {

	int a;
	Random r=new Random();
	//String menu="1. Piedra\r2. Papel\r3. Tijeras\r4. Spock\r5. Lagarto\r0. Salir"
	Scanner teclado=new Scanner(System.in);
	Opcionesrpssl op=new Opcionesrpssl();

	public Rpssl() {
		System.out.println("Empieza el juego: \r");
		do {
			System.out.println(menu());
			a=teclado.nextInt();
			if (a!=0 && a<=op.op.size())
				jugada(a);
			System.out.println(op.getMarcador());
		} while (a!=0);
	}

	String menu() {
		String menu="";
		for (Map.Entry<Integer, String> x : op.op.entrySet()) {
			menu+=x.getKey()+"."+x.getValue()+"\r";
		}
		return menu;
	}

	private void jugada(int a) {
		int b=r.nextInt(5)+1;
		String ai=op.op.get((Integer)a);
		String ia=op.op.get((Integer)b);
		//op.marcaRonda((Integer)a, (Integer)b);
		System.out.println(ai+"   X   "+ia+op.matoPierdo((Integer)a, (Integer)b));
	}

}
