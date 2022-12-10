package com.jgr.paquete.stream.finales.e.intermedios;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * The Class StreamFinalBusquedasOptional.
 *  Optional<T> findFirst() Optional<T>
 *  findAny();
 *  findFirst();
 *  get()
 *  orElse()
 *  isPresent()
 *  hay variantes OptionalInt y OptionalDouble
 * Optional<T> max(Comparator<?super T> comparator)
 * max->devuelve el mayor,utiliza comparator
 * min->devuelve en menor,utiliza comparator 
 * 
 */
public class StreamFinalBusquedasOptional {

	public static void main(String[] args) {
		
		Stream<Integer> st = Stream.of(2, 5, 7, 9, 9, 23);
		Optional<Integer> op = st.filter(s -> s > 2).findAny();// cualquiera,primero hay que aplicar el filtro
		System.out.println(op.isPresent());
		
		//sacaria el mayor		
		Stream<Integer> str = Stream.of(2, 5, 7, 9, 9, 23);
		op = str.max((a,b)->a-b);		
		System.out.println(op.get());
		
		
		//sacaria el que es igual a cero con el get, si lo hacemos asi 
		Stream<Integer> stre = Stream.of(15,-3,21,7,9,-4,7);		
		System.out.println(stre.
				filter(n->n>999).				
				max((a,b)->a-b)
				//.get()//obtiene los que cumplen la condicion,pero si no hay ninguno falla
				.orElse(1)//si ninguno cumple la condicion
				);
		
		//creando un DoubleStream podemos calcular la media
		 DoubleStream stream = DoubleStream.of(2.5, 3.6, 4.7, 5.0, 6.2);  
	        // OptionalDouble is a container object
	        // which may or may not contain a
	        // double value.
	        OptionalDouble obj = stream.average();
	        System.out.println("opcional double->"+obj);
	        System.out.println("opcional double.getAsDouble->"+obj.getAsDouble());
	        
	   	 DoubleStream stream2 = DoubleStream.of(2.5, 3.6, 4.7, 5.0, 6.2);  
	        
	        System.out.println(stream2.sum());
		
		
		
	}

}
