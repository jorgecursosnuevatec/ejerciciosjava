package com.jgr.paquete.stream;

import java.util.stream.Stream;


/**
 * The Class StreamDistinct.
 * saco un com.jgr.stream de los que no estan duplicados
 */
public class StreamDistinct {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		Stream<String> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia",
				"Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez").distinct();

		nombres.forEach(System.out::println);

	}
}
