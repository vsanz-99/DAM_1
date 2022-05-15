package rpssl;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Rpssl {
	int a;
	Random r = new Random();
	//String menu="1.Piedra\r2.Papel\r3.Tijera\r4.Spok\r5.Lagarto\r0.Salir";
	Scanner s = new Scanner(System.in);
	Opcionesrpssl op = new Opcionesrpssl();
	public Rpssl(){
		
		System.out.println("Empieza el juego");
		do {
			System.out.println(menu());
			a=s.nextInt();
			if(a!=0&&a<=op.op.size())
			jugada(a);
			System.out.println(op.getMarcador());
			
		}while(a!=0);
	}
	String menu() {
		String menu="";
		for(Map.Entry<Integer,String> x:op.op.entrySet()) {
			menu+=x.getKey()+"."+x.getValue()+"\r";
		}
		 
		return menu;
		
	}
	private void jugada(int a) {
		int b = r.nextInt(5)+1;
		String ai =op.op.get((Integer)a);
		String ia =op.op.get((Integer)b);
		//op.marcaRonda((Integer)a,(Integer)b);

			System.out.println(ai+"\tX\t"+ia+op.matoPierdo((Integer)a,(Integer)b));
	}
	
}
