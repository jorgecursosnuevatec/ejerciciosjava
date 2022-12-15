package com.jgr.paquete.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;


/**
 * The Class StreamToLista.
 * convertir stream a lista
 */
public class StreamToLista {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		DoubleStream streamDouble = DoubleStream.generate(() -> {
			return (double) (Math.random()) * 10000;
		})
				.filter(p -> p > 0)//solo los positivos
				.peek(p -> System.out.println("en el peek->"+p))
				.limit(5).sorted();

		List<Double> listaDoble = new ArrayList<>();
		//con Consumer
		streamDouble.forEach(listaDoble::add);		
		listaDoble.forEach(System.out::println);
		
		listaDoble.clear();
		
		DoubleStream streamDouble2 = DoubleStream.generate(() -> {
			return (double) (Math.random()) * 10000;
		})
				.filter(p -> p > 0)//solo los positivos
				.peek(p -> System.out.println("en el peek->"+p))
				.limit(5).sorted();

		streamDouble2.forEach(listaDoble::add);
		
		 
		
	}


}
