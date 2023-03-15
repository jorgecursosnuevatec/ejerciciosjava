package com.jgr.paquete.stream.finales.e.intermedios;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * The Class StreamFinalReduccion.
 * Optional<T>	reduce​(BinaryOperator<T> accumulator)	
Performs a reduction on the elements of this com.jgr.stream, using an associative accumulation function,
 and returns an Optional describing the reduced value, if any.
 */
public class StreamFinalReduccion {
	public static void main(String[] args) {
		Integer [][] numeritos = {{8,3,5},{2,11,7},{4,1,9,6}};
		
		System.out.println( Stream.of(numeritos)
				.flatMap(a->Arrays.stream(a))//cada array a com.jgr.stream,lo aplano a 1 dimension
				.reduce((a,b)->a+b)
				
				);
		
		
		//sumar los 3 pares mas pequeños
		
		Stream<Integer> nums = Stream.of(11,20,5,8,3,9,4,10,2);
				
		System.out.println(
				nums.filter(s->s%2==0)//solo los pares
				//.sorted((a,b)->a-b) //ordeno
				.sorted()//no hace falta ponerle parametros si no queremos				
				.limit(3)//solo 3
				.reduce((a, b)->a+b)//los sumo
				.get()//lo obtengo			
				
				);
		
	}

}
