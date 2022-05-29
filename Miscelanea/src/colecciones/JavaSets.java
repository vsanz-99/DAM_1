package colecciones;
import java.util.*;

public class JavaSets {

	HashSet FCBarcelona=new HashSet<>();

	public void add() {
		FCBarcelona.add("Jordi Alba");
		FCBarcelona.add("Pique");
		FCBarcelona.add("Busquets");
		FCBarcelona.add("Iniesta");
		FCBarcelona.add("Messi");
	}

	HashSet jugadores=new HashSet<>();

	public void add2() {
		jugadores.add("Pique");
		jugadores.add("Busquets");
	}

	public void ShowBarcelona() {
		int i=0;
		Iterator it=FCBarcelona.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
			if (FCBarcelona.size()-1>i) {
				System.out.print(", ");
				i++;
			}
		}
		System.out.println();
	}

	public void contains(){
		if(FCBarcelona.contains("Neymar Jr")) {
			System.out.println("Neymar Si esta en el conjunto");
		}else{
			System.out.println("Neymar No esta en el conjunto");
		}
	}

	public void jugadoresEnBarcelona() {
		Iterator it=jugadores.iterator();
		Iterator it2=FCBarcelona.iterator();
		while (it.hasNext()) {
			if (FCBarcelona.contains(it2.next())) {
				System.out.println(it.next()+" esta en el conjunto");
			} else {
				System.out.println(it.next()+" no esta en el conjunto");
			}
		}
	}

	public void unir(){
		FCBarcelona.addAll(jugadores);
	}

	public void borrar(){
		jugadores.removeAll(jugadores);
		System.out.println("Jugadores Borrados");
	}

	public void ShowJugadores(){
		Iterator it=jugadores.iterator();
		int i=0;
		if (it.hasNext()==false) {
			System.out.println("No hay jugadores");
		} else {
			while(it.hasNext()){
				System.out.print(it.next());
				if(jugadores.size()-1>i) {
					System.out.print(", ");
					i++;
				}
			}
			System.out.println();
		}
	}

}

class Test {

	public static void main(String[] args) {

		JavaSets Barcelona=new JavaSets();

		Barcelona.add();
		Barcelona.contains();
		Barcelona.ShowBarcelona();
		Barcelona.add2();
		Barcelona.jugadoresEnBarcelona();
		Barcelona.ShowJugadores();
		Barcelona.unir();
		Barcelona.borrar();
		Barcelona.ShowJugadores();
		Barcelona.ShowBarcelona();

	}

}