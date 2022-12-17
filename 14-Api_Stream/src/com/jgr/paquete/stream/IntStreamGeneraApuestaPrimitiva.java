package com.jgr.paquete.stream;



import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamGeneraApuestaPrimitiva {

	public static void main(String[] args) {
		
		int maximo = 6;
		int numero_maximo = 49;// Integer.MAX_VALUE;
		int numero_minimo = 1;// Integer.MIN_VALUE;
		
		long tMinInicio = System.currentTimeMillis();
		
		List<Integer> intStream = IntStream
 				.generate(()-> (int)(Math.random() * (numero_maximo-numero_minimo)+numero_minimo))
//				.generate(()-> (int)(Math.random() * (Integer.MAX_VALUE-Integer.MIN_VALUE)+Integer.MIN_VALUE))
				.parallel()
				.distinct()
				/*
				.peek(n -> {
                    System.out.println("Nombre Thread: " + Thread.currentThread().getName()
                    + " - " + n);
                })
                */
				.limit(maximo)
//				.limit(Integer.MAX_VALUE)
				.sorted()
				.boxed().collect(Collectors.toList())
				;
			
		long tMinFinal = System.currentTimeMillis();
		System.out.println("terminado");
		intStream.forEach(System.out::println);
		
		long millis = tMinFinal-tMinInicio;
		
		System.out.println("Hora actual: " + String.format("%d min, %d sec",
	             TimeUnit.MILLISECONDS.toMinutes(millis),
	             TimeUnit.MILLISECONDS.toSeconds(millis) -
	                     TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))
	     ));
	}

}
