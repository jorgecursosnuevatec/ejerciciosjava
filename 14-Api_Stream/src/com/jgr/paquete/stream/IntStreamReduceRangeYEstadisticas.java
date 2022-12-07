package com.jgr.paquete.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * The Class IntStreamReduceRangeYEstadisticas. hay que usar IntStream para crear un rango
 * https://www.geeksforgeeks.org/stream-reduce-java-examples/
 */
public class IntStreamReduceRangeYEstadisticas {

	public static void main(String[] args) {
		// To get the product of all elements
		// in given range excluding the
		// rightmost element
		int product = IntStream.range(2, 8).reduce((num1, num2) -> num1 * num2).orElse(-1);

		// Displaying the product
		System.out.println("El producto es : " + product);

		//crea un rango entre 5 y 20
		IntStream num = IntStream.range(5, 20).peek(System.out::println);
		 int resultado = num.reduce(0, Integer::sum);
		 //otra manera de calcular el resultado
		IntStream num2 = IntStream.range(5, 50).peek(System.out::println);
		int resultado2 = num2.sum();
		
		IntStream num3 = IntStream.range(5, 50).peek(System.out::println);
		
		IntSummaryStatistics stats = num3.summaryStatistics();
		System.out.println("max: " + stats.getMax());
		System.out.println("min: " + stats.getMin());
		System.out.println("sum: " + stats.getSum());
		System.out.println("promedio: " + stats.getAverage());
		System.out.println("total: " + stats.getCount());

	}

}
