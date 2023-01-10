package com.jgr.paquete.stream.finales.e.intermedios;

import java.util.stream.Stream;

/**
 * The Class StreamFinalComprobaciones.
 * es Final,devuelve un resultado 
 * -boolean anyMatch<Predicate<? super T> predicate)
 * -boolean allMatch
 * -boolean noneMatch
 * funcionan en modo cortocirtuito, cuando encuentra uno que cumple la condicion termina
 */
public class StreamFinalComprobaciones {

	public static void main(String[] args) {
		Stream<Integer> st = Stream.of(2,5,3,7);
		System.out.println("alguno mayor que 5?"+ st.anyMatch(n->n>5));
		
		//busca si alguno cumple que acaba en "d"
		Stream<String> nombres = Stream.of("Mario","Luis","David");
		
		System.out.println(nombres.anyMatch(n->n.endsWith("d")));

	}

}
