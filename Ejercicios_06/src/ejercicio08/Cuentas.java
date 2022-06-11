package ejercicio08;
import java.util.Arrays;

/**
 * <p><i>Archivo: Cuentas.java</i></p>
 * <p><b>Ejercicio 08</b>.</p>
 * @since 09/06/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Cuentas {

	int contador=0;
	CuentaCorriente[] cCorrientes=new CuentaCorriente[100];
	float[] saldos=new float[100];

	public Cuentas() {}

	public void add(String codigo, String titular, float saldo) {
		cCorrientes[contador]=new CuentaCorriente();
		cCorrientes[contador].setTitular(titular);
		cCorrientes[contador].setSaldo(saldo);
		cCorrientes[contador].setCodigo(codigo);
		++contador;
	}

	public void esRico() {
		for (int i=0; i<contador; i++) {
			saldos[i]=cCorrientes[i].getSaldo();
		}
		Arrays.sort(saldos);
		for (int i=0; i<contador; i++) {
			if (saldos[saldos.length-1]==cCorrientes[i].getSaldo())
				System.out.println(cCorrientes[i].getTitular()+" "
						+cCorrientes[i].getCodigo()+cCorrientes[i].getSaldo());
		}
	}

}
