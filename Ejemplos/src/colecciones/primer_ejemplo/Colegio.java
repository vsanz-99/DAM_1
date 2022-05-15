package colecciones.primer_ejemplo;

import java.util.*;
public class Colegio {
	Map alumno = new HashMap();

	public void addAlumno(String nac){
		if (alumno.containsKey(nac)){
			Integer i = alumno.get(nac);
			alumno.remove(nac);
			alumno.put(nac, i++);
		}else{
			alumno.put(nac,1);
		}
	}

	public void showAll(){
		Iterator it = alumno.keySet().iterator();
		while (it.hasNext()){
			Integer key = (Integer) it.next();
			System.out.println(«Numero de alumno: «+key+» Nacionalidad alumno: «+alumno.get(key));
		}}

	public void showNacionalidad(){
		for (String k : alumno.keySet()){
			System.out.println(k+»->»+alumno.get(k));
		}
	}

	public int cuantos(){
		return alumno.size();
	}

	public void borrar(String nac){
		alumno.remove(nac);
	}
}
