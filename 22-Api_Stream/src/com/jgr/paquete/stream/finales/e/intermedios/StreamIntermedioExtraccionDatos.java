package com.jgr.paquete.stream.finales.e.intermedios;

import java.util.stream.Stream;

/**
 * The Class StreamIntermedioExtraccionDatos.
 * estos devuelven otro stream
 * -distinct
 * -limit
 * -skip
 */
public class StreamIntermedioExtraccionDatos {

	public static void main(String[] args) {

		// devuelve un stream eliminando duplicados y los cuenta,aplica el equals
		Stream<Integer> st = Stream.of(2, 5, 3, 7);
		System.out.println(st.distinct().count());

		// devuelve un stream con los n primeros elementos
		Stream<Integer> st2 = Stream.of(2, 5, 3, 7);
		Stream<Integer> st3 = st2.limit(1);
		st3.forEach(System.out::println);

		// devuelve otro stream saltandose los n primeros elementos
		Stream<Integer> st4 = Stream.of(2, 5, 3, 7);
		Stream<Integer> st5 = st4.skip(3);
		st5.forEach(System.out::println);

	}

}
