package com.jgr.paquete.stream.finales.e.intermedios;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * The Class StreamIntermedioSequential. Cuando usamos un stream paralelo lo
 * volvemos a unir en uno solo usando sequential()
 */
public class StreamIntermedioSequential {

	public static void main(String[] args) {

		int maximo = 15;
		int numero_maximo = 400000;// Integer.MAX_VALUE;
		int numero_minimo = 1;// Integer.MIN_VALUE;

		// aunque le ponga sorted,como los numeros los han creado distintos hilos no van
		// a salir ordenados
		// a menos que les ponga sequential que los unifica en un unico hilo
		IntStream intLista = IntStream
				.generate(() -> (int) (Math.random() * (numero_maximo - numero_minimo) + numero_minimo))
				.parallel()
				.peek(n -> {
					System.out.println("Nombre Thread: " + Thread.currentThread().getName() + " - " + n);
				}).limit(maximo)
//				.sorted() 
				.sequential()// si no le pongo sequential no aseguro que realmente esten ordenados

		;

		intLista.forEach(System.out::println);

	}

}
