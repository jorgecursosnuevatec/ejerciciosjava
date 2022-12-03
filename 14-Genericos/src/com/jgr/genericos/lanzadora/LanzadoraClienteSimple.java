package com.jgr.genericos.lanzadora;

import java.util.Arrays;
import java.util.List;

import com.jgr.genericos.otro.modelos.Cliente;
import com.jgr.genericos.otro.modelos.ClientePremium;

// TODO: Auto-generated Javadoc
/**
 * The Class LanzadoraClienteSimple.
 */
public class LanzadoraClienteSimple {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Cliente andres = new Cliente("Andrés", "Guzmán");
		Cliente andres2 = new Cliente("Andrés2", "Guzmán2");

		Cliente[] clientesArreglo = { andres, andres2 };
		Integer[] integerArreglo = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Float[] floatArreglo = { 1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f};

		
		//este llamaria al generico
		List<Cliente> clientesLista = deArrayALista(clientesArreglo);
		
		//este va a llamar al que implementa comparable,si no lo hiciera llamaria a la misma
		//que cliente
		List<ClientePremium> clientePremiumLista= deArrayALista(new ClientePremium[]
				{new ClientePremium("s1","s2"),
						new ClientePremium("s3","s4")});
				
		
		//este llamaria al que tiene dos parametros
		clientesLista = deArrayALista(clientesArreglo, integerArreglo);
		//este llamaria al que acepta numeros
		List<Integer> numerosLista= deArrayALista(integerArreglo);
		List<Float> floatLista= deArrayALista(floatArreglo);
		
	}

	/**
	 * Convierte de array A lista GENERICO.
	 *
	 * @param <T> the generic type
	 * @param c   the c
	 * @return the list
	 */
	public static <T> List<T> deArrayALista(T[] c) {
		System.out.println("\n Entra en generico");
		return Arrays.asList(c);
	}
	
	
	/**
	 * De array A lista. SOLO PARA CLIENTES Y CLASES QUE HEREDEN DE EL E IMPLEMENTEN COMPARABLE
	 *
	 * @param <T> the generic type
	 * @param c the c
	 * @return the list
	 */
	public static <T extends Cliente & Comparable<T>> List<T> deArrayALista(T[] c) {
		System.out.println("\n Entra en cliente comparable");
		return Arrays.asList(c);
	}
	
	
	/**
	 * De array A lista pero para NUMEROS
	 *
	 * @param <T> the generic type
	 * @param c the c
	 * @return the list
	 */
	public static <T extends Number> List<T> deArrayALista(T[] c) {
		System.out.println("\n Entra en number");
		return Arrays.asList(c);
	}

	/**
	 * De array A lista. LOS DOS PARAMETROS SON GENERICOS
	 * 
	 * le pasamos un array para que lo convierta a lista y otro que lo que hace es
	 * imprimirlo
	 *
	 * @param <T> the generic type
	 * @param <G> the generic type
	 * @param c the c
	 * @param x the x
	 * @return the list
	 */
	public static <T, G> List<T> deArrayALista(T[] c, G[] x) {
		System.out.println("\n Entra en el de dos parametros");
		for (G elemento : x) {
			System.out.println(elemento);
		}
		return Arrays.asList(c);
	}

}
