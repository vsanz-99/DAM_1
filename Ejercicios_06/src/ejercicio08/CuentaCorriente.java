package ejercicio08;
import java.util.Scanner;

/**
 * <p><i>Archivo: CuentaCorriente.java</i></p>
 * <p><b>Ejercicio 08</b>.</p>
 * @since 09/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class CuentaCorriente {
	
	static Scanner tec=new Scanner(System.in);
	private String titular,codigo;
	private static String codigos="";
	float saldo;
	boolean valido, verify=true;
	
	public CuentaCorriente() {}
	
	public CuentaCorriente(String codigo, String titular) {
		int i=0;
		String numeros="1 2 3 4 5 6 7 8 9 0";
		for (int n=codigo.length(); i<n && verify==true && i<9; ++i) {
			if (numeros.indexOf(codigo.charAt(i))>0) {
				verify=true;
			} else {
				verify=false;
			}
		}
		if (codigos.indexOf(codigo)<0 && verify==true) {
			codigos=codigos+" "+codigo;
			this.codigo= codigo;
			this.titular=titular;
			saldo=0.0f; 
			valido=true;
		} else {
			valido=false;
		}
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular=titular;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo=saldo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo=codigo;
	}
	
	public void IngresarDinero() {
		if (valido==true) {
			System.out.println("¿Cuanto dinero desea ingresar?");
			float m=tec.nextFloat();
			setSaldo(saldo + m);
		} else {
			System.out.println("\tEsta cuenta NO existe.");
		}
	}
	
	public void RetiraDinero() {
		if (valido==true) {
			System.out.println("¿Cuanto dinero desea retirar?");
			float m=tec.nextFloat();
			if (PuedoSacar(m)) {
				setSaldo(saldo-m);
			} else { 
				String l=tec.nextLine();
				System.out.println("La cuenta no posee suficientes fondos para retirar esa cantidad. Pulse RETURN.");
				l=tec.nextLine();}
		} else {
			System.out.println("\tEsta cuenta NO existe.");
		}
	}
	
	public boolean PuedoSacar(float m) {
		if (saldo>=m) {
			return true;
		} else {
			return false;
		}
	}
	
}
