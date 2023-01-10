package com.jgr.paquete.stream.finales.e.intermedios;

import java.util.stream.Stream;

/**
 * The Class StreamFinalContarYProcesar.
 * es Final,devuelve un resultado 
 * -long count()->devuelve el numero de elementos de un Stream
 * -void forEach(Consumer<? super T> action) realiza una accion para cada elemento del stream
 * 
 */
public class StreamFinalContarYProcesar {

	public static void main(String[] args) {
		Stream<Integer> st = Stream.of(2,5,7);
		System.out.println(st.count());
		
		Stream<Integer> st2 = Stream.of(2,5,7);
		st2.forEach(System.out::println);
	

	}

}
