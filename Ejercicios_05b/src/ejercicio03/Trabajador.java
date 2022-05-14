package ejercicio03;

/**
 * <p>Definir la clase <b>Trabajador</b>. Cada trabajador 
 * tienen un numero identificativo que va de 1 a 100, ademas 
 * se controla su nombre, estado civil(S/C), turno (D/N), 
 * titulacion(0 a 4) y annos en la empresa.</p>
 * <ul>
 * <li type="disc">Constructor con parametros fijos para un trabajador nuevo.</li>
 * <li type="disc">Modificar cualquier dato menos el identificador.</li>
 * <li type="disc">Visualizar los datos de un trabajador dado.</li>
 * <li type="disc">Calcular la nomina de un trabajador teniendo en cuenta que: </li>
 * <ol>
 * <li>	El salario base es de 425 euros para todos.</li>
 * <li> Se paga 100 euros extra en turno N.</li>
 * <li> Se paga 75 euros por anno de antigüedad.</li>
 * <li> La titulacion se paga 250, 500, 1000, 1250, 1500 segun sea de 0 a 4.</li>
 * <li> Se efectua una retencion de impuestos de la nomina del 12% a todos salvo a los casados que 
 * se les retiene el 10%.</li>
 * </ol>
 * </ul>
 * <p>Declarar los atributos y metodos correspondientes, desarrollarlos y probarlos en un programa.</p>
 * @since 01/05/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Trabajador {

	private String nombre;
	
	private char estado_civil;
	
	private char turno;
	
	private int titulacion;
	
	private int annos_empresa;
	
	public Trabajador() {
		
	}

}
