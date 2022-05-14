import java.util.*;


public class CuentasUsuarios {

	public static void main(String[] args) {

		// Creacion de los clientes
		Cliente cl1=new Cliente("Antonio Banderas", "00001", 200000);
		Cliente cl2=new Cliente("Rafael Nadal", "00002", 250000);
		Cliente cl3=new Cliente("Penelope Cruz", "00003", 300000);
		Cliente cl4=new Cliente("Julio Iglesias", "00004", 500000);
		//Cliente cl5=new Cliente("Antonio Banderas", "00007", 200000);

		// No se pueden repetir clientes (no sebe repetir el cliente dentro de la coleccion)
		// ¿Muchas operaciones de agregar/borrar?

		HashSet<Cliente> clientesBanco=new HashSet<Cliente>(); // Coleccion creada

		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		//clientesBanco.add(cl5);

		/*
		for (Cliente cliente : clientesBanco) {

			// Remover un objeto de la coleccion
			if (cliente.getNombre().equals("Julio Iglesias")) {

				clientesBanco.remove(cliente);

			}

		}
		 */ 

		/*while (it.hasNext()) { // Mientras haya cosas que recorrer ...

			String nombre_cliente=it.next().getNombre(); // Almacena el nombre del objeto ('dando saltos' elemento a elemento)

			System.out.println(nombre_cliente);

			String n_cuenta=it.next().getN_cuenta(); // Almacena el numero de cuenta del objeto

		}*/

		Iterator<Cliente> it=clientesBanco.iterator(); // Objeto Iterador ('almacen')

		while (it.hasNext()) {

			String nombre_cliente=it.next().getNombre();

			if (nombre_cliente.equals("Julio Iglesias")) {

				it.remove();

			}

		}

		for (Cliente cliente : clientesBanco) {

			System.out.println(cliente.getNombre()+" "+cliente.getN_cuenta()+
					" "+cliente.getSaldo());

		} // Fin del bucle for each (mas sencillo que usando un objeto Iterador)

	}

}
