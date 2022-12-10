package com.jgr.paquete.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * The Class StreamCrear.
 * Creamos un stream a partir de un array o con streambuilder
 * tiene metodos intermedios que devuelven otro stream,como filtrar,transformar,ordenar...
 * tiene metodos finales que generan un resultado o void, como calcular,buscar,reduccion...
 * una vez que se usa NO se puede volver a utilizar
 */
public class StreamCrear {

	
	public static void main(String[] args) {
		
		//a partir de otro stream
		Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe");
		nombres.forEach(System.out::println);

		//a partir de un array
		String[] arr = { "Pato", "Paco", "Pepa", "Pepe" };
		Stream<String> nombres2 = Arrays.stream(arr);
		nombres2.forEach(System.out::println);
		
		//a partir de una coleccion
		ArrayList<Integer> nums= new ArrayList<>();
		nums.add(200);
		Stream<Integer> st = nums.stream();
		
		//a partir de una serie de datos
		Stream<Double> strdb= Stream.of(2.4,5.3);
		
		//A partir de un rango de datos
		IntStream stintrange= IntStream.range(1,10);//el ultimo no entra
		IntStream stintrangeC = IntStream.rangeClosed(1,10);//el ultimo si entra		
		stintrange.forEach(System.out::println);
		stintrangeC.forEach(System.out::println);
		
		

		//Usando un stream builder
		Stream<String> nombres3 = Stream.<String>builder().
				add("Pato").add("paco").add("pepa").add("pepe").build();
		nombres3.forEach(System.out::println);

	}

}
