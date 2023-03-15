package com.jgr.paquete.stream.finales.e.intermedios;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * The Class StreamIntermedioPeek.
 * Stream<T>	peek​(Consumer<? super T> action)
 * Returns a com.jgr.stream consisting of the elements of this com.jgr.stream, additionally performing 
 * the provided action on each element as elements are consumed from the resulting com.jgr.stream.
 * aplica el consumer a cada elemento y devuelve uno igual 
 * 
 * SI NO SE INVOCA DIRECTAMENTE NO HACE NADA,NECESITA UNA OPERACION FINAL,VER EJEMPLOS
 * FUNCIONA EN MODO LAZY
 * 
 */
public class StreamIntermedioPeek {

	public static void main(String[] args) {
		
		Integer [][] numeritos = {{8,3,5},{2,11,7},{4,1,9,6}};
		
		System.out.println("total->" +
				Stream.of(numeritos) //datos de entrada
				.flatMap(a->Arrays.stream(a)) //como es un array de varias dimensiones lo aplano
				.filter(n->n%2==0)//solo los pares
				.peek(n->System.out.println("par->"+n))
				.count()
				);
		
		//COMO NO SE HACE NADA CON nums, se guarda el valor,pero no porque es usado con una operacion final
		Stream<Integer> nums = Stream.of(20,5,8,13);
		nums.peek(n->System.out.println("el valor es"+n));
		
		//PEEK FUNCIONA EN MODO LAZY Y ALLMATCH EN MODO CORTOCIRCUITO,SOLO SALEN LOS DOS PRIMEROS ELEMENTOS
		Stream<Integer> nums2 = Stream.of(20,5,8,13);
		nums2.peek(n->System.out.println("el valor es:"+n)).allMatch(n->n>5);
		

	}

}
