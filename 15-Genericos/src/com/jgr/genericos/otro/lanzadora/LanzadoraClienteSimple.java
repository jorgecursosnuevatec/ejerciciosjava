package com.jgr.genericos.otro.lanzadora;

import java.util.Arrays;
import java.util.List;

import com.jgr.genericos.otro.modelos.Cliente;
import com.jgr.genericos.otro.modelos.ClientePremium;

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
		Float[] floatArreglo = { 1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f };

		// este llamaria al generico
		List<Cliente> clientesLista = deArrayALista(clientesArreglo);

		// este va a llamar al que implementa comparable,si no lo hiciera llamaria a la
		// misma
		// que cliente porque hereda de el
		List<ClientePremium> clientesPremiumLista = deArrayALista(
				new ClientePremium[] { new ClientePremium("s1", "s2"), new ClientePremium("s3", "s4") });

		// este llamaria al que tiene dos parametros
		clientesLista = deArrayALista(clientesArreglo, integerArreglo);
		// este llamaria al que acepta numeros
		List<Integer> numerosLista = deArrayALista(integerArreglo);
		List<Float> floatLista = deArrayALista(floatArreglo);

		// el metodo imprimirCliente como esta definido con ? en los parametros de
		// entrada
		// imprime clientes y las clases que heredan de el

		imprimirClientes(clientesLista);
		imprimirClientes(clientesPremiumLista);
		
		//compara 3 objetos y devuelve el mayor
		System.out.println(obtieneMayor(1,2,3));
		System.out.println(obtieneMayor(150033f,2f,3f));
		System.out.println(obtieneMayor("caramelo","betun","zanahoria"));
		
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

	/*
	 * este seria igual que el generico public static List<Cliente>
	 * deArrayALista(Cliente[] c) { System.out.println("\n Entra en generico");
	 * return Arrays.asList(c); }
	 */

	/**
	 * De array A lista. SOLO PARA CLIENTES Y CLASES QUE HEREDEN DE EL E IMPLEMENTEN
	 * COMPARABLE
	 *
	 * @param <T> the generic type
	 * @param c   the c
	 * @return the list
	 */
	public static <T extends Cliente & Comparable<T>> List<T> deArrayALista(T[] c) {
		System.out.println("\n Entra en cliente comparable");
		return Arrays.asList(c);
	}

	/**
	 * De array A lista pero para NUMEROS.
	 *
	 * @param <T> the generic type
	 * @param c   the c
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
	 * @param c   the c
	 * @param x   the x
	 * @return the list
	 */
	public static <T, G> List<T> deArrayALista(T[] c, G[] x) {
		System.out.println("\n Entra en el de dos parametros");
		for (G elemento : x) {
			System.out.println(elemento);
		}
		return Arrays.asList(c);
	}

	/**
	 * Imprime clientes y las clases que heredan de ella con el ? extends Cliente.
	 *
	 * @param clientes the clientes
	 */
	public static void imprimirClientes(List<? extends Cliente> clientes) {
		clientes.forEach(System.out::println);

	}

	/**
	 * Metodo que acepta 3 objetos y devuelve el mayor
	 * tiene que implementar comparable,el string y las clases wrapper lo cumplen
	 *
	 * @param <T> the generic type
	 * @param a the a
	 * @param b the b
	 * @param c the c
	 * @return the t
	 */
	public static <T extends Comparable<T>> T obtieneMayor(T a, T b, T c) {
		T max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;
	}

}
