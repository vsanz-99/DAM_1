package poo;
import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		/*
		Coche micoche=new Coche();
		
		micoche.setColor(JOptionPane.showInputDialog("Introduce el color"));
		
		System.out.println(micoche.getDatosGenerales());
		
		System.out.println(micoche.getColor());
		
		micoche.setAsientos(JOptionPane.showInputDialog("?Tiene asientos de cuero?"));
		
		System.out.println(micoche.getAsientos());
		
		micoche.setClimatizador(JOptionPane.showInputDialog("?Tiene climatizador?"));
		
		System.out.println(micoche.getClimatizador());
		
		System.out.println(micoche.getPesoCoche());
		
		System.out.println("\tEl precio final del coche es: "+micoche.precio_coche()+".");
		*/
		
		Coche micoche1=new Coche();
		
		micoche1.setColor("rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7, 580);
		
		mifurgoneta1.setColor("azul");
		
		mifurgoneta1.setAsientos("Si");
		
		mifurgoneta1.setClimatizador("Si");
		
		System.out.println(micoche1.getDatosGenerales()+"	"+micoche1.getColor());
		
		System.out.println(mifurgoneta1.getDatosGenerales()+mifurgoneta1.getDatosFurgoneta());
		
	}

}
