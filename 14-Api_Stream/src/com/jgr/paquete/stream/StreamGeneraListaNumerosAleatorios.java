package com.jgr.paquete.stream;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;



/**
 * The Class StreamGeneraListaNumerosAleatorios.
 * Genera uyna lista de numeros aleatorios
 */
public class StreamGeneraListaNumerosAleatorios {

	public static void main(String[] args) {

		List <Integer> lista =Stream.generate(()-> new Random()
				.nextInt())
				.limit(10)//10 elementos
				.collect(Collectors.toList());
	
		lista.forEach(System.out::println);

	}

}
