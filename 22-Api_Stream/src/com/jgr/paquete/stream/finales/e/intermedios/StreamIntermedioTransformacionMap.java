package com.jgr.paquete.stream.finales.e.intermedios;

import java.util.stream.Stream;

/**
 * The Class StreamIntermedioTransformacionMap.
 * devuelven otro stream segun el criterio aplicado
 * -map
 * -mapToInt
 * -mapToDouble
 * -mapToLong
 * se pueden realizar calculos
 */
public class StreamIntermedioTransformacionMap {
	public static void main(String[] args) {

		//devuelve un stream convertido a mayusculas
		Stream<String> st = Stream.of("Luis","Javier","Pepe");
		Stream<String> st2 = st.map(s->s.toUpperCase());
		st2.forEach(System.out::println);

		//aplica una funcion a cada elemento y genera un int para cada uno de ellos
		//el resultado es un intStream
		Stream<String> st3 = Stream.of("Luis","Javier","Pepe");

		System.out.println(st3.
				mapToInt(s->s.length()) //longitud de cada elemento
				.sum()//lo suma
				);




	}

}
