package prueba;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamGeneraPrimitiva {

	public static void main(String[] args) {
		
		int maximo = 6;
		int numero_maximo = 49;// Integer.MAX_VALUE;
		int numero_minimo = 1;// Integer.MIN_VALUE;
		
		List<Integer> intStream = IntStream
				.generate(()-> (int)(Math.random() * (numero_maximo-numero_minimo)+numero_minimo))
				.distinct()
				.peek(n -> {
                    System.out.println("Nombre Thread: " + Thread.currentThread().getName()
                    + " - " + n);
                })
				.limit(maximo)
				.sorted()
				.boxed().collect(Collectors.toList())
				;
			
		intStream.forEach(System.out::println);
		
			
	}

}
