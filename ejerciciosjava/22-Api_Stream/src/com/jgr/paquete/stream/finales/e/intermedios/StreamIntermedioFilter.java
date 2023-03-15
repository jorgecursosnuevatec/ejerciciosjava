package com.jgr.paquete.stream.finales.e.intermedios;

import java.util.stream.Stream;

/**
 * The Class StreamIntermedioFilter. Stream<T> filter(Predicate <?super T>
 * predicate),aplica un filtro y devuelve otro con el resultado
 * 
 */
public class StreamIntermedioFilter {

	public static void main(String[] args) {
		Stream<Integer> st = Stream.of(2, 5, 7, 9, 9, 23);

		System.out.println(st.distinct()// solo deja los distintos
				.filter(s -> s > 3)// de los que cumplen aplica un filtro y solo los mayores
				.count()// los cuenta
				);

	}

}
