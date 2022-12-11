package com.jgr.paquete.stream.finales.e.intermedios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jgr.paquete.stream.modelo.Alumno;
import com.jgr.paquete.stream.modelo.CajaNegraComparator;
import com.jgr.paquete.stream.modelo.Persona;
import com.jgr.paquete.stream.modelo.Usuario;

/**
 * The Class StreamFinalReducirACollection.
 * reducimos a coleccion
 * Collectors	
 *	Implementations of Collector that implement various useful reduction operations, such as accumulating elements into collections, 
 *	summarizing elements according to various criteria, etc.
 */
public class StreamFinalReducirACollection {

	public static void main(String[] args) {
		
		//elimino duplicados y lo convierto a una lista
		Integer [][] numeritos = {{2,11,7},{2,11,7},{4,1,9,6}};
		List<Integer> salida = Stream.of(numeritos).//lo convierto a stream
				flatMap(a->Arrays.stream(a)).//lo aplano a array de 1 dimension
				distinct().//dejo los no repetidos
				sorted().//ordeno
				peek(System.out::println).//saco datos por pantalla
				collect(Collectors.toList());//lo convierto a lista
		
		Stream<Persona> personas =Stream.of(new Persona("Persona1",12345),
				new Persona("Persona2",23456));
		
		Map<Integer,String> lista = personas.
				//en cada parametro tengo que usar la funcion -> para obtener el parametro
				collect(Collectors.toMap(p->p.getDni(),p->p.getNombre()));
		
		System.out.println(Arrays.asList(lista));
		System.out.println(Collections.singletonList(lista));
				
		
		

	}

}
