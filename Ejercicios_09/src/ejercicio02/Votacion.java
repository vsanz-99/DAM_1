package ejercicio02;

/**
 * <p><i>Archivo: Votacion.java</i></p>
 * <p><b>Ejercicio 02</b>.</p>
 * @since 07/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Votacion {
	
	/* Almacena los datos de unas elecciones y 
	 * detemrina el numero 
	 * de diputados de los partidos. */
	private final int MAXSIZE=100;
	// Lista de partidos con sus votos.
	Lista<Partido> l=new Lista<>();
	Lista<Diputado> e;
	//int partidos, conDiputados;
	//partidos=conDiputados=0;
	int diputados;
	
	public Votacion(int diputados) {
		this.diputados=diputados;
	}
	
	public void insertarVotos(String partido, int votos) {
		e=null;
		Partido o=new Partido(partido, votos);
		Partido p=l.buscar(o);
		if (p!=null) {
			p.addVotos(votos);
		} else {
			l.insertar(o);
		}
	}
	
	/* Determina el numero de diputados de cada partido con
	 * los datos actuales. */
	public void calcular() {
		int votosTotal=0;
		int partidos=l.getCantidad();
		Lista<Partido> aux=new Lista<>(diputados*partidos);
		for (int i=0; i<partidos; i++) {
			votosTotal+=l.getPartido(i).getVotos();
		}
		int porcentaje=(int)(votosTotal/(100.0*5));
		for (int i=0; i<diputados*partidos; i++) {
			int auxPartido=i%partidos;
			int divisor=i/(partidos+1);
			Partido p=l.getPartido(auxPartido);
			aux.insertar(new Partido(
					p.getNombre(),
					p.getVotos()<porcentaje?0:p.getVotos()/divisor));
			/* aux.insertarVotos(l.getNombre(auxPartido), 
			 * 					 l.getVotos(auxPartido)<porcentaje?0:l.getVotos(auxPartido)/divisor); */
		}
		/* for (int i =0; i<partidos; i++) 
		 * 		if (l.getVotos(i)>=porcentaje)
		 * 			aux.insertarVotos(l.getNombre(i), l.getVotos(i));
		 * 		else 
		 * 			aux.insertarVotos(l.getNombre(i), 0);
		 * for (int i=partidos; i<diputados*partidos; i++) {
		 * 		int auxPartido=i%partidos;
		 * 		int divisor=i/partidos+1;
		 * 		aux.insertarVotos(aux.getNombre(auxPartido), 
		 * 						  aux.getVotos(auxPartido)/divisor);
		 * }*/
		aux.ordenar();
		e=new Lista(l.getCantidad());
		//conDiputados=0;
		for (int i=0; i<diputados; i++) {
			Partido miAux=aux.getPartido(i);
			Partido p=e.buscar(miAux);
			if (p==null) {
				e.insertar(
						new Diputado(
								miAux.getNombre(), miAux.getVotos()));
			} else {
				p.addVotos(1);
			}
		}
		//e.annadirVotos(aux.getNombre(i), 1);
	}
	
	@Override
	public String toString() {
		if (e==null)
			return "No ha sido calculado.";
		String salida="Partido\tEscannios";
		for (int i=0; i<e.getCantidad(); i++) {
			Partido p=e.getPartido(i);
			//p.setSeparador('-');
			salida+="\n"+p;
		}
		return salida;
	}
	
}
