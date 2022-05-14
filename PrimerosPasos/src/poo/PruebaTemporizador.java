package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
	
		DameLaHora oyente=new DameLaHora();
		
		//ActionListener oyente=new DameLaHora();
		
		Timer mitemporizador=new Timer(5000, oyente);
		
		mitemporizador.start(); // Se detiene la ejecucion
		
		// Lanza una ventana
		JOptionPane.showMessageDialog(null, "\tPulsa Aceptar para detener.");
		
		System.exit(0);
		
	}

}

class DameLaHora implements ActionListener { // Implementa la interfaz ActionListener

	// No se puede instanciar en Clases Abstractas y/o Interfaces directamente
	public void actionPerformed(ActionEvent e) { // Se desencadena cuando se produce un evento

		Date ahora=new Date();

		System.out.println("\tTe pongo la hora cada 5 sg: "+ahora); // Cada 5 segundos
		// almacena en la variable 'ahora' la hora que es

	}

}
