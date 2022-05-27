import java.util.HashMap;

/**
 * <p><i>Archivo: Opcionesrpssl.java</i></p>
 * @since 27/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Opcionesrpssl {
	
	static HashMap<Integer, String> op=new HashMap<Integer, String>();
	static int tu=0, maquina=0;
	
	public Opcionesrpssl() {
		op.put(1, "Piedra");
		op.put(2, "Papel");
		op.put(3, "Tijera");
		op.put(4, "Spock");
		op.put(5, "Lagarto");
	}
	
	static public Integer resta(Integer a, int b) {
		if (a-b<=0) 
			return (a-b)+op.size();
		return a-b;
	}
	
	static public Integer suma(Integer a, int b) {
		if (a+b>op.size())
			return (a+b)-op.size();
		return a+b;
	}
	
	public String getMarcador() {
		return "__________________\n|TU \t MAQUINA| \n|"+tu+"\t       "+maquina+"|\n__________________";
	}
	
	/*public void marcaRonda(Integer a, Integer b) {
		if (a==b)
			return;
		int i=2;
		while (i<op.size()/2*2) {
			if (suma(a,i)==b) {
				++tu;
				return;
			}
			if(resta(a,i)==b) {
				++maquina;
				return;
			}
			i+=2;
		}
	}*/
	
	public String matoPierdo(Integer a, Integer b) {
		int i=2;
			while (i<=(op.size()/2)*2) {
				if (suma(a,i)==b) {
					++tu;
					return" ganas";
				}
				if (resta(a,i)==b) {
					++maquina;
					return" pierdes";
				}
				i+=2;
			}
		return" empate";
		
	}
	
}
