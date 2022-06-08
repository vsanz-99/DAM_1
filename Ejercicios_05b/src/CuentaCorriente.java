import java.util.Scanner;

/**
 * <p><i>Archivo: CuentaCorriente.java</i></p>
 * <p><b>Ejercicio 04</b>.</p>
 * @since 06/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class CuentaCorriente {

	static Scanner tec=new Scanner(System.in);
	private static String titular;
	private static float saldo;
	private static String codigo;

	public CuentaCorriente() {
		CuentaCorriente.setTitular(titular);
		CuentaCorriente.setSaldo(saldo);
	}

	public static String getTitular() {
		return titular;
	}

	public static void setTitular(String nombre) {
		titular=nombre;
	}

	public static float getSaldo() {
		return saldo;
	}

	public static void setSaldo(float dinero) {
		saldo=dinero;
	}

	public static String getCodigo() {
		return codigo;
	}

	/* public String setCodigo(String codigo) {
	 *		return codigo
	 * } */

	public static void consultarSaldo() {
		String titular, codigo;
		titular=codigo="";
		float saldo=0.0f;
		do {
			System.out.println("Introduce el nombre del titular de la cuenta: ");
			titular=tec.nextLine();
		} while (titular.isEmpty());
		do {
			System.out.println("Introduce el saldo de la cuenta: ");
			saldo=tec.nextFloat();
			tec.nextLine();
		} while (saldo<=0);
		do {
			System.out.println("Introduce tu codigo de seguridad: ");
			codigo=tec.nextLine();
			if (!validaCodigo(codigo))
				System.out.println("\tCodigo incorrecto. Tienen que ser 8"
						+"digitos numericos exactos.");
		} while (!validaCodigo(codigo));
		setTitular(titular);
		setSaldo(saldo);
		System.out.println("Imprimiendo datos ...\n"
				+"\tNombre del titular: "+getTitular()+"\n"
				+"\tSaldo actual: "+getSaldo()+"\n");
	}

	public static void ingresarDinero() {
		float ingreso=0.0f;
		System.out.println("Tu saldo actual es de: "+getSaldo());
		do {
			System.out.println("¿Cuanto dinero desea ingresar?");
			ingreso=tec.nextFloat();
			tec.nextLine();
		} while (ingreso<=0);
		CuentaCorriente.saldo+=ingreso;
		System.out.println("\tDespues de tu ingreso de "+ingreso+" euros, tu"
				+"saldo es de: "+getSaldo());
	}

	public static void retiraDinero() {
		float retirar=0.0f;
		do {
			System.out.println("Indica cuanto dinero desea retirar: ");
			retirar=tec.nextFloat();
			tec.nextLine();
		} while (retirar<=0);
		if (puedoSacar(retirar)) {
			CuentaCorriente.saldo-=retirar;
			System.out.println("\tDespues de retirar "+retirar+"euros, su saldo es de: "+getSaldo());
		} else {
			System.out.println("\tError: NO puedes sacar tanto dinero, no tienes suficiente.");
			System.out.println("Presiona RETURN para continuar.");
			tec.nextLine();
			tec.nextLine();
		}
	}

	public static boolean puedoSacar(float retirar) {
		boolean saldoPositivo=true;
		if (CuentaCorriente.saldo-retirar<=0) {
			saldoPositivo=false;
		} else {
			saldoPositivo=true;
		}
		return saldoPositivo;
	}

	public static boolean validaCodigo(String codigo) {
		if (codigo.length()==8) {
			for (int i=0; i<codigo.length(); i++) {
				if (!Character.isDigit(codigo.charAt(i)))
					return false;
			}
			return true;
		}
		return false;
	}

}
