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
		
		
		final int TOPE_APUESTAS = 6;
		final int NUMERO_MAXIMO = 49;// Integer.MAX_VALUE;
		final int NUMERO_MINIMO = 1;// Integer.MIN_VALUE;		
		
		
		List<Integer> listaEnteros = Stream
				.generate(() -> (int) (Math.random() * (NUMERO_MAXIMO - NUMERO_MINIMO) + NUMERO_MINIMO))
				.distinct()//sin duplicados
				.limit(TOPE_APUESTAS) //solo 6 numeros
				.sorted()//ordenados
				.collect(Collectors.toList()); //a lista
		
		listaEnteros.forEach(System.out::println);
		
		
		
		
		

	}

}
