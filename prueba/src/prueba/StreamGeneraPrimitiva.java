package prueba;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamGeneraPrimitiva {

	public static void main(String[] args) {

		int maximo = 6;
		int numero_maximo = 49;// Integer.MAX_VALUE;
		int numero_minimo = 1;// Integer.MIN_VALUE;
		long t1 = System.currentTimeMillis();

		List<Integer> intListaStream = IntStream
				.generate(() -> (int) (Math.random() * (numero_maximo - numero_minimo) + numero_minimo)).distinct()
				.parallel().peek(n -> {
					System.out.println("Nombre Thread: " + Thread.currentThread().getName() + " - " + n);
				}).limit(maximo).sorted().boxed().collect(Collectors.toList());

		intListaStream.forEach(System.out::println);
		long t2 = System.currentTimeMillis();
		System.out.println("Tiempo total: " + (t2 - t1));
//	        System.out.println(resultado);

	}

}
