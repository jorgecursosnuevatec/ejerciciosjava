package com.jgr.paquete.stream;

import java.util.Arrays;
import java.util.stream.Stream;


/**
 * The Class StreamCrear.
 * Creamos un stream a partir de un array o con streambuilder
 */
public class StreamCrear {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe");
		nombres.forEach(System.out::println);

		String[] arr = { "Pato", "Paco", "Pepa", "Pepe" };
		Stream<String> nombres2 = Arrays.stream(arr);
		nombres2.forEach(System.out::println);

		//Usando un stream builder
		Stream<String> nombres3 = Stream.<String>builder().
				add("Pato").add("paco").add("pepa").add("pepe").build();
		nombres3.forEach(System.out::println);

	}

}
